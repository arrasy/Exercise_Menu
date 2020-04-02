package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class menu extends AppCompatActivity {
    Spinner spinner1, spinner2, spinner3, spinner4, spinner5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spinner1.getSelectedItem().toString().equals("Hitung Luas")) {
                    Intent i = new Intent(menu.this, luasPersegi.class);
                    startActivity(i);
                } else if (spinner1.getSelectedItem().toString().equals("Hitung Keliling")){
                    Intent i = new Intent(menu.this, kelilingPersegi.class);
                    startActivity(i);
                } else {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spinner2.getSelectedItem().toString().equals("Hitung Luas")) {
                    Intent i = new Intent(menu.this, luasLingkaran.class);
                    startActivity(i);
                } else if (spinner2.getSelectedItem().toString().equals("Hitung Keliling")){
                    Intent i = new Intent(menu.this, kelilingLingkaran.class);
                    startActivity(i);
                } else {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spinner3.getSelectedItem().toString().equals("Hitung Luas")) {
                    Intent i = new Intent(menu.this, luasPersegiP.class);
                    startActivity(i);
                } else if (spinner3.getSelectedItem().toString().equals("Hitung Keliling")){
                    Intent i = new Intent(menu.this, KelilingPersegiP.class);
                    startActivity(i);
                } else {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spinner4.getSelectedItem().toString().equals("Hitung Luas")) {
                    Intent i = new Intent(menu.this, luasSegitiga.class);
                    startActivity(i);
                } else if (spinner4.getSelectedItem().toString().equals("Hitung Keliling")){
                    Intent i = new Intent(menu.this, kelilingSegitiga.class);
                    startActivity(i);
                } else {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spinner5.getSelectedItem().toString().equals("Hitung Luas")) {
                    Intent i = new Intent(menu.this, luasTrapesium.class);
                    startActivity(i);
                } else if (spinner5.getSelectedItem().toString().equals("Hitung Keliling")){
                    Intent i = new Intent(menu.this, kelilingTrapesium.class);
                    startActivity(i);
                } else {
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
