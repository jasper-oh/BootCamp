package com.aoslec.personalprojectfinal.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.aoslec.personalprojectfinal.Adapter.DiaryBookAdapter;
import com.aoslec.personalprojectfinal.Bean.DiaryBook;
import com.aoslec.personalprojectfinal.NetworkTask.NetworkTask;
import com.aoslec.personalprojectfinal.R;

import java.util.ArrayList;

public class ShowOriginStyle extends AppCompatActivity {

    String urlAddr =  null;
    ArrayList<DiaryBook> members;
    DiaryBookAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_origin_style);

        listView = findViewById(R.id.lv_style_book);

        urlAddr = "http://192.168.35.80:8080/test/styleDiaryBookSelectAll.jsp";


    }

    @Override
    protected void onResume() {
        super.onResume();

        connectGetData();

    }

    private void connectGetData() {
        try{
            NetworkTask networkTask = new NetworkTask(ShowOriginStyle.this , urlAddr , "select");
            Object obj = networkTask.execute().get();
            members = (ArrayList<DiaryBook>) obj;

            adapter = new DiaryBookAdapter(ShowOriginStyle.this ,R.layout.style_diary_layout ,members);

            listView.setAdapter(adapter);
//            수정 혹은 삭제 할때
            listView.setOnItemLongClickListener(onItemLongClickListener);
            listView.setOnItemClickListener(onItemClickListener);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener(){
        Intent intent = null;
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
          intent = new Intent(ShowOriginStyle.this , DiaryListActivity.class);
          intent.putExtra("no" , members.get(position).getNo());
          intent.putExtra("image" ,  members.get(position).getImage());
          intent.putExtra("title" ,  members.get(position).getTitle());
          intent.putExtra("hairLength" ,  members.get(position).getHairLength());
          startActivity(intent);
        }
    };

    AdapterView.OnItemLongClickListener onItemLongClickListener = new AdapterView.OnItemLongClickListener() {
        Intent intent = null;
        @Override
        public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(ShowOriginStyle.this, "수정하기 페이지 입니다!", Toast.LENGTH_SHORT).show();
            intent = new Intent(ShowOriginStyle.this , DiaryOriginEditActivity.class);
            intent.putExtra("no" , members.get(position).getNo());
            intent.putExtra("image" ,  members.get(position).getImage());
            intent.putExtra("title" ,  members.get(position).getTitle());
            intent.putExtra("hairLength" ,  members.get(position).getHairLength());
            startActivity(intent);

            return true;
        }
    };




}