package com.perfect.admin.police1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.police1.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Result2018_1 extends AppCompatActivity {


    TextView point;
    TextView score_text;
    Button  button_final2018_1,button_home;
    AdView mAdView;
    InterstitialAd interstitialAd;
    AdRequest adRequest;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result2018_1);
        MobileAds.initialize(this,"ca-app-pub-5091010687953685~3849411913");



        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-5091010687953685/1487734194");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener(){

            @Override
            public void onAdClosed() {
                startActivity(new Intent(Result2018_1.this,FinalActivity2018_1.class));
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }





        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        score_text = findViewById(R.id.score_text);
        point = findViewById(R.id.point);
        button_home =(Button)findViewById(R.id.button_home);



        Bundle bundle = getIntent().getExtras();
        double score = bundle.getDouble("finalScore");

        point.setText("" + score);



        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result2018_1.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });


    }

    public void displayAd2018(View view){

        if(interstitialAd.isLoaded()){

            interstitialAd.show();
        }else {

            startActivity(new Intent(this,FinalActivity2018_1.class));




        }

    }


}