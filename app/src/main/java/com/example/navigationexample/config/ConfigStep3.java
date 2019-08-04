package com.example.navigationexample.config;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.navigationexample.R;

import butterknife.ButterKnife;

public class ConfigStep3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_config_step3, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

}
