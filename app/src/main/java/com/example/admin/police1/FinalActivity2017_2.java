package com.example.admin.police1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity2017_2 extends AppCompatActivity {

    TextView textView;
    Button button_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final2017_2);

        textView = (TextView)findViewById(R.id.textView);
        button_home =(Button)findViewById(R.id.button_home);

        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalActivity2017_2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });




    }
}
