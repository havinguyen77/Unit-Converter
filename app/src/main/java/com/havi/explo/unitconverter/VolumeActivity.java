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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class VolumeActivity extends AppCompatActivity {
    Button convertVl;
    EditText inputUnitVl;
    TextView answerVl;
    Spinner spinnerFirstVl;
    Spinner spinnerSecondVl;


    ArrayAdapter<CharSequence> adapter1Vl;
    ArrayAdapter<CharSequence> adapter2Vl;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        convertVl = (Button)findViewById(R.id.buttonConvert);
        inputUnitVl = (EditText)findViewById(R.id.editTextInput);
        answerVl = (TextView)findViewById(R.id.textViewAnswer);
        spinnerFirstVl = (Spinner)findViewById(R.id.spinner1);
        spinnerSecondVl = (Spinner)findViewById(R.id.spinner2);

        adapter1Vl = ArrayAdapter.createFromResource(this, R.array.volumeOptions,android.R.layout.simple_spinner_item);
        adapter1Vl.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirstVl.setAdapter(adapter1Vl);
        spinnerFirstVl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2Vl = ArrayAdapter.createFromResource(this, R.array.volumeOptions,android.R.layout.simple_spinner_item);
        adapter2Vl.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecondVl.setAdapter(adapter2Vl);
        spinnerSecondVl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        convertVl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String option1Vl = (String) spinnerFirstVl.getSelectedItem();
                String option2Vl = (String) spinnerSecondVl.getSelectedItem();
                double inputVl = Double.valueOf(inputUnitVl.getText().toString());
                double calVl;

                //I fucking hate you!

                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl*.333333;
                    String calVl2 = String.valueOf(calVl);
                    if (calVl2.contains(".33")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/3 tbsp");
                    }
                    else if (calVl2.contains(".66")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 2/3 tbsp");
                    }
                    else{
                    answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " tbsp");}
                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl*.1666667;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".16")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/6 fl oz");
                    }
                    else if (calVl2.contains(".3")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/3 fl oz");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 fl oz");
                    }
                    else if (calVl2.contains(".6")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 2/3 fl oz");
                    }
                    else if (calVl2.contains(".83")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 5/6 fl oz");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " fl oz");}

                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("US Cup")){
                    calVl = inputVl*.0208333;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 cup");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 cup");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 cup");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " cup");}

                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("US Pint")){
                    calVl = inputVl*.0104167;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 pt");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 pt");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 pt");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " pt");}

                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("US Quart")){
                    calVl = inputVl*.00520833;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 qt");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 qt");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 qt");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*100000.0)/100000.0 + " qt");}

                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("US Gallon")){
                    calVl = inputVl*.00130208;
                    answerVl.setText("" + Math.round(calVl*100000.0)/100000.0 + " gal");
                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("US Bushel")){
                    calVl = inputVl*.00013987;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl*.300781;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu in");
                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * .000174063;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl*.000006446786;
                    double cal = Math.round(calVl*1000000000.0)/1000000000.0;
                    answerVl.setText("" + cal + " cu yard");
                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl*.00000492892;
                    double cal = Math.round(calVl*1000000000.0)/1000000000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("Milliliter")){
                    calVl = inputVl*4.92892;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("US Teaspoon") && option2Vl.equals("Liter")){
                    calVl = inputVl*.00492892;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Tablespoon Conversions
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 3;
                    answerVl.setText("" + calVl +" tsp");
                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * .5;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".5")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/2 fl oz");
                    }
                    else{
                    answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 +" fl oz");}
                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("US Cup")){
                    calVl = inputVl * .0625;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".0625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/16 cup");
                    }
                    else if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/8 cup");
                    }
                    else if(calVl2.contains(".1875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/16 cup");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 cup");
                    }
                    else if(calVl2.contains(".3125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/16 cup");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/8 cup");
                    }
                    else if(calVl2.contains(".4375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/16 cup");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 cup");
                    }
                    else if(calVl2.contains(".5625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 9/16 cup");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/8 cup");
                    }
                    else if(calVl2.contains(".6875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 11/16 cup");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 cup");
                    }
                    else if(calVl2.contains(".8125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 13/16 cup");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/8 cup");
                    }
                    else if(calVl2.contains(".9375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 15/16 cup");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " cup");}

                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("US Pint")){
                    calVl = inputVl *.03125;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".0625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/16 pt");
                    }
                    else if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/8 pt");
                    }
                    else if(calVl2.contains(".1875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/16 pt");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 pt");
                    }
                    else if(calVl2.contains(".3125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/16 pt");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/8 pt");
                    }
                    else if(calVl2.contains(".4375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/16 pt");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 pt");
                    }
                    else if(calVl2.contains(".5625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 9/16 pt");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/8 pt");
                    }
                    else if(calVl2.contains(".6875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 11/16 pt");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 pt");
                    }
                    else if(calVl2.contains(".8125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 13/16 pt");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/8 pt");
                    }
                    else if(calVl2.contains(".9375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 15/16 pt");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " pt");}

                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("US Quart")){
                    calVl = inputVl * .015625;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".0625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/16 qt");
                    }
                    else if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/8 qt");
                    }
                    else if(calVl2.contains(".1875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/16 qt");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 qt");
                    }
                    else if(calVl2.contains(".3125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/16 qt");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/8 qt");
                    }
                    else if(calVl2.contains(".4375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/16 qt");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 qt");
                    }
                    else if(calVl2.contains(".5625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 9/16 qt");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/8 qt");
                    }
                    else if(calVl2.contains(".6875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 11/16 qt");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 qt");
                    }
                    else if(calVl2.contains(".8125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 13/16 qt");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/8 qt");
                    }
                    else if(calVl2.contains(".9375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 15/16 qt");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " qt");}

                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * .00390625;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".0625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/16 gal");
                    }
                    else if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/8 gal");
                    }
                    else if(calVl2.contains(".1875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/16 gal");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 gal");
                    }
                    else if(calVl2.contains(".3125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/16 gal");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/8 gal");
                    }
                    else if(calVl2.contains(".4375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/16 gal");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 gal");
                    }
                    else if(calVl2.contains(".5625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 9/16 gal");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/8 gal");
                    }
                    else if(calVl2.contains(".6875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 11/16 gal");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 gal");
                    }
                    else if(calVl2.contains(".8125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 13/16 gal");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/8 gal");
                    }
                    else if(calVl2.contains(".9375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 15/16 gal");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*100000.0)/100000.0 + " gal");}

                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * .0004196127;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal +" bushel");
                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl * .90234375;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal +" cu in");
                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * .00052218967;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal +" cu ft");
                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * .00001934035;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal +" cu yd");
                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * .000014786764;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal +" cu m");
                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 14.7868;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal +" mL");
                }
                if(option1Vl.equals("US Tablespoon") && option2Vl.equals("Liter")){
                    calVl = inputVl * .0147868;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal +" L");
                }

                //Fluid Ounce Conversions
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 6;
                    answerVl.setText("" + calVl + " tsp");
                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 2;
                    answerVl.setText("" + calVl + " tbsp");
                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("US Cup")){
                    calVl = inputVl * .125;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal +" 1/8 cup");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 cup");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal +" 3/8 cup");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 cup");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal +" 5/8 cup");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 cup");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal +" 7/8 cup");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " cup");}

                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("US Pint")){
                    calVl = inputVl * .0625;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".0625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/16 pt");
                    }
                    else if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/8 pt");
                    }
                    else if(calVl2.contains(".1875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/16 pt");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 pt");
                    }
                    else if(calVl2.contains(".3125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/16 pt");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/8 pt");
                    }
                    else if(calVl2.contains(".4375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/16 pt");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 pt");
                    }
                    else if(calVl2.contains(".5625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 9/16 pt");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/8 pt");
                    }
                    else if(calVl2.contains(".6875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 11/16 pt");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 pt");
                    }
                    else if(calVl2.contains(".8125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 13/16 pt");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/8 pt");
                    }
                    else if(calVl2.contains(".9375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 15/16 pt");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " pt");}

                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("US Quart")){
                    calVl = inputVl * .03125;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".0625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/16 qt");
                    }
                    else if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/8 qt");
                    }
                    else if(calVl2.contains(".1875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/16 qt");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 qt");
                    }
                    else if(calVl2.contains(".3125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/16 qt");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/8 qt");
                    }
                    else if(calVl2.contains(".4375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/16 qt");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 qt");
                    }
                    else if(calVl2.contains(".5625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 9/16 qt");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/8 qt");
                    }
                    else if(calVl2.contains(".6875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 11/16 qt");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 qt");
                    }
                    else if(calVl2.contains(".8125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 13/16 qt");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/8 qt");
                    }
                    else if(calVl2.contains(".9375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 15/16 qt");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " qt");}

                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * .0078125;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".0625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/16 gal");
                    }
                    else if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/8 gal");
                    }
                    else if(calVl2.contains(".1875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/16 gal");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 gal");
                    }
                    else if(calVl2.contains(".3125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/16 gal");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/8 gal");
                    }
                    else if(calVl2.contains(".4375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/16 gal");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 gal");
                    }
                    else if(calVl2.contains(".5625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 9/16 gal");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/8 gal");
                    }
                    else if(calVl2.contains(".6875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 11/16 gal");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 gal");
                    }
                    else if(calVl2.contains(".8125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 13/16 gal");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/8 gal");
                    }
                    else if(calVl2.contains(".9375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 15/16 gal");
                    }
                    else{
                        answerVl.setText("" + Math.round(calVl*100000.0)/100000.0 + " gal");}

                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * .0008392255;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl * 1.80469;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu in");
                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * .00104437934;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * .0000386807;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * .0000295735;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 29.5735;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("US Fluid Ounce") && option2Vl.equals("Liter")){
                    calVl = inputVl * .0295735;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Cup Conversions
                if(option1Vl.equals("US Cup") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 48;
                    answerVl.setText("" + calVl + " tsp");
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 16;
                    answerVl.setText("" + calVl + " tbsp");
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * 8;
                    answerVl.setText("" + calVl + " fl oz");
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("US Pint")){
                    calVl = inputVl * .5;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".5")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/2 pt");
                    }
                    else{
                    answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " pt");}
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("US Quart")){
                    calVl = inputVl * .25;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 qt");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 qt");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 qt");
                    }
                    else{
                    answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " qt");}
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * .0625;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".0625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/16 gal");
                    }
                    else if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/8 gal");
                    }
                    else if(calVl2.contains(".1875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/16 gal");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 gal");
                    }
                    else if(calVl2.contains(".3125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/16 gal");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 3/8 gal");
                    }
                    else if(calVl2.contains(".4375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/16 gal");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 gal");
                    }
                    else if(calVl2.contains(".5625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 9/16 gal");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 5/8 gal");
                    }
                    else if(calVl2.contains(".6875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 11/16 gal");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 gal");
                    }
                    else if(calVl2.contains(".8125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 13/16 gal");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 7/8 gal");
                    }
                    else if(calVl2.contains(".9375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 15/16 gal");
                    }
                    else{
                    answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " gal");}
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * .006713804745;
                    double cal = Math.round(calVl* 100000.0)/100000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("Cubic Inch ")){
                    calVl = inputVl * 14.4375;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu in");
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * .008355034;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * .00030944573;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * .00023658823;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 236.588;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("US Cup") && option2Vl.equals("Liter")){
                    calVl = inputVl * .236588;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Pint Conversions
                if(option1Vl.equals("US Pint") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 96;
                    answerVl.setText("" + calVl + " tsp");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 32;
                    answerVl.setText("" + calVl + " tbsp");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * 16;
                    answerVl.setText("" + calVl + " fl oz");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("US Cup")){
                    calVl = inputVl * 2;
                    answerVl.setText("" + calVl + " cup");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("US Quart")){
                    calVl = inputVl * .5;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".5")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/2 qt");
                    }
                    else{
                    answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " qt");}
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * .125;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".125")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal +" 1/8 gal");
                    }
                    else if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 gal");
                    }
                    else if(calVl2.contains(".375")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal +" 3/8 gal");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 gal");
                    }
                    else if(calVl2.contains(".625")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal +" 5/8 gal");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 gal");
                    }
                    else if(calVl2.contains(".875")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal +" 7/8 gal");
                    }
                    else{
                    answerVl.setText("" + Math.round(calVl*1000.0)/1000.0 + " gal");}
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * .0134276;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl * 28.875;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu in");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * .016710069;
                    double cal = Math.round(calVl*10000.0)/10000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * .00061889146;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * .000473176473;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 473.176;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("US Pint") && option2Vl.equals("Liter")){
                    calVl = inputVl * .473176;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Quart Conversions
                if(option1Vl.equals("US Quart") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl *192;
                    answerVl.setText("" + calVl + " tsp");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl *64;
                    answerVl.setText("" + calVl + " tbsp");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl *32;
                    answerVl.setText("" + calVl + " fl oz");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("US Cup")){
                    calVl = inputVl *4;
                    answerVl.setText("" +calVl + " cup");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("US Pint")){
                    calVl = inputVl *2;
                    answerVl.setText("" + calVl + " pt");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("US Gallon")){
                    calVl = inputVl *.25;
                    String calVl2 = String.valueOf(calVl);
                    if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal = (int) calVl;
                        answerVl.setText("" + cal + " 1/4 gal");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 1/2 gal");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal = (int)calVl;
                        answerVl.setText("" + cal + " 3/4 gal");
                    }
                    else{
                    answerVl.setText("" +Math.round(calVl*1000.0)/1000.0 + " gal");}
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("US Bushel")){
                    calVl = inputVl *.0268552189;
                    double cal = Math.round(calVl* 1000.0)/1000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl *57.75;
                    double cal = Math.round(calVl* 1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu in");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl *.03342013;
                    double cal = Math.round(calVl* 1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl *.0012377829;
                    double cal = Math.round(calVl* 100000.0)/100000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl *.0009463529;
                    double cal = Math.round(calVl* 10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("Milliliter")){
                    calVl = inputVl *946.353;
                    double cal = Math.round(calVl* 1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("US Quart") && option2Vl.equals("Liter")){
                    calVl = inputVl *.946353;
                    double cal = Math.round(calVl* 1000.0)/1000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Gallon Conversions
                if(option1Vl.equals("US Gallon") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 768;
                    answerVl.setText("" + calVl + " tsp");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 256;
                    answerVl.setText("" + calVl + " tbsp");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * 128;
                    answerVl.setText("" + calVl + " fl oz");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("US Cup")){
                    calVl = inputVl * 16;
                    answerVl.setText("" + calVl + " cup");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("US Pint")){
                    calVl = inputVl * 8;
                    answerVl.setText("" + calVl + " pt");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("US Quart")){
                    calVl = inputVl * 4;
                    answerVl.setText("" + calVl + " qt");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * .1074208759;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl * 231;
                    answerVl.setText("" + calVl + " cu in");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * .133680556;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * .004951131687;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * .003785411784;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 3785.41;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("US Gallon") && option2Vl.equals("Liter")){
                    calVl = inputVl * 3.78541;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Bushel Conversion
                if(option1Vl.equals("US Bushel") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl *7149.448312;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tsp");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 2383.1494;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tbsp");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl *1191.5747;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " fl oz");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("US Cup")){
                    calVl = inputVl *148.94683;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cup");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("US Pint")){
                    calVl = inputVl *74.4734;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " pt");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("US Quart")){
                    calVl = inputVl *37.2367;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " qt");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("US Gallon")){
                    calVl = inputVl *9.30918;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " gal");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl *2150.42;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu in");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl *1.244456019;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl *.04609096;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl *.03523907;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("Milliliter")){
                    calVl = inputVl *35239.1;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("US Bushel") && option2Vl.equals("Liter")){
                    calVl = inputVl *35.2391;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Cubic Inch Conversion........oh dear, I'm so tired
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 3.32468;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tsp");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 1.1082251;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tbsp");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * .55411255;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " fl oz");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("US Cup")){
                    calVl = inputVl * .069264069;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cup");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("US Pint")){
                    calVl = inputVl * .034632034;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " pt");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("US Quart")){
                    calVl = inputVl * .017316017;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " qt");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * .0043290043;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " gal");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * .0004650254369;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * .0005787037;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * .00002143347;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * .000016387064;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 16.3871;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("Cubic Inch") && option2Vl.equals("Liter")){
                    calVl = inputVl * .0163871;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Cubic Foot Conversion.......almost done T-T
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 5745.038961;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tsp");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 1915.012987;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tbsp");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * 957.5064935;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " fl oz");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("US Cup")){
                    calVl = inputVl * 119.6883;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cup");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("US Pint")){
                    calVl = inputVl * 59.84415;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " pt");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("US Quart")){
                    calVl = inputVl * 29.922077;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " qt");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * 7.480519;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " gal");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * .8035639549;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl * 1728;
                    answerVl.setText("" + calVl + " cu in");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * .0370370370;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * .02831684;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 28316.8;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("Cubic Foot") && option2Vl.equals("Liter")){
                    calVl = inputVl * 28.3168;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Cubic Yard Conversions
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 155116.0519;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tsp");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 51705.35065;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tbsp");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * 25852.67532;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " fl oz");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("US Cup")){
                    calVl = inputVl * 3231.584416;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cup");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("US Pint")){
                    calVl = inputVl * 1615.792208;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " pt");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("US Quart")){
                    calVl = inputVl * 807.8961;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " qt");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * 201.974026;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " gal");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * 21.69622;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl * 46656;
                    answerVl.setText("" + calVl + " cu in");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * 27;
                    answerVl.setText("" + calVl + " cu ft");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * .7645548;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 764554.858;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " mL");
                }
                if(option1Vl.equals("Cubic Yard") && option2Vl.equals("Liter")){
                    calVl = inputVl * 764.555;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " L");
                }

                //Cubic Meter Conversion......ALMOST DONE ... KEEP GOING
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 202884.1362;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tsp");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 67628.0454;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tbsp");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * 33814.0227;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " fl oz");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("US Cup")){
                    calVl = inputVl * 4226.7528;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cup");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("US Pint")){
                    calVl = inputVl * 2113.376419;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " pt");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("US Quart")){
                    calVl = inputVl * 1056.688209;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " qt");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * 264.1720524;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " gal");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * 28.37759;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl * 61023.74409;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu in");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * 35.314666;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * 1.307950619;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 1000000;
                    answerVl.setText("" + calVl + " mL");
                }
                if(option1Vl.equals("Cubic Meter") && option2Vl.equals("Liter")){
                    calVl = inputVl * 1000;
                    answerVl.setText("" + calVl + " L");
                }

                //Milliliter Conversions.....SO CLOSE
                if(option1Vl.equals("Milliliter") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * .202884;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tsp");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * .067628;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tbsp");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * .033814;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " fl oz");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("US Cup")){
                    calVl = inputVl * .00422675;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " cup");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("US Pint")){
                    calVl = inputVl * .00211338;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " pt");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("US Quart")){
                    calVl = inputVl * .00105669;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " qt");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * .000264172;
                    double cal = Math.round(calVl*10000000.0)/10000000.0;
                    answerVl.setText("" + cal + " gal");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * 2.83776e-5;
                    double cal = Math.round(calVl*1000000000.0)/1000000000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl * .0610237;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu in");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * 3.5315e-5;
                    double cal = Math.round(calVl*1000000000.0)/1000000000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * 1.30795e-6;
                    double cal = Math.round(calVl*1000000000.0)/1000000000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * 1e-6;
                    double cal = Math.round(calVl*1000000000.0)/1000000000.0;
                    answerVl.setText("" + cal + " cu m");
                }
                if(option1Vl.equals("Milliliter") && option2Vl.equals("Liter")){
                    calVl = inputVl * .001;
                    answerVl.setText("" + calVl + " L");
                }

                //Liter Conversion!!!!!!!!!!!! YOURE DONE!!!
                if(option1Vl.equals("Liter") && option2Vl.equals("US Teaspoon")){
                    calVl = inputVl * 202.884;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tsp");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("US Tablespoon")){
                    calVl = inputVl * 67.628;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " tbsp");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("US Fluid Ounce")){
                    calVl = inputVl * 33.814;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " fl oz");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("US Cup")){
                    calVl = inputVl * 4.22675;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cup");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("US Pint")){
                    calVl = inputVl * 2.11338;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " pt");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("US Quart")){
                    calVl = inputVl * 1.05669;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " qt");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("US Gallon")){
                    calVl = inputVl * .264172;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " gal");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("US Bushel")){
                    calVl = inputVl * .0283776;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " bushel");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl * 61.0237;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu in");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl * .035315;
                    double cal = Math.round(calVl*1000.0)/1000.0;
                    answerVl.setText("" + cal + " cu ft");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl * .00130795;
                    double cal = Math.round(calVl*100000.0)/100000.0;
                    answerVl.setText("" + cal + " cu yd");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl * .001;
                    answerVl.setText("" + calVl + " cu m");
                }
                if(option1Vl.equals("Liter") && option2Vl.equals("Milliliter")){
                    calVl = inputVl * 1000;
                    answerVl.setText("" + calVl + " mL");
                }






            }
        });
    }
}
