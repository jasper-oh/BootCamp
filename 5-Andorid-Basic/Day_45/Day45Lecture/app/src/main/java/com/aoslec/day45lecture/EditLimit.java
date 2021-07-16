package com.aoslec.day45lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;

public class EditLimit extends AppCompatActivity {
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_limit);

        editText = findViewById(R.id.limit);
        editText.setFilters(new InputFilter[]{
                new InputFilter.LengthFilter(3)
        });

    }
}