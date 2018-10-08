package com.perfect.admin.police1;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.admin.police1.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    Button button2018_1,button2017_1,button2016_1,button2015_1,button2014_1;
    Toolbar toolbar;
    ImageButton imageButton;

    InterstitialAd mInterstitialAd;


    private static final String TAG = "MainActivity";
    private long backPressedTime;

     AdView mAdView;





        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





            mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);



            toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            mInterstitialAd = new InterstitialAd(this);
            mInterstitialAd.setAdUnitId("ca-app-pub-5091010687953685~3849411913");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
            mInterstitialAd.setAdListener(new AdListener(){

                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });



            toolbar.setTitle("Police");

            imageButton = (ImageButton)findViewById(R.id.imageButton);
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        button2018_1 = (Button)findViewById(R.id.button2018_1);
        button2018_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SubjectActivity.class);
                startActivity(intent);


            }
        });

        button2017_1 = (Button)findViewById(R.id.button2017_1);
        button2017_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SubjectActivity2017.class);
                startActivity(intent);


            }
        });

        button2016_1 = (Button) findViewById(R.id.button2016_1);
        button2016_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SubjectActivity2016.class);
                startActivity(intent);


            }
        });

        button2015_1 = (Button)findViewById(R.id.button2015_1);
        button2015_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SubjectActivity2015.class);
                startActivity(intent);

            }
        });

            button2014_1 = (Button)findViewById(R.id.button2014_1);
            button2014_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this,SubjectActivity2014.class);
                    startActivity(intent);

                }
            });


    }






    private void displayedSelectedScreen(int id){

        Fragment fragment = null;

        switch(id){
            case R.id.nav_menu1:
                fragment = new Menu1();
                break;

            case R.id.nav_menu3:
                fragment = new Menu3();
                break;


        }

        if(fragment != null){
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_main , fragment).addToBackStack(null);
            ft.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }



    @Override public boolean onNavigationItemSelected(MenuItem item){

        int id = item.getItemId();

        displayedSelectedScreen(id);







        return true;
    }
}
