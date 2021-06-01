package com.aoslec.day45lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnText;
    Button btnEditableTest;
    Button btnEditLimit;
    Button btnCheckBox;
    Button btnRadio;
    Button btnProgress;
    Button btnQuiz10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnText = findViewById(R.id.btnText);
        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Text.class);
                startActivity(intent);
            }
        });

        btnEditableTest = findViewById(R.id.btnEditableTest);
        btnEditableTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditableTest.class);
                startActivity(intent);
            }
        });

        btnEditLimit = findViewById(R.id.btnEditLimit);
        btnEditLimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditLimit.class);
                startActivity(intent);
            }
        });

        btnCheckBox = findViewById(R.id.btnCheckBox);
        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CheckBox.class);
                startActivity(intent);
            }
        });

        btnRadio = findViewById(R.id.btnRadio);
        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), RadioButton.class);
                startActivity(intent);
            }
        });

        btnProgress = findViewById(R.id.btnProgress);
        btnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), ProgressBar.class);
                startActivity(intent);
            }
        });

        btnQuiz10 = findViewById(R.id.btnQuiz10);
        btnQuiz10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Quiz10.class);
                startActivity(intent);
            }
        });


    }
}