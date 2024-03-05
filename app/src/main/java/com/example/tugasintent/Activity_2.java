package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        int number1 = intent.getIntExtra(MainActivity.EXTRA_NUMBER1,0);
        int number2 = intent.getIntExtra(MainActivity.EXTRA_NUMBER2,0);
        int number3 = intent.getIntExtra(MainActivity.EXTRA_NUMBER3,0);
        int number4 = intent.getIntExtra(MainActivity.EXTRA_NUMBER4,0);

        TextView textView1 = (TextView) findViewById(R.id.textview1);
        TextView textView2 = (TextView) findViewById(R.id.textview2);
        TextView textView3 = (TextView) findViewById(R.id.textview3);
        TextView textView4 = (TextView) findViewById(R.id.textview4);

        textView1.setText("Panjang : " + number1);
        textView2.setText("Lebar : " + number2);
        textView3.setText("Keliling : " + (2*number1+number2));
        textView4.setText("Luas : " + (number1*number2));



    }
}
