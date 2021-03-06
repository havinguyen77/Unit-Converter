package com.havi.explo.unitconverter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WeightActivity extends AppCompatActivity {

    Button convertWt;
    EditText inputUnitWt;
    TextView answerWt;
    Spinner spinnerFirstWt;
    Spinner spinnerSecondWt;


    ArrayAdapter<CharSequence> adapter1Wt;
    ArrayAdapter<CharSequence> adapter2Wt;

    private AdView mAdView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        MobileAds.initialize(getApplicationContext(),"ca-app-pub-9818921099106202~4696649575");


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

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
                double inputwt = 0.0;
                double calwt;
                if(inputUnitWt.getText().toString().equals("")){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(WeightActivity.this);
                    builder1.setTitle("Missing Input");
                    builder1.setMessage("Please input a value");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }else{
                    inputwt = Double.valueOf(inputUnitWt.getText().toString());
                }


                //Ounce Conversion
                if(option1wt.equals("Ounce") && option2wt.equals("Pound")){
                    calwt = inputwt/16;
                    answerWt.setText("" + calwt + " lb");
                }
                if(option1wt.equals("Ounce") && option2wt.equals("US Ton")){
                    calwt = inputwt/32000;
                    double cal = Math.round(calwt*10000000.0)/10000000.0;
                    answerWt.setText("" + cal + " ton");
                }
                if(option1wt.equals("Ounce") && option2wt.equals("Milligram")){
                    calwt = inputwt/3.5274e-5;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " mg");
                }
                if(option1wt.equals("Ounce") && option2wt.equals("Gram")){
                    calwt = inputwt/0.035274;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " g");
                }
                if(option1wt.equals("Ounce") && option2wt.equals("Kilogram")){
                    calwt = inputwt/35.274;
                    double cal = Math.round(calwt*100000.0)/100000.0;
                    answerWt.setText("" + cal + " kg");
                }

                //Pound Conversion
                if(option1wt.equals("Pound") && option2wt.equals("Ounce")){
                    calwt = inputwt*16;
                    answerWt.setText("" + calwt + " oz");
                }
                if(option1wt.equals("Pound") && option2wt.equals("US Ton")){
                    calwt = inputwt/2000;
                    double cal = Math.round(calwt*10000000.0)/10000000.0;
                    answerWt.setText("" + cal + " ton");
                }
                if(option1wt.equals("Pound") && option2wt.equals("Milligram")){
                    calwt = inputwt*453592.37;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " mg");
                }
                if(option1wt.equals("Pound") && option2wt.equals("Gram")){
                    calwt = inputwt*453.592;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " g");
                }
                if(option1wt.equals("Pound") && option2wt.equals("Kilogram")){
                    calwt = inputwt*.453592;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " kg");
                }

                //Ton Conversions
                if(option1wt.equals("US Ton") && option2wt.equals("Ounce")){
                    calwt = inputwt*32000;
                    answerWt.setText("" + calwt + " oz");
                }
                if(option1wt.equals("US Ton") && option2wt.equals("Pound")){
                    calwt = inputwt*2000;
                    answerWt.setText("" + calwt + " lb");
                }
                if(option1wt.equals("US Ton") && option2wt.equals("Milligram")){
                    calwt = inputwt*9.072e+8;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " mg");
                }
                if(option1wt.equals("US Ton") && option2wt.equals("Gram")){
                    calwt = inputwt*907185;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " g");
                }
                if(option1wt.equals("US Ton") && option2wt.equals("Kilogram")){
                    calwt = inputwt*907.185;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " kg");
                }

                //Milligram Conversion
                if(option1wt.equals("Milligram") && option2wt.equals("Ounce")){
                    calwt = inputwt*3.5274e-5;
                    double cal = Math.round(calwt*10000000.0)/10000000.0;
                    answerWt.setText("" + cal + " oz");
                }
                if(option1wt.equals("Milligram") && option2wt.equals("Pound")){
                    calwt = inputwt*2.2046e-6;
                    double cal = Math.round(calwt*1000000000.0)/1000000000.0;
                    answerWt.setText("" + cal + " lb");
                }
                if(option1wt.equals("Milligram") && option2wt.equals("US Ton")){
                    calwt = inputwt*1.1023e-9;
                    double cal = Math.round(calwt*1000000000000.0)/1000000000000.0;
                    answerWt.setText("" + cal + " ton");
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
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " oz");
                }
                if(option1wt.equals("Gram") && option2wt.equals("Pound")){
                    calwt = inputwt*0.00220462;
                    double cal = Math.round(calwt*100000.0)/100000.0;
                    answerWt.setText("" + cal + " lb");
                }
                if(option1wt.equals("Gram") && option2wt.equals("US Ton")){
                    calwt = inputwt*1.1023e-6;
                    double cal = Math.round(calwt*1000000000.0)/1000000000.0;
                    answerWt.setText("" + cal + " ton");
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
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " oz");
                }
                if(option1wt.equals("Kilogram") && option2wt.equals("Pound")){
                    calwt = inputwt*2.20462;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " lb");
                }
                if(option1wt.equals("Kilogram") && option2wt.equals("US Ton")){
                    calwt = inputwt*1.1023e-3;
                    double cal = Math.round(calwt*1000.0)/1000.0;
                    answerWt.setText("" + cal + " ton");
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
