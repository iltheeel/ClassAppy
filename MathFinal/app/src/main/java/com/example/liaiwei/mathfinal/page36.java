package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page36);
    }
    public void launch39(View v) {
        Intent intent = new Intent(this, page39.class);
        startActivity(intent);
        finish();
    }
    public void launch40(View v) {
        Intent intent = new Intent(this, page40.class);
        startActivity(intent);
        finish();
    }

}
