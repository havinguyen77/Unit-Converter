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

public class DataActivity extends AppCompatActivity {

    Button convertDt;
    EditText inputUnitDt;
    TextView answerDt;
    Spinner spinnerFirstDt;
    Spinner spinnerSecondDt;


    ArrayAdapter<CharSequence> adapter1Dt;
    ArrayAdapter<CharSequence> adapter2Dt;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        MobileAds.initialize(getApplicationContext(),"ca-app-pub-9818921099106202~4696649575");


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        convertDt = (Button)findViewById(R.id.buttonConvert);
        inputUnitDt = (EditText)findViewById(R.id.editTextInput);
        answerDt = (TextView)findViewById(R.id.textViewAnswer);
        spinnerFirstDt = (Spinner)findViewById(R.id.spinner1);
        spinnerSecondDt = (Spinner)findViewById(R.id.spinner2);

        adapter1Dt = ArrayAdapter.createFromResource(this, R.array.dataOptions,android.R.layout.simple_spinner_item);
        adapter1Dt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirstDt.setAdapter(adapter1Dt);
        spinnerFirstDt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2Dt = ArrayAdapter.createFromResource(this, R.array.dataOptions,android.R.layout.simple_spinner_item);
        adapter2Dt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecondDt.setAdapter(adapter2Dt);
        spinnerSecondDt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        convertDt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option1Dt = (String) spinnerFirstDt.getSelectedItem();
                String option2Dt = (String) spinnerSecondDt.getSelectedItem();
                double inputDt =0.0;
                double calDt;
                if(inputUnitDt.getText().toString().equals("")){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(DataActivity.this);
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
                    inputDt = Double.valueOf(inputUnitDt.getText().toString());
                }



                //Bit Conversions
                if(option1Dt.equals("Bit") && option2Dt.equals("Byte")){
                    calDt = inputDt*.125;
                    answerDt.setText("" + calDt + " b");
                }
                if(option1Dt.equals("Bit") && option2Dt.equals("Kilobyte")){
                    calDt = inputDt*.0001220703125;
                    double cal = Math.round(calDt*10000000.0)/10000000.0;
                    answerDt.setText("" + cal + " Kb");
                }
                if(option1Dt.equals("Bit") && option2Dt.equals("Megabyte")){
                    calDt = inputDt*1.1920928e-7;
                    double cal = Math.round(calDt*1000000000.0)/1000000000.0;
                    answerDt.setText("" + cal + " Mb");
                }
                if(option1Dt.equals("Bit") && option2Dt.equals("Gigabyte")){
                    calDt = inputDt*1.16415321e-10;
                    double cal = Math.round(calDt*1000000000000.0)/1000000000000.0;
                    answerDt.setText("" + cal + " Gb");
                }
                if(option1Dt.equals("Bit") && option2Dt.equals("Terabyte")){
                    calDt = inputDt*1.1368683e-13;
                    double cal = Math.round(calDt*1000000000000000.0)/1000000000000000.0;
                    answerDt.setText("" + cal + " Tb");
                }

                //Byte Conversions
                if(option1Dt.equals("Byte") && option2Dt.equals("Bit")){
                    calDt = inputDt*8;
                    answerDt.setText("" + calDt + " bit");
                }
                if(option1Dt.equals("Byte") && option2Dt.equals("Kilobyte")){
                    calDt = inputDt*.000976562;
                    double cal = Math.round(calDt*10000000.0)/10000000.0;
                    answerDt.setText("" + cal + " Kb");
                }
                if(option1Dt.equals("Byte") && option2Dt.equals("Megabyte")){
                    calDt = inputDt*9.5367431e-7;
                    double cal = Math.round(calDt*1000000000000.0)/1000000000000.0;
                    answerDt.setText("" + cal + " Mb");
                }
                if(option1Dt.equals("Byte") && option2Dt.equals("Gigabyte")){
                    calDt = inputDt*9.3132257e-10;
                    double cal = Math.round(calDt*1000000000000000.0)/1000000000000000.0;
                    answerDt.setText("" + cal + " Gb");
                }
                if(option1Dt.equals("Byte") && option2Dt.equals("Terabyte")){
                    calDt = inputDt*9.09494701e-13;
                    double cal = Math.round(calDt*1000000000000000.0)/1000000000000000.0;
                    answerDt.setText("" + cal + " Tb");
                }

                //Kilobyte
                if(option1Dt.equals("Kilobyte") && option2Dt.equals("Bit")){
                    calDt = inputDt*8192;
                    answerDt.setText("" + calDt + " bit");
                }
                if(option1Dt.equals("Kilobyte") && option2Dt.equals("Byte")){
                    calDt = inputDt*1024;
                    answerDt.setText("" + calDt + " b");
                }
                if(option1Dt.equals("Kilobyte") && option2Dt.equals("Megabyte")){
                    calDt = inputDt*.0009765625;
                    double cal = Math.round(calDt*10000000.0)/10000000.0;
                    answerDt.setText("" + cal + " Mb");
                }
                if(option1Dt.equals("Kilobyte") && option2Dt.equals("Gigabyte")){
                    calDt = inputDt*9.53674316e-7;
                    double cal = Math.round(calDt*1000000000.0)/1000000000.0;
                    answerDt.setText("" + cal + " Gb");
                }
                if(option1Dt.equals("Kilobyte") && option2Dt.equals("Terabyte")){
                    calDt = inputDt*9.3132257e-10;
                    double cal = Math.round(calDt*1000000000000000.0)/1000000000000000.0;
                    answerDt.setText("" + cal + " Tb");
                }

                //Megabyte Conversions
                if(option1Dt.equals("Megabyte") && option2Dt.equals("Bit")){
                    calDt = inputDt*8388608;
                    answerDt.setText("" + calDt + " bit");
                }
                if(option1Dt.equals("Megabyte") && option2Dt.equals("Byte")){
                    calDt = inputDt*1048576;
                    answerDt.setText("" + calDt + " b");
                }
                if(option1Dt.equals("Megabyte") && option2Dt.equals("Kilobyte")){
                    calDt = inputDt*1024;
                    answerDt.setText("" + calDt + " Kb");
                }
                if(option1Dt.equals("Megabyte") && option2Dt.equals("Gigabyte")){
                    calDt = inputDt*.0009765625;
                    double cal = Math.round(calDt*10000000.0)/10000000.0;
                    answerDt.setText("" + cal + " Gb");
                }
                if(option1Dt.equals("Megabyte") && option2Dt.equals("Terabyte")){
                    calDt = inputDt*9.53674316e-7;
                    double cal = Math.round(calDt*1000000000000.0)/1000000000000.0;
                    answerDt.setText("" + cal + " Tb");
                }

                //Gigabyte Conversions
                if(option1Dt.equals("Gigabyte") && option2Dt.equals("Bit")){
                    calDt = inputDt*858993459e+1;
                    answerDt.setText("" + calDt + " bit");
                }
                if(option1Dt.equals("Gigabyte") && option2Dt.equals("Byte")){
                    calDt = inputDt*1073741824;
                    answerDt.setText("" + calDt + " b");
                }
                if(option1Dt.equals("Gigabyte") && option2Dt.equals("Kilobyte")){
                    calDt = inputDt*1048576;
                    answerDt.setText("" + calDt + " Kb");
                }
                if(option1Dt.equals("Gigabyte") && option2Dt.equals("Megabyte")){
                    calDt = inputDt*1024;
                    answerDt.setText("" + calDt + " Mb");
                }
                if(option1Dt.equals("Gigabyte") && option2Dt.equals("Terabyte")){
                    calDt = inputDt*.0009765625;
                    double cal = Math.round(calDt*10000000.0)/10000000.0;
                    answerDt.setText("" + cal + " Tb");
                }

                //Terabyte Conversions
                if(option1Dt.equals("Terabyte") && option2Dt.equals("Bit")){
                    calDt = inputDt*879609302e+4;
                    answerDt.setText("" + calDt + " bit");
                }
                if(option1Dt.equals("Terabyte") && option2Dt.equals("Byte")){
                    calDt = inputDt*1099511627e+3;
                    answerDt.setText("" + calDt + " b");
                }
                if(option1Dt.equals("Terabyte") && option2Dt.equals("Kilobyte")){
                    calDt = inputDt*1073741824;
                    answerDt.setText("" + calDt + " Kb");
                }
                if(option1Dt.equals("Terabyte") && option2Dt.equals("Megabyte")){
                    calDt = inputDt*1048576;
                    answerDt.setText("" + calDt + " Mb");
                }
                if(option1Dt.equals("Terabyte") && option2Dt.equals("Gigabyte")){
                    calDt = inputDt*1024;
                    answerDt.setText("" + calDt + " Gb");
                }
            }
        });

    }
}
