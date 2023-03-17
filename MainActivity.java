package com.vardaan.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button btng;
    EditText min_number, max_number;

    Random r;
    int min, max, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        result = (TextView) findViewById(R.id.result);
        btng = (Button) findViewById(R.id.btn);
        min_number = (EditText) findViewById(R.id.min_number);
        max_number = (EditText) findViewById(R.id.max_number);

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String tempMin, tempMax;
                tempMin = min_number.getText().toString();
                tempMax = max_number.getText().toString();

                if(!tempMin.equals("") && !tempMax.equals("")) {

                    min = Integer.parseInt(tempMin);
                    max = Integer.parseInt(tempMax);

                    if(max > min) {

                        output = r.nextInt((max - min) + 1) + min;

                        result.setText("" + output);
                    }
                }
            }
        });

    }
}