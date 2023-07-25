package com.example.kamusbahasaseram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(){

            public void run(){
                try {
                    Thread.sleep(3000);
                }catch(Exception ee){}
                Intent i=new Intent(MainActivity.this,Loading.class);
                MainActivity.this.finish();
                startActivity(i);
            }}.start();
    }

}

