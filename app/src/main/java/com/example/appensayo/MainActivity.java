package com.example.appensayo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Activity miActividad;

    private Button btn_jugar;
    private Button btn_perfil;
    private Button btn_ajustes;
    private Button btn_acerca_de;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miActividad = this;
        //Metodo2 : Poner una ID al controlado..., crear una variable del tipo de controlador... en el onCreate debemos encontrar la vista con el ID que le dimos
        btn_jugar = findViewById(R.id.btn_jugar);
        //Luego se sobreescribe  el metodo onClick dentro del listener asi:
        /*btn_jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(miActividad, "Le dist a JUGAR perro!", Toast.LENGTH_SHORT).show();
                Log.e("CLICK_JUGAR","LE HE DADO AL BOTON JUGAR");

            }
        });*/


        //Metodo3:Poner una ID al controlado..., crear una variable del tipo de controlador... en el onCreate debemos encontrar la vista con el ID que le dimos

        btn_perfil = findViewById(R.id.btn_perfil);//Los botones tienen un ID numerico y co
        btn_ajustes = findViewById(R.id.btn_ajustes);
        btn_acerca_de = findViewById(R.id.btn_acerca_de);

        //Asignamos un listener pero no se lo voy a crear a cad uno, le voy a poner THIS... para que sea solo un metodo que se encargue de darle soporte a todos
        //Mi actividad se va a encargar de implementar el metodo y se va a encargar de hacer las importaciones
        //Le doy click en this y utilizo la ayuda del android studio.... make Implementar
        btn_jugar.setOnClickListener(this);
        btn_perfil.setOnClickListener(this);
        btn_ajustes.setOnClickListener(this);
        btn_acerca_de.setOnClickListener(this);

    }


    //Metodo 1: en el xml defino una propiedad android:onClick="clickJugar" y le envio el metodo que me llama cuando le doy click
   /* public void clickJugar(View v){ //estos listener siempre reciben un View
        Toast.makeText(this, "Le dist a JUGAR perro!", Toast.LENGTH_SHORT).show();
        Log.e("CLICK_JUGAR","LE HE DADO AL BOTON JUGAR");
    }*/
    //Los listener siempre arrancan con la palabra on..un listener que esta esperando la interaccion del usuario


    //Metodo3: implementacion del metodo onClick de manera GLOBAL. Aca en el View es el que me va a servir para identificar que boton se ha presionado, apartir del ID
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_jugar:
                Toast.makeText(this, getString(R.string.txt_given)+" "+getString(R.string.txt_play), Toast.LENGTH_SHORT).show();
                Log.e("CLICK_JUGAR",getString(R.string.txt_given)+" "+getString(R.string.txt_play));
                break;
            case R.id.btn_perfil:
                Toast.makeText(this, getString(R.string.txt_given)+" "+getString(R.string.txt_profile), Toast.LENGTH_SHORT).show();
                Log.e("CLICK_PERFIL",getString(R.string.txt_given)+" "+getString(R.string.txt_profile));
                break;
            case R.id.btn_ajustes:
                Toast.makeText(this, getString(R.string.txt_given)+" "+getString(R.string.txt_setting), Toast.LENGTH_SHORT).show();
                Log.e("CLICK_AJUSTES",getString(R.string.txt_given)+" "+getString(R.string.txt_setting));
                break;
            case R.id.btn_acerca_de:
                Toast.makeText(this, getString(R.string.txt_given)+" "+getString(R.string.txt_about), Toast.LENGTH_SHORT).show();
                Log.e("CLICK_ACERCA_DE",getString(R.string.txt_given)+" "+getString(R.string.txt_about));
                break;
        }

    }
}