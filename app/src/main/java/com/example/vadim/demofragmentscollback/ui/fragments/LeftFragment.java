package com.example.vadim.demofragmentscollback.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.vadim.demofragmentscollback.R;

/**
 * Created by Vadim on 05.02.2017.
 */

public class LeftFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_left, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getView().findViewById(R.id.btn_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayFragment rightFragment = (DisplayFragment) getActivity().getSupportFragmentManager().findFragmentByTag(RightFragment.class.getName());
                if(rightFragment != null){
                    rightFragment.showText("Сообщение из левого фрагмента");
                }
            }
        });

        getView().findViewById(R.id.btn_left_remove_right_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment rightFragment =  getActivity().getSupportFragmentManager().findFragmentByTag(RightFragment.class.getName());
                if (rightFragment != null) {
                    getActivity().getSupportFragmentManager().beginTransaction().remove(rightFragment).commit();
                }
            }
        });
    }
}
