package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class Calificacion extends AppCompatActivity {
    TextView numFallos, calificacion;
    ImageView star5,star6,star7,star8,star9;
    Fichero fichero = new Fichero();
    String Siguiente;
    Intent pc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificacion);
        star5= (ImageView) findViewById(R.id.star5);
        star6= (ImageView) findViewById(R.id.star6);
        star7= (ImageView) findViewById(R.id.star7);
        star8= (ImageView) findViewById(R.id.star8);
        star9= (ImageView) findViewById(R.id.star9);

        //Obtener datos del activity Animales:
        String intentoFallidos = getIntent().getStringExtra("numeroIntentosFallidosAnimales");
        String categoria = getIntent().getStringExtra("Categoria");

        numFallos=(TextView) findViewById(R.id.numFallos);
        numFallos.setText(intentoFallidos);
        int iF=Integer.parseInt(intentoFallidos);
        float calificacion1=5-(iF);


        if(categoria.contains("Animales:")){

            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros animales");
            fichero.actualizar(this,"Animales",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, PartesCasa.class);

        }
        else if(categoria.contains("UnaSilaba:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros UnaSilaba");
            fichero.actualizar(this,"UnaSilaba",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Animales.class);

        }else if(categoria.contains("CuatroSilabas:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros CuatroSilabas");
            fichero.actualizar(this,"CuatroSilabas",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, PartesCuerpo.class);

        }else if(categoria.contains("Adjetivos:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros Adjetivos");
            fichero.actualizar(this,"Adjetivos",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Verbos1.class);

        }else if(categoria.contains("Adjetivos2:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros Adjetivos2");
            fichero.actualizar(this,"Adjetivos2",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Verbos2.class);

        }else if(categoria.contains("Animales2:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros Animales2");
            fichero.actualizar(this,"Animales2",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, PartesCasa2.class);

        }else if(categoria.contains("Verbos1:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros Verbos1");
            fichero.actualizar(this,"Verbos1",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Animales2.class);

        }else if(categoria.contains("Verbos2:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros Verbos2");
            fichero.actualizar(this,"Verbos2",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Aleatorio.class);

        }else if(categoria.contains("Sustantivos1:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros Sustantivos1");
            fichero.actualizar(this,"Sustantivos1",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Adjetivos.class);

        }else if(categoria.contains("Sustantivos2:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros Sustantivos2");
            fichero.actualizar(this,"Sustantivos2",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Adjetivos2.class);

        }else if(categoria.contains("PartesCasa:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros PartesCasa");
            fichero.actualizar(this,"PartesCasa",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, PartesCuerpo.class);

        }else if(categoria.contains("PartesCasa2:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros PartesCasa2");
            fichero.actualizar(this,"PartesCasa2",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Sustantivos2.class);

        }else if(categoria.contains("PartesCuerpo:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros PartesCuerpo");
            fichero.actualizar(this,"PartesCuerpo",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Sustantivos1.class);

        }else if(categoria.contains("Numeros:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros Numeros");
            fichero.actualizar(this,"Numeros",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Sustantivos1.class);

        }else if(categoria.contains("CuatroSilabas2:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros CuatroSilabas2");
            fichero.actualizar(this,"CuatroSilabas2",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Sustantivos1.class);

        }
        else if(categoria.contains("CincoLetras:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros CincoLetras");
            fichero.actualizar(this,"CincoLetras",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Sustantivos1.class);

        }else if(categoria.contains("UnaSilaba2:")){
            System.out.println("categoria:"+categoria);
            System.out.println("intentos F:"+intentoFallidos);
            System.out.println("Guardando ficheros UnaSilaba2");
            fichero.actualizar(this,"UnaSilaba2",intentoFallidos,  calificacion1+"");
            pc2= new Intent(this, Animales.class);
        }





        if(calificacion1<=0){
            star5.setVisibility(View.INVISIBLE);
            star6.setVisibility(View.INVISIBLE);
            star7.setVisibility(View.INVISIBLE);
            star8.setVisibility(View.INVISIBLE);
            star9.setVisibility(View.INVISIBLE);
        }else if(calificacion1==1){
            star5.setVisibility(View.VISIBLE);
            star6.setVisibility(View.INVISIBLE);
            star7.setVisibility(View.INVISIBLE);
            star8.setVisibility(View.INVISIBLE);
            star9.setVisibility(View.INVISIBLE);
        }
        else if(calificacion1==2){
            star5.setVisibility(View.VISIBLE);
            star6.setVisibility(View.VISIBLE);
            star7.setVisibility(View.INVISIBLE);
            star8.setVisibility(View.INVISIBLE);
            star9.setVisibility(View.INVISIBLE);
        }else if(calificacion1==3){
            star5.setVisibility(View.VISIBLE);
            star6.setVisibility(View.VISIBLE);
            star7.setVisibility(View.VISIBLE);
            star8.setVisibility(View.INVISIBLE);
            star9.setVisibility(View.INVISIBLE);
        }
        else  if(calificacion1==4){
            star5.setVisibility(View.VISIBLE);
            star6.setVisibility(View.VISIBLE);
            star7.setVisibility(View.VISIBLE);
            star8.setVisibility(View.VISIBLE);
            star9.setVisibility(View.INVISIBLE);
        }else{
            star5.setVisibility(View.VISIBLE);
            star6.setVisibility(View.VISIBLE);
            star7.setVisibility(View.VISIBLE);
            star8.setVisibility(View.VISIBLE);
            star9.setVisibility(View.VISIBLE);
        }
        calificacion=(TextView) findViewById(R.id.calificacion);
        calificacion.setText(calificacion1+"");

    }
    public void menu(View view){
        Intent pc = new Intent(this, MainActivity.class);
        startActivity(pc);
    }
    public void siguiente(View view){

        startActivity(pc2);
    }
}