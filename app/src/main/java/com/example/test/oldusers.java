package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class oldusers extends AppCompatActivity {
    TextView date,taka;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldusers);


        date = (TextView) findViewById(R.id.editText10);
        taka = (TextView) findViewById(R.id.editText11);
        search = (Button) findViewById(R.id.button4);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date.setText("০৯ মার্চ ২০১৯");
                taka.setText("২১০০");
            }
        });

    }
}
