package com.example.vadim.demofragmentscollback.ui;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.vadim.demofragmentscollback.R;
import com.example.vadim.demofragmentscollback.ui.fragments.LeftFragment;
import com.example.vadim.demofragmentscollback.ui.fragments.RightFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.app_name));

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerLeft, new LeftFragment(), LeftFragment.class.getName());
        fragmentTransaction.commit();

        FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction2.replace(R.id.containerRight, new RightFragment(), RightFragment.class.getName());
        fragmentTransaction2.commit();
    }
}
