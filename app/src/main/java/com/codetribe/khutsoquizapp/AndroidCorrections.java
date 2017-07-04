package com.codetribe.khutsoquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AndroidCorrections extends AppCompatActivity {

    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,
                    t10,t11,t12,t13,t14,t15,t16,t17,t18;
    private Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_corrections);

        btnClose=(Button)findViewById(R.id.btnClearA);

        t1=(TextView)findViewById(R.id.textView23);
        t2=(TextView)findViewById(R.id.textView22);
        t3=(TextView)findViewById(R.id.textView21);
        t4=(TextView)findViewById(R.id.textView20);
        t5=(TextView)findViewById(R.id.textView19);
        t6=(TextView)findViewById(R.id.textView18);
        t7=(TextView)findViewById(R.id.textView17);
        t8=(TextView)findViewById(R.id.textView16);
        t9=(TextView)findViewById(R.id.textView15);
        t10=(TextView)findViewById(R.id.textView14);
        t11=(TextView)findViewById(R.id.textView13);
        t12=(TextView)findViewById(R.id.textView12);
        t13=(TextView)findViewById(R.id.textView11);
        t14=(TextView)findViewById(R.id.textView10);
        t15=(TextView)findViewById(R.id.textView9);
        t16=(TextView)findViewById(R.id.textView8);
        t17=(TextView)findViewById(R.id.textView7);
        t18=(TextView)findViewById(R.id.textView6);


        t1.setText("1.How to pass the data between activities in Android?");
        t2.setText("A - Intent");
        t3.setText("Explanation\n" +
                "An Intent is used to connect one activity to another activity and having a message passing mechanism between activities.\n");
        t4.setText("2.What is android view group?");
        t5.setText("A - Collection of views and other child views");
        t6.setText("Explanation\n" +
                "View Group is collaborating with views and other child views,It is an invisible container and base classes for layouts.\n");
        t7.setText("3.What is ANR in android?");
        t8.setText("A - When the application is not responding ANR will occur.");
        t9.setText("Explanation\n" +
                "When an Application is not responding ANR will be occur, and it will stop the process or an application\n");
        t10.setText("4.How to access the context in android content provider?");
        t11.setText("D - A & C");
        t12.setText("Explanation\n" +
                "The getContext() method is used in onCreate() method and getApplicationContext() can be used anywhere in an application.\n");
        t13.setText("5.How to get current location in android?");
        t14.setText("C - A & B");
        t15.setText("Explanation\n" +
                "GPRS and Location provider is used to fetch the current location of a phone as longitude and latitude.\n");
        t16.setText("6.What is breakpoint in android?");
        t17.setText("C - Breaks the execution.");
        t18.setText("Explanation\n" +
                        "Breaks the execution to find the debug value, It is one of the debugging techniques.");

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AndroidCorrections.this,MainActivity.class);
                startActivity(intent);
            }
        });




    }
}
