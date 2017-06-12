package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page96 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page96);
    }
    public void launch97(View v) {
        Intent intent = new Intent(this, page97.class);
        startActivity(intent);
        finish();
    }
    public void launch98(View v) {
        Intent intent = new Intent(this, page98.class);
        startActivity(intent);
        finish();
    }
}
