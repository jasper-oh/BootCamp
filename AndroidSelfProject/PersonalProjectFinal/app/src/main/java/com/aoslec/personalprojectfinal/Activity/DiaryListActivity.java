package com.aoslec.personalprojectfinal.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.aoslec.personalprojectfinal.Adapter.DiaryAdapter;
import com.aoslec.personalprojectfinal.Adapter.DiaryBookAdapter;
import com.aoslec.personalprojectfinal.Bean.DiaryBook;
import com.aoslec.personalprojectfinal.Bean.DiaryBookList;
import com.aoslec.personalprojectfinal.NetworkTask.NetworkTask;
import com.aoslec.personalprojectfinal.NetworkTask.NetworkTaskDiary;
import com.aoslec.personalprojectfinal.R;

import java.util.ArrayList;

public class DiaryListActivity extends AppCompatActivity {

    String urlAddr = null;
    String title = null;
    int diary_no = 0;
    Button btn_diary_write;
    TextView tv_diary_list_title;
    ArrayList<DiaryBookList> styles;
    DiaryAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_list);

        listView = findViewById(R.id.lv_style_diary);

        btn_diary_write = findViewById(R.id.btn_diary_write);


        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        diary_no = intent.getIntExtra("no" , 0);



        btn_diary_write.setOnClickListener(onClickListener);

        tv_diary_list_title = findViewById(R.id.tv_diary_list_title);
        tv_diary_list_title.setText(title);

        urlAddr = "http://192.168.35.80:8080/test/diarySelectAll.jsp?diaryNo="+diary_no;


    }
    protected void onResume() {
        super.onResume();

        connectGetData();

    }
    private void connectGetData() {
        try{
            NetworkTaskDiary networkTaskDiary = new NetworkTaskDiary(DiaryListActivity.this , urlAddr , "select");
            Object obj = networkTaskDiary.execute().get();
            styles = (ArrayList<DiaryBookList>) obj;

            adapter = new DiaryAdapter(DiaryListActivity.this ,R.layout.style_diary_list_layout ,styles);

            listView.setAdapter(adapter);


            // 자세히 보기 -> update & delete
            listView.setOnItemClickListener(onItemClickListener);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(DiaryListActivity.this , DiaryWriteActivity.class);
            intent.putExtra("diary_no" , diary_no);
            startActivity(intent);
        }
    };

    AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(DiaryListActivity.this , DiaryListDetailActivity.class);
            intent.putExtra("no" , styles.get(position).getNo());
            intent.putExtra("date" , styles.get(position).getStyleDate());
            intent.putExtra("image" ,  styles.get(position).getImage());
            intent.putExtra("hairShop" ,  styles.get(position).getHairShop());
            intent.putExtra("designer" ,  styles.get(position).getDesignerName());
            intent.putExtra("comments" , styles.get(position).getContents());
            startActivity(intent);

        }
    };

}