package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page52 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page52);
    }
    public void launch54(View v) {
        Intent intent = new Intent(this, page54.class);
        startActivity(intent);
        finish();
    }
    public void launch55(View v) {
        Intent intent = new Intent(this, page55.class);
        startActivity(intent);
        finish();
    }
}
