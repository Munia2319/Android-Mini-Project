package com.example.converterfinal.;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCalculateHight, btnClearHeight,btnCalculateWeight,btnClearWeight;
    EditText editTextHeight,editTextWeight;
    RadioButton rd_m_to_cm,rd_cm_to_m,rd_m_to_mm;
    RadioButton rd_kg_to_g,rd_g_to_kg,rd_kg_to_mg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculateHight=findViewById(R.id.btnCalculateHeightId);
        btnClearHeight=findViewById(R.id.btnClearHeightId);
        rd_m_to_cm=findViewById(R.id.mTOcmId);
        rd_cm_to_m=findViewById(R.id.cmTOmId);
        rd_m_to_mm=findViewById(R.id.mTOmmId);
        editTextHeight=findViewById(R.id.edtHeightId);

        btnCalculateWeight=findViewById(R.id.btnCalculateWeightId);
        btnClearWeight=findViewById(R.id.btnClearWeightId);
        rd_kg_to_g=findViewById(R.id.kgTOgId);
        rd_g_to_kg=findViewById(R.id.gTOkgId);
        rd_kg_to_mg=findViewById(R.id.kgTOmgId);
        editTextWeight=findViewById(R.id.edtWeightId);

        btnCalculateHight.setOnClickListener(this);
        btnClearHeight.setOnClickListener(this);
        btnClearWeight.setOnClickListener(this);
        btnCalculateWeight.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnCalculateHeightId)
        {
            Double input= new Double(editTextHeight.getText().toString());
            if(rd_m_to_cm.isChecked())
            {
                double result=convertHeight.mTOcm(input);
                editTextHeight.setText(new Double(result).toString());

            }

            else if(rd_cm_to_m.isChecked())
            {
                double result=convertHeight.cmTom(input);
                editTextHeight.setText(new Double(result).toString());
            }

            if(rd_m_to_mm.isChecked())
            {
                double result=convertHeight.mTOmm(input);
                editTextHeight.setText(new Double(result).toString());
            }

        }
        if(view.getId()==R.id.btnClearHeightId)
        {
            editTextHeight.setText(null);

        }

        if(view.getId()==R.id.btnCalculateWeightId)
        {
            Double input2= new Double(editTextWeight.getText().toString());
            if(rd_kg_to_g.isChecked())
            {
                double result2=convertWeight.kgTOg(input2);
                editTextWeight.setText(new Double(result2).toString());

            }

            else if(rd_g_to_kg.isChecked())
            {
                double result2=convertWeight.gTokg(input2);
                editTextWeight.setText(new Double(result2).toString());
            }

            if(rd_kg_to_mg.isChecked())
            {
                double result2=convertWeight.kgTOmg(input2);
                editTextWeight.setText(new Double(result2).toString());
            }

        }
        if(view.getId()==R.id.btnClearWeightId)
        {
            editTextWeight.setText(null);

        }
    }

}

