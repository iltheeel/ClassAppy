package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page78 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page78);
    }
    public void launch80(View v) {
        Intent intent = new Intent(this, page80.class);
        startActivity(intent);
        finish();
    }
    public void launch81(View v) {
        Intent intent = new Intent(this, page81.class);
        startActivity(intent);
        finish();
    }
}
