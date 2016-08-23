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

public class MainActivity extends AppCompatActivity {

    Button convert;
    EditText inputUnit;
    TextView answer;
    Spinner spinnerFirst;
    Spinner spinnerSecond;


    ArrayAdapter<CharSequence> adapter1;
    ArrayAdapter<CharSequence> adapter2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        convert = (Button)findViewById(R.id.buttonConvert);
        inputUnit = (EditText)findViewById(R.id.editTextInput);
        answer = (TextView)findViewById(R.id.textViewAnswer);
        spinnerFirst = (Spinner)findViewById(R.id.spinner1);
        spinnerSecond = (Spinner)findViewById(R.id.spinner2);

        adapter1 = ArrayAdapter.createFromResource(this, R.array.unitOptions,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirst.setAdapter(adapter1);
        spinnerFirst.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2 = ArrayAdapter.createFromResource(this, R.array.unitOptions,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecond.setAdapter(adapter2);
        spinnerSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String option1 = (String) spinnerFirst.getSelectedItem();
                String option2 = (String) spinnerSecond.getSelectedItem();
                double input = Double.valueOf(inputUnit.getText().toString());
                double cal;


                if(option1.equals("Inch") && option2.equals("Centimeter")){
                    cal = input/.3937;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " cm");
                }
                if(option1.equals("Inch") && option2.equals("Feet")){
                    cal = input/12;
                    String calVl2 = String.valueOf(cal);
                    if(calVl2.contains(".249") || calVl2.contains(".25")){
                        int cal2 = (int) cal;
                        answer.setText("" + cal2 + " 1/4 ft");
                    }
                    else if (calVl2.contains(".5") || calVl2.contains(".49")){
                        int cal2 = (int)cal;
                        answer.setText("" + cal2 + " 1/2 ft");
                    }
                    else if (calVl2.contains(".749") || calVl2.contains(".75")){
                        int cal2 = (int)cal;
                        answer.setText("" + cal2 + " 3/4 ft");
                    }
                    else{double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " ft");}
                }
                if(option1.equals("Inch") && option2.equals("Yard")){
                    cal = input/36;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " yd");
                }
                if(option1.equals("Inch") && option2.equals("Mile")){
                    cal = input/63360;
                    double cal2 = Math.round(cal*1000000000.0)/1000000000.0;
                    answer.setText("" + cal2 + " mi");
                }
                if(option1.equals("Inch") && option2.equals("Millimeter")){
                    cal = input/.0393;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " mm");
                }
                if(option1.equals("Inch") && option2.equals("Meter")){
                    cal = input/39.37;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " m");
                }
                if(option1.equals("Inch") && option2.equals("Kilometer")){
                    cal = input/39370;
                    double cal2 = Math.round(cal*1000000000.0)/1000000000.0;
                    answer.setText("" + cal2 + " km");
                }
                //Feet Conversions
                if(option1.equals("Feet") && option2.equals("Inch")){
                    cal = input*12;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " in");
                }
                if(option1.equals("Feet") && option2.equals("Yard")){
                    cal = input/3;
                    String calVl2 = String.valueOf(cal);
                    if (calVl2.contains(".3")){
                        int cal2 = (int)cal;
                        answer.setText("" + cal2 + " 1/3 yd");
                    }
                    else if (calVl2.contains(".6")){
                        int cal2 = (int)cal;
                        answer.setText("" + cal2 + " 2/3 yd");
                    }
                    else{
                        double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " yd");}
                }
                if(option1.equals("Feet") && option2.equals("Mile")){
                    cal = input/5280;
                    double cal2 = Math.round(cal*10000000.0)/10000000.0;
                    answer.setText("" + cal2 + " mi");
                }
                if(option1.equals("Feet") && option2.equals("Millimeter")){
                    cal = input/.00328;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " mm");
                }
                if(option1.equals("Feet") && option2.equals("Centimeter")){
                    cal = input/.0328;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " cm");
                }
                if(option1.equals("Feet") && option2.equals("Meter")){
                    cal = input/3.2808;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " m");
                }
                if(option1.equals("Feet") && option2.equals("Kilometer")){
                    cal = input/3280.8;
                    double cal2 = Math.round(cal*10000000.0)/10000000.0;
                    answer.setText("" + cal2 + " km");
                }

                //Yard Conversion
                if(option1.equals("Yard") && option2.equals("Inch")){
                    cal = input * 36;
                    answer.setText("" + cal + " in");
                }
                if(option1.equals("Yard") && option2.equals("Feet")){
                    cal = input * 3;
                    answer.setText("" + cal + " ft");
                }
                if(option1.equals("Yard") && option2.equals("Mile")){
                    cal = input/1760;
                    double cal2 = Math.round(cal*10000000.0)/10000000.0;
                    answer.setText("" + cal2 + " mi");
                }
                if(option1.equals("Yard") && option2.equals("Millimeter")){
                    cal = input/.00109361;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" +cal2 + " mm");
                }
                if(option1.equals("Yard") && option2.equals("Centimeter")){
                    cal = input/.0109361;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" +cal2 + " cm");
                }
                if(option1.equals("Yard") && option2.equals("Meter")){
                    cal = input/1.09361;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" +cal2 + " m");
                }
                if(option1.equals("Yard") && option2.equals("Kilometer")){
                    cal = input/1093.61;
                    double cal2 = Math.round(cal*10000000.0)/10000000.0;
                    answer.setText("" +cal2 + " km");
                }

                //Mile Conversion
                if(option1.equals("Mile") && option2.equals("Inch")){
                    cal = input*63360;
                    answer.setText("" +cal + " in");
                }
                if(option1.equals("Mile") && option2.equals("Feet")){
                    cal = input*5280;
                    answer.setText("" +cal + " ft");
                }
                if(option1.equals("Mile") && option2.equals("Yard")){
                    cal = input*1760;
                    answer.setText("" +cal + " yd");
                }
                if(option1.equals("Mile") && option2.equals("Millimeter")){
                    cal = input*1609344;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" +cal2 + " mm");
                }
                if(option1.equals("Mile") && option2.equals("Centimeter")){
                    cal = input*160934.4;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" +cal2 + " cm");
                }
                if(option1.equals("Mile") && option2.equals("Meter")){
                    cal = input*1609.344;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" +cal2 + " m");
                }
                if(option1.equals("Mile") && option2.equals("Kilometer")){
                    cal = input*1.609344;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" +cal2 + " km");
                }

                //Millimeter Conversion
                if(option1.equals("Millimeter") && option2.equals("Inch")){
                    cal = input*0.0393701;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " in");
                }
                if(option1.equals("Millimeter") && option2.equals("Feet")){
                    cal = input*0.00328084;
                    double cal2 = Math.round(cal*100000.0)/100000.0;
                    answer.setText("" + cal2 + " ft");
                }
                if(option1.equals("Millimeter") && option2.equals("Yard")){
                    cal = input*0.00109361;
                    double cal2 = Math.round(cal*100000.0)/100000.0;
                    answer.setText("" + cal2 + " yd");
                }
                if(option1.equals("Millimeter") && option2.equals("Mile")){
                    cal = input*6.2137e-7;
                    double cal2 = Math.round(cal*1000000000.0)/1000000000.0;
                    answer.setText("" + cal2 + " mi");
                }
                if(option1.equals("Millimeter") && option2.equals("Centimeter")){
                    cal = input/10;
                    answer.setText("" + cal + " cm");
                }
                if(option1.equals("Millimeter") && option2.equals("Meter")){
                    cal = input/1000;
                    answer.setText("" + cal + " m");
                }
                if(option1.equals("Millimeter") && option2.equals("Kilometer")){
                    cal = input/1000000;
                    double cal2 = Math.round(cal*1000000000.0)/1000000000.0;
                    answer.setText("" + cal2 + " km");
                }

                //Centimeter Conversions
                if(option1.equals("Centimeter") && option2.equals("Inch")){
                    cal = input * 0.3937;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " in");
                }
                if(option1.equals("Centimeter") && option2.equals("Feet")){
                    cal = input * 0.0328084;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " ft");
                }
                if(option1.equals("Centimeter") && option2.equals("Yard")){
                    cal = input * 0.0109361;
                    double cal2 = Math.round(cal*100000.0)/100000.0;
                    answer.setText("" + cal2 + " yd");
                }
                if(option1.equals("Centimeter") && option2.equals("Mile")){
                    cal = input*6.2137e-6;
                    double cal2 = Math.round(cal*1000000000.0)/1000000000.0;
                    answer.setText("" + cal2 + " mi");
                }
                if(option1.equals("Centimeter") && option2.equals("Millimeter")){
                    cal = input*10;
                    answer.setText("" + cal + " mm");
                }
                if(option1.equals("Centimeter") && option2.equals("Meter")){
                    cal = input/100;
                    answer.setText("" + cal + " m");
                }
                if(option1.equals("Centimeter") && option2.equals("Kilometer")){
                    cal = input/100000;
                    double cal2 = Math.round(cal*10000000.0)/10000000.0;
                    answer.setText("" + cal2 + " mm");
                }

                //Meter Conversions
                if(option1.equals("Meter") && option2.equals("Inch")){
                    cal = input * 39.3701;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " in");
                }
                if(option1.equals("Meter") && option2.equals("Feet")){
                    cal = input * 3.28084;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " ft");
                }
                if(option1.equals("Meter") && option2.equals("Yard")){
                    cal = input * 1.09361;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " yd");
                }
                if(option1.equals("Meter") && option2.equals("Mile")){
                    cal = input * 0.000621371;
                    double cal2 = Math.round(cal*10000000.0)/10000000.0;
                    answer.setText("" + cal2 + " mi");
                }
                if(option1.equals("Meter") && option2.equals("Millimeter")){
                    cal = input *1000 ;
                    answer.setText("" + cal + " mm");
                }
                if(option1.equals("Meter") && option2.equals("Centimeter")){
                    cal = input * 100;
                    answer.setText("" + cal + " cm");
                }
                if(option1.equals("Meter") && option2.equals("Kilometer")){
                    cal = input/ 1000;
                    answer.setText("" + cal + " km");
                }

                //Kilometer Conversions
                if(option1.equals("Kilometer") && option2.equals("Inch")){
                    cal = input * 39370.1;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " in");
                }
                if(option1.equals("Kilometer") && option2.equals("Feet")){
                    cal = input * 3280.84;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " ft");
                }
                if(option1.equals("Kilometer") && option2.equals("Yard")){
                    cal = input * 1093.61;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " yd");
                }
                if(option1.equals("Kilometer") && option2.equals("Mile")){
                    cal = input * 0.621371;
                    double cal2 = Math.round(cal*1000.0)/1000.0;
                    answer.setText("" + cal2 + " mi");
                }
                if(option1.equals("Kilometer") && option2.equals("Millimeter")){
                    cal = input * 1000000;
                    answer.setText("" + cal + " mm");
                }
                if(option1.equals("Kilometer") && option2.equals("Centimeter")){
                    cal = input * 100000;
                    answer.setText("" + cal + " cm");
                }
                if(option1.equals("Kilometer") && option2.equals("Meter")){
                    cal = input * 1000;
                    answer.setText("" + cal + " m");
                }




            }
        });









    }
}
