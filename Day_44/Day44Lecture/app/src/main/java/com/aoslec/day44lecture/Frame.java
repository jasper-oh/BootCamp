package com.aoslec.day44lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Frame extends AppCompatActivity {

    Button button1;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        button1 = findViewById(R.id.button);
        imageView = findViewById(R.id.image1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageView.getVisibility() == v.VISIBLE){
                    imageView.setVisibility(v.INVISIBLE);
                }else{
                    imageView.setVisibility(v.VISIBLE);
                }

            }
        });
    }
}