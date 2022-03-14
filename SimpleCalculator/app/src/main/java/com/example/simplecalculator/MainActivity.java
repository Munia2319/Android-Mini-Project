package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0,button1, button2, button3,button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonDiv,buttonMul, buttonEqual, buttonDot,buttonClear;
    EditText edtIn;
    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=findViewById(R.id.btnZero);
        button1=findViewById(R.id.btnOne);
        button2=findViewById(R.id.btnTwo);
        button3=findViewById(R.id.btnThree);
        button4=findViewById(R.id.btnFour);
        button5=findViewById(R.id.btnFive);
        button6=findViewById(R.id.btnSix);
        button7=findViewById(R.id.btnSeven);
        button8=findViewById(R.id.btnEight);
        button9=findViewById(R.id.btnNine);
        buttonAdd=findViewById(R.id.btnAdd);
        buttonSub=findViewById(R.id.btnSub);
        buttonMul=findViewById(R.id.btnMul);
        buttonDiv=findViewById(R.id.btndiv);
        buttonDot=findViewById(R.id.btnDot);
        buttonEqual=findViewById(R.id.btnEqual);
        buttonClear=findViewById(R.id.btnClear);
        edtIn=findViewById(R.id.edt1);

    }
    button0.



}