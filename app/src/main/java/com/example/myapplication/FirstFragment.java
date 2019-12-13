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

@SuppressLint("ValidFragment")
public class FirstFragment extends Fragment {
    TextView textView;
    public static final String SARATH = "SARATH";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(SARATH, "fragmentlifecycle onAttach invoked");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(SARATH, "fragmentlifecycle onCreate invoked");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        textView = view.findViewById(R.id.text);
        textView.setText("first");
        Log.d(SARATH, "fragmentlifecycle onCreateView invoked");
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(SARATH, "fragmentlifecycle onActivityCreated invoked");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(SARATH, "fragmentlifecycle onStart invoked");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(SARATH, "fragmentlifecycle onResume invoked");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(SARATH, "fragmentlifecycle onPause invoked");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(SARATH, "fragmentlifecycle onStop invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(SARATH, "fragmentlifecycle onDestroyView invoked");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(SARATH, "fragmentlifecycle onDetach invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(SARATH, "fragmentlifecycle onDestroy invoked");
    }
}
