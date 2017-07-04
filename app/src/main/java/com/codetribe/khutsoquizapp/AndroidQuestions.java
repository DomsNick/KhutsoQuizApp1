package com.codetribe.khutsoquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class AndroidQuestions extends AppCompatActivity {

    private TextView txtquestion1,txtquestion2,txtquestion3,txtquestion4,txtquestion5,txtquestion6;
    private Button btnsub;
    private RadioGroup rganswer1,rganswer2,rganswer3,rganswer4,rganswer5,rganswer6;
    private RadioButton rdA1,rdA2,rdA3,rdA4,rdA5,rdA6;
    private int score=0;
    private Intent intent;
    AppQuestions appQuiz = new AppQuestions();
    AppAnswers appAnswers = new AppAnswers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_questions);

        //Questions
        txtquestion1=(TextView)findViewById(R.id.txtq1);
        txtquestion2=(TextView)findViewById(R.id.txtq2);
        txtquestion3=(TextView)findViewById(R.id.txtq3);
        txtquestion4=(TextView)findViewById(R.id.txtq4);
        txtquestion5=(TextView)findViewById(R.id.txtq5);
        txtquestion6=(TextView)findViewById(R.id.txtq6);

        txtquestion1.setText(appQuiz.getAndroidQuestiond(0));
        txtquestion2.setText(appQuiz.getAndroidQuestiond(1));
        txtquestion3.setText(appQuiz.getAndroidQuestiond(2));
        txtquestion4.setText(appQuiz.getAndroidQuestiond(3));
        txtquestion5.setText(appQuiz.getAndroidQuestiond(4));
        txtquestion6.setText(appQuiz.getAndroidQuestiond(5));





        //Answers

        rdA1=(RadioButton)findViewById(R.id.answer1);
        rdA2=(RadioButton)findViewById(R.id.answe2);
        rdA3=(RadioButton)findViewById(R.id.answer3);
        rdA4=(RadioButton)findViewById(R.id.answe4);
        rdA5=(RadioButton)findViewById(R.id.answer5);
        rdA6=(RadioButton)findViewById(R.id.answer6);

        rdA1.setText(appAnswers.getAndroidanswer(0));
        rdA2.setText(appAnswers.getAndroidanswer(1));
        rdA3.setText(appAnswers.getAndroidanswer(2));
        rdA4.setText(appAnswers.getAndroidanswer(3));
        rdA5.setText(appAnswers.getAndroidanswer(4));
        rdA6.setText(appAnswers.getAndroidanswer(5));





        btnsub=(Button)findViewById(R.id.btnsubAdroid);

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rganswer1=(RadioGroup)findViewById(R.id.rgq1);
                int key1 = rganswer1.getCheckedRadioButtonId();


                switch (key1) {
                    case R.id.answer1:
                        score++;
                        break;
                    default:
                    break;
                }

                rganswer2=(RadioGroup)findViewById(R.id.rgq2);
                int key2 = rganswer2.getCheckedRadioButtonId();

                switch (key2) {
                    case R.id.answe2:
                        score++;
                        break;
                    default:
                        break;
                }

                rganswer3=(RadioGroup)findViewById(R.id.rgq3);
                int key3 = rganswer3.getCheckedRadioButtonId();

                switch (key3) {
                    case R.id.answer3:
                        score++;
                        break;
                    default:
                        break;
                }

                rganswer4=(RadioGroup)findViewById(R.id.rgq4);
                int key4 = rganswer4.getCheckedRadioButtonId();

                switch (key4) {
                    case R.id.answe4:
                        score++;
                        break;
                    default:
                        break;
                }


                rganswer5=(RadioGroup)findViewById(R.id.rgq5);
                int key5 = rganswer5.getCheckedRadioButtonId();
                switch (key5) {
                    case R.id.answer5:
                        score++;
                        break;
                    default:
                        break;
                }
                rganswer6=(RadioGroup)findViewById(R.id.rgq6);
                int key6 = rganswer6.getCheckedRadioButtonId();
                switch (key6) {
                    case R.id.answer6:
                        score++;
                        break;
                    default:
                        break;
                }


                Toast.makeText(AndroidQuestions.this,"Yo scored "+score+"  out of 6",Toast.LENGTH_LONG).show();
                intent= new Intent(AndroidQuestions.this,AndroidCorrections.class);
                startActivity(intent);


            }






        });





    }
}
