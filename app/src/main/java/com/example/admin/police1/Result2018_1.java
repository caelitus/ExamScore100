package com.example.admin.police1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result2018_1 extends AppCompatActivity {


    TextView point;
    TextView score_text;
    Button  button_final2018_1,button_home;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result2018_1);

        score_text = findViewById(R.id.score_text);
        point = findViewById(R.id.point);
        button_home =(Button)findViewById(R.id.button_home);
        button_final2018_1 = (Button)findViewById(R.id.button_final2018_1);


        Bundle bundle = getIntent().getExtras();
        double score = bundle.getDouble("finalScore");

        point.setText("" + score);



        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        button_final2018_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Result2018_1.this,FinalActivity.class);
                startActivity(intent);



            }
        });
    }
}