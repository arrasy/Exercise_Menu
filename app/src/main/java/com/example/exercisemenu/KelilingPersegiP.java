package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KelilingPersegiP extends AppCompatActivity {

    EditText editP, editL;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi_p);

        editP = (EditText)findViewById(R.id.editAlas);
        editL = (EditText)findViewById(R.id.editTinggi);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editP.getText().toString().isEmpty() || editL.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Tidak Boleh Ada Yang Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    hitung();
                }
            }
        });
    }
    private void hitung() {
        double panjang = Integer.parseInt(editP.getText().toString());
        double lebar = Integer.parseInt(editL.getText().toString());
        double yaitu = 2* (panjang + lebar);
        hasil.setText("Keliling Persegi Panjang dengan panjang: "+ panjang + " dan Lebar: " + lebar +" adalah " +yaitu);
    }
}
