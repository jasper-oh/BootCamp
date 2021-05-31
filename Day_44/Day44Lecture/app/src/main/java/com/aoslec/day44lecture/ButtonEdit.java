package com.aoslec.day44lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonEdit extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_edit);

        button = findViewById(R.id.toastBtn);
        editText = findViewById(R.id.edit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();
                Toast.makeText(ButtonEdit.this, str, Toast.LENGTH_SHORT).show();
            }
        });


    }
}