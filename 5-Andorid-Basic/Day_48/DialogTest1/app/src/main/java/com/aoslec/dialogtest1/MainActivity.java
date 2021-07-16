package com.aoslec.dialogtest1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int a = 3;
    int b = 4;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.call);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Question")
                        .setMessage("Which Calculator")
                        .setPositiveButton("덧셈",mClick)
                        .setNegativeButton("뺄셈",mClick)
                        .show();
            }
        });
    }
    DialogInterface.OnClickListener mClick = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
                  if(which == DialogInterface.BUTTON_POSITIVE){
                      result = a+b;
                  }else{
                      result = a-b;
                  }
            TextView textView = findViewById(R.id.tv_main);
                  textView.setText("Result = " + result);
            Toast.makeText(MainActivity.this,"연산을 완료했습니다.",Toast.LENGTH_SHORT).show();
        }
    };


}