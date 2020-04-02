package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kelilingSegitiga extends AppCompatActivity {

    EditText editA, editT, editSM;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga);

        editA = (EditText)findViewById(R.id.editAlas);
        editT = (EditText)findViewById(R.id.editTinggi);
        editSM = (EditText)findViewById(R.id.editSmiring);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editA.getText().toString().isEmpty() || editT.getText().toString().isEmpty() || editSM.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Tidak Boleh Ada Yang Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    hitung();
                }
            }
        });
    }
    private void hitung() {
        double alas = Integer.parseInt(editA.getText().toString());
        double tinggi = Integer.parseInt(editT.getText().toString());
        double sisi = Integer.parseInt(editSM.getText().toString());
        double yaitu = alas + tinggi + sisi;
        hasil.setText("Keliling Segitiga dengan Alas: "+ alas + " , Tinggi: " + tinggi + "Sisi Miring :" + sisi +" adalah " +yaitu);
    }
}
