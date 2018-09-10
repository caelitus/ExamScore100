package com.example.admin.police1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result2018_1 extends AppCompatActivity {


    TextView point;
    TextView score_text;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result2018_1);

        score_text = findViewById(R.id.score_text);
        point = findViewById(R.id.point);
        button =(Button)findViewById(R.id.button);


        Bundle bundle = getIntent().getExtras();
        double score = bundle.getDouble("finalScore");

        point.setText("" + score);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}