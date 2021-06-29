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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.aoslec.personalprojectfinal.NetworkTask.NetworkTask;
import com.aoslec.personalprojectfinal.NetworkTask.NetworkTaskDiary;
import com.aoslec.personalprojectfinal.R;

import java.io.File;
import java.io.InputStream;

public class DiaryListDetailActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_STORAGE_PERMISSION = 1;
    private static final int REQUEST_CODE_SELECT_IMAGE= 2;

    ImageView image_selected_detail_diary;

    Button btn_image_insert_detail_diary ,btn_detail_update,btn_detail_delete;

    EditText et_visit_detail_date, et_shop_detail_name,et_designer_detail_name,et_contents_detail_memo;

    Intent intent;

    String imagePath;
    String urlAddr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_list_detail);

        image_selected_detail_diary = findViewById(R.id.image_selected_detail_diary);
        btn_image_insert_detail_diary = findViewById(R.id.btn_image_insert_detail_diary);
        btn_detail_update = findViewById(R.id.btn_detail_update);
        btn_detail_delete = findViewById(R.id.btn_detail_delete);

        et_visit_detail_date = findViewById(R.id.et_visit_detail_date);
        et_shop_detail_name = findViewById(R.id.et_shop_detail_name);
        et_designer_detail_name = findViewById(R.id.et_designer_detail_name);
        et_contents_detail_memo = findViewById(R.id.et_contents_detail_memo);

        intent = getIntent();

        String date = intent.getStringExtra("date");
        String image = intent.getStringExtra("image");
        String hairShop = intent.getStringExtra("hairShop");
        String designer = intent.getStringExtra("designer");
        String comments = intent.getStringExtra("comments");

        et_visit_detail_date.setText(date);
        et_shop_detail_name.setText(hairShop);
        et_designer_detail_name.setText(designer);
        et_contents_detail_memo.setText(comments);

        //-- button action
        btn_image_insert_detail_diary.setOnClickListener(onClickListener);
        btn_detail_update.setOnClickListener(onClickListener);
        btn_detail_delete.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            int no;
            switch(v.getId()){
                case R.id.btn_image_insert_detail_diary:
                    if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(DiaryListDetailActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},REQUEST_CODE_STORAGE_PERMISSION);
                    }else{
                        selectImage();
                    }
                    break;

                case R.id.btn_detail_update:
                    intent = getIntent();
                    no = intent.getIntExtra("no" , 0);
                    String hairShop = et_shop_detail_name.getText().toString();
                    String designerName = et_designer_detail_name.getText().toString();
                    String comments = et_contents_detail_memo.getText().toString();

                    urlAddr = "http://192.168.35.80:8080/test/styleDiaryUpdate.jsp?";
                    urlAddr = urlAddr+"no="+no+"&image="+imagePath+"&hairshop="+hairShop+"&designer="+designerName+"&comments="+comments;

                    String updateResult = connectUpdateData();

                    if(updateResult.equals("1")){
                        Toast.makeText(DiaryListDetailActivity.this, hairShop + " is inserted!", Toast.LENGTH_SHORT).show();
                        finish();
                    }else{
                        Toast.makeText(DiaryListDetailActivity.this, "Insert Fail !", Toast.LENGTH_SHORT).show();
                    }

                    break;


                case R.id.btn_detail_delete:
                    intent = getIntent();
                    no = intent.getIntExtra("no" , 0);

                    urlAddr = "http://192.168.35.80:8080/test/styleDiaryDelete.jsp?no="+no;
                    String hairShop1 = et_shop_detail_name.getText().toString();
                    String deleteResult = connectDeleteData();

                    if(deleteResult.equals("1")){
                        Toast.makeText(DiaryListDetailActivity.this, hairShop1 + " is Deleted!", Toast.LENGTH_SHORT).show();
                        finish();
                    }else{
                        Toast.makeText(DiaryListDetailActivity.this, "Delete Fail !", Toast.LENGTH_SHORT).show();
                    }
                    break;


            }
        }
    };

    private String connectUpdateData(){
        String result = null;
        try{
            NetworkTaskDiary networkTaskDiary = new NetworkTaskDiary(DiaryListDetailActivity.this,urlAddr,"update");
            Object obj = networkTaskDiary.execute().get();
            result = (String) obj;
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    private String connectDeleteData(){
        String result = null;
        try{
            NetworkTaskDiary networkTaskDiary = new NetworkTaskDiary(DiaryListDetailActivity.this,urlAddr,"delete");
            Object obj = networkTaskDiary.execute().get();
            result = (String) obj;
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;

    }

    private void selectImage(){
        intent = new Intent(Intent.ACTION_PICK , MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent , REQUEST_CODE_SELECT_IMAGE);
        }
    }
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
                        image_selected_detail_diary.setImageBitmap(bitmap);

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