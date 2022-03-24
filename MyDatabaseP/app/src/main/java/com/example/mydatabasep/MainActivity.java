package com.example.mydatabasep;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText idEtxt, nameEtxt,ageEtxt;
    private Button insertbtn,displaybtn,updatebtn,deletebtn;
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         database=new Database(this);
        SQLiteDatabase sqLiteDatabase=database.getWritableDatabase();
        idEtxt=findViewById(R.id.idEid);
        nameEtxt=findViewById(R.id.nameEid);
        ageEtxt=findViewById(R.id.ageEid);
        insertbtn=findViewById(R.id.insertBtnId);
        displaybtn=findViewById(R.id.displayBtnId);
        updatebtn=findViewById(R.id.updateBtnId);
        deletebtn=findViewById(R.id.deleteBtnId);

        insertbtn.setOnClickListener(this);
        displaybtn.setOnClickListener(this);
        deletebtn.setOnClickListener(this);
        updatebtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String id=idEtxt.getText().toString();
        String name=nameEtxt.getText().toString();
        String age=ageEtxt.getText().toString();
     if(view.getId()==R.id.insertBtnId)
     {
         long rowid=database.insertData(id,name,age);
         if(rowid==-1)
         {
             Toast.makeText(getApplicationContext(),"Data not inserted "+rowid,Toast.LENGTH_LONG).show();
         }

         else{
             Toast.makeText(getApplicationContext(),"Data successfully inserted ",Toast.LENGTH_LONG).show();
         }
     }
     else if(view.getId()==R.id.displayBtnId)
     {
         Cursor cursor=database.displayData();
         if(cursor.getCount()==0)
         {
             showdata("Error","Do not found data");
             return;
         }
         StringBuffer stringBuffer=new StringBuffer();
         while (cursor.moveToNext())
         {
             stringBuffer.append("ID: "+cursor.getString(0)+"\n");
             stringBuffer.append("NAME: "+cursor.getString(1)+"\n");
             stringBuffer.append("AGE: "+cursor.getString(2)+"\n\n\n");

         }
         showdata("Resultset",stringBuffer.toString());
     }

     else if(view.getId()==R.id.updateBtnId)
     {
         int a=database.updateData(id,name,age);
         if(a==0)
         {
             Toast.makeText(getApplicationContext(),"Data not updated "+a,Toast.LENGTH_LONG).show();
         }
         else{
             Toast.makeText(getApplicationContext(),"Data successfully updated "+a,Toast.LENGTH_LONG).show();
         }
     }
     else if(view.getId()==R.id.deleteBtnId)
     {
         int b=database.deleteData(id,age);
         if(b==0)
         {
             Toast.makeText(getApplicationContext(),"Data not deleted "+b,Toast.LENGTH_LONG).show();
         }
         else{
             Toast.makeText(getApplicationContext(),"Data successfully deleted "+b,Toast.LENGTH_LONG).show();
         }
     }


    }
    public void showdata(String title, String data)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(data);
        builder.setCancelable(true);
        builder.show();
    }
}