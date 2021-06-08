package com.aoslec.fragmenttest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;


public class TextFragment extends Fragment {
    TextView textView = null;


    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text,container,false);

        textView = view.findViewById(R.id.f2_text);

        return view;

    }

    public void changeTextProperties(int fontSize , String text){
        textView.setTextSize(fontSize);
        textView.setText(text);
    }
}