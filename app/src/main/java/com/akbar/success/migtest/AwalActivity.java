package com.akbar.success.migtest;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AwalActivity extends AppCompatActivity {

    Button btnDaftar, btnMasuk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnDaftar = findViewById(R.id.btn_register);
        btnMasuk = findViewById(R.id.btn_loginM);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AwalActivity.this, DaftarActivity.class);
                startActivity(intent);
            }
        });

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AwalActivity.this, LoginActivity .class);
                startActivity(intent);
            }
        });




    }
}
