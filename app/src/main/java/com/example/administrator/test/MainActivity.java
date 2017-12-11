package com.example.administrator.test;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


/**
 * 帧动画,frame-by-frame animations
 * AnimationDrawable
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.iv);
        AnimationDrawable ad = (AnimationDrawable) iv.getBackground();
        ad.start();

    }


}
