package com.lagn.mascotas.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.lagn.mascotas.Razas;

import java.util.ArrayList;

public class BaseDatos extends SQLiteOpenHelper {
    private Context context;
    public BaseDatos(Context context) {
        super(context, ConstanteBaseDatos.DATABASE_NAME, null, ConstanteBaseDatos.VERSION_DATA);
        this.context=context;

    }

    @Override
    public void onCreate(SQLiteDatabase Database) {
        String queryCrearTablaMascota= " CREATE TABLE " + ConstanteBaseDatos.TABLE_MASCOtAS+  "(" +
                ConstanteBaseDatos.TABLE_MASCOtAS_ID    + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                ConstanteBaseDatos.TABLE_MASCOtAS_RAZA  + " TEXT, "    +
                ConstanteBaseDatos.TABLE_MASCOtAS_FOTO  + " INTEGER " +

                ")";

        String queryCrearTablaMascotaLikes="CREATE TABLE "+ConstanteBaseDatos.TABLE_LIKES+ "("+
                ConstanteBaseDatos.TABLE_LIKES_ID           + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                ConstanteBaseDatos.TABLE_LIKES_ID_MASCOTA   + " INTEGER,  " +
                ConstanteBaseDatos.TABLE_LIKES_NUMERO_LIKES + " INTEGER,  " +
                "FOREIGN KEY ("+ ConstanteBaseDatos.TABLE_LIKES_ID_MASCOTA + ") "+
                "REFERENCES "+ ConstanteBaseDatos.TABLE_MASCOtAS + "("+ ConstanteBaseDatos.TABLE_MASCOtAS_ID+ ")"+
                                           ")";

        Database.execSQL(queryCrearTablaMascota);
        Database.execSQL(queryCrearTablaMascotaLikes);

    }

    @Override
    public void onUpgrade(SQLiteDatabase Database, int i, int i1) {
        Database.execSQL("DROP TABLE IF EXISTS " +ConstanteBaseDatos.TABLE_MASCOtAS);
        Database.execSQL("DROP TABLE IF EXISTS " +ConstanteBaseDatos.TABLE_LIKES);
        onCreate(Database);

    }


    public ArrayList<Razas> obtenertdslasmascotas (){
        ArrayList<Razas> razas=new ArrayList<>();

        String query = "SELECT * FROM " +ConstanteBaseDatos.TABLE_MASCOtAS;
        SQLiteDatabase Database= this.getWritableDatabase();
        Cursor registers = Database.rawQuery(query,null);

       while (registers.moveToNext()){

           Razas razaActual= new Razas();
           razaActual.setId(registers.getInt(0));
           razaActual.setRazaprro(registers.getString(1));
           razaActual.setFotoperro(registers.getInt(2));

           String querylikes = "SELECT COUNT("+ConstanteBaseDatos.TABLE_LIKES_NUMERO_LIKES+") as likes " +
                               "FROM " + ConstanteBaseDatos.TABLE_LIKES +
                               " WHERE " +    ConstanteBaseDatos.TABLE_LIKES_ID_MASCOTA + "=" + razaActual.getId();
           Cursor registrolikes = Database.rawQuery(querylikes,null);
           if(registrolikes.moveToNext()){
               razaActual.setLikesdados(registrolikes.getInt(0));

           }else {
               razaActual.setLikesdados(0);
           }

           razas.add(razaActual);


       }
       Database.close();
       return razas;


    }

    public void  insertarmascota(ContentValues contentValues){
    SQLiteDatabase database= this.getWritableDatabase();
    database.insert(ConstanteBaseDatos.TABLE_MASCOtAS,null,contentValues);
    database.close();

    }

    public void insertarlikemascota (ContentValues contentValues){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstanteBaseDatos.TABLE_LIKES,null,contentValues);
        db.close();

    }
    public int obtenerliksmasco(Razas razas){
        int likes=0;
        String query= "SELECT COUNT("+ConstanteBaseDatos.TABLE_LIKES_NUMERO_LIKES+")" +
                      " FROM "+ConstanteBaseDatos.TABLE_LIKES+
                      " WHERE "+ ConstanteBaseDatos.TABLE_LIKES_ID_MASCOTA+ "="+ razas.getId();
        SQLiteDatabase database= this.getWritableDatabase();
        Cursor registros = database.rawQuery(query,null);
        if (registros.moveToNext()) {
            likes = registros.getInt(0);
        }


        database.close();
        return  likes;
    }


}
