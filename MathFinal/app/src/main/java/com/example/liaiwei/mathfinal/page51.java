package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page51 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page51);
    }
    public void launch52(View v) {
        Intent intent = new Intent(this, page52.class);
        startActivity(intent);
        finish();
    }
    public void launch53(View v) {
        Intent intent = new Intent(this, page53.class);
        startActivity(intent);
        finish();
    }
}
