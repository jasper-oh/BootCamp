package com.aoslec.dialogtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.call);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AlertDialog.Builder bld = new AlertDialog.Builder(MainActivity.this);
//                bld.setTitle("Announcement");
//                bld.setMessage("Open Dialog");
//                bld.setIcon(R.mipmap.ic_launcher);
//                bld.show();

                //이렇게 많이 사용한다.
                new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Announcement")
                    .setMessage("Open Dialog")
                    .setIcon(R.mipmap.ic_launcher)
                        .setCancelable(false)
                        .setPositiveButton("Close",null)
                    .show();
            }
        });
    }
}