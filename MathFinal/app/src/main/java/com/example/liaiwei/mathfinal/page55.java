package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page55 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page55);
    }
    public void launch56(View v) {
        Intent intent = new Intent(this, page56.class);
        startActivity(intent);
        finish();
    }
    public void launch57(View v) {
        Intent intent = new Intent(this, page57.class);
        startActivity(intent);
        finish();
    }
}
