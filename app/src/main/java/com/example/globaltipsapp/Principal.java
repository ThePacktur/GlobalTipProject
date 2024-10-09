package com.example.globaltipsapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
    }


    @Overridet
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.op1){
            Toast.makeText(this,"vas al Perfil", Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.op2){
            Toast.makeText(this,"vas a la Configuracion", Toast.LENGTH_SHORT).show();
        } 
        else if (id==R.id.op4) {
            Toast.makeText(this,"vas a la Reviews", Toast.LENGTH_SHORT).show();

        } else if (id==R.id.op3) {
            Toast.makeText(this,"vas a explorar", Toast.LENGTH_SHORT).show();
            
        } else if (id==R.id.op5) {
            Toast.makeText(this,"Vas al mapa", Toast.LENGTH_SHORT).show();

        } else if (id==R.id.op6) {
            Toast.makeText(this,"Vas al calendario", Toast.LENGTH_SHORT).show();

        } else if (id==R.id.op7) {
            Toast.makeText()

        }


        return super.onOptionsItemSelected(item);
    }
}