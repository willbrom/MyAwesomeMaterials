package com.wilbrom.myawesomematerials;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main5Activity extends AppCompatActivity {

    AnimationDrawable mAnimationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ImageView imageView = (ImageView) findViewById(R.id.imageView4);
        imageView.setImageResource(R.drawable.cycle_animation);
        mAnimationDrawable = (AnimationDrawable) imageView.getDrawable();
        mAnimationDrawable.start();
    }
}
