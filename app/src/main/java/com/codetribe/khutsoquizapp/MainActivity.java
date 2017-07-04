package com.codetribe.khutsoquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnplay;
    private RadioButton rbjava,rbAndroid;
    private Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnplay = (Button)findViewById(R.id.play);
        rbjava=(RadioButton)findViewById(R.id.rdJava);
        rbAndroid=(RadioButton)findViewById(R.id.rbAndroid);

        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(rbjava.isChecked())
                {

                    intent = new Intent(MainActivity.this,JavaQuestions.class);
                    startActivity(intent);

                }else

                if(rbAndroid.isChecked())
                {

                    intent = new Intent(MainActivity.this,AndroidQuestions.class);
                    startActivity(intent);

                }

                if(!rbAndroid.isChecked() && !rbjava.isChecked())
                {


                    Toast toast= Toast.makeText(MainActivity.this,"Please check one of RadioButton (Java or Android) to Proceed",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL,0,0);
                    toast.show();


                }




            }
        });


    }
}
