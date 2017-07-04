package com.codetribe.khutsoquizapp;

/**
 * Created by CodeTribe on 2017/06/30.
 */

class AppQuestions {

    private String[] javaQuestions={"Which one of these lists contains only Java programming language keywords?",
            "Which will legally declare, construct, and initialize an array?",
            "What is the size of byte variable?",
            "Which is a valid keyword in java?"};

    private  String[] androidQuestiond={"1.How to pass the data between activities in Android?",
            "2.What is android view group?",
            "3.What is ANR in android?",
            "4.How to access the context in android content provider?",
            "5.How to get current location in android?",
            "6.What is breakpoint in android?"};


    public AppQuestions() {
        super();
    }

    public String getJavaQuestions(int x) {
        String javaq = javaQuestions[x];

        return javaq;
    }

    public String getAndroidQuestiond(int x) {

        String android = androidQuestiond[x];
        return android ;
    }



}
