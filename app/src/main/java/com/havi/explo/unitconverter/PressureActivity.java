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

public class PressureActivity extends AppCompatActivity {

    Button convertPr;
    EditText inputUnitPr;
    TextView answerPr;
    Spinner spinnerFirstPr;
    Spinner spinnerSecondPr;


    ArrayAdapter<CharSequence> adapter1Pr;
    ArrayAdapter<CharSequence> adapter2Pr;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        MobileAds.initialize(getApplicationContext(),"ca-app-pub-9818921099106202/9008451171");


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        convertPr = (Button)findViewById(R.id.buttonConvert);
        inputUnitPr = (EditText)findViewById(R.id.editTextInput);
        answerPr = (TextView)findViewById(R.id.textViewAnswer);
        spinnerFirstPr = (Spinner)findViewById(R.id.spinner1);
        spinnerSecondPr = (Spinner)findViewById(R.id.spinner2);

        adapter1Pr = ArrayAdapter.createFromResource(this, R.array.pressureOptions,android.R.layout.simple_spinner_item);
        adapter1Pr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirstPr.setAdapter(adapter1Pr);
        spinnerFirstPr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2Pr = ArrayAdapter.createFromResource(this, R.array.pressureOptions,android.R.layout.simple_spinner_item);
        adapter2Pr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecondPr.setAdapter(adapter2Pr);
        spinnerSecondPr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        convertPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option1Pr = (String) spinnerFirstPr.getSelectedItem();
                String option2Pr = (String) spinnerSecondPr.getSelectedItem();
                double inputPr = 0.0;
                double calPr;
                if(inputUnitPr.getText().toString().equals("")){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(PressureActivity.this);
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
                    inputPr = Double.valueOf(inputUnitPr.getText().toString());
                }


                if(option1Pr.equals("Atmosphere") && option2Pr.equals("Bar")){
                    calPr = inputPr*1.01325;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal +" bar");
                }
                if(option1Pr.equals("Atmosphere") && option2Pr.equals("Millibar")){
                    calPr = inputPr*1013.25;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal +" mbar");
                }
                if(option1Pr.equals("Atmosphere") && option2Pr.equals("Pascal(N/m^2)")){
                    calPr = inputPr*101325;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal +" Pa");
                }
                if(option1Pr.equals("Atmosphere") && option2Pr.equals("Kilo Pascal")){
                    calPr = inputPr*101.325;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal +" kPa");
                }
                if(option1Pr.equals("Atmosphere") && option2Pr.equals("Pound/Sq Inch")){
                    calPr = inputPr*14.69594878;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal +" psi");
                }
                if(option1Pr.equals("Atmosphere") && option2Pr.equals("Pound/Sq Foot")){
                    calPr = inputPr*2116.216624;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal +" psf");
                }
                if(option1Pr.equals("Atmosphere") && option2Pr.equals("Inch Mercury")){
                    calPr = inputPr*29.92125984;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal +" in Hg");
                }
                if(option1Pr.equals("Atmosphere") && option2Pr.equals("Millimeter Mercury(Torr)")){
                    calPr = inputPr*760;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal +" mm Hg");
                }

                //Bar Conversions
                if(option1Pr.equals("Bar") && option2Pr.equals("Atmosphere")){
                    calPr = inputPr*.9869232667;
                    double  cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " atm");
                }
                if(option1Pr.equals("Bar") && option2Pr.equals("Millibar")){
                    calPr = inputPr*1000;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mbar");
                }
                if(option1Pr.equals("Bar") && option2Pr.equals("Pascal(N/m^2)")){
                    calPr = inputPr*100000;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " Pa");
                }
                if(option1Pr.equals("Bar") && option2Pr.equals("Kilo Pascal")){
                    calPr = inputPr*100;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " kPa");
                }
                if(option1Pr.equals("Bar") && option2Pr.equals("Pound/Sq Inch")){
                    calPr = inputPr*14.50377377;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " psi");
                }
                if(option1Pr.equals("Bar") && option2Pr.equals("Pound/Sq Foot")){
                    calPr = inputPr*2088.543423;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " psf");
                }
                if(option1Pr.equals("Bar") && option2Pr.equals("Inch Mercury")){
                    calPr = inputPr*29.52998751;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " in Hg");
                }
                if(option1Pr.equals("Bar") && option2Pr.equals("Millimeter Mercury(Torr)")){
                    calPr = inputPr*750.0616827;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mm Hg");
                }

                //Millibar Conversions
                if(option1Pr.equals("Millibar") && option2Pr.equals("Atmosphere")){
                    calPr = inputPr*.0009869232667;
                    double  cal = Math.round(calPr*100000000.0)/100000000.0;
                    answerPr.setText("" + cal + " atm");
                }
                if(option1Pr.equals("Millibar") && option2Pr.equals("Bar")){
                    calPr = inputPr*.001;
                    double cal = Math.round(calPr*100000000.0)/100000000.0;
                    answerPr.setText("" + cal + " bar");
                }
                if(option1Pr.equals("Millibar") && option2Pr.equals("Pascal(N/m^2)")){
                    calPr = inputPr*100;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " Pa");
                }
                if(option1Pr.equals("Millibar") && option2Pr.equals("Kilo Pascal")){
                    calPr = inputPr*.1;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " kPa");
                }
                if(option1Pr.equals("Millibar") && option2Pr.equals("Pound/Sq Inch")){
                    calPr = inputPr*.01450377377;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " psi");
                }
                if(option1Pr.equals("Millibar") && option2Pr.equals("Pound/Sq Foot")){
                    calPr = inputPr*2.088543423;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " psf");
                }
                if(option1Pr.equals("Millibar") && option2Pr.equals("Inch Mercury")){
                    calPr = inputPr*.02952998751;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " in Hg");
                }
                if(option1Pr.equals("Millibar") && option2Pr.equals("Millimeter Mercury(Torr)")){
                    calPr = inputPr*.7500616827;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " mm Hg");
                }

                //Pascal Conversions
                if(option1Pr.equals("Pascal(N/m^2)") && option2Pr.equals("Atmosphere")){
                    calPr = inputPr*.000009869232667;
                    double  cal = Math.round(calPr*1000000000.0)/1000000000.0;
                    answerPr.setText("" + cal + " atm");
                }
                if(option1Pr.equals("Pascal(N/m^2)") && option2Pr.equals("Bar")){
                    calPr = inputPr*.00001;
                    double cal = Math.round(calPr*100000000.0)/100000000.0;
                    answerPr.setText("" + cal + " bar");
                }
                if(option1Pr.equals("Pascal(N/m^2)") && option2Pr.equals("Millibar")){
                    calPr = inputPr*.01;
                    double cal = Math.round(calPr*1000000.0)/1000000.0;
                    answerPr.setText("" + cal + " mbar");
                }
                if(option1Pr.equals("Pascal(N/m^2)") && option2Pr.equals("Kilo Pascal")){
                    calPr = inputPr*.001;
                    double cal = Math.round(calPr*1000000000.0)/1000000000.0;
                    answerPr.setText("" + cal + " kPa");
                }
                if(option1Pr.equals("Pascal(N/m^2)") && option2Pr.equals("Pound/Sq Inch")){
                    calPr = inputPr*.0001450377377;
                    double cal = Math.round(calPr*10000000.0)/10000000.0;
                    answerPr.setText("" + cal + " psi");
                }
                if(option1Pr.equals("Pascal(N/m^2)") && option2Pr.equals("Pound/Sq Foot")){
                    calPr = inputPr*.02088543423;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " psf");
                }
                if(option1Pr.equals("Pascal(N/m^2)") && option2Pr.equals("Inch Mercury")){
                    calPr = inputPr*.0002952998751;
                    double cal = Math.round(calPr*10000000.0)/10000000.0;
                    answerPr.setText("" + cal + " in Hg");
                }
                if(option1Pr.equals("Pascal(N/m^2)") && option2Pr.equals("Millimeter Mercury(Torr)")){
                    calPr = inputPr*.007500616827;
                    double cal = Math.round(calPr*10000000.0)/10000000.0;
                    answerPr.setText("" + cal + " mm Hg");
                }

                //Kilo Pascal Conversion
                if(option1Pr.equals("Kilo Pascal") && option2Pr.equals("Atmosphere")){
                    calPr = inputPr*.009869232667;
                    double  cal = Math.round(calPr*10000000.0)/10000000.0;
                    answerPr.setText("" + cal + " atm");
                }
                if(option1Pr.equals("Kilo Pascal") && option2Pr.equals("Bar")){
                    calPr = inputPr*.01;
                    double cal = Math.round(calPr*1000000.0)/1000000.0;
                    answerPr.setText("" + cal + " bar");
                }
                if(option1Pr.equals("Kilo Pascal") && option2Pr.equals("Millibar")){
                    calPr = inputPr*10;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mbar");
                }
                if(option1Pr.equals("Kilo Pascal") && option2Pr.equals("Pascal(N/m^2)")){
                    calPr = inputPr*1000;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " Pa");
                }
                if(option1Pr.equals("Kilo Pascal") && option2Pr.equals("Pound/Sq Inch")){
                    calPr = inputPr*.1450377377;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " psi");
                }
                if(option1Pr.equals("Kilo Pascal") && option2Pr.equals("Pound/Sq Foot")){
                    calPr = inputPr*20.88543423;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " psf");
                }
                if(option1Pr.equals("Kilo Pascal") && option2Pr.equals("Inch Mercury")){
                    calPr = inputPr*.2952998751;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " in Hg");
                }
                if(option1Pr.equals("Kilo Pascal") && option2Pr.equals("Millimeter Mercury(Torr)")){
                    calPr = inputPr*7.500616827;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mm Hg");
                }

                //Pound/Sq Inch Conversion
                if(option1Pr.equals("Pound/Sq Inch") && option2Pr.equals("Atmosphere")){
                    calPr = inputPr*.068045963;
                    double  cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " atm");
                }
                if(option1Pr.equals("Pound/Sq Inch") && option2Pr.equals("Bar")){
                    calPr = inputPr*.06894757293;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " bar");
                }
                if(option1Pr.equals("Pound/Sq Inch") && option2Pr.equals("Millibar")){
                    calPr = inputPr*68.94757293;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mbar");
                }
                if(option1Pr.equals("Pound/Sq Inch") && option2Pr.equals("Pascal(N/m^2)")){
                    calPr = inputPr*6894.757293;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " Pa");
                }
                if(option1Pr.equals("Pound/Sq Inch") && option2Pr.equals("Kilo Pascal")){
                    calPr = inputPr*6.894757293;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " kPa");
                }
                if(option1Pr.equals("Pound/Sq Inch") && option2Pr.equals("Pound/Sq Foot")){
                    calPr = inputPr*144;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " psf");
                }
                if(option1Pr.equals("Pound/Sq Inch") && option2Pr.equals("Inch Mercury")){
                    calPr = inputPr*2.0360209;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " in Hg");
                }
                if(option1Pr.equals("Pound/Sq Inch") && option2Pr.equals("Millimeter Mercury(Torr)")){
                    calPr = inputPr*51.714932;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mm Hg");
                }

                //Pound/Sq Foot Conversion
                if(option1Pr.equals("Pound/Sq Foot") && option2Pr.equals("Atmosphere")){
                    calPr = inputPr*.0004725414;
                    double  cal = Math.round(calPr*10000000.0)/10000000.0;
                    answerPr.setText("" + cal + " atm");
                }
                if(option1Pr.equals("Pound/Sq Foot") && option2Pr.equals("Bar")){
                    calPr = inputPr*.0004788025898;
                    double cal = Math.round(calPr*10000000.0)/10000000.0;
                    answerPr.setText("" + cal + " bar");
                }
                if(option1Pr.equals("Pound/Sq Foot") && option2Pr.equals("Millibar")){
                    calPr = inputPr*.4788025898;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " mbar");
                }
                if(option1Pr.equals("Pound/Sq Foot") && option2Pr.equals("Pascal(N/m^2)")){
                    calPr = inputPr*47.88025898;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " Pa");
                }
                if(option1Pr.equals("Pound/Sq Foot") && option2Pr.equals("Kilo Pascal")){
                    calPr = inputPr*.04788025898;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " kPa");
                }
                if(option1Pr.equals("Pound/Sq Foot") && option2Pr.equals("Pound/Sq Inch")){
                    calPr = inputPr*.00694444;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " psi");
                }
                if(option1Pr.equals("Pound/Sq Foot") && option2Pr.equals("Inch Mercury")){
                    calPr = inputPr*.0141390344;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " in Hg");
                }
                if(option1Pr.equals("Pound/Sq Foot") && option2Pr.equals("Millimeter Mercury(Torr)")){
                    calPr = inputPr*.3591314762;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mm Hg");
                }

                //Inch Mercury Conversion
                if(option1Pr.equals("Inch Mercury") && option2Pr.equals("Atmosphere")){
                    calPr = inputPr*.033421052;
                    double  cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " atm");
                }
                if(option1Pr.equals("Inch Mercury") && option2Pr.equals("Bar")){
                    calPr = inputPr*.03386388158;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " bar");
                }
                if(option1Pr.equals("Inch Mercury") && option2Pr.equals("Millibar")){
                    calPr = inputPr*33.86388158;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mbar");
                }
                if(option1Pr.equals("Inch Mercury") && option2Pr.equals("Pascal(N/m^2)")){
                    calPr = inputPr*3386.388158;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " Pa");
                }
                if(option1Pr.equals("Inch Mercury") && option2Pr.equals("Kilo Pascal")){
                    calPr = inputPr*3.386388158;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " kPa");
                }
                if(option1Pr.equals("Inch Mercury") && option2Pr.equals("Pound/Sq Inch")){
                    calPr = inputPr*.4911540775;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " psi");
                }
                if(option1Pr.equals("Inch Mercury") && option2Pr.equals("Pound/Sq Foot")){
                    calPr = inputPr*70.726187;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " psf");
                }
                if(option1Pr.equals("Inch Mercury") && option2Pr.equals("Millimeter Mercury(Torr)")){
                    calPr = inputPr*25.4;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mm Hg");
                }

                //Millimeter Mercury Conversions
                if(option1Pr.equals("Millimeter Mercury(Torr)") && option2Pr.equals("Atmosphere")){
                    calPr = inputPr*.00131578947;
                    double  cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " atm");
                }
                if(option1Pr.equals("Millimeter Mercury(Torr)") && option2Pr.equals("Bar")){
                    calPr = inputPr*.001333223684;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " bar");
                }
                if(option1Pr.equals("Millimeter Mercury(Torr)") && option2Pr.equals("Millibar")){
                    calPr = inputPr*1.333223684;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " mbar");
                }
                if(option1Pr.equals("Millimeter Mercury(Torr)") && option2Pr.equals("Pascal(N/m^2)")){
                    calPr = inputPr*133.3223684;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " Pa");
                }
                if(option1Pr.equals("Millimeter Mercury(Torr)") && option2Pr.equals("Kilo Pascal")){
                    calPr = inputPr*.1333223684;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " kPa");
                }
                if(option1Pr.equals("Millimeter Mercury(Torr)") && option2Pr.equals("Pound/Sq Inch")){
                    calPr = inputPr*.0193367747;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " psi");
                }
                if(option1Pr.equals("Millimeter Mercury(Torr)") && option2Pr.equals("Pound/Sq Foot")){
                    calPr = inputPr*2.784495557;
                    double cal = Math.round(calPr*1000.0)/1000.0;
                    answerPr.setText("" + cal + " psf");
                }
                if(option1Pr.equals("Millimeter Mercury(Torr)") && option2Pr.equals("Inch Mercury")){
                    calPr = inputPr*.03937007874;
                    double cal = Math.round(calPr*100000.0)/100000.0;
                    answerPr.setText("" + cal + " in Hg");
                }
            }
        });
    }
}
