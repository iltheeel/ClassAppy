package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page77 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page77);
    }
    public void launch78(View v) {
        Intent intent = new Intent(this, page78.class);
        startActivity(intent);
        finish();
    }
    public void launch79(View v) {
        Intent intent = new Intent(this, page79.class);
        startActivity(intent);
        finish();
    }
}
