package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page38);
    }
    public void launch43(View v) {
        Intent intent = new Intent(this, page43.class);
        startActivity(intent);
        finish();
    }
    public void launch44(View v) {
        Intent intent = new Intent(this, page44.class);
        startActivity(intent);
        finish();
    }
}
