package com.lagn.mascotas.presentador;

import android.content.Context;

import com.lagn.mascotas.Mascotadapter;
import com.lagn.mascotas.Razas;
import com.lagn.mascotas.db.ConstructorMascotas;
import com.lagn.mascotas.vistafrag.IRecyclerViewFragmentView;

import java.util.ArrayList;

public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {
    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Razas> razas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
    this.iRecyclerViewFragmentView=iRecyclerViewFragmentView;
    this.context= context;
    obtenercontactosBaseDatos();
    }


    @Override
    public void obtenercontactosBaseDatos() {
        constructorMascotas= new ConstructorMascotas(context);
       razas= constructorMascotas.obtenerMascotas();
       mostrarcontactosenReVie();


    }

    @Override
    public void mostrarcontactosenReVie() {
    iRecyclerViewFragmentView.inicializarAdaptadorReView(iRecyclerViewFragmentView.crearAdaptador(razas));
    iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
