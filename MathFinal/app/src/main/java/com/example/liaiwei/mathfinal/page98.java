package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page98 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page98);
    }
    public void launch99(View v) {
        Intent intent = new Intent(this, page99.class);
        startActivity(intent);
        finish();
    }
    public void launch100(View v) {
        Intent intent = new Intent(this, page100.class);
        startActivity(intent);
        finish();
    }
}
