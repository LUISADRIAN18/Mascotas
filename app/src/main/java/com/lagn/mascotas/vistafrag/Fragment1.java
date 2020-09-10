package com.lagn.mascotas.vistafrag;

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
import com.lagn.mascotas.Mascotadapter;
import com.lagn.mascotas.R;
import com.lagn.mascotas.Razas;
import com.lagn.mascotas.presentador.IRecyclerViewFragmentPresenter;
import com.lagn.mascotas.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;

public class Fragment1 extends Fragment implements IRecyclerViewFragmentView{
    private RecyclerView ListaRecyclerprros;
    private IRecyclerViewFragmentPresenter presenter;

    private FloatingActionButton bts;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
    View v= inflater.inflate(R.layout.fargment1,container,false);
    ListaRecyclerprros=v.findViewById(R.id.recyclerView);
    bts=v.findViewById(R.id.floatin);
    presenter=new RecyclerViewFragmentPresenter(this,getContext());

    return v;


    }
    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaRecyclerprros.setLayoutManager(llm);

    }

    @Override
    public Mascotadapter crearAdaptador(ArrayList<Razas> razas) {
        Mascotadapter adaptar= new Mascotadapter(razas,getActivity());
        return adaptar;
    }

    @Override
    public void inicializarAdaptadorReView(Mascotadapter adaptar) {
        ListaRecyclerprros.setAdapter(adaptar);


    }
}
