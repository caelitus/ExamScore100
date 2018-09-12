package com.example.admin.police1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class SubjectActivity extends AppCompatActivity {

    ImageButton imageButton_history_2018_3;
    ImageButton imageButton_englash_2018_3;
    ImageButton imageButton_criminal_law_2018_3;
    ImageButton imageButton_police_theory_2018_3;
    ImageButton imageButton_criminal_p_2018_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        //2018_1 한국사
        imageButton_history_2018_3 =(ImageButton)findViewById(R.id.imageButton_history_2018_3);
        imageButton_englash_2018_3 = (ImageButton)findViewById(R.id.imageButton_englash_2018_3);
        imageButton_criminal_law_2018_3 = (ImageButton)findViewById(R.id.imageButton_criminal_law_2018_3);
        imageButton_criminal_p_2018_3 = (ImageButton)findViewById(R.id.imageButton_criminal_p_2018_3);
        imageButton_police_theory_2018_3 = (ImageButton)findViewById(R.id.imageButton_police_theory_2018_3);


        imageButton_history_2018_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_1.class);
                startActivity(intent);
                finish();


            }
        });



        imageButton_englash_2018_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_2.class);
                startActivity(intent);
                finish();

            }


        });

         imageButton_criminal_law_2018_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_3.class);
                 startActivity(intent);

             }
         });

         imageButton_criminal_p_2018_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_4.class);
                 startActivity(intent);


             }
         });


         imageButton_police_theory_2018_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(SubjectActivity.this,QuizActivity2018_5.class);
                 startActivity(intent);



             }
         });



    }
}
