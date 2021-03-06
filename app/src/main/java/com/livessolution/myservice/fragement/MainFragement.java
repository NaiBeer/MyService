package com.livessolution.myservice.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Button Controller
        buttonController();


    }

    private void buttonController() {
        Button button = (Button) getView().findViewById(R.id.btnGoToSecond);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            getActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentFragementMain,new SecondFragment())
                    .addToBackStack(null)
                    .commit(); //Shit Ctrl Enter
            }
        });
    }
} // Main Class
