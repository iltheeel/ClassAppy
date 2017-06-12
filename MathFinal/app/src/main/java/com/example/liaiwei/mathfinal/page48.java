package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page48 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page48);
    }
    public void launch58(View v) {
        Intent intent = new Intent(this, page58.class);
        startActivity(intent);
        finish();
    }
    public void launch59(View v) {
        Intent intent = new Intent(this, page59.class);
        startActivity(intent);
        finish();
    }
}
