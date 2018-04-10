package com.example.rtc23.modcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDelete,btnMod;
    TextView textView;


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
        btnMod =findViewById(R.id.btn_mod);

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

        btnDelete = findViewById(R.id.btn_delete);
        btnMod = findViewById(R.id.btn_mod);

        btnDelete.setOnClickListener(listner2);
        btnMod.setOnClickListener(listner2);

        btnDelete.setOnLongClickListener(listner_long);


        textView = findViewById(R.id.textView);
    }

    String number;
    Button.OnClickListener listner = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_1:
                    Log.e("btn_1","call");
                    number = "1";
                    break;
                case R.id.btn_2:
                    Log.e("btn_2","call");
                    number = "2";
                    break;
                case R.id.btn_3:
                    Log.e("btn_3","call");
                    number = "3";
                    break;
                case R.id.btn_4:
                    Log.e("btn_4","call");
                    number = "4";
                    break;
                case R.id.btn_5:
                    Log.e("btn_5","call");
                    number = "5";
                    break;
                case R.id.btn_6:
                    Log.e("btn_6","call");
                    number = "6";
                    break;
                case R.id.btn_7:
                    Log.e("btn_7","call");
                    number = "7";
                    break;
                case R.id.btn_8:
                    Log.e("btn_8","call");
                    number = "8";
                    break;
                case R.id.btn_9:
                    Log.e("btn_9","call");
                    number = "9";
                    break;
                case R.id.btn_0:
                    Log.e("btn_0","call");
                    number = "0";
                    break;
                default:
                    Log.e("default","!!!");
                    break;
            }

            if (textView.getText().toString().equals("input number")){
                Log.e("equals","!!!");
                textView.setText(number);
            }else {
                textView.setText(textView.getText()+number);
            }
        }
    };


    Button.OnClickListener listner2 = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (textView.getText().toString().equals("input number")){
                return;
            }
            switch (v.getId()){
                case R.id.btn_mod:
                    Log.e("btn_mod","call");
                    textView.setText(textView.getText()+"%");
                    break;
                case R.id.btn_delete:
                    Log.e("btn_delete","call");
                    number = textView.getText().toString();
                    textView.setText(number.substring(0,number.length()-1));
                    break;
                default:
                    break;
            }
        }
    };

    Button.OnLongClickListener listner_long = new Button.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            textView.setText("input number");
            return false;
        }
    };



}
