package com.google.cloud.android.speech;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;

public class Loginin extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginin);

        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.button2);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                EditText paswd = (EditText) findViewById(R.id.password);

                EditText usr = (EditText) findViewById(R.id.username);

                if (usr.getText().length() > 0 && paswd.getText().length() > 0) {
                    Intent myIntent = new Intent(Loginin.this,
                            MainActivity.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
