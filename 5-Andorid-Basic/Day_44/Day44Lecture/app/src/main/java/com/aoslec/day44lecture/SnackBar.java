package com.aoslec.day44lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class SnackBar extends AppCompatActivity {

    Button snackBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);

        snackBar = findViewById(R.id.btnSnackbar1);
        snackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Snackbar 를 눌렀습니다.", Snackbar.LENGTH_SHORT).show();
            }
        });


    }
}