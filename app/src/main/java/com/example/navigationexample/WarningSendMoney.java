package com.example.navigationexample;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class WarningSendMoney extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_warning_send_money, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.button_yes)
    public void confirmSendMoney(View view) {

        @IdRes int resIdDestination = R.id.action_warningSendMoney_to_moneySentOk;

        if (getRandomBoolean() == false) {
            resIdDestination = R.id.action_warningSendMoney_to_error;
        }

        Navigation.findNavController(view).navigate(resIdDestination);
    }


    @OnClick(R.id.button_no)
    public void regretSendMoney(View view) {

        Navigation.findNavController(view).navigateUp();
    }

    private boolean getRandomBoolean() {

        return  Math.random() < 0.5;
    }

}
