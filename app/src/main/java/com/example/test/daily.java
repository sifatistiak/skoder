package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class daily extends AppCompatActivity {
    TextView date,bakikisti,dailykisti,motkisti;
    Spinner spinner;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        String date_n = new SimpleDateFormat("E, MMM dd, yyyy", Locale.getDefault()).format(new Date());
        date = (TextView) findViewById(R.id.datetext);
        date.setText(date_n);

        spinner = (Spinner)findViewById(R.id.spinner);
        bakikisti = (TextView) findViewById(R.id.bakikisti);
        dailykisti = (TextView) findViewById(R.id.dailykisti);
        motkisti = (TextView) findViewById(R.id.motkisti);
        button = (Button)findViewById(R.id.button3);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bakikisti.setText("০");
                dailykisti.setText("২১০০");
                motkisti.setText("২১০০");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                bakikisti.setText("");
                dailykisti.setText("");
                motkisti.setText("");

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(daily.this,"জমা করা হয়েছে",Toast.LENGTH_LONG).show();
                bakikisti.setText("");
                dailykisti.setText("");
                motkisti.setText("");
            }
        });
    }
}
