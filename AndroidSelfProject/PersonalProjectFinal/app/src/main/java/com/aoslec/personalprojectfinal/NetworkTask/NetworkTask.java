package com.aoslec.personalprojectfinal.NetworkTask;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.renderscript.ScriptGroup;

import com.aoslec.personalprojectfinal.Bean.DiaryBook;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class NetworkTask extends AsyncTask<Integer , String, Object> {
    Context context;
    String mAddress;
    ProgressDialog progressDialog;
    ArrayList<DiaryBook> members;

    // NetWork Task 를 검색 입력 수정삭제 구분 없이 하나로 사용키 위해 생성자 변수 추가.
    String where = null;

    public NetworkTask(Context context, String mAddress,  String where) {
        this.context = context;
        this.mAddress = mAddress;
        this.members = members;
        this.members = new ArrayList<DiaryBook>();
        this.where = where;
    }

    @Override
    protected void onPreExecute() {
        progressDialog = new ProgressDialog(context);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setTitle("Dialog");
        progressDialog.setMessage("Get.....");
        progressDialog.show();
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        progressDialog.dismiss();
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        progressDialog.dismiss();
    }


    @Override
    protected Object doInBackground(Integer... integers) {
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        String result = null;

        try{
            URL url = new URL(mAddress);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);

            if(httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK){
                inputStream = httpURLConnection.getInputStream();
                inputStreamReader = new InputStreamReader(inputStream);
                bufferedReader  = new BufferedReader(inputStreamReader);

                while(true){
                    String strLine = bufferedReader.readLine();
                    if(strLine == null ) break;
                    stringBuffer.append(strLine + "\n");
                }

                if(where.equals("select")){
                    parserSelect(stringBuffer.toString());
                } else {
                    result = parserAction(stringBuffer.toString());
                }

            }


        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(bufferedReader != null) bufferedReader.close();
                if(inputStreamReader != null) inputStreamReader.close();
                if(inputStream != null) inputStream.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        if(where.equals("select")){
            return members;
        }else {
            return result;
        }


    }

    private String parserAction(String str){
        String returnValue = null;
        try{
            JSONObject jsonObject = new JSONObject(str);
            returnValue = jsonObject.getString("result");

        }catch(Exception e){
            e.printStackTrace();
        }

        return returnValue;
    }

    private void parserSelect(String str){
        try{
            JSONObject jsonObject = new JSONObject(str);

            JSONArray jsonArray = new JSONArray(jsonObject.getString("diary_book"));
            members.clear();

            for(int i= 0 ; i<jsonArray.length();i++){
                JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
                int no = jsonObject1.getInt("no");
                String image = jsonObject1.getString("titleimage");
                String title = jsonObject1.getString("styletitle");
                String hairLength = jsonObject1.getString("stylelength");

                DiaryBook style = new DiaryBook(image,title,hairLength,no);
                members.add(style);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
