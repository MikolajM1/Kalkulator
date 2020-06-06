package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button button11;
    private Button button12;
    private Button button14;
    private Button button15;
    private Button button17;
    private Button button18;
    private Button button20;
    private Button button21;
    private ImageView button13;
    private ImageView button16;
    private ImageView button19;
    private TextView wynik;
    private Button buttonac;

    String a = "";
    String b = "";
    BigDecimal value1;
    BigDecimal value2;
    BigDecimal c;
    double c1;
    int ab = 0;
    int type;
    float temp1;
    double temp2;
    double c2;
    float temp_c;
    double value3;
    double temp_p;
    int temp;
    BigDecimal temp_c2;
    BigDecimal temp_c3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button13 = findViewById(R.id.button13);
        button16 = findViewById(R.id.button16);
        button19 = findViewById(R.id.button19);
        wynik = findViewById(R.id.textView);
        buttonac = findViewById(R.id.buttonac);



        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = "";
                b = "";
                value1 = BigDecimal.valueOf(0);
                value2 = BigDecimal.valueOf(0);
                c = BigDecimal.valueOf(0);
                c1 = 0;
                c2 = 0;
                ab = 0;
                type = 0;
                temp1 = 0;
                temp2 = 0;
                wynik.setText("");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(ab == 0){
                   a = a+"1";
                   wynik.setText(a);

               }else{
                   b = b+"1";
                   wynik.setText(b);
               }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+"2";
                    wynik.setText(a);
                }else{
                    b = b+"2";
                    wynik.setText(b);
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+"3";
                    wynik.setText(a);
                }else{
                    b = b+"3";
                    wynik.setText(b);
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+"4";
                    wynik.setText(a);
                }else{
                    b = b+"4";
                    wynik.setText(b);
                }

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+"5";
                    wynik.setText(a);
                }else{
                    b = b+"5";
                    wynik.setText(b);
                }

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+"6";
                    wynik.setText(a);
                }else{
                    b = b+"6";
                    wynik.setText(b);
                }

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+"7";
                    wynik.setText(a);
                }else{
                    b = b+"7";
                    wynik.setText(b);
                }

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+"8";
                    wynik.setText(a);
                }else{
                    b = b+"8";
                    wynik.setText(b);
                }

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+"9";
                    wynik.setText(a);
                }else{
                    b = b+"9";
                    wynik.setText(b);
                }

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+"0";
                    wynik.setText(a);
                }else{
                    b = b+"0";
                    wynik.setText(b);
                }

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ab == 0){
                    a = a+".";
                    wynik.setText(a);
                }else{
                    b = b+".";
                    wynik.setText(b);
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.length() != 0 && b.length() != 0){
                    value1 = BigDecimal.valueOf(Double.parseDouble(a));
                    value2 = BigDecimal.valueOf(Double.parseDouble(b));
                    temp = value2.intValue();
                }

                if(type == 1){
                    c = value1.add(value2);
                }else if(type == 2){
                    c = value1.subtract(value2);
                }else if(type == 3){
                    c = value1.multiply(value2);
                }else if(type == 4){
                    c = value1.divide(value2, RoundingMode.CEILING);
                }else if(type == 6){
                    c = value1.pow(temp);
                }else if (type == 5){
                    temp1 = value1.intValue();
                    temp2 = Math.sqrt(temp1);
                    c = BigDecimal.valueOf(Double.parseDouble(String.valueOf(temp2)));
                }else if(type == 7){
                    c = value1.multiply(value2);
                }else if(type == 8){
                    temp_c2 = value1.pow(2);
                    c = temp_c2.multiply(BigDecimal.valueOf(3.14));
                }else if(type == 9){
                    temp_c3 = value1.multiply(value2);
                    c = temp_c3.divide(BigDecimal.valueOf(2), RoundingMode.CEILING);
                }

                wynik.setText(String.valueOf(c));



            }

        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = 7;
                ab = 1;
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = 1;
                ab = 1;
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = 2;
                ab = 1;
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value3 = Double.parseDouble(a);
                temp_p = Math.pow(value3, 2);
                c1 = 3.14*temp_p;
                wynik.setText(String.valueOf(c1));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = 3;
                ab = 1;
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = 4;
                ab = 1;
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = 9;
                ab = 1;
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value3 = Double.parseDouble(a);
                c1 = Math.sqrt(value3);
                wynik.setText(String.valueOf(c1));
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = 6;
                ab = 1;
            }
        });

    }
}
