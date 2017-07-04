package com.codetribe.khutsoquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JavaCorrections extends AppCompatActivity {
    private TextView t1,t2,t3,t4,t5,t6,
                    t7,t8,t9,t10,t11,t12;

    private Button btnJAVAClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_corrections);

        btnJAVAClear=(Button)findViewById(R.id.button);
        t1=(TextView)findViewById(R.id.textView35);
        t2=(TextView)findViewById(R.id.textView34);
        t3=(TextView)findViewById(R.id.textView33);
        t4=(TextView)findViewById(R.id.textView32);
        t5=(TextView)findViewById(R.id.textView31);
        t6=(TextView)findViewById(R.id.textView30);
        t7=(TextView)findViewById(R.id.textView29);
        t8=(TextView)findViewById(R.id.textView28);
        t9=(TextView)findViewById(R.id.textView27);
        t10=(TextView)findViewById(R.id.textView26);
        t11=(TextView)findViewById(R.id.textView25);
        t12=(TextView)findViewById(R.id.textView24);


        t1.setText("1.Which one of these lists contains only Java programming language keywords?");
        t2.setText("B-goto, instanceof, native, finally, default, throws");
        t3.setText("Explanation:\n" +
                "All the words in option B are among the 49 Java keywords. Although goto reserved as a keyword in Java, goto is not used and has no function.\n" +
                "Option A is wrong because the keyword for the primitive int starts with a lowercase i.\n" +
                "Option C is wrong because \"virtual\" is a keyword in C++, but not Java.\n" +
                "Option D is wrong because \"constant\" is not a keyword. Constants in Java are marked static and final.\n" +
                "Option E is wrong because \"include\" is a keyword in C, but not in Java.\n");
        t4.setText("2.Which will legally declare, construct, and initialize an array?");
        t5.setText("D-int myList [] = {4, 3, 7};");
        t6.setText("Explanation:\n" +
                "The only legal array declaration and assignment statement is Option D\n" +
                "Option A is wrong because it initializes an int array with String literals.\n" +
                "Option B is wrong because it use something other than curly braces for the initialization.\n" +
                "Option C is wrong because it provides initial values for only one dimension, although the declared array is a two-dimensional array.\n");
        t7.setText("3.What is the size of byte variable?");
        t8.setText("A-8 bit");
        t9.setText("Explanation:\n" +
                "In computer architecture, 8-bit integers, memory addresses, or other data units are those that are at most 8 bits (1 octet) wide. ... 8-bit is also a term given to a generation of microcomputers in which 8-bit microprocessors were the norm.");
        t10.setText("4.Which is a valid keyword in java?");
        t11.setText("A-interface");
        t12.setText("Explanation:\n" +
                "interface is a valid keyword.\n" +
                "Option B is wrong because although \"String\" is a class type in Java, \"string\" is not a keyword.\n" +
                "Option C is wrong because \"Float\" is a class type. The keyword for the Java primitive is float.\n" +
                "Option D is wrong because \"unsigned\" is a keyword in C/C++ but not in Java.\n");


        btnJAVAClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(JavaCorrections.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
