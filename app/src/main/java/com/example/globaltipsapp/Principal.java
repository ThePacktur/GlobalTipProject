package com.example.globaltipsapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Toolbar tb = (Toolbar) findViewById(R.id.tablayout);
        setSupportActionBar(tb);

        TabLayout tl = (TabLayout) findViewById(R.id.tablayout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                switch (position){
                    case 0:
                        //llamar a un fragmaneto:
                        publicacion p = new publicacion();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,p).commit();

                        break;

                    case 1:

                        fotos f = new fotos();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,f).commit();


                        break;

                    case 2:

                        amigos ag = new amigos();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,ag).commit();

                        break;




                    case 3:

                        travel tra = new travel();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,tra).commit();

                        break;

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

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
            Toast.makeText(this,"vas a los mensajes", Toast.LENGTH_SHORT).show();

        }


        return super.onOptionsItemSelected(item);
    }
}