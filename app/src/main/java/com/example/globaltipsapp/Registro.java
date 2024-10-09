package com.example.globaltipsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);


    }
    public void loginRegister(View v){

        //recuperar views
        EditText etNombre = (EditText) findViewById(R.id.etNombre);
        EditText etCorreo = (EditText) findViewById(R.id.etCorreo);
        EditText etPassword = (EditText) findViewById(R.id.etPassword);
        EditText etPassword2 = (EditText) findViewById(R.id.etPassword2);
        RadioGroup rdGenero = (RadioGroup) findViewById(R.id.rdGenero);
        //recuperar el valor
        String  usuario = etNombre.getText().toString();
        String correo = etCorreo.getText().toString();
        String password = etPassword.getText().toString();
        String password2 = etPassword2.getText().toString();
        if (password.equals(password2)){
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Registro fallido", Toast.LENGTH_SHORT).show();
        }
        int id = rdGenero.getCheckedRadioButtonId();
        String genero = "";
        switch (id){
            case R.id.rdMasculino:
                genero = "Masculino";
                break;

            case  R.id.rdFemenino:
                genero = "Femenino";
                break;

            case  R.id.rdOtros:
                genero = "Otros";
                break;

            default:
                Toast.makeText(this,"Error al ingresar el genero", Toast.LENGTH_SHORT).show();
        }
        Spinner spPais = (Spinner) findViewById(R.id.spPais);
        String paises = spPais.getSelectedItem().toString();

    }
}