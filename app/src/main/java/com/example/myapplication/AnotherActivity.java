package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static com.example.myapplication.FirstFragment.SARATH;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Log.d(SARATH, "Anotheractivity onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(SARATH, "Anotheractivity onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(SARATH, "Anotheractivity onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(SARATH, "Anotheractivity onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(SARATH, "Anotheractivity onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(SARATH, "Anotheractivity onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(SARATH, "Anotheractivity onDestroy invoked");
    }
}
