package com.perfect.admin.police1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.admin.police1.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
//

public class QuizActivity2016_2 extends AppCompatActivity {

    private  QuestionLibrary2016_2 mQuestionLibrary = new QuestionLibrary2016_2();

    public TextView mScoreView;
    public TextView mQuestionView;
    public Button mButtonChoice1;
    public Button mButtonChoice2;
    public Button mButtonChoice3;
    public Button mButtonChoice4;
    public ScrollView scrollView2016_2;
    public AdView mAdView;


    public String mAnswer;
    public double mScore = 0.0;
    public int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_activity2016_2);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);
        scrollView2016_2 = (ScrollView)findViewById(R.id.scrollView2016_2);



        scrollView2016_2.fullScroll(ScrollView.FOCUS_UP);

        updateQuestion();

        scrollView2016_2.fullScroll(ScrollView.FOCUS_UP);

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer) {

                    mScore = mScore +5.0;
                    updateScore(mScore);

                    //check before button start

                    if (mQuestionNumber ==  QuestionLibrary2016_2.mQuestions.length) {

                        Intent i = new Intent(QuizActivity2016_2.this, Result2016_1.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity2016_2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }


                } else {

                    if (mQuestionNumber ==  QuestionLibrary2016_2.mQuestions.length) {

                        Intent i = new Intent(QuizActivity2016_2.this, Result2016_1.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity2016_2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }
                }

            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer) {

                    mScore = mScore + 5.0;
                    updateScore(mScore);

                    //check before button start

                    if (mQuestionNumber ==  QuestionLibrary2016_2.mQuestions.length) {

                        Intent i = new Intent(QuizActivity2016_2.this, Result2016_1.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity2016_2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }

                } else {

                    if (mQuestionNumber ==  QuestionLibrary2016_2.mQuestions.length) {

                        Intent i = new Intent(QuizActivity2016_2.this, Result2016_1.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity2016_2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }
                }

            }
        });


        //End of Button Listener for Button2


        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Start of Button Listener for Button3


                if (mButtonChoice3.getText() == mAnswer) {

                    mScore = mScore + 5.0;
                    updateScore(mScore);

                    //check before button start
                    if (mQuestionNumber ==  QuestionLibrary2016_2.mQuestions.length) {

                        Intent i = new Intent(QuizActivity2016_2.this, Result2016_1.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity2016_2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }




                } else {

                    if (mQuestionNumber ==  QuestionLibrary2016_2.mQuestions.length) {

                        Intent i = new Intent(QuizActivity2016_2.this, Result2016_1.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity2016_2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }
                }

            }
        });


        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice4.getText() == mAnswer) {

                    mScore = mScore + 5.0;
                    updateScore(mScore);

                    //check before button start

                    if (mQuestionNumber ==  QuestionLibrary2016_2.mQuestions.length) {

                        Intent i = new Intent(QuizActivity2016_2.this, Result2016_1.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity2016_2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }



                } else {

                    if (mQuestionNumber ==  QuestionLibrary2016_2.mQuestions.length) {

                        Intent i = new Intent(QuizActivity2016_2.this, Result2016_1.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity2016_2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }
                }

            }
        });


    }

    private void updateQuestion() {
        scrollView2016_2.fullScroll(ScrollView.FOCUS_UP);


        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;

        scrollView2016_2.fullScroll(ScrollView.FOCUS_UP);
    }



    private void updateScore (double point) {

        mScoreView.setText("" + mScore);

        scrollView2016_2.fullScroll(ScrollView.FOCUS_UP);

    }
}

