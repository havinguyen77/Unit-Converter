package com.havi.explo.unitconverter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TempActivity extends AppCompatActivity {

    Button convertTm;
    EditText inputUnitTm;
    TextView answerTm;
    Spinner spinnerFirstTm;
    Spinner spinnerSecondTm;


    ArrayAdapter<CharSequence> adapter1Tm;
    ArrayAdapter<CharSequence> adapter2Tm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        convertTm = (Button)findViewById(R.id.buttonConvert);
        inputUnitTm = (EditText)findViewById(R.id.editTextInput);
        answerTm = (TextView)findViewById(R.id.textViewAnswer);
        spinnerFirstTm = (Spinner)findViewById(R.id.spinner1);
        spinnerSecondTm = (Spinner)findViewById(R.id.spinner2);

        adapter1Tm = ArrayAdapter.createFromResource(this, R.array.tempOptions,android.R.layout.simple_spinner_item);
        adapter1Tm.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirstTm.setAdapter(adapter1Tm);
        spinnerFirstTm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2Tm = ArrayAdapter.createFromResource(this, R.array.tempOptions,android.R.layout.simple_spinner_item);
        adapter2Tm.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecondTm.setAdapter(adapter2Tm);
        spinnerSecondTm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        convertTm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option1Tm = (String) spinnerFirstTm.getSelectedItem();
                String option2Tm = (String) spinnerSecondTm.getSelectedItem();
                double inputTm = Double.valueOf(inputUnitTm.getText().toString());
                double calTm;

                //Celsius Conversion
                if(option1Tm.equals("Celsius") && option2Tm.equals("Fahrenheit")){
                    calTm = inputTm*1.8+32;
                    answerTm.setText("" +calTm + " °F");
                }
                if(option1Tm.equals("Celsius") && option2Tm.equals("Kelvin")){
                    calTm = inputTm+273.15;
                    answerTm.setText("" +calTm + " K");
                }
                if(option1Tm.equals("Celsius") && option2Tm.equals("Rankine")){
                    calTm = (inputTm+273.15)*1.8;
                    answerTm.setText("" +calTm + " °Ra");
                }

                //Fahrenheit Conversion
                if(option1Tm.equals("Fahrenheit") && option2Tm.equals("Celsius")){
                    calTm = (inputTm-32)/1.8;
                    answerTm.setText("" +calTm + " °C");
                }
                if(option1Tm.equals("Fahrenheit") && option2Tm.equals("Kelvin")){
                    calTm = (inputTm+ 459.67)*(.55555555555555);
                    answerTm.setText("" +calTm + " K");
                }
                if(option1Tm.equals("Fahrenheit") && option2Tm.equals("Rankine")){
                    calTm = inputTm + 459.67;
                    answerTm.setText("" +calTm + " °Ra");
                }

                //Kelvin Conversions
                if(option1Tm.equals("Kelvin") && option2Tm.equals("Celsius")){
                    calTm = inputTm-273.15;
                    answerTm.setText("" +calTm + " °C");
                }
                if(option1Tm.equals("Kelvin") && option2Tm.equals("Fahrenheit")){
                    calTm = 1.8*(inputTm-273.15)+32;
                    answerTm.setText("" +calTm + " °F");
                }
                if(option1Tm.equals("Kelvin") && option2Tm.equals("Rankine")){
                    calTm = inputTm*1.8;
                    answerTm.setText("" +calTm + " °Ra");
                }

                //Rankine Conversions
                if(option1Tm.equals("Rankine") && option2Tm.equals("Celsius")){
                    calTm = (inputTm-491.67)*(.555555555555555555);
                    answerTm.setText("" +calTm + " °C");
                }
                if(option1Tm.equals("Rankine") && option2Tm.equals("Kelvin")){
                    calTm = (inputTm)*(.555555555555555555555);
                    answerTm.setText("" +calTm + " K");
                }
                if(option1Tm.equals("Rankine") && option2Tm.equals("Fahrenheit")){
                    calTm = (inputTm-491.67) + 32;
                    answerTm.setText("" +calTm + " °F");
                }


            }
        });
    }
}
