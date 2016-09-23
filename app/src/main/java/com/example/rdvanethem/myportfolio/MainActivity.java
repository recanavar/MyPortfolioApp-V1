package com.example.rdvanethem.myportfolio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPopularMovies,btnStockHawk,btnBuildItBigger,btnMakeYourAppMat,btnGoUbi,btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer buttonClickSound = MediaPlayer.create(this,R.raw.button_click_sound);

        btnPopularMovies = (Button) findViewById(R.id.btnPopularMovies);
        btnStockHawk = (Button) findViewById(R.id.btnStockHawk);
        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnMakeYourAppMat = (Button) findViewById(R.id.btnMakeYourAppMat);
        btnGoUbi = (Button) findViewById(R.id.btnGoUbi);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);

        btnPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickSound.start();
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Poupular Movies app!",
                        Toast.LENGTH_LONG).show();
            }
        });

        btnStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickSound.start();
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Stock Hawk app!",
                        Toast.LENGTH_LONG).show();
            }
        });

        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickSound.start();
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Build It Bigger app!",
                        Toast.LENGTH_LONG).show();
            }
        });

        btnMakeYourAppMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickSound.start();
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Make Your App Material app!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnGoUbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickSound.start();
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Go Ubiquitous app!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickSound.start();
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Capstone app!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
