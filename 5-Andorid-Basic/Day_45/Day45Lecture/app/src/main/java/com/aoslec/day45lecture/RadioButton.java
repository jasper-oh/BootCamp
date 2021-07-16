package com.aoslec.day45lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = findViewById(R.id.rg_01);
        radioGroup.setOnCheckedChangeListener(checkChangeListener);

    }
    RadioGroup.OnCheckedChangeListener checkChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

            switch (checkedId){
                case R.id.rg_01:
                    if(checkedId == R.id.rb_01){
                        Toast.makeText(RadioButton.this , "당신의 고향은 서울" , Toast.LENGTH_SHORT ).show();
                    }else if(checkedId == R.id.rb_02){
                        Toast.makeText(RadioButton.this , "당신의 고향은 경기도" , Toast.LENGTH_SHORT ).show();
                    }else if(checkedId == R.id.rb_03){
                        Toast.makeText(RadioButton.this , "당신의 고향은 강원도" , Toast.LENGTH_SHORT ).show();
                    }else if(checkedId == R.id.rb_04){
                        Toast.makeText(RadioButton.this , "당신의 고향은 충청도" , Toast.LENGTH_SHORT ).show();
                    }else if(checkedId == R.id.rb_05){
                        Toast.makeText(RadioButton.this , "당신의 고향은 경상도" , Toast.LENGTH_SHORT ).show();
                    }else if(checkedId == R.id.rb_06){
                        Toast.makeText(RadioButton.this , "당신의 고향은 전라도" , Toast.LENGTH_SHORT ).show();
                    }else if(checkedId == R.id.rb_07){
                        Toast.makeText(RadioButton.this , "당신의 고향은 제주도" , Toast.LENGTH_SHORT ).show();
                    }
                    break;

            }
        }
    };

}