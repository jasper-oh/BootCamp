package com.aoslec.fragmenttest;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;


public class ToolBarFragment extends Fragment {
    EditText editText = null;
    Button button = null;
    SeekBar seekBar = null;
    int seekValue = 10;

    ToolBarListener activityCallBack;


    // ----

    // Communication with MainActivity using interface

    // In MainActivity, Using implements

    // ----

    public interface ToolBarListener{
        public void onButtonClick(int position , String text);
    }

    //----
    // In Fragment, onAttach() is the very first activated method

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try{
            activityCallBack = (ToolBarListener) context;
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    // where is this onCreateView going ????
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tool_bar,container, false);

        editText = view.findViewById(R.id.f1_edit);
        button = view.findViewById(R.id.f1_button);
        seekBar = view.findViewById(R.id.f1_seek);

        button.setOnClickListener(mClickListener);
        seekBar.setOnSeekBarChangeListener(mSeekBarChangedListener);

        return view;
    }

    SeekBar.OnSeekBarChangeListener mSeekBarChangedListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            seekValue = progress;

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    // -- MainActivity 의 onButtonClick()에서 실행
    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            activityCallBack.onButtonClick(seekValue,editText.getText().toString());
        }
    };


}