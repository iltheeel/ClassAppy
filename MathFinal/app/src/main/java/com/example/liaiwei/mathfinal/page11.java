package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
    }
    public void reset(View v) {
        Intent intent = new Intent(this, OpenPage.class);
        startActivity(intent);
        finish();
    }

    public void viewSolution(View v)  {
        Uri uri = Uri.parse(getString(R.string.answer_key));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
