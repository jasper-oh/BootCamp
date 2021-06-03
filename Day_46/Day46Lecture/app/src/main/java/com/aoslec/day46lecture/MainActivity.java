package com.aoslec.day46lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTask1,btnTask2,btnTask3,btnTask4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTask1 = findViewById(R.id.btnTask1);
        btnTask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DateTime.class);
                startActivity(intent);
            }
        });

        btnTask2 = findViewById(R.id.btnTask2);
        btnTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OptionMenu.class);
                startActivity(intent);
            }
        });

        btnTask3 = findViewById(R.id.btnTask3);
        btnTask3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),name3.class);
//                startActivity(intent);
            }
        });

        btnTask4 = findViewById(R.id.btnTask4);
        btnTask4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),name4.class);
//                startActivity(intent);
            }
        });
    }
}