package com.perfect.admin.police1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.admin.police1.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class SubjectActivity2017 extends AppCompatActivity {

    Button button_history_2017_3;
    Button button_englash_2017_3;
    Button button_criminal_law_2017_3;
    Button button_police_theory_2017_3;
    Button button_criminal_p_2017_3;
    AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_2017);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //2017_1 한국사
        button_history_2017_3 =(Button)findViewById(R.id.button_history_2017_3);
        button_englash_2017_3 = (Button)findViewById(R.id.button_englash_2017_3);
        button_criminal_law_2017_3 = (Button)findViewById(R.id.button_criminal_law_2017_3);
        button_criminal_p_2017_3 = (Button)findViewById(R.id.button_criminal_p_2017_3);
        button_police_theory_2017_3 = (Button)findViewById(R.id.button_police_theory_2017_3);


        button_history_2017_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SubjectActivity2017.this,QuizActivity2017_1.class);
                startActivity(intent);


            }
        });



        button_englash_2017_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity2017.this,QuizActivity2017_2.class);
                startActivity(intent);


            }


        });

        button_criminal_law_2017_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity2017.this,QuizActivity2017_3.class);
                 startActivity(intent);

             }
         });

        button_criminal_p_2017_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity2017.this,QuizActivity2017_4.class);
                 startActivity(intent);



             }
         });


        button_police_theory_2017_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity2017.this,QuizActivity2017_5.class);
                 startActivity(intent);




             }
         });



    }
}
