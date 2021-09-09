package com.zyl.pigprice1.ui.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zyl.pigprice1.MainActivity;
import com.zyl.pigprice1.R;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }


    public void clickMe(View view) {
        Intent intent = new Intent();
        intent.setClass(TestActivity.this, MainActivity.class);
        startActivity(intent);
    }
}