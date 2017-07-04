package com.codetribe.khutsoquizapp;

/**
 * Created by CodeTribe on 2017/06/30.
 */

class AppAnswers {

    private String[] javaAnswer ={"goto, instanceof, native, finally, default, throws",
            "int myList [] = {4, 3, 7};",
            "8 bits","interface"};
    private String[] androidanswer={"A.Intent",
            "A.Collection of views and other child views",
            "A.When the application is not responding ANR will occur.",
            "D. A & C","C. A & B",
            "C.Breaks the execution"};


    public AppAnswers() {
        super();
    }

    public String getJavaAnswer(int x) {

        String javaA=javaAnswer[x];
        return javaA;
    }

    public String getAndroidanswer(int x) {

        String androidA=androidanswer[x];
        return androidA;
    }
}
