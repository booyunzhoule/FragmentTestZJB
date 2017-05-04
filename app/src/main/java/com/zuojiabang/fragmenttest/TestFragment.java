package com.zuojiabang.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by win7 on 2017/4/8.
 */
public class TestFragment extends Fragment {
    private TextView numberText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test,container,false);
        numberText = (TextView) view.findViewById(R.id.fragment_num);
        return view;
    }
}
