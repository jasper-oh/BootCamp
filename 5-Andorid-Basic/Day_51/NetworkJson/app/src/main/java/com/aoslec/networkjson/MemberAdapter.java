package com.aoslec.networkjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MemberAdapter extends BaseAdapter {
    private Context mContext;
    private int layout;
    private ArrayList<JsonMember> data ;
    private LayoutInflater inflater;

    public MemberAdapter(Context mContext, int layout, ArrayList<JsonMember> data) {
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
        return data.get(position).getId();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflate 는 내가 올릴 layout 이다.
        convertView = inflater.inflate(this.layout , parent, false);
        TextView tv_name = convertView.findViewById(R.id.tv_name);
        TextView tv_age = convertView.findViewById(R.id.tv_age);
        TextView tv_hobbies = convertView.findViewById(R.id.tv_hobbies);
        TextView tv_no = convertView.findViewById(R.id.tv_no);
        TextView tv_id = convertView.findViewById(R.id.tv_id);



        tv_name.setText("Name : "+data.get(position).getName());
        tv_age.setText("Age : "+data.get(position).getAge());
        tv_hobbies.setText("Hobbies : "+data.get(position).getHobbies());
        tv_no.setText("No : "+data.get(position).getNo());
        tv_id.setText("ID : "+data.get(position).getId());

        if ((position % 2) == 1){
            convertView.setBackgroundColor(0x0000ff);
        }else{
            convertView.setBackgroundColor(0x0000ff);
        }

        return convertView;
    }
}
