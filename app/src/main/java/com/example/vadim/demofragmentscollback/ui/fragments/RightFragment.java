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

public class RightFragment extends Fragment implements DisplayFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    @Override
    public void showText(String s) {
        ((TextView) getView().findViewById(R.id.tv_right)).setText(s);
    }
}