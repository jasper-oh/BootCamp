package com.aoslec.day45lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BMIcalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        EditText heightEditText = findViewById(R.id.heightEditText);
        EditText weightEditText = findViewById(R.id.weightEditText);
        Button resultButton = findViewById(R.id.resultButton);

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MBIcalculator","Result was Clicked");
                if (heightEditText.getText().toString().equals("")){
                    Toast.makeText(BMIcalculator.this,"빈값을 입력해주십시오",Toast.LENGTH_SHORT).show();
                }
            }
        });

        String strHeight = heightEditText.getText().toString();
        String strWeight = weightEditText.getText().toString();

        double height = Double.parseDouble(strHeight);
        double weight = Double.parseDouble(strWeight);

        Log.d("userWeight",strHeight);
        Log.d("userWeight",strWeight);

        Intent intent = new Intent(getApplicationContext(),BMIresult.class);
        intent.putExtra("height",height);
        intent.putExtra("weight",weight);
        startActivity(intent);

    }
}