package com.example.appensayo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistroActivity extends AppCompatActivity {

    private CheckBox chb_terminos;
    private Button btn_registro_usuario;
    private EditText edt_contrasena;
    private TextView tev_terminos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btn_registro_usuario = findViewById(R.id.btn_registro_usuario);
        chb_terminos = findViewById(R.id.chb_terminos);
        edt_contrasena = findViewById(R.id.edt_contrasena);
        tev_terminos = findViewById(R.id.tev_terminos);



        btn_registro_usuario.setEnabled(false);

        tev_terminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroActivity.this, TerminosCondiciones.class);
                startActivity(intent);

            }
        });


        chb_terminos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                btn_registro_usuario.setEnabled(isChecked);

            }
        });

        btn_registro_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contrasena = edt_contrasena.getText().toString();

                if(contrasena.length()<8 &&!isValidPassword(contrasena)){
                    Toast.makeText(RegistroActivity.this, "Contraseña No valida", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(RegistroActivity.this, "Contraseña valida", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public static boolean isValidPassword(final String password) {

        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();

    }
}