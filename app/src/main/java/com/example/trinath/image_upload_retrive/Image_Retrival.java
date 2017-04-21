package com.example.trinath.image_upload_retrive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Image_Retrival extends AppCompatActivity {
    String urlNavHeaderBg = "http://api.androidhive.info/images/nav-menu-header-bg.jpg";
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image__retrival);

    iv = (ImageView) findViewById(R.id.ir);

        Glide.with(this).load(urlNavHeaderBg)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(iv);

    }
}
