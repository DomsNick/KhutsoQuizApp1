package com.codetribe.khutsoquizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class JavaQuestions extends AppCompatActivity {


    TextView q1,q2,q3,q4;

    RadioButton a1,a2,a3,a4;
    RadioGroup rg1,rg2,rg3,rg4;
    Button sub;
    int score = 0;
    Intent intent;

    AppQuestions appQuiz = new AppQuestions();
    AppAnswers appAns = new AppAnswers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_questions);
        int count=0;


        q1=(TextView)findViewById(R.id.textView2);
        q2=(TextView)findViewById(R.id.textView3);
        q3=(TextView)findViewById(R.id.textView4);
        q4=(TextView)findViewById(R.id.textView5);

        a1=(RadioButton)findViewById(R.id.radioButton21);
        a2=(RadioButton)findViewById(R.id.radioButton15);
        a3=(RadioButton)findViewById(R.id.radioButton14);
        a4=(RadioButton)findViewById(R.id.radioButton10);

       // rg1=(RadioGroup)findViewById(R.id.rgroupone);
        sub=(Button)findViewById(R.id.btnSub);
        q1.setText(appQuiz.getJavaQuestions(0));
        q2.setText(appQuiz.getJavaQuestions(1));
        q3.setText(appQuiz.getJavaQuestions(2));

        q4.setText(appQuiz.getJavaQuestions(3));



        a1.setText(appAns.getJavaAnswer(0));
        a2.setText(appAns.getJavaAnswer(1));
        a3.setText(appAns.getJavaAnswer(2));
        a4.setText(appAns.getJavaAnswer(3));



        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                rg1=(RadioGroup)findViewById(R.id.rgroupone);
                int key1 = rg1.getCheckedRadioButtonId();


                switch (key1) {
                    case R.id.radioButton21:

                        score++;


                        break;

                    default:

                        break;
                }

                rg2=(RadioGroup)findViewById(R.id.rgrouptwo);
                int key2=rg2.getCheckedRadioButtonId();

                switch (key2) {
                    case R.id.radioButton15:

                        score++;


                        break;

                    default:

                        break;
                }
                rg3=(RadioGroup)findViewById(R.id.rgroupthree);
                int key3=rg3.getCheckedRadioButtonId();

                switch (key3) {
                    case R.id.radioButton14:

                        score++;


                        break;

                    default:

                        break;
                }

                rg4=(RadioGroup)findViewById(R.id.rgroupfour);
                int key4=rg3.getCheckedRadioButtonId();

                switch (key4) {
                    case R.id.radioButton10:

                        score++;


                        break;

                    default:




                        break;
                }

                Toast.makeText(JavaQuestions.this,"Yo scored "+score+"  out of 4",Toast.LENGTH_LONG).show();
                intent = new Intent(JavaQuestions.this,JavaCorrections.class);
                startActivity(intent);
            }
        });









    }
}
