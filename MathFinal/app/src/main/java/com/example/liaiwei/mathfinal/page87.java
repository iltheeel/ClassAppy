package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page87 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page87);
    }
    public void launch94(View v) {
        Intent intent = new Intent(this, page94.class);
        startActivity(intent);
        finish();
    }
    public void launch96(View v) {
        Intent intent = new Intent(this, page96.class);
        startActivity(intent);
        finish();
    }
}
