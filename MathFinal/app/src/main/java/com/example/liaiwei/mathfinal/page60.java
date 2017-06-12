package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page60 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page60);
    }
    public void launch62(View v) {
        Intent intent = new Intent(this, page62.class);
        startActivity(intent);
        finish();
    }
    public void launch63(View v) {
        Intent intent = new Intent(this, page63.class);
        startActivity(intent);
        finish();
    }
    public void launch64(View v) {
        Intent intent = new Intent(this, page64.class);
        startActivity(intent);
        finish();
    }
}
