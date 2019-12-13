package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.myapplication.FirstFragment.SARATH;


public class SecondFragment extends Fragment {
    TextView textView;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(SARATH, "fragmentlifecycle2 onAttach invoked");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(SARATH, "fragmentlifecycle2 onCreate invoked");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment, container, false);
        textView=view.findViewById(R.id.text);
        textView.setText("Second");
        Log.d(SARATH, "fragmentlifecycle2 onCreateView invoked");
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(SARATH, "fragmentlifecycle2 onActivityCreated invoked");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(SARATH, "fragmentlifecycle2 onStart invoked");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(SARATH, "fragmentlifecycle2 onResume invoked");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(SARATH, "fragmentlifecycle2 onPause invoked");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(SARATH, "fragmentlifecycle2 onStop invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(SARATH, "fragmentlifecycle2 onDestroyView invoked");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(SARATH, "fragmentlifecycle2 onDetach invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(SARATH, "fragmentlifecycle2 onDestroy invoked");
    }
}
