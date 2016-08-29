package com.soaresfelipef.nicecalculator;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalcActivity extends AppCompatActivity {

    public enum Operation{
        ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUAL
    }

    String runningNumber = "";
    String leftValueStr = "";
    String rightValueStr = "";


    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button zeroButton = (Button)findViewById(R.id.zeroButton);
        Button oneButton = (Button)findViewById(R.id.oneButton);
        Button twoButton = (Button)findViewById(R.id.twoButton);
        Button threeButton = (Button)findViewById(R.id.threeButton);
        Button fourButton = (Button)findViewById(R.id.fourButton);
        Button fiveButton = (Button)findViewById(R.id.fiveButton);
        Button sixButton = (Button)findViewById(R.id.sixButton);
        Button sevenButton = (Button)findViewById(R.id.sevenButton);
        Button eightButton = (Button)findViewById(R.id.eightButton);
        Button nineButton = (Button)findViewById(R.id.nineButton);
        Button clearButton = (Button)findViewById(R.id.clearButton);

        ImageButton equalButton = (ImageButton)findViewById(R.id.equalButton);
        ImageButton divideButton = (ImageButton)findViewById(R.id.divideButton);
        ImageButton multiplyButton = (ImageButton)findViewById(R.id.multiplyButton);
        ImageButton subtractButton = (ImageButton)findViewById(R.id.subtractButton);
        ImageButton addButton = (ImageButton)findViewById(R.id.addButton);


        resultTextView = (TextView)findViewById(R.id.textView);
        resultTextView.setText("");

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(0);
            }
        });

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(1);
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(2);
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(3);
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(4);
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(5);
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(6);
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(7);
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(8);
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(9);
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    void numberPressed(int number){
        runningNumber += String.valueOf(number);
        resultTextView.setText(runningNumber);
    }
}
