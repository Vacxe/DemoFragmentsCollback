package com.example.vadim.demofragmentscollback.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vadim.demofragmentscollback.R;

/**
 * Created by Vadim on 05.02.2017.
 */

public class RightFragment extends Fragment implements CallbackFragment{

    TextView tvRight;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_right, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvRight = (TextView) getActivity().findViewById(R.id.tv_right);
        LeftFragment leftFragment = (LeftFragment) getActivity().getSupportFragmentManager().findFragmentByTag(LeftFragment.class.getName());
        if (leftFragment != null) {
            leftFragment.registerCallBack(this);
        };
    }

    @Override
    public void callingBack(String s) {
        tvRight.setText(s);
    }
}