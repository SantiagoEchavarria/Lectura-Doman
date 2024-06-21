package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Notas extends AppCompatActivity {
    Fichero fichero = new Fichero();
    TextView historialtxt, partesCasatxt,partesCuerpo, sustantivos, adjetivos, verbos, animales2, partesCasa2,
    sustantivos2, adjetivos2, verbos2, unaSilabatxt, unaSilabatxt2, letras, numeros, cuatrosilabas2, cincosilabas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        // r1= (TextView) findViewById(R.id.txtLeon);
        unaSilabatxt=(TextView) findViewById(R.id.idUnaSilaba);
        unaSilabatxt2=(TextView) findViewById(R.id.idUnaSilaba2);
        historialtxt= (TextView) findViewById(R.id.idTitulo);
        partesCasatxt=(TextView) findViewById(R.id.PartesCasatxt);
        partesCuerpo = (TextView) findViewById(R.id.PartesCuerpotxt);
        sustantivos = (TextView) findViewById(R.id.sustantivostxt);
        adjetivos = (TextView) findViewById(R.id.adjetivostxt);
        verbos = (TextView) findViewById(R.id.verbostxt);
        animales2 = (TextView) findViewById(R.id.animales2txt);
        partesCasa2 = (TextView) findViewById(R.id.partesCasa2txt);
        sustantivos2 = (TextView) findViewById(R.id.sustantivos2txt);
        adjetivos2 = (TextView) findViewById(R.id.adjetivos2txt);
        verbos2 = (TextView) findViewById(R.id.verbos2txt);
        letras = (TextView) findViewById(R.id.Letras);
        numeros= (TextView) findViewById(R.id.numeros);
        cincosilabas= (TextView) findViewById(R.id.cincosilabas);
        cuatrosilabas2=(TextView) findViewById(R.id.cuatrosilabas2);



        unaSilabatxt.setText("Una Silaba" +fichero.readFile(this, "UnaSilaba"));
        unaSilabatxt2.setText("Una Silaba 2" +fichero.readFile(this, "UnaSilaba2"));
        historialtxt.setText("Animales "+fichero.readFile(this,"Animales"));
        partesCasatxt.setText("Partes se la casa"+fichero.readFile(this,"PartesCasa"));
        letras.setText("Letras"+fichero.readFile(this,"CuatroSilabas"));
        partesCuerpo.setText("Partes del cuerpo"+fichero.readFile(this, "PartesCuerpo"));
        numeros.setText("Numeros "+fichero.readFile(this, "Numeros"));
        sustantivos.setText("Sustantivos"+ fichero.readFile(this, "Sustantivos1"));
        adjetivos.setText("Adjetivos"+fichero.readFile(this, "Adjetivos"));
        verbos.setText("Verbos"+fichero.readFile(this, "Verbos1"));
        animales2.setText("Animales 2"+ fichero.readFile(this, "Animales2"));
        partesCasa2.setText("Partes de la casa 2"+fichero.readFile(this, "PartesCasa2"));
        sustantivos2.setText("Sustantivos 2"+ fichero.readFile(this, "Sustantivos2"));
        adjetivos2.setText("Adjetivos 2"+fichero.readFile(this, "Adjetivos2"));
        verbos2.setText("Verbos 2"+fichero.readFile(this, "Verbos2"));
        cuatrosilabas2.setText("Letras 2"+fichero.readFile(this, "CuatroSilabas2"));
        cincosilabas.setText("Letras 3"+fichero.readFile(this, "CincoLetras"));
    }

    public void compartir( View view){
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT, "Compartir");

        share.putExtra(Intent.EXTRA_TEXT, "Una Silaba" +fichero.readFile(this, "UnaSilaba")+"\n"+
                "Animales "+fichero.readFile(this,"Animales")+"\n"+
                "Una Silaba 2 "+fichero.readFile(this,"UnaSilaba2")+"\n"+
                "Partes se la casa"+fichero.readFile(this,"PartesCasa")+"\n"+
                "Letras"+fichero.readFile(this,"CuatroSilabas")+"\n"+
                "Partes del cuerpo"+fichero.readFile(this, "PartesCuerpo")+"\n"+
                "Numeros "+fichero.readFile(this, "Numeros")+"\n"+
                "Sustantivos"+ fichero.readFile(this, "Sustantivos1")+"\n"+
                "Adjetivos"+fichero.readFile(this, "Adjetivos")+"\n"+
                "Verbos"+fichero.readFile(this, "Verbos1")+"\n"+
                "Animales 2"+ fichero.readFile(this, "Animales2")+"\n"+
                "Letras 2"+fichero.readFile(this, "CuatroSilabas2")+"\n"+
                "Partes de la casa 2"+fichero.readFile(this, "PartesCasa2")+"\n"+
                "Sustantivos 2"+ fichero.readFile(this, "Sustantivos2")+"\n"+
                "Letras 3"+fichero.readFile(this, "CincoLetras")+"\n"+
                "Adjetivos 2"+fichero.readFile(this, "Adjetivos2")+"\n"+
                "Verbos 2"+fichero.readFile(this, "Verbos2"));
        startActivity(Intent.createChooser(share,"Compartir"));
    }
}