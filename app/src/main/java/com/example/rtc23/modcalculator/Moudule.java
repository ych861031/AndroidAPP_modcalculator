package com.example.rtc23.modcalculator;

import android.util.Log;

public class Moudule {


    protected String get_answer(String number){


        String[] cut = number.split("%",2);

        if (cut.length<2){
            return "?";
        }

        long a = Integer.parseInt(cut[0]);
        long b = Integer.parseInt(cut[1]);

        number = Long.toString(a%b);

        Log.e("return",number);

        return number;
    }




}
