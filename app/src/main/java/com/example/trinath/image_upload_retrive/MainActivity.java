package com.example.trinath.image_upload_retrive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Retrival(View v )
    {
        Intent i = new Intent(MainActivity.this,Image_Retrival.class);
        startActivity(i);
    }
    public void Upload(View v )
    {
        Intent i = new Intent(MainActivity.this,Upload_image.class);
        startActivity(i);
    }
}
