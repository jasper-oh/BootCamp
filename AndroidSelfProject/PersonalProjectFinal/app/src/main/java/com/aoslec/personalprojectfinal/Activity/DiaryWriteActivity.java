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

public class DiaryWriteActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_STORAGE_PERMISSION = 1;
    private static final int REQUEST_CODE_SELECT_IMAGE= 2;

    private ImageView image_selected_diary;

    Button btn_image_insert_diary, btn_diary_insert;
    EditText et_visit_date,et_shop_name,et_designer_name,et_contents_memo;

    String urlAddr = "http://192.168.35.80:8080/test/diaryInsertDiaryBook.jsp?";

    String imagePath;
    int diary_no = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_write);

        image_selected_diary = findViewById(R.id.image_selected_diary);
        et_visit_date = findViewById(R.id.et_visit_date);
        et_shop_name = findViewById(R.id.et_shop_name);
        et_designer_name = findViewById(R.id.et_designer_name);
        et_contents_memo = findViewById(R.id.et_contents_memo);

        btn_image_insert_diary = findViewById(R.id.btn_image_insert_diary);
        btn_diary_insert = findViewById(R.id.btn_diary_insert);



        btn_diary_insert.setOnClickListener(onClickListener);
        btn_image_insert_diary.setOnClickListener(onClickListener);

        Intent intent = getIntent();
        diary_no = intent.getIntExtra("diary_no", 0);


    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_image_insert_diary:

                    if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(DiaryWriteActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},REQUEST_CODE_STORAGE_PERMISSION);
                    }else{
                        selectImage();
                    }
                    break;



                case R.id.btn_diary_insert:

                    String date = et_visit_date.getText().toString();
                    String hairShop = et_shop_name.getText().toString();
                    String designerName = et_designer_name.getText().toString();
                    String comments = et_contents_memo.getText().toString();

                    urlAddr = urlAddr+"diaryNo="+diary_no+"&image="+imagePath+"&date="+date+"&hairshop="+hairShop+"&designer="+designerName+"&comments="+comments;

                    String result = connectInsertData();

                    if(result.equals("1")){
                    Toast.makeText(DiaryWriteActivity.this, hairShop + " is inserted!", Toast.LENGTH_SHORT).show();
                    finish();
                }else{
                    Toast.makeText(DiaryWriteActivity.this, "Insert Fail !", Toast.LENGTH_SHORT).show();
                }

                    break;

            }

        }
    };

    // 서버 연결 --
    private String connectInsertData(){
        String result = null;
        try{
            NetworkTaskDiary networkTaskDiary = new NetworkTaskDiary(DiaryWriteActivity.this,urlAddr,"insert");
            Object obj = networkTaskDiary.execute().get();
            result = (String) obj;
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;

    }
    // 연결 해보기 끝 --

    private void selectImage(){
        Intent intent = new Intent(Intent.ACTION_PICK , MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
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

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_SELECT_IMAGE && resultCode == RESULT_OK) {
            if (data != null) {
                Uri selectImageUri = data.getData();
                if (selectImageUri != null) {
                    try {
                        InputStream inputStream = getContentResolver().openInputStream(selectImageUri);
                        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                        image_selected_diary.setImageBitmap(bitmap);

                        //Following is the selected image File.
                        // Do whatever you want to do with the selected image file.
                        // For example , upload it to  the sever...!
                        File selectedImageFile = new File(getPathFromUri(selectImageUri));

                        imagePath = String.valueOf(selectedImageFile);

                    } catch (Exception e) {
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