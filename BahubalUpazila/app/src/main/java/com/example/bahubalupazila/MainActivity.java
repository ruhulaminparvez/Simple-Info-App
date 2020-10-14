package com.example.bahubalupazila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonSchool,buttonCollege,buttonPoliceStation,buttonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSchool = (Button)findViewById(R.id.buttonSchool);
        buttonCollege = (Button)findViewById(R.id.buttonCollege);
        buttonPoliceStation = (Button)findViewById(R.id.buttonPoliceStation);
        buttonAbout = (Button)findViewById(R.id.buttonAbout);


        buttonSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome,School Section", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, School.class);
                startActivity(intent);
            }

        });

        buttonCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome,College Section", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, College.class);
                startActivity(intent);
            }

        });

        buttonPoliceStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome,Police Station Section", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Police.class);
                startActivity(intent);
            }
        });

        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });

    }

}