package com.aoslec.listtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //DATA prepare
        ArrayList<String> arGeneral = new ArrayList<>();
        arGeneral.add("kim yu shin");
        arGeneral.add("lee sun shin");
        arGeneral.add("kang kam chan");
        arGeneral.add("eul ji mun duk");


        //Adapter Prepare
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arGeneral);

        //Adapter and View Connecting
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);



    }
}