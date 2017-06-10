package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);
    }

    public void launch12(View v) {
        Intent intent = new Intent(this, page12.class);
        startActivity(intent);
        finish();
    }
    public void launch13(View v) {
        Intent intent = new Intent(this, page13.class);
        startActivity(intent);
        finish();
    }
    public void launch14(View v) {
        Intent intent = new Intent(this, page14.class);
        startActivity(intent);
        finish();
    }
}
