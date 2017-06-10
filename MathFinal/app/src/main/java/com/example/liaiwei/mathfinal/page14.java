package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page14);
    }
    public void launch15(View v) {
        Intent intent = new Intent(this, page15.class);
        startActivity(intent);
        finish();
    }
    public void launch16(View v) {
        Intent intent = new Intent(this, page16.class);
        startActivity(intent);
        finish();
    }

}
