package com.example.currencyconverter;

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




    }
}