package com.example.globaltipsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
    }

    public void loginFeed(View v){

        EditText camp1 = this.findViewById(R.id.emailRegister);
        String email = camp1.getText().toString();
        EditText camp2 = this.findViewById(R.id.passwordRegister);
        String pass = camp2.getText().toString();

        if(email.equals("user1") && pass.equals("1234")){
            Intent i = new Intent(this,Principal.class);
            startActivity(i);
        }else{
            Toast.makeText(this,"Error en al iniciar secion", Toast.LENGTH_SHORT).show();
        }


    }
    public void  loginRegister(View v){
        Intent iRestir = new Intent(this,Registro.class);
        startActivity(iRestir);
    }

    public static class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder> {

        private Context context;
        private int[] imageIds;

        // Constructor que recibe el contexto y el array de imágenes
        public PhotoAdapter(Context context, int[] imageIds) {
            this.context = context;
            this.imageIds = imageIds;
        }

        @NonNull
        @Override
        public PhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            // Inflar el layout para cada item del RecyclerView
            View view = LayoutInflater.from(context).inflate(R.layout.photo_item, parent, false);
            return new PhotoViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PhotoViewHolder holder, int position) {
            // Asignar la imagen correspondiente a cada posición
            holder.imageView.setImageResource(imageIds[position]);
        }

        @Override
        public int getItemCount() {
            return imageIds.length;
        }

        public class PhotoViewHolder extends RecyclerView.ViewHolder {

            ImageView imageView;

            public PhotoViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.imageView);
            }
        }
    }
}