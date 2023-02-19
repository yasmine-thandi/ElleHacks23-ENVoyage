package com.example.EnVoyage;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class PopThree extends PopTwo {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindowthree);

        DisplayMetrics Dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(Dm);

        int Width = Dm.widthPixels;
        int Height = Dm.heightPixels;

        getWindow().setLayout(Width, Height);



    }
}
