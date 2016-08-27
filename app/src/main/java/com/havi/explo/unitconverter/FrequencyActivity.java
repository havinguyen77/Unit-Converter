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

public class FrequencyActivity extends AppCompatActivity {

    Button convertFq;
    EditText inputUnitFq;
    TextView answerFq;
    Spinner spinnerFirstFq;
    Spinner spinnerSecondFq;


    ArrayAdapter<CharSequence> adapter1Fq;
    ArrayAdapter<CharSequence> adapter2Fq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency);

        convertFq = (Button)findViewById(R.id.buttonConvert);
        inputUnitFq = (EditText)findViewById(R.id.editTextInput);
        answerFq = (TextView)findViewById(R.id.textViewAnswer);
        spinnerFirstFq = (Spinner)findViewById(R.id.spinner1);
        spinnerSecondFq = (Spinner)findViewById(R.id.spinner2);

        adapter1Fq = ArrayAdapter.createFromResource(this, R.array.frequencyOptions,android.R.layout.simple_spinner_item);
        adapter1Fq.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirstFq.setAdapter(adapter1Fq);
        spinnerFirstFq.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2Fq = ArrayAdapter.createFromResource(this, R.array.frequencyOptions,android.R.layout.simple_spinner_item);
        adapter2Fq.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecondFq.setAdapter(adapter2Fq);
        spinnerSecondFq.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        convertFq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String option1Fq = (String) spinnerFirstFq.getSelectedItem();
                String option2Fq = (String) spinnerSecondFq.getSelectedItem();
                double inputFq = Double.valueOf(inputUnitFq.getText().toString());
                double calFq;

                //Nanohertz Conversions
                if (option1Fq.equals("Nanohertz") && option2Fq.equals("Microhertz")){
                    calFq = inputFq*.001;
                    double cal = Math.round(calFq*100000.0)/100000.0;
                    answerFq.setText("" + cal+ " µHz");
                }
                if (option1Fq.equals("Nanohertz") && option2Fq.equals("Millihertz")){
                    calFq = inputFq*1e-6;
                    double cal = Math.round(calFq*1000000000.0)/1000000000.0;
                    answerFq.setText("" + cal+ " mHz");
                }
                if (option1Fq.equals("Nanohertz") && option2Fq.equals("Hertz")){
                    calFq = inputFq*1e-9;
                    double cal = Math.round(calFq*1000000000000.0)/1000000000000.0;
                    answerFq.setText("" + cal+ " Hz");
                }
                if (option1Fq.equals("Nanohertz") && option2Fq.equals("Kilohertz")){
                    calFq = inputFq*1e-12;
                    double cal = Math.round(calFq*1000000000000000.0)/1000000000000000.0;
                    answerFq.setText("" + cal+ " kHz");
                }
                if (option1Fq.equals("Nanohertz") && option2Fq.equals("Megahertz")){
                    calFq = inputFq*1e-15;
                    double cal = Math.round(calFq*1000000000000000000.0)/1000000000000000000.0;
                    answerFq.setText("" + cal+ " MHz");
                }
                if (option1Fq.equals("Nanohertz") && option2Fq.equals("Gigahertz")){
                    calFq = inputFq*1e-18;
                    double cal = Math.round(calFq*1000000000000000000000.0)/1000000000000000000000.0;
                    answerFq.setText("" + cal+ " GHz");
                }
                if (option1Fq.equals("Nanohertz") && option2Fq.equals("Terahertz")){
                    calFq = inputFq*1e-21;
                    double cal = Math.round(calFq*1000000000000000000000000.0)/1000000000000000000000000.0;
                    answerFq.setText("" + cal+ " THz");
                }

                //Microhertz Conversions
                if (option1Fq.equals("Microhertz") && option2Fq.equals("Nanohertz")){
                    calFq = inputFq*1000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " nHz");
                }
                if (option1Fq.equals("Microhertz") && option2Fq.equals("Millihertz")){
                    calFq = inputFq*.001;
                    double cal = Math.round(calFq*1000000.0)/1000000.0;
                    answerFq.setText("" + cal+ " mHz");
                }
                if (option1Fq.equals("Microhertz") && option2Fq.equals("Hertz")){
                    calFq = inputFq*1e-6;
                    double cal = Math.round(calFq*1000000000.0)/1000000000.0;
                    answerFq.setText("" + cal+ " Hz");
                }
                if (option1Fq.equals("Microhertz") && option2Fq.equals("Kilohertz")){
                    calFq = inputFq*1e-9;
                    double cal = Math.round(calFq*1000000000000.0)/1000000000000.0;
                    answerFq.setText("" + cal+ " kHz");
                }
                if (option1Fq.equals("Microhertz") && option2Fq.equals("Megahertz")){
                    calFq = inputFq*1e-12;
                    double cal = Math.round(calFq*1000000000000000.0)/1000000000000000.0;
                    answerFq.setText("" + cal+ " MHz");
                }
                if (option1Fq.equals("Microhertz") && option2Fq.equals("Gigahertz")){
                    calFq = inputFq*1e-15;
                    double cal = Math.round(calFq*1000000000000000000.0)/1000000000000000000.0;
                    answerFq.setText("" + cal+ " GHz");
                }
                if (option1Fq.equals("Microhertz") && option2Fq.equals("Terahertz")){
                    calFq = inputFq*1e-18;
                    double cal = Math.round(calFq*1000000000000000000000.0)/1000000000000000000000.0;
                    answerFq.setText("" + cal+ " THz");
                }

                //Millihertz Conversion
                if (option1Fq.equals("Millihertz") && option2Fq.equals("Nanohertz")){
                    calFq = inputFq*1000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " nHz");
                }
                if (option1Fq.equals("Millihertz") && option2Fq.equals("Microhertz")){
                    calFq = inputFq*1000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " µHz");
                }
                if (option1Fq.equals("Millihertz") && option2Fq.equals("Hertz")){
                    calFq = inputFq*.001;
                    double cal = Math.round(calFq*1000000.0)/1000000.0;
                    answerFq.setText("" + cal+ " Hz");
                }
                if (option1Fq.equals("Millihertz") && option2Fq.equals("Kilohertz")){
                    calFq = inputFq*1e-6;
                    double cal = Math.round(calFq*1000000000.0)/1000000000.0;
                    answerFq.setText("" + cal+ " kHz");
                }
                if (option1Fq.equals("Millihertz") && option2Fq.equals("Megahertz")){
                    calFq = inputFq*1e-9;
                    double cal = Math.round(calFq*1000000000000.0)/1000000000000.0;
                    answerFq.setText("" + cal+ " MHz");
                }
                if (option1Fq.equals("Millihertz") && option2Fq.equals("Gigahertz")){
                    calFq = inputFq*1e-12;
                    double cal = Math.round(calFq*1000000000000000.0)/1000000000000000.0;
                    answerFq.setText("" + cal+ " GHz");
                }
                if (option1Fq.equals("Millihertz") && option2Fq.equals("Terahertz")){
                    calFq = inputFq*1e-15;
                    double cal = Math.round(calFq*1000000000000000000.0)/1000000000000000000.0;
                    answerFq.setText("" + cal+ " THz");
                }

                //Hertz Conversions
                if (option1Fq.equals("Hertz") && option2Fq.equals("Nanohertz")){
                    calFq = inputFq*1000000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " nHz");
                }
                if (option1Fq.equals("Hertz") && option2Fq.equals("Microhertz")){
                    calFq = inputFq*1000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " µHz");
                }
                if (option1Fq.equals("Hertz") && option2Fq.equals("Millihertz")){
                    calFq = inputFq*1000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " mHz");
                }
                if (option1Fq.equals("Hertz") && option2Fq.equals("Kilohertz")){
                    calFq = inputFq*.001;
                    double cal = Math.round(calFq*1000000.0)/1000000.0;
                    answerFq.setText("" + cal+ " kHz");
                }
                if (option1Fq.equals("Hertz") && option2Fq.equals("Megahertz")){
                    calFq = inputFq*1e-6;
                    double cal = Math.round(calFq*1000000000.0)/1000000000.0;
                    answerFq.setText("" + cal+ " MHz");
                }
                if (option1Fq.equals("Hertz") && option2Fq.equals("Gigahertz")){
                    calFq = inputFq*1e-9;
                    double cal = Math.round(calFq*1000000000000.0)/1000000000000.0;
                    answerFq.setText("" + cal+ " GHz");
                }
                if (option1Fq.equals("Hertz") && option2Fq.equals("Terahertz")){
                    calFq = inputFq*1e-12;
                    double cal = Math.round(calFq*1000000000000000.0)/1000000000000000.0;
                    answerFq.setText("" + cal+ " THz");
                }

                //Kilohertz Conversion
                if (option1Fq.equals("Kilohertz") && option2Fq.equals("Nanohertz")){
                    calFq = inputFq*1000000000e3;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " nHz");
                }
                if (option1Fq.equals("Kilohertz") && option2Fq.equals("Microhertz")){
                    calFq = inputFq*1000000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " µHz");
                }
                if (option1Fq.equals("Kilohertz") && option2Fq.equals("Millihertz")){
                    calFq = inputFq*1000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " mHz");
                }
                if (option1Fq.equals("Kilohertz") && option2Fq.equals("Hertz")){
                    calFq = inputFq*1000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" +cal+ " Hz");
                }
                if (option1Fq.equals("Kilohertz") && option2Fq.equals("Megahertz")){
                    calFq = inputFq*.001;
                    double cal = Math.round(calFq*1000000.0)/1000000.0;
                    answerFq.setText("" + cal+ " MHz");
                }
                if (option1Fq.equals("Kilohertz") && option2Fq.equals("Gigahertz")){
                    calFq = inputFq*1e-6;
                    double cal = Math.round(calFq*1000000000.0)/1000000000.0;
                    answerFq.setText("" + cal+ " GHz");
                }
                if (option1Fq.equals("Kilohertz") && option2Fq.equals("Terahertz")){
                    calFq = inputFq*1e-9;
                    double cal = Math.round(calFq*1000000000000.0)/1000000000000.0;
                    answerFq.setText("" + cal+ " THz");
                }

                //Megahertz Conversion
                if (option1Fq.equals("Megahertz") && option2Fq.equals("Nanohertz")){
                    calFq = inputFq*1000000000e6;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " nHz");
                }
                if (option1Fq.equals("Megahertz") && option2Fq.equals("Microhertz")){
                    calFq = inputFq*1000000000e3;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " µHz");
                }
                if (option1Fq.equals("Megahertz") && option2Fq.equals("Millihertz")){
                    calFq = inputFq*1000000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " mHz");
                }
                if (option1Fq.equals("Megahertz") && option2Fq.equals("Hertz")){
                    calFq = inputFq*1000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " Hz");
                }
                if (option1Fq.equals("Megahertz") && option2Fq.equals("Kilohertz")){
                    calFq = inputFq*1000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " kHz");
                }
                if (option1Fq.equals("Megahertz") && option2Fq.equals("Gigahertz")){
                    calFq = inputFq*.001;
                    double cal = Math.round(calFq*1000000.0)/1000000.0;
                    answerFq.setText("" + cal+ " GHz");
                }
                if (option1Fq.equals("Megahertz") && option2Fq.equals("Terahertz")){
                    calFq = inputFq*1e-6;
                    double cal = Math.round(calFq*1000000000.0)/1000000000.0;
                    answerFq.setText("" + cal+ " THz");
                }

                //Gigahertz Conversion
                if (option1Fq.equals("Gigahertz") && option2Fq.equals("Nanohertz")){
                    calFq = inputFq*1000000000e9;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " nHz");
                }
                if (option1Fq.equals("Gigahertz") && option2Fq.equals("Microhertz")){
                    calFq = inputFq*1000000000e6;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " µHz");
                }
                if (option1Fq.equals("Gigahertz") && option2Fq.equals("Millihertz")){
                    calFq = inputFq*1000000000e3;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " mHz");
                }
                if (option1Fq.equals("Gigahertz") && option2Fq.equals("Hertz")){
                    calFq = inputFq*1000000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " Hz");
                }
                if (option1Fq.equals("Gigahertz") && option2Fq.equals("Kilohertz")){
                    calFq = inputFq*1000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " kHz");
                }
                if (option1Fq.equals("Gigahertz") && option2Fq.equals("Megahertz")){
                    calFq = inputFq*1000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " MHz");
                }
                if (option1Fq.equals("Gigahertz") && option2Fq.equals("Terahertz")){
                    calFq = inputFq*.001;
                    double cal = Math.round(calFq*1000000.0)/1000000.0;
                    answerFq.setText("" + cal+ " THz");
                }

                //Terahertz Conversion
                //Messed up conversion to Nano
                if (option1Fq.equals("Terahertz") && option2Fq.equals("Nanohertz")){
                    calFq = inputFq*Math.pow(1,21);
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " nHz");
                }
                if (option1Fq.equals("Terahertz") && option2Fq.equals("Microhertz")){
                    calFq = inputFq*1000000000e9;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " µHz");
                }
                if (option1Fq.equals("Terahertz") && option2Fq.equals("Millihertz")){
                    calFq = inputFq*1000000000e6;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " mHz");
                }
                if (option1Fq.equals("Terahertz") && option2Fq.equals("Hertz")){
                    calFq = inputFq*1000000000e3;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " Hz");
                }
                if (option1Fq.equals("Terahertz") && option2Fq.equals("Kilohertz")){
                    calFq = inputFq*1000000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " kHz");
                }
                if (option1Fq.equals("Terahertz") && option2Fq.equals("Megahertz")){
                    calFq = inputFq*1000000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " MHz");
                }
                if (option1Fq.equals("Terahertz") && option2Fq.equals("Gigahertz")){
                    calFq = inputFq*1000;
                    double cal = Math.round(calFq*1000.0)/1000.0;
                    answerFq.setText("" + cal+ " GHz");
                }




            }
        });
    }
}
