package com.livessolution.myservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.livessolution.myservice.fragement.MainFragement;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fregment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragementMain, new MainFragement())
                    .commit();
        }

    } // Main Method

} //Main Class
