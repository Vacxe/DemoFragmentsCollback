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

    TextView tvLeft;

    Button buttonSend, buttonRemoveRightFragment;

    CallbackFragment callbackFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_left, container, false);
        tvLeft = (TextView) rootView.findViewById(R.id.tv_left);
        buttonSend = (Button) rootView.findViewById(R.id.btn_send);
        buttonRemoveRightFragment = (Button) rootView.findViewById(R.id.btn_left_remove_right_fragment);
        return rootView;
    }

    public void registerCallBack(CallbackFragment callback){
        this.callbackFragment = callback;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // вызываем метод обратного вызова
                callbackFragment.callingBack("Сообщение из левого фрагмента");
            }
        });

        buttonRemoveRightFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RightFragment rightFragment = (RightFragment) getActivity().getSupportFragmentManager().findFragmentByTag(RightFragment.class.getName());
                if (rightFragment != null) {
                    getActivity().getSupportFragmentManager().beginTransaction().remove(rightFragment).commit();
                }
            }
        });
    }
}
