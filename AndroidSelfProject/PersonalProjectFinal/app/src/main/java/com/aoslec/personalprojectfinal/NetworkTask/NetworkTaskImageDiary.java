package com.aoslec.personalprojectfinal.NetworkTask;


import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class NetworkTaskImageDiary extends AsyncTask<Integer ,String , Integer> {

    Context context;
    String mAddr ;
    String devicePath;
    ImageView imageView;
    ProgressDialog progressDialog = null;
    String title;
    String hairLength;



    public NetworkTaskImageDiary(Context context , ImageView imageView , String devicePath , String mAddr , String title, String hairLength){
        this.context = context;
        this.mAddr = mAddr;
        this.devicePath = devicePath;
        this.imageView = imageView;
        this.title = title;
        this.hairLength = hairLength;

    }

    @Override
    protected void onPreExecute() {

        progressDialog = new ProgressDialog(context);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setTitle("Status");
        progressDialog.setMessage("Uploading ....");
        progressDialog.show();

    }

    @Override
    protected void onProgressUpdate(String... values) {

        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Integer integer) {

        progressDialog.dismiss();

    }


    @Override
    protected Integer doInBackground(Integer... integers) {
        File file = new File(devicePath);
        OkHttpClient okHttpClient = new OkHttpClient();

        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("image" , file.getName() , RequestBody.create(file , MediaType.parse("image/jpeg")))
                .addFormDataPart("title" , title)
                .addFormDataPart("hairLength",hairLength)
                .build();

        Request request = new Request.Builder()
                .url(mAddr)
                .post(requestBody)
                .build();

        try{
            Response response = okHttpClient.newCall(request).execute();
            return 1;
        } catch (IOException e){
            e.printStackTrace();
            return 0;

        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }

    }
}
