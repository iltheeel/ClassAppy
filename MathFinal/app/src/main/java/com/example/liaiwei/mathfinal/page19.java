package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page19);
    }

    public void launch20(View v) {
        Intent intent = new Intent(this, page20.class);
        startActivity(intent);
        finish();
    }
    public void launch21(View v) {
        Intent intent = new Intent(this, page21.class);
        startActivity(intent);
        finish();
    }
    public void launch22(View v) {
        Intent intent = new Intent(this, page22.class);
        startActivity(intent);
        finish();
    }

}
