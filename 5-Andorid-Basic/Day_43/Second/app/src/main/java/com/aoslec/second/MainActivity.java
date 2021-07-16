package com.aoslec.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button buttonRed;
    Button buttonGreen;
    Button buttonBlue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Button.OnClickListener onClickListner = new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch(v.getId()){
//                    case R.id.btnRed:
//                        Toast.makeText(MainActivity.this, "빨간 버튼!",Toast.LENGTH_SHORT).show();
//                        break;
//
//                    case R.id.btnGreen:
//                        Toast.makeText(MainActivity.this, "초록 버튼!",Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.btnBlue:
//                        Toast.makeText(MainActivity.this, "파란 버튼!",Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        };

        buttonRed = findViewById(R.id.btnRed);
        buttonRed.setOnClickListener(onClickListener);
        buttonGreen = findViewById(R.id.btnGreen);
        buttonGreen.setOnClickListener(onClickListener);
        buttonBlue = findViewById(R.id.btnBlue);
        buttonBlue.setOnClickListener(onClickListener);


    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String colorString = "";
            switch(v.getId()){

                case R.id.btnRed:

                    colorString ="Red";
                    break;

                case R.id.btnGreen:

                    colorString ="Green";
                    break;
                case R.id.btnBlue:

                    colorString ="Blue";
                    break;
            }
            Toast.makeText(MainActivity.this, colorString+" 버튼!",Toast.LENGTH_SHORT).show();
        }
    };


}