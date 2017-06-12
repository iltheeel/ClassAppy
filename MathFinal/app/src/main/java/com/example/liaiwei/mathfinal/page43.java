package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page43);
    }
    public void launch45(View v) {
        Intent intent = new Intent(this, page45.class);
        startActivity(intent);
        finish();
    }
    public void launch46(View v) {
        Intent intent = new Intent(this, page46.class);
        startActivity(intent);
        finish();
    }
    public void launch47(View v) {
        Intent intent = new Intent(this, page47.class);
        startActivity(intent);
        finish();
    }
}
