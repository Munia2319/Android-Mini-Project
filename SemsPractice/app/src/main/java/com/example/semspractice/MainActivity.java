package com.example.semspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView nameTextView1, nameTextView2,btnListener;
    private Button loginBtn,logOutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView1=(TextView)findViewById(R.id.name1);
        nameTextView1.setText("Hi! My name is Muna!");
        nameTextView2=(TextView)findViewById(R.id.name2);
        nameTextView2.setText("You shouldn't use Muna!");
        loginBtn=(Button)findViewById(R.id.loginBtn);
        logOutBtn=(Button)findViewById(R.id.logOutBtn);
        btnListener=(TextView)findViewById(R.id.btnListener);

        loginBtn.setOnClickListener(this);
        logOutBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.loginBtn){
           //btnListener.setText("Login Button is clicked!!");
            Toast toast = Toast.makeText(MainActivity.this,"Login",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();

        }
        else if(view.getId()==R.id.logOutBtn){
            //btnListener.setText("Logout Button is clicked!!");
            Toast toast=Toast.makeText(MainActivity.this,"Logout is clicked",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        }
    }
}