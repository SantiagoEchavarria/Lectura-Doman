package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Sustantivos2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_sustantivos2);
        datos[0][0]=0; datos[0][1]="Andres"; datos[0][2]="Arroz"; datos[0][3]="Agua"; datos[0][4]=3;
        datos[1][0]=1; datos[1][1]="Árbol"; datos[1][2]="Amigo"; datos[1][3]="Ayer"; datos[1][4]=1;
        datos[2][0]=2; datos[2][1]="Amigos"; datos[2][2]="Agua"; datos[2][3]="Antes"; datos[2][4]=1;
        datos[3][0]=3; datos[3][1]="Cusco"; datos[3][2]="Coro"; datos[3][3]="Comida"; datos[3][4]=3;
        datos[4][0]=4; datos[4][1]="Sol"; datos[4][2]="Solo"; datos[4][3]="Silo"; datos[4][4]=1;
        datos[5][0]=5; datos[5][1]="A gusto"; datos[5][2]="Arbusto"; datos[5][3]="Asusto"; datos[5][4]=2;
        datos[6][0]=6; datos[6][1]="Tacaño"; datos[6][2]="Trabajo"; datos[6][3]="Tabaco"; datos[6][4]=2;
        datos[7][0]=7; datos[7][1]="Dinero"; datos[7][2]="Daño"; datos[7][3]="Aro"; datos[7][4]=1;
        datos[8][0]=8; datos[8][1]="Fijo"; datos[8][2]="Foco"; datos[8][3]="Familia"; datos[8][4]=3;
        datos[9][0]=9; datos[9][1]="Cerdo"; datos[9][2]="Ropa"; datos[9][3]="Roma"; datos[9][4]=2;

        r1= (TextView) findViewById(R.id.txtLeon11);
        r2=(TextView) findViewById(R.id.txtLima11);
        r3=(TextView) findViewById(R.id.txtLoma11);
        txt=(TextView) findViewById(R.id.txt12);

        btnNext= (ImageButton) findViewById(R.id.btnnext12);

        btnNext.setVisibility(View.INVISIBLE);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        imageButton = findViewById(R.id.imageButton12);
        imageButton.setImageResource(R.drawable.aguaacuarela);

        r1.setText(datos[i][1].toString());
        r2.setText(datos[i][2].toString());
        r3.setText(datos[i][3].toString());


        sonido = MediaPlayer.create(this,R.raw.lion);
    }

    public void setRespuestas(View view){
        if(i<=9){
            if((int)datos[i][0]==0){
                imageButton.setImageResource(R.drawable.aguaacuarela);
            }else if((int)datos[i][0]==1){
                imageButton.setImageResource(R.drawable.arbolacuarela);
            }else if((int)datos[i][0]==2){
                imageButton.setImageResource(R.drawable.amigoacuarela);
            }else if((int)datos[i][0]==3){
                imageButton.setImageResource(R.drawable.comidaacuarela);
            }else if((int)datos[i][0]==4){
                imageButton.setImageResource(R.drawable.diasoleadoacuarela);
            }else if((int)datos[i][0]==5){
                imageButton.setImageResource(R.drawable.arbolacuarela);
            }else if((int)datos[i][0]==6){
                imageButton.setImageResource(R.drawable.trabajoacuarela);
            }else if((int)datos[i][0]==7){
                imageButton.setImageResource(R.drawable.dineroacuarela);
            }else if((int)datos[i][0]==8){
                imageButton.setImageResource(R.drawable.familiaacuarela);
            }else if((int)datos[i][0]==9){
                imageButton.setImageResource(R.drawable.ropaacuarela);
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
            Calificacion.putExtra("numeroIntentosFallidosAnimales",numIntentosF+"");
            Calificacion.putExtra("Categoria","Sustantivos2:");
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
            i=i+1;
            txt.setText("Es Correcto!");
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