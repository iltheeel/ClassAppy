package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page22);
    }
    public void launch23(View v) {
        Intent intent = new Intent(this, page23.class);
        startActivity(intent);
        finish();
    }
}
