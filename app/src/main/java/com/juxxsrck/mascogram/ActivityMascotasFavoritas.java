package com.juxxsrck.mascogram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import static com.juxxsrck.mascogram.R.id.rvMascotasFav;

public class ActivityMascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(rvMascotasFav);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializaAdaptador();
    }

    public MascotaAdaptador adaptador;

    private void inicializaAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public  void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.labrador, "Firulais", "10"));
        mascotas.add(new Mascota(R.drawable.persa,"Merlin", "9"));
        mascotas.add(new Mascota(R.drawable.pitbull, "Piti", "8"));
        mascotas.add(new Mascota(R.drawable.angora, "Minchi", "7"));
        mascotas.add(new Mascota(R.drawable.beagle, "Rockie", "6"));

    }
}