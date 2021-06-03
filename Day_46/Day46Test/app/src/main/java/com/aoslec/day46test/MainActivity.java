package com.aoslec.day46test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

    }

    public void calcButtonClicked(View view) {

        String editText1Str = editText1.getText().toString().trim();
        String editText2Str = editText2.getText().toString().trim();

        if (editText1Str.equals("")) {
            editText1Str = "0";
        }

        if (editText2Str.length() == 0) {
            editText2Str = "0";
        }

        String calcType = "";

        if (view.getId() == R.id.buttonAdd) {
            calcType = "더하기";
        } else if (view.getId() == R.id.buttonMinus) {
            calcType = "빼기";
        } else if (view.getId() == R.id.buttonMulti) {
            calcType = "곱하기";
        } else if (view.getId() == R.id.buttonDivide) {
            calcType = "나누기";
        }

        if (calcType.equals("더하기")) {
            int result = Integer.parseInt(editText1Str) + Integer.parseInt(editText2Str);
            Toast.makeText(MainActivity.this,"더한 결과"+result,Toast.LENGTH_SHORT).show();

        } else if (calcType.equals("빼기")) {
            int result = Integer.parseInt(editText1Str) - Integer.parseInt(editText2Str);

            Toast.makeText(MainActivity.this,"빼기 결과"+result,Toast.LENGTH_SHORT).show();
        } else if (calcType.equals("곱하기")) {
            int result = Integer.parseInt(editText1Str) * Integer.parseInt(editText2Str);

            Toast.makeText(MainActivity.this,"곱하기 결과"+result,Toast.LENGTH_SHORT).show();

        } else if (calcType.equals("나누기")) {
            double result = (double) Integer.parseInt(editText1Str) / Integer.parseInt(editText2Str);

            if (Integer.parseInt(editText2Str) == 0) {
                Toast.makeText(MainActivity.this, "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(MainActivity.this,"나누기 결과"+result,Toast.LENGTH_SHORT).show();

        }
    }
}