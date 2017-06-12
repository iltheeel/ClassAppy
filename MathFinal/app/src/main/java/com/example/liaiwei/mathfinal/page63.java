package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page63 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page63);
    }
    public void launch70(View v) {
        Intent intent = new Intent(this, page70.class);
        startActivity(intent);
        finish();
    }
    public void launch71(View v) {
        Intent intent = new Intent(this, page71.class);
        startActivity(intent);
        finish();
    }
}
