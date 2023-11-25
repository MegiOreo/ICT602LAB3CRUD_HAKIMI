package com.example.lab3database_hakimi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "personalbiodata.db";

    //database version
    private  static  final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primar3y key, name text null, dob text null, gender text null, address text null);";
        Log.d("Data", "onCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }
}
