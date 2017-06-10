package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void launchtown(View v) {
        Intent intent = new Intent(this, page4.class);
        startActivity(intent);
        finish();
    }

    public void launchbs(View v) {
        Intent intent = new Intent(this, page3.class);
        startActivity(intent);
        finish();
    }

}
