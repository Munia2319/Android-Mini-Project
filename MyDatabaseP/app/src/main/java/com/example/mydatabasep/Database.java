package com.example.mydatabasep;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    private  static final String DATABASE_NAME="Customer.db";
    private  static final String TABLE_NAME="customer_details";
    private  static final int VERSION_NO=1;
    private  static final String ID="id";
    private  static final String NAME="name";
    private  static final String AGE="age";
    private  static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"("+ID+" INTEGER,"+NAME+" VARCHAR(255),"+AGE+" INTEGER);";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    private static final String DISPLAY_TABLE = "SELECT *FROM " + TABLE_NAME;

    private Context context;

    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION_NO);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try{
            Toast.makeText(context,"onCreate is called",Toast.LENGTH_LONG).show();
             sqLiteDatabase.execSQL(CREATE_TABLE);
        }
        catch (Exception e)
        {
            Toast.makeText(context,"Exceptiob:"+e,Toast.LENGTH_LONG).show();
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        try {
            Toast.makeText(context, "onupgrade method is called", Toast.LENGTH_LONG).show();
            sqLiteDatabase.execSQL(DROP_TABLE);
            onCreate(sqLiteDatabase);
        } catch (Exception e) {
            Toast.makeText(context, "Exception" + e, Toast.LENGTH_LONG).show();
        }
    }

    public long insertData(String id, String name,String age)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ID,id);
        contentValues.put(NAME,name);
        contentValues.put(AGE,age);
        long rowid=sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        return rowid;
    }

    public Cursor displayData()
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor= sqLiteDatabase.rawQuery(DISPLAY_TABLE,null);
        return cursor;

    }
    public int updateData(String id, String name, String age) {

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ID, id);
        contentValues.put(NAME, name);
        contentValues.put(AGE, age);
        int b=sqLiteDatabase.update(TABLE_NAME,contentValues,ID+"=?",new String[]{id});
        return  b;
    }
    public int deleteData(String id,String age)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        int d=sqLiteDatabase.delete(TABLE_NAME,ID+"=? AND "+AGE+"=?" ,new String[]{id,age});
        return  d;
    }
}
