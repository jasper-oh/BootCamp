package com.aoslec.datajson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "Status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parser();
    }

    private void parser(){
        // --
        Log.v(TAG , "parser()");
        InputStream inputStream = getResources().openRawResource(R.raw.jsonex);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // --


        StringBuffer stringBuffer = new StringBuffer();
        String line = null;

        try{
            while((line = bufferedReader.readLine()) != null){
                stringBuffer.append(line);

            }

            Log.v(TAG,"StringBuffer" + stringBuffer.toString());

            JSONObject jsonObject = new JSONObject(stringBuffer.toString());
            JSONArray jsonArray = new JSONArray(jsonObject.getString("members_info"));
            for (int i=0 ; i < jsonArray.length() ; i++){
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                JSONObject jsonObject2 = (JSONObject) jsonArray.get(i);
                String name = jsonObject2.getString("name");
                Log.v(TAG ,"name :" + name);
                int age = jsonObject2.getInt("age");
                Log.v(TAG , "age : " + age);

                JSONArray jsonArray1 = jsonObject2.getJSONArray("hobbies");
                for(int j = 0 ; j < jsonArray.length() ; j++){
                    String hobby = jsonArray1.getString(j);
                    Log.v(TAG , "hobby : " + hobby);
                }

                JSONObject jsonObject3 = jsonObject2.getJSONObject("info");
                int no = jsonObject3.getInt("no");
                Log.v(TAG , " no : " + no);
                String id  = jsonObject3.getString("id");
                Log.v(TAG , "ID : " + id);
                String pw  = jsonObject3.getString("pw");
                Log.v(TAG , "pw : " + pw);

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(inputStream != null) inputStream.close();
                if (inputStreamReader != null) inputStreamReader.close();
                if(bufferedReader != null) bufferedReader.close();

            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}