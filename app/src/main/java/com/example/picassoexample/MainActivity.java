package com.example.picassoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView mImg1;
    ImageView mImg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImg1 = (ImageView) findViewById(R.id.img1);
        mImg2 = (ImageView) findViewById(R.id.img2);
    }

    public void doMagic(View view) {
       Picasso.with(this)
                .load("https://lh5.googleusercontent.com/-TP2wcJeq8e0/AAAAAAAAAAI/AAAAAAAAOHY/j1bvqP2M4x4/s0-c-k-no-ns/photo.jpg")
                //.load("https://upload.wikimedia.org/wikipedia/commons/2/2c/Rotating_earth_(large).gif")
              .into(mImg1);
        GlideDrawableImageViewTarget imageViewTarget
                = new GlideDrawableImageViewTarget(mImg2);

        Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/2/2c/Rotating_earth_(large).gif")
                .into (imageViewTarget);
    }
}
