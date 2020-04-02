package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kelilingTrapesium extends AppCompatActivity {

    EditText AB, EF, T;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_trapesium);

        AB = (EditText)findViewById(R.id.editAB);
        EF = (EditText)findViewById(R.id.editEF);
        T = (EditText)findViewById(R.id.editAE);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AB.getText().toString().isEmpty() || EF.getText().toString().isEmpty() || T.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Tidak Boleh Ada Yang Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    hitung();
                }
            }
        });
    }
    private void hitung() {
        double ab = Integer.parseInt(AB.getText().toString());
        double ef = Integer.parseInt(EF.getText().toString());
        double t = Integer.parseInt(T.getText().toString());
        double yaitu = 0.5 * (ab + ef) * t;
        hasil.setText("Keliling Trapesium dengan panjang AB : "+ ab + " , EF : " + ef + "Dan t :" + t +" adalah " +yaitu);
    }
}

