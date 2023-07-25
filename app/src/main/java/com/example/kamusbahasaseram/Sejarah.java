package com.example.kamusbahasaseram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sejarah extends AppCompatActivity {
    Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);
        kembali=(Button) findViewById(R.id.menu_kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali =new Intent(getApplicationContext(), Loading.class);
                startActivity(kembali);
                finish();
            }
        });
    }
}