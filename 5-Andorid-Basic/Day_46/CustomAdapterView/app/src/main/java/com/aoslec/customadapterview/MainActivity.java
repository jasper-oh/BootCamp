package com.aoslec.customadapterview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Weather> data = null;
    private WeatherAdapter adapter = null;
    private ListView listView = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        data = new ArrayList<Weather>();
        data.add(new Weather("월",R.drawable.w1,"맑음"));
        data.add(new Weather("월",R.drawable.w1,"맑음"));
        data.add(new Weather("월",R.drawable.w1,"맑음"));
        data.add(new Weather("월",R.drawable.w1,"맑음"));
        data.add(new Weather("월",R.drawable.w1,"맑음"));
        data.add(new Weather("월",R.drawable.w1,"맑음"));
        data.add(new Weather("월",R.drawable.w1,"맑음"));


        //Adapter 연결
        adapter = new WeatherAdapter(MainActivity.this , R.layout.custom_layout,data);

        //ListView
        listView = findViewById(R.id.lv_weather);
        listView.setAdapter(adapter);


    }
}