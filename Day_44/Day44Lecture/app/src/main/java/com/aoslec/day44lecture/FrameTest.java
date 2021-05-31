package com.aoslec.day44lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class FrameTest extends AppCompatActivity {

        Button button1;
        Button button2;

        FrameLayout frame1;
        FrameLayout frame2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_test);

        button1 = findViewById(R.id.LinearBtn1);
        button2 = findViewById(R.id.LinearBtn2);
        frame1 = findViewById(R.id.frame1);
        frame2 = findViewById(R.id.frame2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(frame1.getVisibility() == v.VISIBLE){
                    frame1.setVisibility(v.INVISIBLE);
                }else{
                    frame1.setVisibility(v.VISIBLE);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(frame2.getVisibility() == v.VISIBLE){
                    frame2.setVisibility(v.INVISIBLE);
                }else{
                    frame2.setVisibility(v.VISIBLE);
                }
            }
        });

    }
}