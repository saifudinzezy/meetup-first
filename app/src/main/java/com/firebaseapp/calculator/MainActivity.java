package com.firebaseapp.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2;
    Button btnPlus, btnMinus, btnDivision, btnMultipication;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate / inisialisati
        //button
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnDivision = findViewById(R.id.btn_division);
        btnMultipication = findViewById(R.id.btn_multiplication);
        //textview
        result = findViewById(R.id.result);
        //edittext
        edt1 = findViewById(R.id.edt_1);
        edt2 = findViewById(R.id.edt_2);

        //create event onClick
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edt1.getText().toString());
                int value2 = Integer.parseInt(edt2.getText().toString());
                result.setText("Hasil : "+(value1 + value2));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edt1.getText().toString());
                int value2 = Integer.parseInt(edt2.getText().toString());
                result.setText("Hasil : "+(value1 - value2));
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edt1.getText().toString());
                int value2 = Integer.parseInt(edt2.getText().toString());
                result.setText("Hasil : "+(value1 / value2));
            }
        });

        btnMultipication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edt1.getText().toString());
                int value2 = Integer.parseInt(edt2.getText().toString());
                result.setText("Hasil : "+(value1 * value2));
            }
        });
    }
}
