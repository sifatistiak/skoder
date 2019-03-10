package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class addnewac extends AppCompatActivity {

    Button button ,r;
    EditText loan,interest,time;
    TextView show1,show2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewac);

        loan = (EditText) findViewById(R.id.loan) ;
        interest = (EditText) findViewById(R.id.interest) ;
        time = (EditText) findViewById(R.id.time) ;
        show1 = (EditText) findViewById(R.id.show1) ;
        show2 = (EditText) findViewById(R.id.showday) ;

        button = (Button) findViewById(R.id.button);
        r = (Button) findViewById(R.id.button2);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double loand = Double.valueOf(loan.getText().toString());
                Double intd = Double.valueOf(interest.getText().toString());
                Double timed = Double.valueOf(time.getText().toString());
                Double newtaka = loand+(loand*(intd/100)*(timed/12));
                int daykisti = (int) Math.ceil(newtaka/(timed*30));
                show1.setText(newtaka.toString());
                show2.setText(Integer.toString(daykisti));



            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(addnewac.this,"অ্যাকাউন্ট যুক্ত করা হয়েছে",Toast.LENGTH_LONG).show();
            }
        });
    }
}
