package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page90 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page90);
    }
    public void launch91(View v) {
        Intent intent = new Intent(this, page91.class);
        startActivity(intent);
        finish();
    }
    public void launch92(View v) {
        Intent intent = new Intent(this, page92.class);
        startActivity(intent);
        finish();
    }
}
