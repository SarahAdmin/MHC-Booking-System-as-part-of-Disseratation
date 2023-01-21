package com.example.maldenhollywoodcinemaapp;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseAdapter {
    MyDatabaseHelper helper;
    public DatabaseAdapter(Context contextOne)
    {

        helper = new MyDatabaseHelper(contextOne);
        db = helper.getWritableDatabase();
    }
    public long insertData(String order_id, String film_title, String date, String time, String seat,
                           String a_quantity, String c_quantity, String s_quantity) {
        SQLiteDatabase ddb = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues;
        contentValues.put(MyDatabaseHelper.ORDER_ID, order_id);
        contentValues.put(MyDatabaseHelper.FILM_TITLE, film_title);
        contentValues.put(MyDatabaseHelper.DATE, date);
        contentValues.put(MyDatabaseHelper.TIME, time);
        contentValues.put(MyDatabaseHelper.SEAT, seat);
        contentValues.put(MyDatabaseHelper.A_QUANTITY, a_quantity);
        contentValues.put(MyDatabaseHelper.C_QUANTITY, c_quantity);
        contentValues.put(MyDatabaseHelper.S_QUANTITY, s_quantity);
        long id = ddb.insert(MyDatabaseHelper.TABLE_NAME, null, contentValues);
        return id;
    }
