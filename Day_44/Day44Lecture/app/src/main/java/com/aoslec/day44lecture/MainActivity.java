package com.aoslec.day44lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnGravity;
    Button btnButtonEdit;
    Button btnImageView;
    Button btnWeight1;
    Button btnPadding;
    Button btnFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGravity = findViewById(R.id.btnGravity);
        btnGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Gravity.class);
                startActivity(intent);
            }
        });

        btnButtonEdit = findViewById(R.id.btnButtonEdit);
        btnButtonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ButtonEdit.class);
                startActivity(intent);
            }
        });

        btnImageView = findViewById(R.id.btnImageView);
        btnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ImageView.class);
                startActivity(intent);
            }
        });

        btnWeight1 = findViewById(R.id.btnWeight1);
        btnWeight1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Padding.class);
                startActivity(intent);
            }
        });

        btnPadding = findViewById(R.id.btnPadding);
        btnPadding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Padding.class);
                startActivity(intent);
            }
        });

        btnFrame = findViewById(R.id.btnFrame);
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Frame.class);
                startActivity(intent);
            }
        });



    }
}