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

public class EnergyActivity extends AppCompatActivity {

    Button convertEg;
    EditText inputUnitEg;
    TextView answerEg;
    Spinner spinnerFirstEg;
    Spinner spinnerSecondEg;


    ArrayAdapter<CharSequence> adapter1Eg;
    ArrayAdapter<CharSequence> adapter2Eg;

    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        convertEg = (Button)findViewById(R.id.buttonConvert);
        inputUnitEg = (EditText)findViewById(R.id.editTextInput);
        answerEg = (TextView)findViewById(R.id.textViewAnswer);
        spinnerFirstEg = (Spinner)findViewById(R.id.spinner1);
        spinnerSecondEg = (Spinner)findViewById(R.id.spinner2);

        adapter1Eg = ArrayAdapter.createFromResource(this, R.array.energyOptions,android.R.layout.simple_spinner_item);
        adapter1Eg.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirstEg.setAdapter(adapter1Eg);
        spinnerFirstEg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2Eg = ArrayAdapter.createFromResource(this, R.array.energyOptions,android.R.layout.simple_spinner_item);
        adapter2Eg.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecondEg.setAdapter(adapter2Eg);
        spinnerSecondEg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        convertEg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option1Eg = (String) spinnerFirstEg.getSelectedItem();
                String option2Eg = (String) spinnerSecondEg.getSelectedItem();
                double inputEg = 0.0;
                double calEg;
                if(inputUnitEg.getText().toString().equals("")){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(EnergyActivity.this);
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
                    inputEg = Double.valueOf(inputUnitEg.getText().toString());
                }

                System.out.println(option1Eg);
                System.out.println(option2Eg);

                if (option1Eg.equals("Joules") && option2Eg.equals("British Thermal Unit")){
                    calEg = inputEg* 9.479e-4;
                    double cal = Math.round(calEg*1000000000.0)/1000000000.0;
                    answerEg.setText("" + cal + " btu");
                }
                if (option1Eg.equals("Joules") && option2Eg.equals("Quad")){
                    calEg = inputEg* 9.479e-19;
                    double cal = Math.round(calEg*1000000000000000000000000.0)/1000000000000000000000000.0;
                    answerEg.setText("" + cal + " quad");
                }
                if (option1Eg.equals("Joules") && option2Eg.equals("Kilocalorie")){
                    calEg = inputEg* .000239006;
                    double cal = Math.round(calEg*1000000.0)/1000000.0;
                    answerEg.setText("" + cal + " kcal");
                }
                if (option1Eg.equals("Joules") && option2Eg.equals("Megatonne of Coal Equivalent")){
                    calEg = inputEg* 3.414e-11;
                    double cal = Math.round(calEg*1000000000000000.0)/1000000000000000.0;
                    answerEg.setText("" + cal + " mtce");
                }
                if (option1Eg.equals("Joules") && option2Eg.equals("Barrel of Oil Equivalent")){
                    calEg = inputEg* 1.634e-10;
                    double cal = Math.round(calEg*1000000000000000.0)/1000000000000000.0;
                    answerEg.setText("" + cal + " boe");
                }
                if (option1Eg.equals("Joules") && option2Eg.equals("Megatonne of Oil Equivalent")){
                    calEg = inputEg* 2.234e-11;
                    double cal = Math.round(calEg*1000000000000000.0)/1000000000000000.0;
                    answerEg.setText("" + cal + " mtoe");
                }
                if (option1Eg.equals("Joules") && option2Eg.equals("Kilowatt-Hour")){
                    calEg = inputEg* 2.78e-7;
                    double cal = Math.round(calEg*100000000000.0)/100000000000.0;
                    answerEg.setText("" + cal + " kWh");
                }
                if (option1Eg.equals("Joules") && option2Eg.equals("Terawatt-Year")){
                    calEg = inputEg* 3.171e-20;
                    double cal = Math.round(calEg*1000000000000000000000000.0)/1000000000000000000000000.0;
                    answerEg.setText("" + cal + " TWy");
                }

                //British Thermal Unit Conversions
                if (option1Eg.equals("British Thermal Unit") && option2Eg.equals("Joules")){
                    calEg = inputEg* 1055;
                    double cal = Math.round(calEg*1000.0)/1000.0;
                    answerEg.setText("" + cal + " J");
                }
                if (option1Eg.equals("British Thermal Unit") && option2Eg.equals("Quad")){
                    calEg = inputEg* 1e-15;
                    double cal = Math.round(calEg*1000000000000000000000.0)/1000000000000000000000.0;
                    answerEg.setText("" + cal + " quad");
                }
                if (option1Eg.equals("British Thermal Unit") && option2Eg.equals("Kilocalorie")){
                    calEg = inputEg* .2522;
                    double cal = Math.round(calEg*1000000.0)/1000000.0;
                    answerEg.setText("" + cal + " kcal");
                }
                if (option1Eg.equals("British Thermal Unit") && option2Eg.equals("Megatonne of Coal Equivalent")){
                    calEg = inputEg* 3.602e-8;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " mtce");
                }
                if (option1Eg.equals("British Thermal Unit") && option2Eg.equals("Barrel of Oil Equivalent")){
                    calEg = inputEg* 1.724e-7;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " boe");
                }
                if (option1Eg.equals("British Thermal Unit") && option2Eg.equals("Megatonne of Oil Equivalent")){
                    calEg = inputEg* 2.357e-8;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " mtoe");
                }
                if (option1Eg.equals("British Thermal Unit") && option2Eg.equals("Kilowatt-Hour")){
                    calEg = inputEg* 2.93e-4;
                    double cal = Math.round(calEg*10000000.0)/10000000.0;
                    answerEg.setText("" + cal + " kWh");
                }
                if (option1Eg.equals("British Thermal Unit") && option2Eg.equals("Terawatt-Year")){
                    calEg = inputEg* 3.345e-17;
                    double cal = Math.round(calEg*1000000000000000000000.0)/1000000000000000000000.0;
                    answerEg.setText("" + cal + " TWy");
                }

                //Quad Conversions
                if (option1Eg.equals("Quad") && option2Eg.equals("Joules")){
                    calEg = inputEg* 1.055e18;
                    double cal = Math.round(calEg*1000000000000000000000.0)/1000000000000000000000.0;
                    answerEg.setText("" + cal + " J");
                }
                if (option1Eg.equals("Quad") && option2Eg.equals("British Thermal Unit")){
                    calEg = inputEg* 1e15;
                    double cal = Math.round(calEg*1000000000000000000000.0)/1000000000000000000000.0;
                    answerEg.setText("" + cal + " btu");
                }
                if (option1Eg.equals("Quad") && option2Eg.equals("Kilocalorie")){
                    calEg = inputEg* 2522e11;
                    double cal = Math.round(calEg*1000000000000000.0)/1000000000000000.0;
                    answerEg.setText("" + cal + " kcal");
                }
                //Please Validate Value
                if (option1Eg.equals("Quad") && option2Eg.equals("Megatonne of Coal Equivalent")){
                    calEg = inputEg* 3.602e7;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " mtce");
                }
                if (option1Eg.equals("Quad") && option2Eg.equals("Barrel of Oil Equivalent")){
                    calEg = inputEg* 1.724e-8;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " boe");
                }
                if (option1Eg.equals("Quad") && option2Eg.equals("Megatonne of Oil Equivalent")){
                    calEg = inputEg* 2.357e-7;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " mtoe");
                }
                if (option1Eg.equals("Quad") && option2Eg.equals("Kilowatt-Hour")){
                    calEg = inputEg* 2.93e11;
                    double cal = Math.round(calEg*1000000000000000.0)/1000000000000000.0;
                    answerEg.setText("" + cal + " kWh");
                }
                if (option1Eg.equals("Quad") && option2Eg.equals("Terawatt-Year")){
                    calEg = inputEg* .03345;
                    double cal = Math.round(calEg*10000000.0)/10000000.0;
                    answerEg.setText("" + cal + " TWy");
                }

                //Kilocalorie Conversion
                if (option1Eg.equals("Kilocalorie") && option2Eg.equals("Joules")){
                    calEg = inputEg* 4184;
                    double cal = Math.round(calEg*1000.0)/1000.0;
                    answerEg.setText("" + cal + " J");
                }
                if (option1Eg.equals("Kilocalorie") && option2Eg.equals("British Thermal Unit")){
                    calEg = inputEg* 3.966;
                    double cal = Math.round(calEg*1000.0)/1000.0;
                    answerEg.setText("" + cal + " btu");
                }
                if (option1Eg.equals("Kilocalorie") && option2Eg.equals("Quad")){
                    calEg = inputEg* 3.966e-15;
                    double cal = Math.round(calEg*1000000000000000000.0)/1000000000000000000.0;
                    answerEg.setText("" + cal + " quad");
                }
                if (option1Eg.equals("Kilocalorie") && option2Eg.equals("Megatonne of Coal Equivalent")){
                    calEg = inputEg* 1.429e-9;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " mtce");
                }
                if (option1Eg.equals("Kilocalorie") && option2Eg.equals("Barrel of Oil Equivalent")){
                    calEg = inputEg* 6.838e-7;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " boe");
                }
                if (option1Eg.equals("Kilocalorie") && option2Eg.equals("Megatonne of Oil Equivalent")){
                    calEg = inputEg* 9.347e-8;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " mtoe");
                }
                if (option1Eg.equals("Kilocalorie") && option2Eg.equals("Kilowatt-Hour")){
                    calEg = inputEg* 1.16e-3;
                    double cal = Math.round(calEg*1000000.0)/1000000.0;
                    answerEg.setText("" + cal + " kWh");
                }
                if (option1Eg.equals("Kilocalorie") && option2Eg.equals("Terawatt-Year")){
                    calEg = inputEg* 1.327e-16;
                    double cal = Math.round(calEg*100000000000000000000.0)/100000000000000000000.0;
                    answerEg.setText("" + cal + " TWy");
                }

                //MTCE Conversions
                if (option1Eg.equals("Megatonne of Coal Equivalent") && option2Eg.equals("Joules")){
                    calEg = inputEg* 29.29e9;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " J");
                }
                if (option1Eg.equals("Megatonne of Coal Equivalent") && option2Eg.equals("British Thermal Unit")){
                    calEg = inputEg* 27.76e6;
                    double cal = Math.round(calEg*1000000000.0)/1000000000.0;
                    answerEg.setText("" + cal + " btu");
                }
                if (option1Eg.equals("Megatonne of Coal Equivalent") && option2Eg.equals("Quad")){
                    calEg = inputEg* 27.76e-9;
                    double cal = Math.round(calEg*1000000000000000.0)/1000000000000000.0;
                    answerEg.setText("" + cal + " quad");
                }
                if (option1Eg.equals("Megatonne of Coal Equivalent") && option2Eg.equals("Kilocalorie")){
                    calEg = inputEg* 7e6;
                    double cal = Math.round(calEg*1000000000.0)/1000000000.0;
                    answerEg.setText("" + cal + " kcal");
                }
                if (option1Eg.equals("Megatonne of Coal Equivalent") && option2Eg.equals("Barrel of Oil Equivalent")){
                    calEg = inputEg* 4.786;
                    double cal = Math.round(calEg*100000.0)/100000.0;
                    answerEg.setText("" + cal + " boe");
                }
                if (option1Eg.equals("Megatonne of Coal Equivalent") && option2Eg.equals("Megatonne of Oil Equivalent")){
                    calEg = inputEg* .6543;
                    double cal = Math.round(calEg*100000.0)/100000.0;
                    answerEg.setText("" + cal + " mtoe");
                }
                if (option1Eg.equals("Megatonne of Coal Equivalent") && option2Eg.equals("Kilowatt-Hour")){
                    calEg = inputEg* 8135;
                    double cal = Math.round(calEg*1000.0)/1000.0;
                    answerEg.setText("" + cal + " kWh");
                }
                if (option1Eg.equals("Megatonne of Coal Equivalent") && option2Eg.equals("Terawatt-Year")){
                    calEg = inputEg* 9.287e-10;
                    double cal = Math.round(calEg*100000000000000.0)/100000000000000.0;
                    answerEg.setText("" + cal + " TWy");
                }

                //BOE Conversion
                if (option1Eg.equals("Barrel of Oil Equivalent") && option2Eg.equals("Joules")){
                    calEg = inputEg* 6.119e9;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " J");
                }
                if (option1Eg.equals("Barrel of Oil Equivalent") && option2Eg.equals("British Thermal Unit")){
                    calEg = inputEg* 5.8e6;
                    double cal = Math.round(calEg*1000000000.0)/1000000000.0;
                    answerEg.setText("" + cal + " btu");
                }
                if (option1Eg.equals("Barrel of Oil Equivalent") && option2Eg.equals("Quad")){
                    calEg = inputEg* 5.8e-9;
                    double cal = Math.round(calEg*1000000000000000.0)/1000000000000000.0;
                    answerEg.setText("" + cal + " quad");
                }
                if (option1Eg.equals("Barrel of Oil Equivalent") && option2Eg.equals("Kilocalorie")){
                    calEg = inputEg* 1.462e6;
                    double cal = Math.round(calEg*1000000000.0)/1000000000.0;
                    answerEg.setText("" + cal + " kcal");
                }
                if (option1Eg.equals("Barrel of Oil Equivalent") && option2Eg.equals("Megatonne of Coal Equivalent")){
                    calEg = inputEg* .2089;
                    double cal = Math.round(calEg*10000000.0)/10000000.0;
                    answerEg.setText("" + cal + " mtce");
                }
                if (option1Eg.equals("Barrel of Oil Equivalent") && option2Eg.equals("Megatonne of Oil Equivalent")){
                    calEg = inputEg* .1367;
                    double cal = Math.round(calEg*100000.0)/100000.0;
                    answerEg.setText("" + cal + " mtoe");
                }
                if (option1Eg.equals("Barrel of Oil Equivalent") && option2Eg.equals("Kilowatt-Hour")){
                    calEg = inputEg* 1699;
                    double cal = Math.round(calEg*1000.0)/1000.0;
                    answerEg.setText("" + cal + " kWh");
                }
                if (option1Eg.equals("Barrel of Oil Equivalent") && option2Eg.equals("Terawatt-Year")){
                    calEg = inputEg* 1.94e-10;
                    double cal = Math.round(calEg*100000000000000.0)/100000000000000.0;
                    answerEg.setText("" + cal + " TWy");
                }

                //MTOE Conversion
                if (option1Eg.equals("Megatonne of Oil Equivalent") && option2Eg.equals("Joules")){
                    calEg = inputEg* 44.76e9;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " J");
                }
                if (option1Eg.equals("Megatonne of Oil Equivalent") && option2Eg.equals("British Thermal Unit")){
                    calEg = inputEg* 42.43e6;
                    double cal = Math.round(calEg*1000000000.0)/1000000000.0;
                    answerEg.setText("" + cal + " btu");
                }
                if (option1Eg.equals("Megatonne of Oil Equivalent") && option2Eg.equals("Quad")){
                    calEg = inputEg* 42.43e-9;
                    double cal = Math.round(calEg*1000000000000000.0)/1000000000000000.0;
                    answerEg.setText("" + cal + " quad");
                }
                if (option1Eg.equals("Megatonne of Oil Equivalent") && option2Eg.equals("Kilocalorie")){
                    calEg = inputEg* 1.07e7;
                    double cal = Math.round(calEg*1000000000.0)/1000000000.0;
                    answerEg.setText("" + cal + " kcal");
                }
                if (option1Eg.equals("Megatonne of Oil Equivalent") && option2Eg.equals("Megatonne of Coal Equivalent")){
                    calEg = inputEg* 1.528;
                    double cal = Math.round(calEg*10000000.0)/10000000.0;
                    answerEg.setText("" + cal + " mtce");
                }
                if (option1Eg.equals("Megatonne of Oil Equivalent") && option2Eg.equals("Barrel of Oil Equivalent")){
                    calEg = inputEg* 7.315;
                    double cal = Math.round(calEg*100000.0)/100000.0;
                    answerEg.setText("" + cal + " boe");
                }
                if (option1Eg.equals("Megatonne of Oil Equivalent") && option2Eg.equals("Kilowatt-Hour")){
                    calEg = inputEg* 12430;
                    double cal = Math.round(calEg*1000.0)/1000.0;
                    answerEg.setText("" + cal + " kWh");
                }
                if (option1Eg.equals("Megatonne of Oil Equivalent") && option2Eg.equals("Terawatt-Year")){
                    calEg = inputEg* 1.94e-4;
                    double cal = Math.round(calEg*10000000.0)/10000000.0;
                    answerEg.setText("" + cal + " TWy");
                }

                //KWH Conversions
                if (option1Eg.equals("Kilowatt-Hour") && option2Eg.equals("Joules")){
                    calEg = inputEg* 3.60e6;
                    double cal = Math.round(calEg*1000000000.0)/1000000000.0;
                    answerEg.setText("" + cal + " J");
                }
                if (option1Eg.equals("Kilowatt-Hour") && option2Eg.equals("British Thermal Unit")){
                    calEg = inputEg* 3.41e3;
                    double cal = Math.round(calEg*1000000.0)/1000000.0;
                    answerEg.setText("" + cal + " btu");
                }
                if (option1Eg.equals("Kilowatt-Hour") && option2Eg.equals("Quad")){
                    calEg = inputEg* 3.41e-12;
                    double cal = Math.round(calEg*1000000000000000000.0)/1000000000000000000.0;
                    answerEg.setText("" + cal + " quad");
                }
                if (option1Eg.equals("Kilowatt-Hour") && option2Eg.equals("Kilocalorie")){
                    calEg = inputEg* 860.39;
                    double cal = Math.round(calEg*1000.0)/1000.0;
                    answerEg.setText("" + cal + " kcal");
                }
                if (option1Eg.equals("Kilowatt-Hour") && option2Eg.equals("Megatonne of Coal Equivalent")){
                    calEg = inputEg* 1.228e-4;
                    double cal = Math.round(calEg*10000000.0)/10000000.0;
                    answerEg.setText("" + cal + " mtce");
                }
                if (option1Eg.equals("Kilowatt-Hour") && option2Eg.equals("Barrel of Oil Equivalent")){
                    calEg = inputEg* 5.88e-4;
                    double cal = Math.round(calEg*10000000.0)/10000000.0;
                    answerEg.setText("" + cal + " boe");
                }
                if (option1Eg.equals("Kilowatt-Hour") && option2Eg.equals("Megatonne of Oil Equivalent")){
                    calEg = inputEg* 8.042e-5;
                    double cal = Math.round(calEg*1000000000.0)/1000000000.0;
                    answerEg.setText("" + cal + " mtoe");
                }
                if (option1Eg.equals("Kilowatt-Hour") && option2Eg.equals("Terawatt-Year")){
                    calEg = inputEg* 1.142e-13;
                    double cal = Math.round(calEg*10000000000000000.0)/10000000000000000.0;
                    answerEg.setText("" + cal + " TWy");
                }

                //Terawatt-Year Conversion
                if (option1Eg.equals("Terawatt-Year") && option2Eg.equals("Joules")){
                    calEg = inputEg* 3.154e19;
                    double cal = Math.round(calEg*10000000000000000000000.0)/10000000000000000000000.0;
                    answerEg.setText("" + cal + " J");
                }
                if (option1Eg.equals("Terawatt-Year") && option2Eg.equals("British Thermal Unit")){
                    calEg = inputEg* 2.989e16;
                    double cal = Math.round(calEg*100000000000000000000.0)/100000000000000000000.0;
                    answerEg.setText("" + cal + " btu");
                }
                if (option1Eg.equals("Terawatt-Year") && option2Eg.equals("Quad")){
                    calEg = inputEg* 29.89;
                    double cal = Math.round(calEg*1000.0)/1000.0;
                    answerEg.setText("" + cal + " quad");
                }
                if (option1Eg.equals("Terawatt-Year") && option2Eg.equals("Kilocalorie")){
                    calEg = inputEg* 7.537e15;
                    double cal = Math.round(calEg*1000000000000000000.0)/1000000000000000000.0;
                    answerEg.setText("" + cal + " kcal");
                }
                if (option1Eg.equals("Terawatt-Year") && option2Eg.equals("Megatonne of Coal Equivalent")){
                    calEg = inputEg* 1.076e9;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " mtce");
                }
                if (option1Eg.equals("Terawatt-Year") && option2Eg.equals("Barrel of Oil Equivalent")){
                    calEg = inputEg* 5.154e9;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " boe");
                }
                if (option1Eg.equals("Terawatt-Year") && option2Eg.equals("Megatonne of Oil Equivalent")){
                    calEg = inputEg* 7.045e8;
                    double cal = Math.round(calEg*1000000000000.0)/1000000000000.0;
                    answerEg.setText("" + cal + " mtoe");
                }
                if (option1Eg.equals("Terawatt-Year") && option2Eg.equals("Kilowatt-Hour")){
                    calEg = inputEg* 8.76e12;
                    double cal = Math.round(calEg*10000000000000000.0)/10000000000000000.0;
                    answerEg.setText("" + cal + " kWh");
                }




            }
        });
    }
}
