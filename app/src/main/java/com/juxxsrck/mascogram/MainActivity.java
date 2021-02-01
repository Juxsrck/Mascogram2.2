package com.juxxsrck.mascogram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnSegudaActividad = (ImageButton) findViewById(R.id.btnSegudaActividad);
        btnSegudaActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityMascotasFavoritas.class);
                startActivity(intent);
            }
        });

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
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
        mascotas.add(new Mascota(R.drawable.angora, "Minchi", "7"));
        mascotas.add(new Mascota(R.drawable.pitbull, "Piti", "8"));
        mascotas.add(new Mascota(R.drawable.siames,"Merlina", "5"));
        mascotas.add(new Mascota(R.drawable.beagle, "Rockie", "6"));
        mascotas.add(new Mascota(R.drawable.persa,"Merlin", "9"));

    }
}