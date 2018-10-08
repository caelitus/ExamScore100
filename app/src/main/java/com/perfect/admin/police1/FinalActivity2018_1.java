package com.perfect.admin.police1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import com.example.admin.police1.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FinalActivity2018_1 extends AppCompatActivity {


    Button button_home;
    private ExpandableListView listView;
    private ExpandableListAdapter2018 listAdapter2018;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final2018_1);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        listView = (ExpandableListView)findViewById(R.id.list_final_2018);
        initData();
        listAdapter2018 = new ExpandableListAdapter2018(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter2018);






        button_home =(Button)findViewById(R.id.button_home);

        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalActivity2018_1.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });




    }

    private void initData() {

        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();


        listDataHeader.add("2018년 1차 한국사 정답표");
        listDataHeader.add("2018년 1차 영어 정답표");
        listDataHeader.add("2018년 1차 형법 정답표");
        listDataHeader.add("2018년 1차 형사소송법 정답표");
        listDataHeader.add("2018년 1차 경찰학개론 정답표");

        List<String> answer2018_1 =   new ArrayList<>();
        answer2018_1.add(getString(R.string.final_2018_1));

        List<String> answer2018_2 =   new ArrayList<>();
        answer2018_2.add(getString(R.string.final_2018_2));

        List<String> answer2018_3 =   new ArrayList<>();
        answer2018_3.add(getString(R.string.final_2018_3));

        List<String> answer2018_4 =   new ArrayList<>();
        answer2018_4.add(getString(R.string.final_2018_4));

        List<String> answer2018_5 =   new ArrayList<>();
        answer2018_5.add(getString(R.string.final_2018_5));


        listHash.put(listDataHeader.get(0),answer2018_1);

        listHash.put(listDataHeader.get(1),answer2018_2);

        listHash.put(listDataHeader.get(2),answer2018_3);

        listHash.put(listDataHeader.get(3),answer2018_4);

        listHash.put(listDataHeader.get(4),answer2018_5);


    }

    public void displayAd2018(View view) {


    }
}
