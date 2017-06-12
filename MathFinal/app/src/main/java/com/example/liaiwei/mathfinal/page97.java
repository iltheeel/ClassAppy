package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page97 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page97);
    }
    public void launch101(View v) {
        Intent intent = new Intent(this, page101.class);
        startActivity(intent);
        finish();
    }
    public void launch102(View v) {
        Intent intent = new Intent(this, page102.class);
        startActivity(intent);
        finish();
    }
}
