package com.lutful.zakkatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView zakkat;
    private EditText amount;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zakkat = (TextView) findViewById(R.id.zakkat);
        amount = (EditText) findViewById(R.id.amount);
        calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float total_amount = Float.parseFloat(amount.getText().toString());
                float calculate_Zakkat = total_amount/40;

                zakkat.setText(Float.toString(calculate_Zakkat));


            }
        });

    }
}