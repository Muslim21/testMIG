package com.akbar.success.migtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TambahPost extends AppCompatActivity {

    private String KEY_NAME = "NAMA";

    EditText editText;
    Button btnPost;
    TextView input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tambah_posh);

        editText = (EditText) findViewById(R.id.edt_post);
        btnPost = (Button) findViewById(R.id.btn_edit);
        input = (TextView) findViewById(R.id.input);

        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = editText.getText().toString();
                    if (nama != null && nama != ""){
                        Intent i = new Intent(TambahPost.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !",Toast.LENGTH_SHORT);
                }

            }
        });

        //buat form yang di hiden isinya id user yang dari session
    }
}

