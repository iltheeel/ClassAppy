package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page20);
    }
    public void launch48(View v) {
        Intent intent = new Intent(this, page48.class);
        startActivity(intent);
        finish();
    }
    public void launch49(View v) {
        Intent intent = new Intent(this, page49.class);
        startActivity(intent);
        finish();
    }
    public void launch50(View v) {
        Intent intent = new Intent(this, page50.class);
        startActivity(intent);
        finish();
    }
}
