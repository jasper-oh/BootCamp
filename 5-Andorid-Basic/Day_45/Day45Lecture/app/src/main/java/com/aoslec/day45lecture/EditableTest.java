package com.aoslec.day45lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditableTest extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editable_test);

        editText = findViewById(R.id.etNum);
        Button btn1 = findViewById(R.id.btnIns);
        btn1.setOnClickListener(clickListener);

        findViewById(R.id.btnDel).setOnClickListener(clickListener);
        findViewById(R.id.btnApp).setOnClickListener(clickListener);
        findViewById(R.id.btnRep).setOnClickListener(clickListener);
        findViewById(R.id.btnClear).setOnClickListener(clickListener);

    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Editable 로 받아서 사용해야 한다.
            Editable edit = editText.getText();
            switch (v.getId()) {
                case R.id.btnIns:
                    edit.insert(0, "INS");
                    break;
                case R.id.btnDel:
                    edit.delete(2, 5);
                    break;
                case R.id.btnApp:
                    edit.append("APP");
                    break;
                case R.id.btnRep:
                    edit.replace(2, 5, "REP");
                    break;
                case R.id.btnClear:
                    edit.clear();
                    break;
            }
        }
    };
}
