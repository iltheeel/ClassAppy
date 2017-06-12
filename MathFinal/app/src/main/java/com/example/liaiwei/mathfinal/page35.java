package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page35);
    }
    public void launch36(View v) {
        Intent intent = new Intent(this, page36.class);
        startActivity(intent);
        finish();
    }
    public void launch37(View v) {
        Intent intent = new Intent(this, page37.class);
        startActivity(intent);
        finish();
    }
    public void launch38(View v) {
        Intent intent = new Intent(this, page38.class);
        startActivity(intent);
        finish();
    }
}
