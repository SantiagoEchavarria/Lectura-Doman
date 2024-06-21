package com.lectura.dogmanlectura;

import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.widget.TextView;

public class Examen {
    TextView bien;
    TextView mal;
    TextView mal2;
    MediaPlayer sonido;
    int contador;
    int rBuenas;
    int rMalas;

    Examen(TextView bien, TextView mal, TextView mal2){
        this.bien=bien;
        this.mal=mal;
        this.mal2=mal2;
    }
    Examen(TextView bien, TextView mal, TextView mal2, MediaPlayer sonido){
        this.bien=bien;
        this.mal=mal;
        this.mal2=mal2;
        this.sonido=sonido;
    }



    //Get
    public MediaPlayer getSonido() {
        return sonido;
    }

    public TextView getBien() {
        return bien;
    }

    public TextView getMal() {
        return mal;
    }

    public TextView getMal2() {
        return mal2;
    }

    public int getContador() {
        return contador;
    }

    public int getrBuenas() {
        return rBuenas;
    }

    public int getrMalas() {
        return rMalas;
    }


    //Set
    public void setBien(TextView bien) {
        this.bien = bien;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setMal(TextView mal) {
        this.mal = mal;
    }

    public void setMal2(TextView mal2) {
        this.mal2 = mal2;
    }

    public void setSonido(MediaPlayer sonido) {
        this.sonido = sonido;
    }
}
