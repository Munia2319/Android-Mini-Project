package com.example.cc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button CbtnCalculate, CbtnClear, HbtnCalculate, HbtnClear, WbtnCalculate, WbtnClear;
    EditText C_editText, H_editText,  W_editText ;
    RadioButton rdBDT, rdUSD, rdIND,rdFEET,rdINCH,rdCem,rdKg,rdPound,rdOunce,rdGrm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CbtnCalculate=findViewById(R.id.CbtnCalculate);
        CbtnClear=findViewById(R.id.CbtnClear);
        C_editText=findViewById(R.id.edtINId1);
        rdUSD=findViewById(R.id.Crd1);
        rdBDT=findViewById(R.id.Crd2);
        rdIND=findViewById(R.id.Crd3);
        CbtnCalculate.setOnClickListener(this);
        CbtnClear.setOnClickListener(this);


        HbtnCalculate=findViewById(R.id.HbtnCalculate);
        HbtnClear=findViewById(R.id.HbtnClear);
        H_editText=findViewById(R.id.edtINId2);
        rdFEET=findViewById(R.id.Hrd1);
        rdINCH=findViewById(R.id.Hrd2);
        rdCem=findViewById(R.id.Hrd3);
        HbtnCalculate.setOnClickListener(this);
        HbtnClear.setOnClickListener(this);


        WbtnCalculate=findViewById(R.id.WbtnCalculate);
        WbtnClear=findViewById(R.id.WbtnClear);
        W_editText=findViewById(R.id.edtINId3);
        rdKg=findViewById(R.id.Wrd1);
        rdPound=findViewById(R.id.Wrd2);
        rdOunce=findViewById(R.id.Wrd3);
        rdGrm=findViewById(R.id.Wrd4);
        WbtnCalculate.setOnClickListener(this);
        WbtnClear.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.CbtnCalculate)
        {
            Double input= new Double(C_editText.getText().toString());
            if(rdBDT.isChecked())
            {
                double result=converter.bdtUSD(input);
                C_editText.setText(new Double(result).toString());
            }

            else if(rdUSD.isChecked())
            {
                double result=converter.UsdBDT(input);
                C_editText.setText(new Double(result).toString());
            }

            if(rdIND.isChecked())
            {
                double result=converter.bdtI(input);
                C_editText.setText(new Double(result).toString());
            }

        }
        if(view.getId()==R.id.CbtnClear)
        {
            C_editText.setText(null);

        }



        if(view.getId()==R.id.HbtnCalculate)
        {
            Double input= new Double(H_editText.getText().toString());
            if(rdFEET.isChecked())
            {
                double result=HeightConverter.CemFeet(input);
                H_editText.setText(new Double(result).toString());
            }

            else if(rdINCH.isChecked())
            {
                double result=HeightConverter.FeetInch(input);
                H_editText.setText(new Double(result).toString());
            }

            if(rdCem.isChecked())
            {
                double result=HeightConverter.FeetCem(input);
                H_editText.setText(new Double(result).toString());
            }

        }
        if(view.getId()==R.id.HbtnClear)
        {
            H_editText.setText(null);

        }



        if(view.getId()==R.id.WbtnCalculate)
        {
            Double input= new Double(W_editText.getText().toString());
            if(rdPound.isChecked())
            {
                double result=WeightConverter.KgPnd(input);
                W_editText.setText(new Double(result).toString());
            }

            else if(rdKg.isChecked())
            {
                double result=WeightConverter.PndKg(input);
                W_editText.setText(new Double(result).toString());
            }

            if(rdOunce.isChecked())
            {
                double result=WeightConverter.KgOnc(input);
                W_editText.setText(new Double(result).toString());
            }
            if(rdGrm.isChecked())
            {
                double result=WeightConverter.KgGrm(input);
                W_editText.setText(new Double(result).toString());
            }

        }
        if(view.getId()==R.id.WbtnClear)
        {
            W_editText.setText(null);

        }
    }
}