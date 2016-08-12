package com.havi.explo.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by HaviNguyen on 8/10/16.
 */
public class FirstPageActivity extends AppCompatActivity {

    ImageButton length;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        length = (ImageButton)findViewById(R.id.imageButtonLength);
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this,MainActivity.class);
                startActivity(goToDisplay);
            }
        });



    }
}
