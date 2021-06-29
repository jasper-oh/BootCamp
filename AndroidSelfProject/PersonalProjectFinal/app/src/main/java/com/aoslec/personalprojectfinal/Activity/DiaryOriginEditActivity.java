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
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.aoslec.personalprojectfinal.NetworkTask.NetworkTask;
import com.aoslec.personalprojectfinal.R;

import java.io.File;
import java.io.InputStream;

public class DiaryOriginEditActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_STORAGE_PERMISSION = 1;
    private static final int REQUEST_CODE_SELECT_IMAGE= 2;

    ImageView selectedImageEdit;

    Button btn_getGalleryPhotoEdit , btn_styleUpdate , btn_styleDelete;

    EditText styleTitleEdit;

    Spinner styleSpinnerEdit;
    Intent intent;

    String imagePath;
    String urlAddr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_origin_edit);

        selectedImageEdit = findViewById(R.id.selectedImageEdit);

        btn_getGalleryPhotoEdit = findViewById(R.id.btn_getGalleryPhotoEdit);
        btn_styleUpdate = findViewById(R.id.btn_styleUpdate);
        btn_styleDelete = findViewById(R.id.btn_styleDelete);

        styleTitleEdit = findViewById(R.id.styleTitleEdit);

        styleSpinnerEdit = findViewById(R.id.styleSpinnerEdit);
        ArrayAdapter styleEditAdapter = ArrayAdapter.createFromResource(this , R.array.hairStyleArray , android.R.layout.simple_spinner_dropdown_item);
        styleSpinnerEdit.setAdapter(styleEditAdapter);


        intent = getIntent();
        String hairLength = intent.getStringExtra("hairLength");

        switch(hairLength){
            case "장발":
                styleSpinnerEdit.setSelection(0);
                break;
            case "단발":
                styleSpinnerEdit.setSelection(1);
                break;
            case "숏컷":
                styleSpinnerEdit.setSelection(2);
                break;
        }
        btn_getGalleryPhotoEdit.setOnClickListener(onClickListener);
        btn_styleUpdate.setOnClickListener(onClickListener);
        btn_styleDelete.setOnClickListener(onClickListener);

        String styleTitle = intent.getStringExtra("title");

        styleTitleEdit.setText(styleTitle);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_getGalleryPhotoEdit:
                    if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(DiaryOriginEditActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},REQUEST_CODE_STORAGE_PERMISSION);
                    }else{
                        selectImage();
                    }
                    break;
                case R.id.btn_styleUpdate:
                    intent = getIntent();
                    int no = intent.getIntExtra("no",0);
                    String updateTitle = styleTitleEdit.getText().toString();
                    String hairLength = styleSpinnerEdit.getSelectedItem().toString();
                    urlAddr = "http://192.168.35.80:8080/test/styleDiaryBookUpdate.jsp?";
                    urlAddr = urlAddr +"no="+no+"&title="+updateTitle+"&hairLength="+hairLength+"&image="+imagePath;

                    String result = connectUpdateData();
                    if(result.equals("1")){
                        Toast.makeText(DiaryOriginEditActivity.this, updateTitle + " is updated!", Toast.LENGTH_SHORT).show();
                        finish();
                    }else{
                        Toast.makeText(DiaryOriginEditActivity.this, "Update Fail !", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.btn_styleDelete:
                    intent = getIntent();
                    int no1 = intent.getIntExtra("no",0);
                    urlAddr = "http://192.168.35.80:8080/test/styleDiaryBookDelete.jsp?no="+no1;

                    String deleteResult = connectDeleteData();
                    String deleteTitle = styleTitleEdit.getText().toString();
                    if(deleteResult.equals("1")){
                        Toast.makeText(DiaryOriginEditActivity.this, deleteTitle + " is Deleted!", Toast.LENGTH_SHORT).show();
                        finish();
                    }else{
                        Toast.makeText(DiaryOriginEditActivity.this, "Delete Fail !", Toast.LENGTH_SHORT).show();
                    }

                    break;

            }
        }
    };

    // ---  서버 연결 -- update
    private String connectUpdateData(){
        String result = null;
        try{
            NetworkTask networkTask = new NetworkTask(DiaryOriginEditActivity.this,urlAddr,"update");
            Object obj = networkTask.execute().get();
            result = (String) obj;
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;

    }
    // --- 끝

    // ---  서버 연결 -- delete
    private String connectDeleteData(){
        String result = null;
        try{
            NetworkTask networkTask = new NetworkTask(DiaryOriginEditActivity.this,urlAddr,"delete");
            Object obj = networkTask.execute().get();
            result = (String) obj;
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;

    }
    // --- 끝

    private void selectImage(){
        intent = new Intent(Intent.ACTION_PICK , MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
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
            if(data != null){
                Uri selectImageUri = data.getData();
                if(selectImageUri != null){
                    try{
                        InputStream inputStream = getContentResolver().openInputStream(selectImageUri);
                        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                        selectedImageEdit.setImageBitmap(bitmap);

                        //Following is the selected image File.
                        // Do whatever you want to do with the selected image file.
                        // For example , upload it to  the sever...!
                        File selectedImageFile = new File(getPathFromUri(selectImageUri));

                        imagePath = String.valueOf(selectedImageFile);

//                        Log.v("title" , String.valueOf(selectedImageFile));

                    }catch(Exception e){
                        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }
    }

    private String getPathFromUri(Uri contentUri){
        String filePath;
        Cursor cursor = getContentResolver().query(contentUri , null , null , null,null );
        if(cursor == null){
            filePath = contentUri.getPath();
        }else{
            cursor.moveToFirst();
            int index = cursor.getColumnIndex("_data");
            filePath = cursor.getString(index);
            cursor.close();

        }
        return filePath;
    }
}