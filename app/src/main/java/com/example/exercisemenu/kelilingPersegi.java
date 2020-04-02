package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kelilingPersegi extends AppCompatActivity {

    EditText ediSisi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi);

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
        double yaitu = 4 * angka;
        hasil.setText("Keliling Persegi dengan sisi: "+ angka + " adalah " +yaitu);
    }
}
