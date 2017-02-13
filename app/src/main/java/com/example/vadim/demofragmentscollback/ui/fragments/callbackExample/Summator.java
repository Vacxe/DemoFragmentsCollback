package com.example.vadim.demofragmentscollback.ui.fragments.callbackExample;

/**
 * Created by konstantinaksenov on 13.02.17.
 */

public class Summator {
    final SummatorCallback summatorCallback;


    public Summator(SummatorCallback summatorCallback) {
        this.summatorCallback = summatorCallback;
    }

    public void calculateSumm(int first, int second){
        this.summatorCallback.result(first + second);
    }
}
