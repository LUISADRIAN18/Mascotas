package com.lagn.mascotas.db;

import android.content.ContentValues;
import android.content.Context;

import com.lagn.mascotas.R;
import com.lagn.mascotas.Razas;

import java.util.ArrayList;

public class ConstructorMascotas {
    private static final Integer LIKE = 1;
    private Context context;
    private ArrayList<Razas> razasprro;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }


    public ArrayList<Razas> obtenerMascotas(){

        BaseDatos baseDatos = new BaseDatos(context);
        insertar3mascotas(baseDatos);


        return baseDatos.obtenertdslasmascotas();
    }



    public void insertar3mascotas(BaseDatos baseDatos){
        ContentValues contentValues= new ContentValues();
        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_RAZA,"Samoyedo");
        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_FOTO,R.drawable.samoyedo);
        baseDatos.insertarmascota(contentValues);

        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_RAZA,"Ladrador");
        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_FOTO,R.drawable.ladrador);
        baseDatos.insertarmascota(contentValues);

        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_RAZA,"Husky");
        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_FOTO,R.drawable.huky);
        baseDatos.insertarmascota(contentValues);

        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_RAZA,"Dalmata");
        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_FOTO,R.drawable.dalmata);
        baseDatos.insertarmascota(contentValues);

        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_RAZA,"Akita");
        contentValues.put(ConstanteBaseDatos.TABLE_MASCOtAS_FOTO,R.drawable.akita);
        baseDatos.insertarmascota(contentValues);
           baseDatos.close();




    }
    public void  darLike(Razas razas){
        BaseDatos baseDatos= new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstanteBaseDatos.TABLE_LIKES_ID_MASCOTA, razas.getId());
        contentValues.put(ConstanteBaseDatos.TABLE_LIKES_NUMERO_LIKES, LIKE);
        baseDatos.insertarlikemascota(contentValues);




    }

    public int obternerLike(Razas razas){
        BaseDatos baseDatos= new BaseDatos(context);
        return baseDatos.obtenerliksmasco(razas);


    }
}
