package com.example.admin.police1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SubjectActivity2015 extends AppCompatActivity {

    Button button_history_2017_3;
    Button button_englash_2017_3;
    Button button_criminal_law_2017_3;
    Button button_police_theory_2017_3;
    Button button_criminal_p_2017_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_2017);

        //2017_1 한국사
        button_history_2017_3 =(Button)findViewById(R.id.button_history_2017_3);
        button_englash_2017_3 = (Button)findViewById(R.id.button_englash_2017_3);
        button_criminal_law_2017_3 = (Button)findViewById(R.id.button_criminal_law_2017_3);
        button_criminal_p_2017_3 = (Button)findViewById(R.id.button_criminal_p_2017_3);
        button_police_theory_2017_3 = (Button)findViewById(R.id.button_police_theory_2017_3);


        button_history_2017_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SubjectActivity2015.this,QuizActivity2017_1.class);
                startActivity(intent);
                finish();


            }
        });



        button_englash_2017_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity2015.this,QuizActivity2017_2.class);
                startActivity(intent);
                finish();

            }


        });

        button_criminal_law_2017_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity2015.this,QuizActivity2018_3.class);
                 startActivity(intent);

             }
         });

        button_criminal_p_2017_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity2015.this,QuizActivity2018_4.class);
                 startActivity(intent);


             }
         });


        button_police_theory_2017_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity2015.this,QuizActivity2018_5.class);
                 startActivity(intent);



             }
         });



    }
}
