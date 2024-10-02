package com.example.globaltipsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void loginRegister(View v){

        EditText campo1 = this.findViewById(R.id.nombreRegistro);
        String  nombreRegistro = campo1.getText().toString();
        EditText campo2 = this.findViewById(R.id.correoRegistro);
        String correoRegistro = campo2.getText().toString();
        EditText campo3 = this.findViewById(R.id.passwordRegistro);
        String passwordRegistro = campo3.getText().toString();
        System.out.println(nombreRegistro+" "+correoRegistro+" "+passwordRegistro);
    }
}