package com.aoslec.personalprojectfinal.Adapter;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aoslec.personalprojectfinal.Bean.DiaryBook;
import com.aoslec.personalprojectfinal.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;



public class DiaryBookAdapter extends BaseAdapter {
    private Context mContext = null;
    private int layout = 0;
    private ArrayList<DiaryBook> data = null;
    private LayoutInflater inflater= null;

    public DiaryBookAdapter(Context mContext, int layout, ArrayList<DiaryBook> data) {
        this.mContext = mContext;
        this.layout = layout;
        this.data = data;
        this.inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("AAA" , "convert Enter");
        convertView = inflater.inflate(this.layout , parent , false);
        ImageView origin_image = convertView.findViewById(R.id.origin_image);
        TextView origin_title = convertView.findViewById(R.id.origin_title);
        TextView origin_styleLength = convertView.findViewById(R.id.origin_styleLength);
//        TextView origin_styleCount = convertView.findViewById(R.id.origin_styleCount);

        Uri uri = Uri.parse(data.get(position).getImage());
        try {
            InputStream inputStream = mContext.getContentResolver().openInputStream(uri);
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            origin_image.setImageBitmap(bitmap);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        origin_title.setText(data.get(position).getTitle());
        origin_styleLength.setText(data.get(position).getHairLength());
//        origin_styleCount.setText("총 " + data.get(position).getInfoCount() + " 개의 기록");

        return convertView;
    }

 //====



}
