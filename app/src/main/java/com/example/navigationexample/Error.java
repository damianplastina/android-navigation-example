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
public class Error extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_error, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

}
