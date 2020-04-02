package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luasLingkaran extends AppCompatActivity {

    EditText editJari;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        editJari = (EditText)findViewById(R.id.editJari);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editJari.getText().toString().isEmpty() || editJari.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Tidak Boleh Ada Yang Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    hitung();
                }
            }
        });

    }
    private void hitung() {
        double jari = Integer.parseInt(editJari.getText().toString());
        double yaitu = 3.14 * (jari * jari );
        hasil.setText("Luas Lingkaran dengan Jari-jari: "+ jari +" adalah " +yaitu);
    }
}
