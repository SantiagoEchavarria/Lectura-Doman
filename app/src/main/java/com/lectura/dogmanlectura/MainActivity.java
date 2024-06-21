package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Fichero fichero = new Fichero();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        if(fichero.existeFile(this, "Adjetivos") && fichero.obtenerNota("Adjetivos")>29){
            System.out.println("Nota ficheros "+ fichero.obtenerNota("Adjetivos"));
        }
        if(fichero.existeFile(this, "Adjetivos2") && fichero.obtenerNota("Adjetivos2")>29){

        }
        if(fichero.existeFile(this, "Animales") && fichero.obtenerNota("Animales")>29){

        }
        if(fichero.existeFile(this, "Animales2")&& fichero.obtenerNota("Animales2")>29){

        }
        if(fichero.existeFile(this, "CincoLetras")&& fichero.obtenerNota("CincoLetras")>29){

        }
        if(fichero.existeFile(this, "CuatroSilabas")&& fichero.obtenerNota("CuatroSilabas")>29){

        }
        if(fichero.existeFile(this, "CuatroSilabas2")&& fichero.obtenerNota("CuatroSilabas2")>29){

        }
        if(fichero.existeFile(this, "Numeros")&& fichero.obtenerNota("Numeros")>29){

        }
        if(fichero.existeFile(this, "PartesCasa")&& fichero.obtenerNota("PartesCasa")>29){

        }
        if(fichero.existeFile(this, "PartesCasa2")&& fichero.obtenerNota("PartesCasa2")>29){

        }
        if(fichero.existeFile(this, "PartesCuerpo")&& fichero.obtenerNota("PartesCuerpo")>29){

        }
        if(fichero.existeFile(this, "Sustantivos1")&& fichero.obtenerNota("Sustantivos1")>29){

        }
        if(fichero.existeFile(this, "Sustantivos2")&& fichero.obtenerNota("Sustantivos2")>29){

        }
        if(fichero.existeFile(this, "UnaSilaba")&& fichero.obtenerNota("UnaSilaba")>29){

        }
        if(fichero.existeFile(this, "UnaSilaba2")&& fichero.obtenerNota("UnaSilaba2")>29){

        }
        if(fichero.existeFile(this, "Verbos1")&& fichero.obtenerNota("Verbos1")>29){

        }
        if(fichero.existeFile(this, "Verbos2")&& fichero.obtenerNota("Verbos2")>29){

        }
*/
    }
    public void activityMain(View view){
        Intent activityMain = new Intent(this, Animales.class);
        startActivity(activityMain);
    }
    public void partesCuerpoActivity(View view){
        Intent pc = new Intent(this, PartesCuerpo.class);
        startActivity(pc);
    }
    public void cuatroSilabasActivity(View view){
        Intent pc = new Intent(this, CuatroSilabas.class);
        startActivity(pc);
    }
    public void cuatroSilabas2Activity(View view){
        Intent pc = new Intent(this, CuatroSilabas2.class);
        startActivity(pc);
    }
    public void cincoSilabasActivity(View view){
        Intent pc = new Intent(this, CincoLetras.class);
        startActivity(pc);
    }

    public void partesCasaActivity(View view){
        Intent pc = new Intent(this, PartesCasa.class);
        startActivity(pc);
    }

    public void unaSilaba(View view){
        Intent pc = new Intent(this, UnaSilaba.class);
        startActivity(pc);
    }
    public void parteCasa2(View view){
        Intent pc = new Intent(this, PartesCasa2.class);
        startActivity(pc);
    }
    public void animales2(View view){
        Intent pc = new Intent(this, Animales2.class);
        startActivity(pc);
    }

    public void sustantivos(View view){
        Intent pc = new Intent(this, Sustantivos1.class);
        startActivity(pc);
    }
    public void adjetivos(View view){
        Intent pc = new Intent(this, Adjetivos.class);
        startActivity(pc);
    }

    public void notas(View view){
        Intent pc = new Intent(this, Notas.class);
        startActivity(pc);
    }
    public void verbos(View view){
        Intent pc = new Intent(this, Verbos1.class);
        startActivity(pc);
    }

    public void sustantivos2(View view){
        Intent pc = new Intent(this, Sustantivos1.class);
        startActivity(pc);
    }
    public void adjetivos2(View view){
        Intent pc = new Intent(this, Adjetivos2.class);
        startActivity(pc);
    }
    public void verbos2(View view){
        Intent pc = new Intent(this, Verbos2.class);
        startActivity(pc);
    }
    public void unaSilaba2(View view){
        Intent pc = new Intent(this, UnaSilaba2.class);
        startActivity(pc);
    }
    public void numeros(View view){
        Intent pc = new Intent(this, Numeros.class);
        startActivity(pc);
    }
    public void aleatorio(View view){
        Intent pc = new Intent(this, Aleatorio.class);
        startActivity(pc);
    }


}