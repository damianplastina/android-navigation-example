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
public class SendMoney extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_send_money, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.button_send_money)
    public void sendMoney(View view) {

        Navigation.findNavController(view).navigate(R.id.action_sendMoney_to_warningSendMoney);
    }

}
