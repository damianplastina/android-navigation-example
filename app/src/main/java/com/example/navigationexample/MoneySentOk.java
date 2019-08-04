package com.example.navigationexample;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoneySentOk extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_money_sent_ok, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

}
