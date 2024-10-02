package com.example.globaltipsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
    }

    public void loginRegister(View v){

        EditText camp1 = this.findViewById(R.id.emailRegister);
        String email = camp1.getText().toString();
        EditText camp2 = this.findViewById(R.id.passwordRegister);
        String pass = camp2.getText().toString();

        if(email.equals("user1") && pass.equals("1234")){
            Intent i = new Intent(this,FrontApp.class);
            startActivity(i);
        }else{
            Toast.makeText(this,"Error en al iniciar secion", Toast.LENGTH_SHORT).show();
        }


    }
}