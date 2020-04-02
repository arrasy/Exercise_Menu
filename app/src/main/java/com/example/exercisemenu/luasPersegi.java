package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luasPersegi extends AppCompatActivity {

    EditText ediSisi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        ediSisi = (EditText)findViewById(R.id.editSisi);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ediSisi.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Tidak Boleh Ada Yang Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    hitung();
                }
            }
        });
    }

    private void hitung() {
        double angka = Integer.parseInt(ediSisi.getText().toString());
        double yaitu = angka * angka;
        hasil.setText("Luas Persegi dengan sisi: "+ angka + " adalah " +yaitu);
    }
}
