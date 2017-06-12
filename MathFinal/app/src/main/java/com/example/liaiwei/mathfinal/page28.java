package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page28);
    }
    public void launch31(View v) {
        Intent intent = new Intent(this, page31.class);
        startActivity(intent);
        finish();
    }
    public void launch32(View v) {
        Intent intent = new Intent(this, page32.class);
        startActivity(intent);
        finish();
    }
}
