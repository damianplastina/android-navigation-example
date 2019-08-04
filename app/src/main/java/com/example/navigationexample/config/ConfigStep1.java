package com.example.navigationexample.config;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.navigationexample.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ConfigStep1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_config_step1, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.button_ok)
    public void ok(View view) {
        Navigation.findNavController(view).navigate(R.id.action_configStep1_to_configStep2);
    }

}
