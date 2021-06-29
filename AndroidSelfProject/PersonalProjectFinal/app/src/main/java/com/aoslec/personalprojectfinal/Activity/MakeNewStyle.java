package com.aoslec.personalprojectfinal.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.aoslec.personalprojectfinal.NetworkTask.NetworkTask;
import com.aoslec.personalprojectfinal.NetworkTask.NetworkTaskImageDiary;
import com.aoslec.personalprojectfinal.R;
import com.aoslec.personalprojectfinal.ShareVar.ShareVar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MakeNewStyle extends AppCompatActivity {
    String devicePath = Environment.getDataDirectory().getAbsolutePath() + "/test/com.aoslec.personalprojectfinal/";
    String urlAddr = ShareVar.urlAddr + "styleDiaryBookInsertFinal.jsp";
    private static final int REQUEST_CODE_STORAGE_PERMISSION = 1;
    private static final int REQUEST_CODE_SELECT_IMAGE= 2;

    private ImageView imageSelected;


    Button btn_getGalleryPhoto,btn_styleSave;
    EditText styleTitle;

    Spinner styleSpinner;

    String imagePath;
    String img_path;
    private String f_ext = null;
    File tempSelectFile;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_new_style);

        imageSelected = findViewById(R.id.selectedImage);

        styleSpinner = findViewById(R.id.styleSpinner);
        ArrayAdapter styleAdapter = ArrayAdapter.createFromResource(this,R.array.hairStyleArray, android.R.layout.simple_spinner_dropdown_item);
        styleSpinner.setAdapter(styleAdapter);

        styleTitle = findViewById(R.id.styleTitle);

        btn_getGalleryPhoto = findViewById(R.id.btn_getGalleryPhoto);
        btn_getGalleryPhoto.setOnClickListener(onClickListener);

        btn_styleSave = findViewById(R.id.btn_styleSave);
        btn_styleSave.setOnClickListener(onClickListener);

        // server 연결 시도



    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_getGalleryPhoto:

                    if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(MakeNewStyle.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},REQUEST_CODE_STORAGE_PERMISSION);
                    }else{
                        selectImage();
                    }
                    break;

                case R.id.btn_styleSave:
                    // 이미지 파일 가지고 오기
                    Log.v("title",imagePath);
                    // 스타일 제목 가지고 오기
                    String title = styleTitle.getText().toString();
                    Log.v("title" , title);

                    // 스타일 길이 가지고 오기
                    String hairLength = styleSpinner.getSelectedItem().toString();
                    Log.v("title",hairLength);


                    String result = connectInsertData();

                    if(result.equals("1")){
                        Toast.makeText(MakeNewStyle.this, title + " is inserted!", Toast.LENGTH_SHORT).show();
                        finish();
                    }else{
                        Toast.makeText(MakeNewStyle.this, "Insert Fail !", Toast.LENGTH_SHORT).show();
                    }

                    break;
            }
        }
    };
    // 서버 연결 --
    private String connectInsertData(){

        String insertResult = "";
        NetworkTaskImageDiary networkTaskImageDiary = new NetworkTaskImageDiary(MakeNewStyle.this , imageSelected , img_path , urlAddr , styleTitle.getText().toString(), styleSpinner.getSelectedItem().toString() );

        try{
            Integer result = networkTaskImageDiary.execute(100).get();
            switch(result){
                case 1:
                    Toast.makeText(MakeNewStyle.this , "Success" , Toast.LENGTH_SHORT).show();
                    insertResult = "1";
                    File file = new File(img_path);
                    file.delete();
                    break;

                case 0:
                    Toast.makeText(MakeNewStyle.this, "Error", Toast.LENGTH_SHORT).show();
                    insertResult = "2";
                    break;
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return insertResult;


    }
    // 연결 해보기 끝 --

    private void selectImage(){
        Intent intent = new Intent(Intent.ACTION_PICK , MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent , REQUEST_CODE_SELECT_IMAGE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == REQUEST_CODE_STORAGE_PERMISSION && grantResults.length > 0){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                selectImage();
            }else{
                Toast.makeText(this, "갤러리 접근 실패", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==  REQUEST_CODE_SELECT_IMAGE && resultCode == RESULT_OK){
//            if(data != null){
//                Uri selectImageUri = data.getData();
//                if(selectImageUri != null){
//                    try{
//                        InputStream inputStream = getContentResolver().openInputStream(selectImageUri);
//                        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
//                        imageSelected.setImageBitmap(bitmap);
//
//                        //Following is the selected image File.
//                        // Do whatever you want to do with the selected image file.
//                        // For example , upload it to  the sever...!
//                        File selectedImageFile = new File(getPathFromUri(selectImageUri));
//
//                        imagePath = String.valueOf(selectedImageFile);
//
////                        Log.v("title" , String.valueOf(selectedImageFile));
//
//                    }catch(Exception e){
//                        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }

            //  Experiment ===
            try{

                img_path = getImagePathToUri(data.getData());

                Bitmap image_bitmap = MediaStore.Images.Media.getBitmap(getContentResolver() , data.getData());
                Bitmap image_bitmap_copy = Bitmap.createScaledBitmap(image_bitmap , 400, 300 ,true);
                imageSelected.setImageBitmap(image_bitmap_copy);

                String date = new SimpleDateFormat("yyyyMMddHmsS").format(new Date());
                String imageName = date + "." + f_ext;
                tempSelectFile = new File(devicePath , imageName);
                OutputStream out = new FileOutputStream(tempSelectFile);
                image_bitmap.compress(Bitmap.CompressFormat.JPEG ,100 ,out);

                img_path = devicePath + imageName;

            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }

//    private String getPathFromUri(Uri contentUri){
//        String filePath;
//        Cursor cursor = getContentResolver().query(contentUri , null , null , null,null );
//        if(cursor == null){
//            filePath = contentUri.getPath();
//        }else{
//            cursor.moveToFirst();
//            int index = cursor.getColumnIndex("_data");
//            filePath = cursor.getString(index);
//            cursor.close();
//
//        }
//        return filePath;
//    }

    private String getImagePathToUri(Uri data) {

        String[] proj = {MediaStore.Images.Media.DATA};
        Cursor cursor = getContentResolver().query(data, proj, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();

        //이미지의 경로 값
        String imgPath = cursor.getString(column_index);

        //이미지의 이름 값
        String imgName = imgPath.substring(imgPath.lastIndexOf("/") + 1);

        // 확장자 명 저장
        f_ext = imgPath.substring(imgPath.length()-3, imgPath.length());

        return imgPath;
    }

}