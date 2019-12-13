package com.example.myapplication;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import static com.example.myapplication.FirstFragment.SARATH;


public class MainActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final android.support.v4.app.Fragment first = new FirstFragment();
        final android.support.v4.app.Fragment second = new SecondFragment();
        findViewById(R.id.fragment1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.layout, first);
                fragmentTransaction.commit();
            }
        });
        findViewById(R.id.fragment2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.layout, second);
                fragmentTransaction.commit();
            }
        });
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.layout, first);
        fragmentTransaction.commit();
        Log.d(SARATH, "activitylifecycle onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(SARATH, "activitylifecycle onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(SARATH, "activitylifecycle onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(SARATH, "activitylifecycle onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(SARATH, "activitylifecycle onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(SARATH, "activitylifecycle onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(SARATH, "activitylifecycle onDestroy invoked");
    }

}


