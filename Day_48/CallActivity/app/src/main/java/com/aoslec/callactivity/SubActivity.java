package com.aoslec.callactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 회전
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_sub);

        Log.v("Message","onCreate_Sub");

        btnClose = findViewById(R.id.close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        Log.v("Message","onStart_Sub");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v("Message","onResume_Sub");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v("Message","onPause_Sub");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v("Message","onStop_Sub");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v("Message","onDestroy_Sub");
        super.onDestroy();
    }



}