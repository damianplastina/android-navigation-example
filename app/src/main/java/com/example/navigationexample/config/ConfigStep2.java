package com.example.navigationexample.config;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.navigationexample.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ConfigStep2 extends Fragment {

    @BindView(R.id.button_ok)
    Button buttonOk;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_config_step2, container, false);
        ButterKnife.bind(this, view);

        boolean showOkButton = getArguments().getBoolean("show_ok_button");
        if (showOkButton == false) {
            buttonOk.setVisibility(View.INVISIBLE);
        }
        return view;
    }

    @OnClick(R.id.button_ok)
    public void ok(View view) {
        Navigation.findNavController(view).navigate(R.id.action_configStep2_to_configStep3);
    }

}
