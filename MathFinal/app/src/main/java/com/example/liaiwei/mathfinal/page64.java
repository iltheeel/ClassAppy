package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page64 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page64);
    }
    public void launch74(View v) {
        Intent intent = new Intent(this, page74.class);
        startActivity(intent);
        finish();
    }
    public void launch75(View v) {
        Intent intent = new Intent(this, page75.class);
        startActivity(intent);
        finish();
    }
    public void launch76(View v) {
        Intent intent = new Intent(this, page76.class);
        startActivity(intent);
        finish();
    }
}
