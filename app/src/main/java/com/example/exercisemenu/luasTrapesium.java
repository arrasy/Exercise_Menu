package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luasTrapesium extends AppCompatActivity {

    EditText AB, EF, AE;
    Button hitung;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);

        AB = (EditText)findViewById(R.id.editAB);
        EF = (EditText)findViewById(R.id.editEF);
        AE = (EditText)findViewById(R.id.editAE);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AB.getText().toString().isEmpty() || EF.getText().toString().isEmpty() || AE.getText().toString().isEmpty()){
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
        double ae = Integer.parseInt(AE.getText().toString());
        double yaitu = ab + ef + ae;
        hasil.setText("Keliling Trapesium dengan panjang AB : "+ ab + " , EF : " + ef + "Dan AE :" +ae+" adalah " +yaitu);
    }
}
