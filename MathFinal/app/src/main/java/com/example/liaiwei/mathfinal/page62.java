package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page62 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page62);
    }
    public void launch65(View v) {
        Intent intent = new Intent(this, page65.class);
        startActivity(intent);
        finish();
    }
    public void launch66(View v) {
        Intent intent = new Intent(this, page66.class);
        startActivity(intent);
        finish();
    }

}
