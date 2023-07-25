package com.example.kamusbahasaseram;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kamus extends AppCompatActivity {

    private SQLiteDatabase db = null;
    private Cursor kamusCursor = null;
    private EditText txtIndonesia;
    private EditText txtSeram;

    private DataKamus datakamus = null;
    public static final String INDONESIA = "indonesia";
    public static final String SERAM = "seram";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        datakamus = new DataKamus (this);
        db = datakamus.getWritableDatabase();
        datakamus.createTable(db);
        datakamus.generateData(db);

        setContentView(R.layout.activity_kamus);

        txtIndonesia = (EditText) findViewById(R.id.txtIndonesia);
        txtSeram = (EditText) findViewById(R.id.txtSeram);

        //setContentView(R.layout.activity_kamus);
    }

    public void getTranslate(View view) {
        String result = "";
        String kataIndonesia = txtIndonesia.getText().toString();
        kamusCursor = db.rawQuery("SELECT ID, INDONESIA, SERAM "
                + "FROM kamus where INDONESIA='" + kataIndonesia
                + "' ORDER BY INDONESIA", null);

        if (kamusCursor.moveToFirst()) {
            result = kamusCursor.getString(2);
            for (; !kamusCursor.isAfterLast(); kamusCursor.moveToNext()) {

                result = kamusCursor.getString(2);
            }

        }
        if (result.equals("")) {
            result = "KATA TIDAK DITEMUKAN";
        }
        txtSeram.setText(result);

    }
}