package com.example.anisulislamandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView nameview;
    private TextView ageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameview=(TextView)findViewById(R.id.name);
        ageview=(TextView)findViewById(R.id.age);

    }
}