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

public class AreaActivity extends AppCompatActivity {

    Button convertAr;
    EditText inputUnitAr;
    TextView answerAr;
    Spinner spinnerFirstAr;
    Spinner spinnerSecondAr;


    ArrayAdapter<CharSequence> adapter1Ar;
    ArrayAdapter<CharSequence> adapter2Ar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        convertAr = (Button)findViewById(R.id.buttonConvert);
        inputUnitAr = (EditText)findViewById(R.id.editTextInput);
        answerAr = (TextView)findViewById(R.id.textViewAnswer);
        spinnerFirstAr = (Spinner)findViewById(R.id.spinner1);
        spinnerSecondAr = (Spinner)findViewById(R.id.spinner2);

        adapter1Ar = ArrayAdapter.createFromResource(this, R.array.areaOptions,android.R.layout.simple_spinner_item);
        adapter1Ar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirstAr.setAdapter(adapter1Ar);
        spinnerFirstAr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2Ar = ArrayAdapter.createFromResource(this, R.array.areaOptions,android.R.layout.simple_spinner_item);
        adapter2Ar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecondAr.setAdapter(adapter2Ar);
        spinnerSecondAr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        convertAr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String option1Ar = (String) spinnerFirstAr.getSelectedItem();
                String option2Ar = (String) spinnerSecondAr.getSelectedItem();
                double inputAr = Double.valueOf(inputUnitAr.getText().toString());
                double calAr;

                //Square Inch Conversions
                if(option1Ar.equals("Square Inch") && option2Ar.equals("Square Feet")){
                    calAr = inputAr*.0069444444444;
                    answerAr.setText("" +calAr + " sq in");
                }
                if(option1Ar.equals("Square Inch") && option2Ar.equals("Square Yard")){
                    calAr = inputAr*.0007716049383;
                    answerAr.setText("" +calAr + " sq yd");
                }
                if(option1Ar.equals("Square Inch") && option2Ar.equals("Square Mile")){
                    calAr = inputAr*2.49098e-10;
                    answerAr.setText("" +calAr + " sq mi");
                }
                if(option1Ar.equals("Square Inch") && option2Ar.equals("Acre")){
                    calAr = inputAr*1.5942e-7;
                    answerAr.setText("" +calAr + " acre");
                }
                if(option1Ar.equals("Square Inch") && option2Ar.equals("Square Centimeter")){
                    calAr = inputAr*6.4516;
                    answerAr.setText("" +calAr + " sq cm");
                }
                if(option1Ar.equals("Square Inch") && option2Ar.equals("Square Meter")){
                    calAr = inputAr*.00064516;
                    answerAr.setText("" +calAr + " sq m");
                }
                if(option1Ar.equals("Square Inch") && option2Ar.equals("Square Kilometer")){
                    calAr = inputAr*6.4516e-10;
                    answerAr.setText("" +calAr + " sq km");
                }

                //Square Feet Conversions
                if(option1Ar.equals("Square Feet") && option2Ar.equals("Square Inch")){
                    calAr = inputAr*144;
                    answerAr.setText("" +calAr + " sq in");
                }
                if(option1Ar.equals("Square Feet") && option2Ar.equals("Square Yard")){
                    calAr = inputAr*(.111111);
                    answerAr.setText("" +calAr + " sq yd");
                }
                if(option1Ar.equals("Square Feet") && option2Ar.equals("Square Mile")){
                    calAr = inputAr*.00000003587006428;
                    answerAr.setText("" +calAr + " sq mi");
                }
                if(option1Ar.equals("Square Feet") && option2Ar.equals("Acre")){
                    calAr = inputAr*.00002295684114;
                    answerAr.setText("" +calAr + " acre");
                }
                if(option1Ar.equals("Square Feet") && option2Ar.equals("Square Centimeter")){
                    calAr = inputAr*929.0304;
                    answerAr.setText("" +calAr + " sq cm");
                }
                if(option1Ar.equals("Square Feet") && option2Ar.equals("Square Meter")){
                    calAr = inputAr*.09290304;
                    answerAr.setText("" +calAr + " sq m");
                }
                if(option1Ar.equals("Square Feet") && option2Ar.equals("Square Kilometer")){
                    calAr = inputAr*9.2903e-8;
                    answerAr.setText("" +calAr + " sq km");
                }

                //Square Yard Conversions
                if(option1Ar.equals("Square Yard") && option2Ar.equals("Square Inch")){
                    calAr = inputAr*1296;
                    answerAr.setText("" +calAr + " sq in");
                }
                if(option1Ar.equals("Square Yard") && option2Ar.equals("Square Feet")){
                    calAr = inputAr*9;
                    answerAr.setText("" +calAr + " sq ft");
                }
                if(option1Ar.equals("Square Yard") && option2Ar.equals("Square Mile")){
                    calAr = inputAr*3.2283e-7;
                    answerAr.setText("" +calAr + " sq mi");
                }
                if(option1Ar.equals("Square Yard") && option2Ar.equals("Acre")){
                    calAr = inputAr*.000206612;
                    answerAr.setText("" +calAr + " acre");
                }
                if(option1Ar.equals("Square Yard") && option2Ar.equals("Square Centimeter")){
                    calAr = inputAr*8361.2736;
                    answerAr.setText("" +calAr + " sq cm");
                }
                if(option1Ar.equals("Square Yard") && option2Ar.equals("Square Meter")){
                    calAr = inputAr*.83612736;
                    answerAr.setText("" +calAr + " sq m");
                }
                if(option1Ar.equals("Square Yard") && option2Ar.equals("Square Kilometer")){
                    calAr = inputAr*8.3613e-7;
                    answerAr.setText("" +calAr + " sq km");
                }

                //Square Mile Conversions
                if(option1Ar.equals("Square Mile") && option2Ar.equals("Square Feet")){
                    calAr = inputAr*27878400;
                    answerAr.setText("" +calAr + " sq ft");
                }
                if(option1Ar.equals("Square Mile") && option2Ar.equals("Square Yard")){
                    calAr = inputAr*3097600;
                    answerAr.setText("" +calAr + " sq yd");
                }
                if(option1Ar.equals("Square Mile") && option2Ar.equals("Square Inch")){
                    calAr = inputAr*401448960e1;
                    answerAr.setText("" +calAr + " sq in");
                }
                if(option1Ar.equals("Square Mile") && option2Ar.equals("Acre")){
                    calAr = inputAr*640;
                    answerAr.setText("" +calAr + " acre");
                }
                if(option1Ar.equals("Square Mile") && option2Ar.equals("Square Centimeter")){
                    calAr = inputAr*258998811e2;
                    answerAr.setText("" +calAr + " sq cm");
                }
                if(option1Ar.equals("Square Mile") && option2Ar.equals("Square Meter")){
                    calAr = inputAr*2589988.11;
                    answerAr.setText("" +calAr + " sq m");
                }
                if(option1Ar.equals("Square Mile") && option2Ar.equals("Square Kilometer")){
                    calAr = inputAr*2.58998811;
                    answerAr.setText("" +calAr + " sq km");
                }

                //Acre Conversions
                if(option1Ar.equals("Acre") && option2Ar.equals("Square Feet")){
                    calAr = inputAr*43560;
                    answerAr.setText("" +calAr + " sq ft");
                }
                if(option1Ar.equals("Acre") && option2Ar.equals("Square Yard")){
                    calAr = inputAr*4840;
                    answerAr.setText("" +calAr + " sq yd");
                }
                if(option1Ar.equals("Acre") && option2Ar.equals("Square Mile")){
                    calAr = inputAr*.0015625;
                    answerAr.setText("" +calAr + " sq mi");
                }
                if(option1Ar.equals("Acre") && option2Ar.equals("Square Inch")){
                    calAr = inputAr*6272640;
                    answerAr.setText("" +calAr + " sq in");
                }
                if(option1Ar.equals("Acre") && option2Ar.equals("Square Centimeter")){
                    calAr = inputAr*40468564.22;
                    answerAr.setText("" +calAr + " sq cm");
                }
                if(option1Ar.equals("Acre") && option2Ar.equals("Square Meter")){
                    calAr = inputAr*4046.856422;
                    answerAr.setText("" +calAr + " sq m");
                }
                if(option1Ar.equals("Acre") && option2Ar.equals("Square Kilometer")){
                    calAr = inputAr*.004046856422;
                    answerAr.setText("" +calAr + " sq km");
                }

                //Square Centimeter Conversions
                if(option1Ar.equals("Square Centimeter") && option2Ar.equals("Square Feet")){
                    calAr = inputAr*.001076391042;
                    answerAr.setText("" +calAr + " sq ft");
                }
                if(option1Ar.equals("Square Centimeter") && option2Ar.equals("Square Yard")){
                    calAr = inputAr*.0001195990046;
                    answerAr.setText("" +calAr + " sq yd");
                }
                if(option1Ar.equals("Square Centimeter") && option2Ar.equals("Square Mile")){
                    calAr = inputAr*3.86102e-11;
                    answerAr.setText("" +calAr + " sq mi");
                }
                if(option1Ar.equals("Square Centimeter") && option2Ar.equals("Acre")){
                    calAr = inputAr*2.4711e-8;
                    answerAr.setText("" +calAr + " acre");
                }
                if(option1Ar.equals("Square Centimeter") && option2Ar.equals("Square Inch")){
                    calAr = inputAr*.15500031;
                    answerAr.setText("" +calAr + " sq in");
                }
                if(option1Ar.equals("Square Centimeter") && option2Ar.equals("Square Meter")){
                    calAr = inputAr*.0001;
                    answerAr.setText("" +calAr + " sq m");
                }
                if(option1Ar.equals("Square Centimeter") && option2Ar.equals("Square Kilometer")){
                    calAr = inputAr*.0000000001;
                    answerAr.setText("" +calAr + " sq km");
                }

                //Square Meter Conversions
                if(option1Ar.equals("Square Meter") && option2Ar.equals("Square Feet")){
                    calAr = inputAr*10.76391042;
                    answerAr.setText("" +calAr + " sq ft");
                }
                if(option1Ar.equals("Square Meter") && option2Ar.equals("Square Yard")){
                    calAr = inputAr*1.195990046;
                    answerAr.setText("" +calAr + " sq yd");
                }
                if(option1Ar.equals("Square Meter") && option2Ar.equals("Square Mile")){
                    calAr = inputAr*3.86102e-7;
                    answerAr.setText("" +calAr + " sq mi");
                }
                if(option1Ar.equals("Square Meter") && option2Ar.equals("Acre")){
                    calAr = inputAr*.0002471;
                    answerAr.setText("" +calAr + " acre");
                }
                if(option1Ar.equals("Square Meter") && option2Ar.equals("Square Inch")){
                    calAr = inputAr*1550.0031;
                    answerAr.setText("" +calAr + " sq in");
                }
                if(option1Ar.equals("Square Meter") && option2Ar.equals("Square Centimeter")){
                    calAr = inputAr*10000;
                    answerAr.setText("" +calAr + " sq cm");
                }
                if(option1Ar.equals("Square Meter") && option2Ar.equals("Square Kilometer")){
                    calAr = inputAr*.000001;
                    answerAr.setText("" +calAr + " sq km");
                }

                //Square Kilometer Conversions
                if(option1Ar.equals("Square Kilometer") && option2Ar.equals("Square Feet")){
                    calAr = inputAr*10763910.42;
                    answerAr.setText("" +calAr + " sq ft");
                }
                if(option1Ar.equals("Square Kilometer") && option2Ar.equals("Square Yard")){
                    calAr = inputAr*1195990.046;
                    answerAr.setText("" +calAr + " sq yd");
                }
                if(option1Ar.equals("Square Kilometer") && option2Ar.equals("Square Mile")){
                    calAr = inputAr*.38610215;
                    answerAr.setText("" +calAr + " sq mi");
                }
                if(option1Ar.equals("Square Kilometer") && option2Ar.equals("Acre")){
                    calAr = inputAr*247.105;
                    answerAr.setText("" +calAr + " acre");
                }
                if(option1Ar.equals("Square Kilometer") && option2Ar.equals("Square Inch")){
                    calAr = inputAr*1550003100;
                    answerAr.setText("" +calAr + " sq in");
                }
                if(option1Ar.equals("Square Kilometer") && option2Ar.equals("Square Centimeter")){
                    calAr = inputAr*1000000000e1;
                    answerAr.setText("" +calAr + " sq cm");
                }
                if(option1Ar.equals("Square Kilometer") && option2Ar.equals("Square Meter")){
                    calAr = inputAr*1000000;
                    answerAr.setText("" +calAr + " sq m");
                }
            }
        });
    }
}
