package com.lagn.mascotas.vistafrag;

import com.lagn.mascotas.Mascotadapter;
import com.lagn.mascotas.Razas;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {


    public void generarLinearLayoutVertical();
    public Mascotadapter crearAdaptador(ArrayList<Razas> razas);
    public void inicializarAdaptadorReView(Mascotadapter adapter);



}
