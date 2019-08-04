package com.example.navigationexample;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.button_send_money)
    public void goToSendMoney(View view) {
        Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_sendMoney);
    }

    @OnClick(R.id.button_configuration_step_1)
    public void goToConfigurationStep1(View view) {
        Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_configStep1);
    }

    @OnClick(R.id.button_configuration_step_2)
    public void goToConfigurationStep2(View view) {
        Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_configStep2);
    }

}
