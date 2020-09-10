package com.lagn.mascotas.db;

public final class ConstanteBaseDatos {
    public static final String DATABASE_NAME="mascotas";
    public static final int VERSION_DATA=1;

    public static final String TABLE_MASCOtAS       ="mascota";
    public static final String TABLE_MASCOtAS_ID    ="id";
    public static final String TABLE_MASCOtAS_RAZA  ="raza";
    public static final String TABLE_MASCOtAS_FOTO  ="foto";


    public static final String TABLE_LIKES = "Mascota_Likes";
    public static final String TABLE_LIKES_ID = "id";
    public static final String TABLE_LIKES_ID_MASCOTA = "id_cmascota";
    public static final String TABLE_LIKES_NUMERO_LIKES = "numer_Likes";
}
