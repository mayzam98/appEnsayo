package com.example.appensayo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    public Activity miActividad;

    private Button btn_login;
    private Button btn_registro;
    private EditText edt_usuario;
    private EditText edt_contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        miActividad = this;

        btn_login = findViewById(R.id.btn_login);
        btn_registro = findViewById(R.id.btn_registro);
        edt_usuario = findViewById(R.id.edt_usuario);
        edt_contrasena = findViewById(R.id.edt_contrasena);

        btn_registro.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:

                String usuario = edt_usuario.getText().toString();
                String contrasena = edt_contrasena.getText().toString();

                Log.e("USUARIO", usuario);
                Log.e("CONTRASEÑA", contrasena);

                if(usuario.equals("admin@admin.com") && contrasena.equals("admin")  ){
                    Toast.makeText(LoginActivity.this, "Se ha iniciado sesion", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(LoginActivity.this, "Error iniciando sesion", Toast.LENGTH_SHORT).show();

                }

                break;

            case R.id.btn_registro:
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent);
                break;
        }
    }
}