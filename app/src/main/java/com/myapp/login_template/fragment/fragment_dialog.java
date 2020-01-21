package com.myapp.login_template.fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapp.login_template.R;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_dialog extends DialogFragment {

    public fragment_dialog() {
        // Required empty public constructor
    }


    @SuppressLint("WrongConstant")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_dialog, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;

    }

}
