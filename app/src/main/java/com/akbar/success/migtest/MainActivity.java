package com.akbar.success.migtest;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.nama)
    TextView tvResultNama;

    TextView txtResultNama;
    String resultNama;
    private FloatingActionButton fab;
    SharedPrefManager sharedPrefManager;

    TextView txtHello;
    private String nama;
    private String KEY_NAME = "result_nama";

    @BindView(R.id.btn1)
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello = (TextView) findViewById(R.id.input);


        ButterKnife.bind(this);
        sharedPrefManager = new SharedPrefManager(MainActivity.this);
        Bundle extrast = getIntent().getExtras();

        tvResultNama.setText(sharedPrefManager.getSPNama());
        Bundle extras = getIntent().getExtras();
        if (extras != null)
            resultNama = extras.getString("result_nama");
//        txtResultNama.setText(resultNama);


//        resultNama = extrast.getString(KEY_NAME);
        initComponents();
        txtHello.setText("Ini Tulisan Mu :  " + nama + "!");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPrefManager.saveSPBoolean(SharedPrefManager.SP_SUDAH_LOGIN, false);
                startActivity(new Intent(MainActivity.this, LoginActivity.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                finish();
            }
        });

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TambahPost.class);
                startActivity(intent);
            }

        });


        // untuk mendapatkan data dari activity sebelumnya, yaitu activity login.

    }

    private void initComponents() {
        txtResultNama = (TextView) findViewById(R.id.nama);

    }


}

