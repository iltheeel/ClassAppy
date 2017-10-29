package com.example.liaiwei.mathfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OpenPage extends AppCompatActivity {
    private Button buttonmcbuttony;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_page);



        buttonmcbuttony = (Button) findViewById(R.id.enter);
        buttonmcbuttony.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
    }


    private void launchActivity() {
        Intent intent = new Intent(this, page1.class);
        startActivity(intent);
        finish();
    }

}
