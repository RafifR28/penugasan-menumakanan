package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listKuliner = new ArrayList<>();

        // Koneksi DB
        // Query
        // Iterasi hasil query ke arraylist
        listKuliner.add(new Kuliner("Lumpia Goreng",
                "15.000",
                "Lumpia Khas Asli Semarang enak cuyyy",
                R.drawable.lumpia));

        listKuliner.add(new Kuliner("Mie Kopyok",
                "10.000",
                "Mie Kopyok tiada duanya",
                R.drawable.mie));

        listKuliner.add(new Kuliner("Nasi Gandul",
                "15.000",
                "Nasi Gandul daging sapi",
                R.drawable.nasigandul));

        listKuliner.add(new Kuliner("Tahu Pong",
                "1000",
                "Tahu Pong yang rasanya tidak kalah enak dengan yang lain",
                R.drawable.tahupong));

        listKuliner.add(new Kuliner("Wingko",
                "20.000",
                "Wingko Untuk oleh oleh dari Semarang",
                R.drawable.wingko));

        listKuliner.add(new Kuliner("Ayam Geprek",
                "10.000",
                "Ayam geprek level, pilih sesukamu",
                R.drawable.ayam_geprek_keju));
    }
}