package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page40);
    }
    public void launch41(View v) {
        Intent intent = new Intent(this, page41.class);
        startActivity(intent);
        finish();
    }
    public void launch42(View v) {
        Intent intent = new Intent(this, page42.class);
        startActivity(intent);
        finish();
    }
}
