package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page26);
    }
    public void launch29(View v) {
        Intent intent = new Intent(this, page29.class);
        startActivity(intent);
        finish();
    }
    public void launch30(View v) {
        Intent intent = new Intent(this, page30.class);
        startActivity(intent);
        finish();
    }

}
