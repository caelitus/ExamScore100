package com.example.admin.police1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class SubjectActivity extends AppCompatActivity {


    Button button_history_2018_3;
    Button button_englash_2018_3;
    Button button_criminal_law_2018_3;
    Button button_criminal_p_2018_3;
    Button button_police_theory_2018_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        //2018_1 한국사
        button_history_2018_3 =(Button)findViewById(R.id.button_history_2018_3);
        button_englash_2018_3 = (Button)findViewById(R.id.button_englash_2018_3);
        button_criminal_law_2018_3 = (Button)findViewById(R.id.button_criminal_law_2018_3);
        button_criminal_p_2018_3 = (Button)findViewById(R.id.button_criminal_p_2018_3);
        button_police_theory_2018_3 = (Button)findViewById(R.id.button_police_theory_2018_3);



        button_history_2018_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_1.class);
                startActivity(intent);
                finish();


            }
        });



        button_englash_2018_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_2.class);
                startActivity(intent);
                finish();

            }


        });

        button_criminal_law_2018_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_3.class);
                 startActivity(intent);
                 finish();

             }
         });

        button_criminal_p_2018_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_4.class);
                 startActivity(intent);
                 finish();


             }
         });


        button_police_theory_2018_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_5.class);
                 startActivity(intent);
                 finish();



             }
         });



    }
}
