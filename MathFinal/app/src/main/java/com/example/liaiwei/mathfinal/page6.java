package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
    }
    public void launch9(View v) {
        Intent intent = new Intent(this, page9.class);
        startActivity(intent);
        finish();
    }
    public void launch10(View v) {
        Intent intent = new Intent(this, page10.class);
        startActivity(intent);
        finish();
    }
    public void launch11(View v) {
        Intent intent = new Intent(this, page11.class);
        startActivity(intent);
        finish();
    }
}
