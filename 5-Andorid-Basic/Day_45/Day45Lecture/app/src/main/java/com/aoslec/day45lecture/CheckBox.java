package com.aoslec.day45lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.ArrayList;

public class CheckBox extends AppCompatActivity {

    android.widget.CheckBox cb1,cb2,cb3,cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cb1 = findViewById(R.id.chk1);
        cb2 = findViewById(R.id.chk1);
        cb3 = findViewById(R.id.chk1);
        cb4 = findViewById(R.id.chk1);

        cb1.setOnCheckedChangeListener(checkChangeListener);
        cb2.setOnCheckedChangeListener(checkChangeListener);
        cb3.setOnCheckedChangeListener(checkChangeListener);
        cb4.setOnCheckedChangeListener(checkChangeListener);

    }//--

    CompoundButton.OnCheckedChangeListener checkChangeListener = new CompoundButton.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//            배열로 처리하기

            String str = "";
            ArrayList<String> str1 = new ArrayList<String>();

            switch (buttonView.getId()){
                case R.id.chk1:
                    if(isChecked == true){
//                        str += "운동";
                        str1.add("운동");
                    }
//                    break;
                case R.id.chk2:
                    if(isChecked == true){
//                        str += "요리";
                        str1.add("요리");
                    }
//                    break;
                case R.id.chk3:
                    if(isChecked == true){
//                        str += "독서";
                        str1.add("독서");

                    }
//                    break;
                case R.id.chk4:
                    if(isChecked == true){
//                        str += "여행";
                        str1.add("여행");
                    }
                    break;
            }
            for(int i = 0 ; i < str1.size() ; i ++){
                str += str1.get(i);
            }

            Toast.makeText(CheckBox.this , str+"선택되었습니다",Toast.LENGTH_SHORT).show();
        }
    };

}//--