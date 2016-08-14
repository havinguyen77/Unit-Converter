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

public class VolumeActivity extends AppCompatActivity {
    Button convertVl;
    EditText inputUnitVl;
    TextView answerVl;
    Spinner spinnerFirstVl;
    Spinner spinnerSecondVl;


    ArrayAdapter<CharSequence> adapter1Vl;
    ArrayAdapter<CharSequence> adapter2Vl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

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

                //I was filling in the equations for the conversion but wouldn't using
                //fractions be for useful in the US. For example, knowing that a 3 tablespoon is
                // 3/16 of a cup is more useful than knowing that it is .1875 of a cup.
                //However, I can't display fractions or input them.
                //Should I continue to leave he conversion as a decimal or fractions?

                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Tablespoon")){
                    calVl = inputVl*.333333;
                    answerVl.setText("" + calVl + " tbsp");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Fluid Ounce")){
                    calVl = inputVl*.1666667;
                    answerVl.setText("" + calVl + " fl.oz.");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Cup")){
                    calVl = inputVl*.0208333;
                    answerVl.setText("" + calVl + " cup");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Pint")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " pt");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Quart")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " qt");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Gallon")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " gal");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Bushel")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " bushel");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Cubic Inch")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " cu in");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Cubic Foot")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " cu ft");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Cubic Yard")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " cu yard");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Cubic Meter")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " cu m");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Milliliter")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " mL");
                }
                if(option1Vl.equals("Teaspoon") && option2Vl.equals("Liter")){
                    calVl = inputVl;
                    answerVl.setText("" + calVl + " L");
                }
            }
        });
    }
}
