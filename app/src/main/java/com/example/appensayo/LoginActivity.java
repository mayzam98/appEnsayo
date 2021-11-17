package com.example.appensayo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    public Activity miActividad;

    private Button btn_login;
    private Button btn_registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        miActividad = this;

        btn_login = findViewById(R.id.btn_login);
        btn_registro = findViewById(R.id.btn_registro);

        btn_registro.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                break;

            case R.id.btn_registro:
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent);
                break;
        }
    }
}