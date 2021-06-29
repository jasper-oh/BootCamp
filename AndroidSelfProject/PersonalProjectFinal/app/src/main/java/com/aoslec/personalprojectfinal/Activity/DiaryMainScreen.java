package com.aoslec.personalprojectfinal.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aoslec.personalprojectfinal.R;

public class DiaryMainScreen extends AppCompatActivity {

    Button btn_newStyle,btn_originStyle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_main_screen);

        btn_newStyle = findViewById(R.id.btn_newStyle);
        btn_originStyle = findViewById(R.id.btn_originStyle);

        btn_newStyle.setOnClickListener(onClickListener);
        btn_originStyle.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        Intent intent;
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.btn_newStyle:
                    intent = new Intent(DiaryMainScreen.this , MakeNewStyle.class);
                    startActivity(intent);
                    break;

                case R.id.btn_originStyle:
                    intent = new Intent(DiaryMainScreen.this , ShowOriginStyle.class);
                    startActivity(intent);
                    break;

            }
        }
    };

}