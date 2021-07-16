package com.aoslec.orderdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.call);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final LinearLayout linear = (LinearLayout) View.inflate(MainActivity.this , R.layout.order , null);

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Check the info")
                        .setIcon(R.mipmap.ic_launcher)
                        .setView(linear)
                        .setPositiveButton("Check", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                EditText product = linear.findViewById(R.id.product);
                                EditText number = linear.findViewById(R.id.number);
                                CheckBox paymethod = linear.findViewById(R.id.paymethod);
                                TextView textView = findViewById(R.id.text);
                                textView.setText("Order Info : " + product.getText() + "product , " + number.getText() + "개" + (paymethod.isChecked() ? "착불결제" : " "));
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                TextView textView = findViewById(R.id.text);
                                textView.setText("Order was Cancelled");
                            }
                        })
                        .show();
            }
        });

    }
}