package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER1 = "number1";
    public static final String EXTRA_NUMBER2 = "number2";
    public static final String EXTRA_NUMBER3 = "number3";
    public static final String EXTRA_NUMBER4 = "number4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2(){
        EditText EditText1 = (EditText) findViewById(R.id.edittext1);
        int number1 = Integer.parseInt(EditText1.getText().toString());
        EditText EditText2 = (EditText) findViewById(R.id.edittextt2);
        int number2 = Integer.parseInt(EditText2.getText().toString());

        Intent intent = new Intent(this, Activity_2.class);
        intent.putExtra(EXTRA_NUMBER1,number1);
        intent.putExtra(EXTRA_NUMBER2,number2);
        startActivity(intent);
    }
}


