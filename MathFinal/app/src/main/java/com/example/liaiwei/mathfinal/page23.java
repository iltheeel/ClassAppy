package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page23);
    }

    public void launch24(View v) {
        Intent intent = new Intent(this, page24.class);
        startActivity(intent);
        finish();
    }
    public void launch25(View v) {
        Intent intent = new Intent(this, page25.class);
        startActivity(intent);
        finish();
    }
    public void launch35(View v) {
        Intent intent = new Intent(this, page35.class);
        startActivity(intent);
        finish();
    }
}
