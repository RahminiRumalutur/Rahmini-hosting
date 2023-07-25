package com.example.kamusbahasaseram;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Loading extends AppCompatActivity {
    Button kamus, sejarah, pemilik, bahasa, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);


        kamus = (Button) findViewById(R.id.menu_kamus);
        sejarah= (Button) findViewById(R.id.menu_sejarah);
        pemilik= (Button) findViewById(R.id.menu_pemilikAPK);
        bahasa= (Button)  findViewById(R.id.menu_bahasa);
        exit = (Button)  findViewById(R.id.menu_keluar);

        kamus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kamus=new Intent(getApplicationContext(), Kamus.class);
                startActivity(kamus);
                finish();
            }
        });
        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarah = new Intent(getApplicationContext(), Sejarah.class);
                startActivity(sejarah);
                finish();
            }

        });
        pemilik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pemilik = new Intent(getApplicationContext(), PemilikAPK.class);
                startActivity(pemilik);
                finish();
            }

        });
        bahasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bahasa = new Intent(getApplicationContext(), Bahasa.class);
                startActivity(bahasa);
                finish();
            }

        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kelur = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(kelur);
                finish();
            }

        });


    }

}

