
// JSON으로 들고 온것을 Recycler View 로 바꾸는 것 해보기

package com.aoslec.networktasktest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String urlAddr = "http://192.168.2.6:8080/test/students.json";

    Button button;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_network_conn);

        recyclerView = findViewById(R.id.rv_view);

        // GridView 로 바꾸어 보기
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new StudentAdapter();
        recyclerView.setAdapter(adapter);


    }
}