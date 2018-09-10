package com.example.admin.police1;


public class QuestionLibrary2017_1 {

       //2017_3 한국사


    public   static  String mQuestions [] = {
            "1. " +
                    "2017년 한국사 1번 문제  ",
            "2." +
                    "공무원  기출문제를 만들고 있어요.",
            "3." +
                    "This part of the plant attracts bees, butterflies and hummingbirds.",
            "아래 그림",
            "5번 문제 ",
            "6번 문제 ",
            "7 문제 ",
            "8 문제 ",
            "9 문제 ",
            "10 문제 ",

    };


    public  static String mChoices [][] = {
            {"국어의 비문절 음운에는 장점과 단점이 있다.", "10조", "50조", "100원"},
            {"오답", "Seeds","이건 정답 아니야","이게 정답"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
    };



    public static String mCorrectAnswers[] = {"국어의 비문절 음운에는 장점과 단점이 있다.", "이게 정답", "정답", "정답", "정답", "정답", "정답", "정답", "정답", "정답"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}


