package com.example.currencyconverter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button doller,euro,pound,yen,franc,ruouble,drachma,spesmilo,austral,penny,lira,bath;
    EditText editText;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        textView = findViewById(R.id.textView);
        doller = findViewById(R.id.button);
        euro = findViewById(R.id.button2);
        pound = findViewById(R.id.button3);
        yen = findViewById(R.id.button4);
        franc = findViewById(R.id.button5);
        ruouble = findViewById(R.id.button6);
        drachma = findViewById(R.id.button7);
        spesmilo = findViewById(R.id.button8);
        austral = findViewById(R.id.button9);
        penny = findViewById(R.id.button10);
        lira = findViewById(R.id.button11);
        bath = findViewById(R.id.button12);

        doller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Doller",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c = b*0.012;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Euro",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*0.011;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Pound",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*0.010;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
         yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Yen",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*1.66;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
        franc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Franc",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*0.011;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
        ruouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Ruouble",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*0.012;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
        drachma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Drachma",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*4.76;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
        spesmilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Spesmilo",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*0.11;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
        austral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Austral",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*0.018;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
        penny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Penny",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =0.3105;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
        lira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Lira",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*0.23;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });
        bath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Bath",Toast.LENGTH_LONG).show();
                String a = editText.getText().toString();


                if(TextUtils.isEmpty(a)){

                    editText.setError("empty user input");
                }
                else {
                    double b,c;
                    b= Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    c =b*0.42;
                    DecimalFormat numberformat = new DecimalFormat("0.00");
                    textView.setText(""+ numberformat.format(c));
                }

            }
        });

    }
}