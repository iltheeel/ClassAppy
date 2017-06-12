package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page65 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page65);
    }
    public void launch67(View v) {
        Intent intent = new Intent(this, page67.class);
        startActivity(intent);
        finish();
    }
    public void launch68(View v) {
        Intent intent = new Intent(this, page68.class);
        startActivity(intent);
        finish();
    }
    public void launch69(View v) {
        Intent intent = new Intent(this, page69.class);
        startActivity(intent);
        finish();
    }
}
