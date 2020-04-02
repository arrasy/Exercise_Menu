package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luasSegitiga extends AppCompatActivity {

    EditText editA, editT;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);


        editA = (EditText) findViewById(R.id.editAlas);
        editT = (EditText) findViewById(R.id.editTinggi);
        hitung = (Button) findViewById(R.id.btnHitung);
        hasil = (TextView) findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editA.getText().toString().isEmpty() || editT.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),
                            "Tidak Boleh Ada Yang Kosong", Toast.LENGTH_SHORT).show();
                } else {
                    hitung();
                }
            }
        });
    }

    private void hitung() {
        double alas = Integer.parseInt(editA.getText().toString());
        double tinggi = Integer.parseInt(editT.getText().toString());
        double yaitu = 0.5 * alas * tinggi;
        hasil.setText("Luas Segitiga dengan Alas: " + alas + " , Tinggi: " + tinggi + " adalah " + yaitu);
    }
}