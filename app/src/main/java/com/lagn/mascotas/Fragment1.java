package com.lagn.mascotas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Fragment1 extends Fragment {
    private RecyclerView ListaRecyclerprros;
    private ArrayList<Razas> razasprro;
    private FloatingActionButton bts;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
    View v= inflater.inflate(R.layout.fargment1,container,false);


        ListaRecyclerprros=v.findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaRecyclerprros.setLayoutManager(llm);
        razaslistar();
        inicaradaptador();
        bts=v.findViewById(R.id.floatin);

    return v;


    }

    public void inicaradaptador(){
        Mascotadapter adaptar= new Mascotadapter(razasprro,getActivity());
        ListaRecyclerprros.setAdapter(adaptar);



    }


    public void razaslistar( ){

        razasprro=new ArrayList<>();
        razasprro.add(new Razas("Samoyedo",R.drawable.samoyedo,R.id.botonlike,R.id.likestxt));
        razasprro.add(new Razas("Ladrador",R.drawable.ladrador,R.id.botonlike,R.id.likestxt));
        razasprro.add(new Razas("Husky",R.drawable.huky,R.id.botonlike,R.id.likestxt));
        razasprro.add(new Razas("Dalmata",R.drawable.dalmata,R.id.botonlike,R.id.likestxt));
        razasprro.add(new Razas("Akita",R.drawable.akita,R.id.botonlike,R.id.likestxt));



    }





}
