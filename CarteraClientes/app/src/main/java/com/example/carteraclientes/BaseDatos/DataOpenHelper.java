package com.example.carteraclientes.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataOpenHelper extends SQLiteOpenHelper {
    public DataOpenHelper(Context context) {
        super(context, "DATOS",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE (");
        sql.append("NOMBRE VARCHAR(250), ");
        sql.append("DIRECCION VARCHAR(250), ");
        sql.append("EMAIL VARCHAR(250), ");
        sql.append("TELEFONO VARCHAR(20))");

        sqLiteDatabase.execSQL(sql.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}