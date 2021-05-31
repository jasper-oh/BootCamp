package com.aoslec.day44lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

        EditText edtNum1,edtNum2;
        Button[] buttonNum=new Button[10];
        Button btnAdd,btnMinus,btnDiv,btnClear,btngobhagi;
        TextView txtResult;
        Integer[] btnID={R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,
                R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9};
        String num1,num2;
        Integer result;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_calculator);


            txtResult=(TextView)findViewById(R.id.txtV);
            edtNum1=(EditText)findViewById(R.id.edt1);
            edtNum2=(EditText)findViewById(R.id.edt2);
            btnAdd=(Button)findViewById(R.id.btnplus);
            btnMinus=(Button)findViewById(R.id.btnminus);
            btnDiv=(Button)findViewById(R.id.btndivide);
            btngobhagi=(Button)findViewById(R.id.btngobhagi);
            btnClear=(Button)findViewById(R.id.btnclear);


            for(int i=0;i<buttonNum.length;i++){
                buttonNum[i]=(Button)findViewById(btnID[i]);
            }

            for(int i=0;i<buttonNum.length;i++){
                final int index=i;
                buttonNum[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(edtNum1.isFocused()){
                            num1=edtNum1.getText().toString()+buttonNum[index].getText().toString();
                            edtNum1.setText(num1);
                        }else if(edtNum2.isFocused()){
                            num2=edtNum2.getText().toString()+buttonNum[index].getText().toString();
                            edtNum2.setText(num2);
                        }else{
                            Toast.makeText(getApplicationContext(),"빈값으로 두면 안됩니다 ! ",Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }

            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    num1=edtNum1.getText().toString();
                    num2=edtNum2.getText().toString();

                    if(num1.equals("") || num2.equals("")){
                        Toast.makeText(getApplicationContext(),"빈값 두면 안되욤" ,Toast.LENGTH_SHORT).show();
                        return;
                    }

                    result=Integer.parseInt(num1)+Integer.parseInt(num2);
                    txtResult.setText("계산 결과 : "+result.toString());

                }
            });

            btnMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1=edtNum1.getText().toString();
                    num2=edtNum2.getText().toString();

                    if(num1.equals("") || num2.equals("")){
                        Toast.makeText(getApplicationContext(),"빈값 두면 안되욤" ,Toast.LENGTH_SHORT).show();
                        return;
                    }

                    result=Integer.parseInt(num1)-Integer.parseInt(num2);
                    txtResult.setText("계산 결과 : "+result.toString());
                }
            });

            btnDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1=edtNum1.getText().toString();
                    num2=edtNum2.getText().toString();

                    if(num1.equals("") || num2.equals("")){
                        Toast.makeText(getApplicationContext(),"빈값 두면 안되욤" ,Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if(Integer.parseInt(num2) == 0){
                        Toast.makeText(getApplicationContext(),"0 으로 나누는 것은 불가능합니다.",Toast.LENGTH_SHORT).show();
                        return;
                    }else {
                        result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    }
                    txtResult.setText("계산 결과 : "+result.toString());
                }
            });

            btngobhagi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1=edtNum1.getText().toString();
                    num2=edtNum2.getText().toString();

                    if(num1.equals("") || num2.equals("")){
                        Toast.makeText(getApplicationContext(),"빈값 두면 안되욤" ,Toast.LENGTH_SHORT).show();
                        return;
                    }

                    result=Integer.parseInt(num1)*Integer.parseInt(num2);
                    txtResult.setText("계산 결과 : "+result.toString());
                }
            });

            btnClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    edtNum1.setText("");
                    edtNum2.setText("");
                    txtResult.setText("계산 결과 : ");
                }
            });
        }
    }