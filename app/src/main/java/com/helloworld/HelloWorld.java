package com.helloworld;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HelloWorld extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.hello_world_activity);
    }
}
