package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page79 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page79);
    }
    public void launch82(View v) {
        Intent intent = new Intent(this, page82.class);
        startActivity(intent);
        finish();
    }
    public void launch83(View v) {
        Intent intent = new Intent(this, page83.class);
        startActivity(intent);
        finish();
    }
}
