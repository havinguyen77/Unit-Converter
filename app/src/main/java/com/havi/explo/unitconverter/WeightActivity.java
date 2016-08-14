package com.havi.explo.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class WeightActivity extends AppCompatActivity {

    Button convertWt;
    EditText inputUnitWt;
    TextView answerWt;
    Spinner spinnerFirstWt;
    Spinner spinnerSecondWt;


    ArrayAdapter<CharSequence> adapter1Wt;
    ArrayAdapter<CharSequence> adapter2Wt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);


        convertWt = (Button)findViewById(R.id.buttonConvert);
        inputUnitWt = (EditText)findViewById(R.id.editTextInputWeight);
        answerWt = (TextView)findViewById(R.id.textViewAnswerWeight);
        spinnerFirstWt = (Spinner)findViewById(R.id.spinner1);
        spinnerSecondWt = (Spinner)findViewById(R.id.spinner2);

        adapter1Wt = ArrayAdapter.createFromResource(this, R.array.weightOptions,android.R.layout.simple_spinner_item);
        adapter1Wt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirstWt.setAdapter(adapter1Wt);
        spinnerFirstWt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2Wt = ArrayAdapter.createFromResource(this, R.array.weightOptions,android.R.layout.simple_spinner_item);
        adapter2Wt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecondWt.setAdapter(adapter2Wt);
        spinnerSecondWt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        convertWt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option1wt = (String) spinnerFirstWt.getSelectedItem();
                String option2wt = (String) spinnerSecondWt.getSelectedItem();
                double inputwt = Double.valueOf(inputUnitWt.getText().toString());
                double calwt;

                //Ounce Conversion
                if(option1wt.equals("Ounce") && option2wt.equals("Pound")){
                    calwt = inputwt/16;
                    answerWt.setText("" + calwt + " lb");
                }
                if(option1wt.equals("Ounce") && option2wt.equals("Ton")){
                    calwt = inputwt/32000;
                    answerWt.setText("" + calwt + " ton");
                }
                if(option1wt.equals("Ounce") && option2wt.equals("Milligram")){
                    calwt = inputwt/3.5274e-5;
                    answerWt.setText("" + calwt + " mg");
                }
                if(option1wt.equals("Ounce") && option2wt.equals("Gram")){
                    calwt = inputwt/0.035274;
                    answerWt.setText("" + calwt + " g");
                }
                if(option1wt.equals("Ounce") && option2wt.equals("Kilogram")){
                    calwt = inputwt/35.274;
                    answerWt.setText("" + calwt + " kg");
                }

                //Pound Conversion
                if(option1wt.equals("Pound") && option2wt.equals("Ounce")){
                    calwt = inputwt*16;
                    answerWt.setText("" + calwt + " oz");
                }
                if(option1wt.equals("Pound") && option2wt.equals("Ton")){
                    calwt = inputwt/2000;
                    answerWt.setText("" + calwt + " ton");
                }
                if(option1wt.equals("Pound") && option2wt.equals("Milligram")){
                    calwt = inputwt*453592;
                    answerWt.setText("" + calwt + " mg");
                }
                if(option1wt.equals("Pound") && option2wt.equals("Gram")){
                    calwt = inputwt*453.592;
                    answerWt.setText("" + calwt + " g");
                }
                if(option1wt.equals("Pound") && option2wt.equals("Kilogram")){
                    calwt = inputwt*.453592;
                    answerWt.setText("" + calwt + " kg");
                }

                //Ton Conversions
                if(option1wt.equals("Ton") && option2wt.equals("Ounce")){
                    calwt = inputwt*32000;
                    answerWt.setText("" + calwt + " oz");
                }
                if(option1wt.equals("Ton") && option2wt.equals("Pound")){
                    calwt = inputwt*2000;
                    answerWt.setText("" + calwt + " lb");
                }
                if(option1wt.equals("Ton") && option2wt.equals("Milligram")){
                    calwt = inputwt*9.072e+8;
                    answerWt.setText("" + calwt + " mg");
                }
                if(option1wt.equals("Ton") && option2wt.equals("Gram")){
                    calwt = inputwt*907185;
                    answerWt.setText("" + calwt + " g");
                }
                if(option1wt.equals("Ton") && option2wt.equals("Kilogram")){
                    calwt = inputwt*907.185;
                    answerWt.setText("" + calwt + " kg");
                }

                //Milligram Conversion
                if(option1wt.equals("Milligram") && option2wt.equals("Ounce")){
                    calwt = inputwt*3.5274e-5;
                    answerWt.setText("" + calwt + " oz");
                }
                if(option1wt.equals("Milligram") && option2wt.equals("Pound")){
                    calwt = inputwt*2.2046e-6;
                    answerWt.setText("" + calwt + " lb");
                }
                if(option1wt.equals("Milligram") && option2wt.equals("Ton")){
                    calwt = inputwt*1.1023e-9;
                    answerWt.setText("" + calwt + " ton");
                }
                if(option1wt.equals("Milligram") && option2wt.equals("Gram")){
                    calwt = inputwt*.001;
                    answerWt.setText("" + calwt + " g");
                }
                if(option1wt.equals("Milligram") && option2wt.equals("Kilogram")){
                    calwt = inputwt*.000001;
                    answerWt.setText("" + calwt + " kg");
                }

                //Gram Conversions
                if(option1wt.equals("Gram") && option2wt.equals("Ounce")){
                    calwt = inputwt*0.035274;
                    answerWt.setText("" + calwt + " oz");
                }
                if(option1wt.equals("Gram") && option2wt.equals("Pound")){
                    calwt = inputwt*0.00220462;
                    answerWt.setText("" + calwt + " lb");
                }
                if(option1wt.equals("Gram") && option2wt.equals("Ton")){
                    calwt = inputwt*1.1023e-6;
                    answerWt.setText("" + calwt + " ton");
                }
                if(option1wt.equals("Gram") && option2wt.equals("Milligram")){
                    calwt = inputwt*1000;
                    answerWt.setText("" + calwt + " mg");
                }
                if(option1wt.equals("Gram") && option2wt.equals("Kilogram")){
                    calwt = inputwt/1000;
                    answerWt.setText("" + calwt + " kg");
                }

                //Kilogram Conversion
                if(option1wt.equals("Kilogram") && option2wt.equals("Ounce")){
                    calwt = inputwt*035.274;
                    answerWt.setText("" + calwt + " oz");
                }
                if(option1wt.equals("Kilogram") && option2wt.equals("Pound")){
                    calwt = inputwt*2.20462;
                    answerWt.setText("" + calwt + " lb");
                }
                if(option1wt.equals("Kilogram") && option2wt.equals("Ton")){
                    calwt = inputwt*1.1023e-3;
                    answerWt.setText("" + calwt + " ton");
                }
                if(option1wt.equals("Kilogram") && option2wt.equals("Milligram")){
                    calwt = inputwt*1000000;
                    answerWt.setText("" + calwt + " mg");
                }
                if(option1wt.equals("Kilogram") && option2wt.equals("Gram")){
                    calwt = inputwt*1000;
                    answerWt.setText("" + calwt + " g");
                }


            }
        });

    }
}
