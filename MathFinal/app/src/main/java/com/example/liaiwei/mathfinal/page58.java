package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page58 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page58);
    }
    public void launch60(View v) {
        Intent intent = new Intent(this, page60.class);
        startActivity(intent);
        finish();
    }
    public void launch61(View v) {
        Intent intent = new Intent(this, page61.class);
        startActivity(intent);
        finish();
    }
}
