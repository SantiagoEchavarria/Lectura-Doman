package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Adjetivos extends AppCompatActivity {

    TextView r1, r2, r3, txt;
    MediaPlayer sonido;
    ImageButton btnNext,imageButton;

    Object[][] datos = new Object[100][10];
    int i=0;
    int numIntentosF=0;
    boolean next=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjetivos1);
        datos[0][0]=0; datos[0][1]="Casa azul"; datos[0][2]="Casa grande"; datos[0][3]="Casa roja"; datos[0][4]=2;
        datos[1][0]=1; datos[1][1]="Perro rápido"; datos[1][2]="Perro grande"; datos[1][3]="Perro pequeño"; datos[1][4]=3;
        datos[2][0]=2; datos[2][1]="Carro rápido"; datos[2][2]="Carro lento"; datos[2][3]="Camión lento"; datos[2][4]=1;
        datos[3][0]=3; datos[3][1]="Día soleado"; datos[3][2]="Noche oscura"; datos[3][3]="Dia nublado"; datos[3][4]=1;
        datos[4][0]=4; datos[4][1]="Gato blanco"; datos[4][2]="Gato azul"; datos[4][3]="Gato negro"; datos[4][4]=3;
        datos[5][0]=5; datos[5][1]="Flor negra"; datos[5][2]="Flor hermosa"; datos[5][3]="árbol grande"; datos[5][4]=2;
        datos[6][0]=6; datos[6][1]="Tren largo"; datos[6][2]="Tren corto"; datos[6][3]="Bus largo"; datos[6][4]=1;
        datos[7][0]=7; datos[7][1]="Río tranquilo"; datos[7][2]="Mar tranquilo"; datos[7][3]="Río azul"; datos[7][4]=2;
        datos[8][0]=8; datos[8][1]="Cielo estrellado"; datos[8][2]="Cielo oscuro"; datos[8][3]="Cielo azul"; datos[8][4]=3;
        datos[9][0]=9; datos[9][1]="Llano largo"; datos[9][2]="Montaña seca"; datos[9][3]="Montaña alta"; datos[9][4]=3;


        r1= (TextView) findViewById(R.id.txtLeon5);
        r2=(TextView) findViewById(R.id.txtLima5);
        r3=(TextView) findViewById(R.id.txtLoma5);
        txt=(TextView) findViewById(R.id.txt6);

        btnNext= (ImageButton) findViewById(R.id.btnnext6);

        btnNext.setVisibility(View.INVISIBLE);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        imageButton = findViewById(R.id.imageButton6);
        imageButton.setImageResource(R.drawable.casagrandeacuarela);

        r1.setText(datos[i][1].toString());
        r2.setText(datos[i][2].toString());
        r3.setText(datos[i][3].toString());


        sonido = MediaPlayer.create(this,R.raw.lion);
    }
    public void setRespuestas(View view){
        if(i<=9){

            if((int)datos[i][0]==0){
                imageButton.setImageResource(R.drawable.casagrandeacuarela);
            }else if((int)datos[i][0]==1){
                imageButton.setImageResource(R.drawable.perropequenoacurela);
            }else if((int)datos[i][0]==2){
                imageButton.setImageResource(R.drawable.carrorapidoacuarela);
            }else if((int)datos[i][0]==3){
                imageButton.setImageResource(R.drawable.diasoleadoacuarela);
            }else if((int)datos[i][0]==4){
                imageButton.setImageResource(R.drawable.gatonegroacuarela);
            }else if((int)datos[i][0]==5){
                imageButton.setImageResource(R.drawable.floracuarela);
            }else if((int)datos[i][0]==6){
                imageButton.setImageResource(R.drawable.trenlargoacuarela);
            }else if((int)datos[i][0]==7){
                imageButton.setImageResource(R.drawable.maracuarela);
            }else if((int)datos[i][0]==8){
                imageButton.setImageResource(R.drawable.cieloacuarela);
            }else if((int)datos[i][0]==9){
                imageButton.setImageResource(R.drawable.montanaaltaacuarela);
            }

            //Datos de las respuestas
            r1.setText(datos[i][1].toString());
            r2.setText(datos[i][2].toString());
            r3.setText(datos[i][3].toString());

            txt.setText("");

            //Color de las respuestas
            r1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            r2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            r3.setBackgroundColor(getResources().getColor(android.R.color.transparent));


            btnNext.setVisibility(View.VISIBLE);
            btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));

            r1.setClickable(true);
            r2.setClickable(true);
            r3.setClickable(true);

        }else{
            Intent Calificacion = new Intent(this, Calificacion.class);
            Calificacion.putExtra("Categoria","Adjetivos:");
            Calificacion.putExtra("numeroIntentosFallidosAnimales",numIntentosF+"");
            startActivity(Calificacion);

        }
    }

    public void sonido(View view){
        sonido.start();
    }

    public void respuesta1(View view) {
        if ((int) datos[i][4] == 1) {
            r1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            i=i+1;
            txt.setText("Es Correcto!");
            btnNext.setVisibility(View.VISIBLE);
            btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            r1.setClickable(false);
            r2.setClickable(false);
            r3.setClickable(false);
        }else {
            txt.setText("Incorrecto, intetalo de nuevo");

            r1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }
    public void respuesta2(View view){
        if((int) datos[i][4]==2) {
            r2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            txt.setText("Es Correcto!");
            r1.setClickable(false);
            r2.setClickable(false);
            r3.setClickable(false);
            btnNext.setVisibility(View.VISIBLE);
            btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            i=i+1;

        }else {
            txt.setText("Incorrecto, intetalo de nuevo");
            r2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }
    public void respuesta3(View view){
        if((int) datos[i][4]==3) {
            r3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            txt.setText("Es Correcto!");
            i=i+1;
            btnNext.setVisibility(View.VISIBLE);
            btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            r1.setClickable(false);
            r2.setClickable(false);
            r3.setClickable(false);

        }else {

            r3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
            txt.setText("Incorrecto, intetalo de nuevo");
        }
    }
}