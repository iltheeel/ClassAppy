package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page74 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page74);
    }
    public void launch84(View v) {
        Intent intent = new Intent(this, page84.class);
        startActivity(intent);
        finish();
    }
    public void launch85(View v) {
        Intent intent = new Intent(this, page85.class);
        startActivity(intent);
        finish();
    }
    public void launch86(View v) {
        Intent intent = new Intent(this, page86.class);
        startActivity(intent);
        finish();
    }
}
