package com.example.globaltipsapp;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class photos extends Fragment {

    // Array de fotos predeterminadas (referencia a imágenes en drawable)
    private final int[] imageIds = {
            R.drawable._11820,
            R.drawable._21718,
            R.drawable._351306,
            R.drawable._354780,
            R.drawable._360352
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fotos, container, false);

        // Configurar el RecyclerView con un GridLayoutManager (3 columnas)
        RecyclerView photosRecyclerView = view.findViewById(R.id.photosRecyclerView);
        photosRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));

        // Configurar el adaptador y asignarlo al RecyclerView
        MainActivity.PhotoAdapter photoAdapter = new MainActivity.PhotoAdapter(getContext(), imageIds);
        photosRecyclerView.setAdapter(photoAdapter);

        return view;
    }
}
