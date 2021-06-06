package com.aoslec.listadddel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button add,delete;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<String>();
        items.add("First");
        items.add("Second");
        items.add("Third");

        //simple_list_item_single_choice - > 라디오 버튼 나오는 것
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice,items);

        list = findViewById(R.id.list);
        list.setAdapter(adapter);

        //simple_list_item_single_choice - > 라디오 버튼 나오는 것
        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        list.setOnItemClickListener(mItemClickListener);

        findViewById(R.id.add).setOnClickListener(mClickListener);
        findViewById(R.id.delete).setOnClickListener(mClickListener);


    }//--oncreate

    AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String message;
            message = "select item = " + items.get(position);
            Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText editText = findViewById(R.id.et01);
            switch(v.getId()){
                case R.id.add:
                    String text = editText.getText().toString();
                    if(text.length() != 0){
                        items.add(text);
                        editText.setText("");
                        // 데이터 추가에 대한 것을 어뎁터에게 보여주는 역할
                        adapter.notifyDataSetChanged();
                    }
                    break;
                case R.id.delete:
                    int id;
                    id = list.getCheckedItemPosition();
                    if(id != ListView.INVALID_POSITION){
                        items.remove(id);
                        adapter.notifyDataSetChanged();
                        list.clearChoices();
                    }
                    break;

            }
        }
    };


}//--end