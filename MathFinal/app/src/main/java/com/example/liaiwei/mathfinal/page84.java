package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page84 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page84);
    }
    public void launch87(View v) {
        Intent intent = new Intent(this, page87.class);
        startActivity(intent);
        finish();
    }
    public void launch88(View v) {
        Intent intent = new Intent(this, page88.class);
        startActivity(intent);
        finish();
    }
}
