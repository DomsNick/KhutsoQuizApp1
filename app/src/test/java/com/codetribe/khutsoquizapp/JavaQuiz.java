package com.codetribe.khutsoquizapp;

/**
 * Created by CodeTribe on 2017/06/12.
 */

public class JavaQuiz{


    private String[] questions ={"Which one of these lists contains only Java programming language keywords?",
                                "Which will legally declare, construct, and initialize an array?",
                                " What is the size of byte variable?",
                                "Which is a valid keyword in java?"};


    private String[] answers={"goto, instanceof, native, finally, default, throws",
                                "int myList [] = {4, 3, 7};",
            "8 bits","interface"};


    public JavaQuiz() {



    }

    public String getQuestions(int q) {

        String question = questions[q];

        return question;
    }



    public String getAnswers(int a) {

        String answer = answers[a];

        return answer;
    }


}
