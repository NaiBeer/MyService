package com.livessolution.myservice.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.livessolution.myservice.R;

/**
 * Created by Admins on 09/16/17.
 */

public class MainFragement extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_main,container,false);
        return view;


    }   //  Create Fragment View
} // Main Class
