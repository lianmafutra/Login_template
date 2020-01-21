package com.myapp.login_template.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapp.login_template.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_example extends Fragment {


    public fragment_example() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_example, container, false);
    }

}
