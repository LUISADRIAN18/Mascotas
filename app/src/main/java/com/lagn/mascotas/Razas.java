package com.lagn.mascotas;

public class Razas {
private int id;
private String razaprro;
private int Fotoperro;
private int boton;
private int Likesdados;


    public Razas(String razaprro, int fotoperro, int numerolikes) {
        this.razaprro = razaprro;
        this.Fotoperro = fotoperro;

        this.Likesdados=numerolikes;

    }

    public Razas() {

    }

    public void setLikesdados(int likesdados) {
        Likesdados = likesdados;
    }
    private int sumalk=0;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSumalk() {
        return sumalk;
    }

    public void setSumalk(int sumalk) {
        this.sumalk = sumalk;
    }

    public int getBoton() {
        return boton;
    }

    public void setBoton(int boton) {
        this.boton = boton;
    }

    public int getLikesdados() {
        return Likesdados;
    }



    public String getRazaprro() {
        return razaprro;
    }

    public void setRazaprro(String razaprro) {
        this.razaprro = razaprro;
    }

    public int getFotoperro() {
        return Fotoperro;
    }

    public void setFotoperro(int fotoperro) {
        Fotoperro = fotoperro;
    }

}
