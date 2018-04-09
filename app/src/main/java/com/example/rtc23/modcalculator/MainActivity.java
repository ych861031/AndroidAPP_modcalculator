package com.example.rtc23.modcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDelete,btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =findViewById(R.id.btn_1);
        btn2 =findViewById(R.id.btn_2);
        btn3 =findViewById(R.id.btn_3);
        btn4 =findViewById(R.id.btn_4);
        btn5 =findViewById(R.id.btn_5);
        btn6 =findViewById(R.id.btn_6);
        btn7 =findViewById(R.id.btn_7);
        btn8 =findViewById(R.id.btn_8);
        btn9 =findViewById(R.id.btn_9);
        btn0 =findViewById(R.id.btn_0);
        btnDelete =findViewById(R.id.btn_delete);
        btnGo =findViewById(R.id.btn_go);

        btn1.setOnClickListener(listner);
        btn2.setOnClickListener(listner);
        btn3.setOnClickListener(listner);
        btn4.setOnClickListener(listner);
        btn5.setOnClickListener(listner);
        btn6.setOnClickListener(listner);
        btn7.setOnClickListener(listner);
        btn8.setOnClickListener(listner);
        btn9.setOnClickListener(listner);
        btn0.setOnClickListener(listner);

    }

    Button.OnClickListener listner = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };




}
