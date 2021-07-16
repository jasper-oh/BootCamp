package com.aoslec.networkjson;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class NetworkTask extends AsyncTask<Integer , String , Object> {

    Context context = null;
    String mAddress = null ;
    ProgressDialog progressDialog = null;
    ArrayList<JsonMember> members = null;


    public NetworkTask(Context context, String mAddress) {
        this.context = context;
        this.mAddress = mAddress;
        this.members = new ArrayList<JsonMember>();
    }

    // Progress Dialog Showing in MainActivity so the param is context ( mainActivity)
    @Override
    protected void onPreExecute() {
        progressDialog = new ProgressDialog(context);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setTitle("Dialog");
        progressDialog.setMessage("Down...");
        progressDialog.show();
    }

    // Progress 진행중에 보여주고 싶다면 여기에다가 작성
    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }

    // Progress 끝났다!!!
    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        progressDialog.dismiss();
    }

    // Progress 끝내기
    @Override
    protected void onCancelled() {
        super.onCancelled();
    }

    // Get Server Data ...-> get Several Data Integer... -> same thing like array
    @Override
    protected Object doInBackground(Integer... integers) {
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream =null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try{
            URL url = new URL(mAddress);

            //HTTP 로 연결을 한다고 생각하면 된다.
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);

            if(httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK){

                Log.v("TAG" , "HTTP Success");

                //Json file을 가지고 온다.
                inputStream = httpURLConnection.getInputStream();
                inputStreamReader = new InputStreamReader(inputStream);
                bufferedReader = new BufferedReader(inputStreamReader);

                // Read JSON file
                while(true){
                    String strLine = bufferedReader.readLine();
                    if(strLine == null) break;
                    stringBuffer.append(strLine).append("\n");
                }
                parser(stringBuffer.toString());

            }

        }catch(Exception e){
            e.printStackTrace();

        }finally {
            try{
                if( bufferedReader != null) bufferedReader.close();
                if( inputStreamReader != null) inputStreamReader.close();
                if( inputStream != null) inputStream.close();

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return members;
    }

    public void parser(String json){

        try{

            JSONObject jsonObject = new JSONObject(json);
            JSONArray jsonArray = new JSONArray(jsonObject.getString("members_info"));

            // 또 다른 ArrayList 를 받기 위해서
           members.clear();

            for(int i = 0 ; i < jsonArray.length();i ++){
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                String name = jsonObject1.getString("name");
                Log.v("TAG" , name);
                int age = jsonObject1.getInt("age");
                Log.v("TAG" , " "+age);

                String image = jsonObject1.getString("image");
                ArrayList<String> hobbies = new ArrayList<String>();

                JSONArray jsonArray1 = jsonObject1.getJSONArray("hobbies");
                for( int j = 0 ; j < jsonArray1.length() ; j ++){
                    String hobby = jsonArray1.getString(j);
                    hobbies.add(hobby);
                }

                JSONObject jsonObject2 = jsonObject1.getJSONObject("info");
                int no = jsonObject2.getInt("no");
                String id = jsonObject2.getString("id");
                Log.v("TAG" , id);
                String pw = jsonObject2.getString("pw");



                JsonMember member = new JsonMember(name, age, hobbies , no,id, pw , image);
                members.add(member);

            }

        }catch(Exception e){
            e.printStackTrace();
            Log.v("TAG" , "PARSER fail");
        }
    }
}
