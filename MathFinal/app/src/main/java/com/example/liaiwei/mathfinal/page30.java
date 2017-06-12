package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page30);
    }

    public void launch33(View v) {
        Intent intent = new Intent(this, page33.class);
        startActivity(intent);
        finish();
    }
    public void launch34(View v) {
        Intent intent = new Intent(this, page34.class);
        startActivity(intent);
        finish();
    }

}
