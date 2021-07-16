package com.aoslec.customadapterview;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends BaseAdapter {


//    화면에 그림을 그려주는 것 Context

    private Context mContext = null;
    private int layout = 0;
    private ArrayList<Weather> data = null;
    private LayoutInflater inflater = null;

//    Constructor

    //Layout 안에 Layout 을 추가 하는 것으로 아는것이 inflator 이다. 조금만 더 생각해보면 이해 될듯 . 메소드 getSystemService 에 대해서 공부도 해보자
    public WeatherAdapter(Context mContext,int layout,ArrayList<Weather> data){
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
        return data.get(position).getDay();
    }


    @Override
    public long getItemId(int position) {
        return position;
    }



//     중요하다. 어떻게 만들어주느냐 가 여기에 달렸다 아래의 메소드 체크 하기 !!!

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            // 데이터가 들어가는 한 줄 이 convertView
            convertView = inflater.inflate(this.layout,parent,false);

        }
        TextView tv_day = convertView.findViewById(R.id.tv_day);
        ImageView iv_icon = convertView.findViewById(R.id.iv_weather);
        TextView tv_comment = convertView.findViewById(R.id.tv_comment);


        tv_day.setText(data.get(position).getDay() + " ");
        iv_icon.setImageResource(data.get(position).getIcon());
        tv_comment.setText(data.get(position).getComment());

        if(position % 2 ==1 ){
            convertView.setBackgroundColor(0x5000ff00);

        }else{
            convertView.setBackgroundColor(0x2000ff00);
        }

        return convertView;
    }
}
