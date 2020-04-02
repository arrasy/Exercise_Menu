package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signin;
    EditText usn,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin = (Button) findViewById(R.id.btnsignin);
        usn = (EditText) findViewById(R.id.editUN);
        pass = (EditText) findViewById(R.id.editPass);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usn.getText().toString().equals("admin") &&
                   pass.getText().toString().equals("123")) {

                    Intent i = new Intent(MainActivity.this, menu.class);
                    startActivity(i);

                    Toast.makeText(getApplicationContext(),
                            "Login Sukses",Toast.LENGTH_SHORT).show();
                } else if (usn.getText().toString().isEmpty() || pass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Semua Kolom Harus Terisi",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Login Gagal",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
