package com.havi.explo.unitconverter;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;


public class FirstPageActivity extends AppCompatActivity {

    ImageButton length;
    ImageButton weight;
    ImageButton temp;
    ImageButton data;
    ImageButton area;
    ImageButton volume;
    ImageButton frequency;
    ImageButton pressure;
    ImageButton energy;

    private FirebaseAnalytics mFirebaseAnalytics;
    private AdView mAdView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        MobileAds.initialize(getApplicationContext(),"ca-app-pub-9818921099106202~4696649575");


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        length = (ImageButton)findViewById(R.id.imageButtonLength);
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this,MainActivity.class);
                startActivity(goToDisplay);
            }
        });

        weight = (ImageButton)findViewById(R.id.imageButtonWeight);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this, WeightActivity.class);
                startActivity(goToDisplay);
            }
        });

        temp = (ImageButton)findViewById(R.id.imageButtonTemp);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this, TempActivity.class);
                startActivity(goToDisplay);
            }
        });

        data = (ImageButton)findViewById(R.id.imageButtonData);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this, DataActivity.class);
                startActivity(goToDisplay);
            }
        });

        area = (ImageButton)findViewById(R.id.imageButtonArea);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this, AreaActivity.class);
                startActivity(goToDisplay);
            }
        });

        volume = (ImageButton)findViewById(R.id.imageButtonVolume);
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this, VolumeActivity.class);
                startActivity(goToDisplay);
            }
        });

        frequency = (ImageButton)findViewById(R.id.imageButtonFrequency);
        frequency.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this, FrequencyActivity.class);
                startActivity(goToDisplay);


            }
        }));

        pressure = (ImageButton)findViewById(R.id.imageButtonPressure);
        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this, PressureActivity.class);
                startActivity(goToDisplay);

            }
        });

        energy = (ImageButton)findViewById(R.id.imageButtonEnergy);
        energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDisplay = new Intent(FirstPageActivity.this, EnergyActivity.class);
                startActivity(goToDisplay);

            }
        });



    }
}
