package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class PartesCasa extends AppCompatActivity {
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
        setContentView(R.layout.activity_partes_casa);


        datos[0][0]=0; datos[0][1]="Techo"; datos[0][2]="Termo"; datos[0][3]="Tema"; datos[0][4]=1;
        datos[1][0]=1; datos[1][1]="Papel"; datos[1][2]="Pared"; datos[1][3]="Pastel"; datos[1][4]=2;
        datos[2][0]=2; datos[2][1]="Sucio"; datos[2][2]="Sueño"; datos[2][3]="Suelo"; datos[2][4]=3;
        datos[3][0]=3; datos[3][1]="Barrio"; datos[3][2]="Balcón"; datos[3][3]="Barco"; datos[3][4]=2;
        datos[4][0]=4; datos[4][1]="Ropa"; datos[4][2]="Rosa"; datos[4][3]="Roma"; datos[4][4]=1;
        datos[5][0]=5; datos[5][1]="Muro"; datos[5][2]="Mula"; datos[5][3]="Mudo"; datos[5][4]=1;
        datos[6][0]=6; datos[6][1]="Foco"; datos[6][2]="Coco"; datos[6][3]="Foto"; datos[6][4]=1;
        datos[7][0]=7; datos[7][1]="Caja"; datos[7][2]="Calle"; datos[7][3]="Cama"; datos[7][4]=3;
        datos[8][0]=8; datos[8][1]="Baño"; datos[8][2]="Vaca"; datos[8][3]="banda"; datos[8][4]=1;
        datos[9][0]=9; datos[9][1]="Sismo"; datos[9][2]="Siete"; datos[9][3]="Silla"; datos[9][4]=3;

        r1= (TextView) findViewById(R.id.txtLeon2);
        r2=(TextView) findViewById(R.id.txtLima2);
        r3=(TextView) findViewById(R.id.txtLoma2);
        txt=(TextView) findViewById(R.id.txt);

        btnNext= (ImageButton) findViewById(R.id.btnnext);

        btnNext.setVisibility(View.INVISIBLE);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        imageButton = findViewById(R.id.imageButton2);

        imageButton.setImageResource(R.drawable.techoacuarela);

        r1.setText(datos[i][1].toString());
        r2.setText(datos[i][2].toString());
        r3.setText(datos[i][3].toString());

    }

    public void setRespuestas(View view){
        if(i<=9){
            if((int)datos[i][0]==1){
                imageButton.setImageResource(R.drawable.muroacuarela);
            }else if((int)datos[i][0]==2){
                imageButton.setImageResource(R.drawable.pisoacuarela);
            }else if((int)datos[i][0]==3){
                imageButton.setImageResource(R.drawable.balconacuarela);
            }else if((int)datos[i][0]==4){
                imageButton.setImageResource(R.drawable.ropaacuarela);
            }else if((int)datos[i][0]==5){
                imageButton.setImageResource(R.drawable.muroacuarela);
            }else if((int)datos[i][0]==6){
                imageButton.setImageResource(R.drawable.focoacuarela);
            }else if((int)datos[i][0]==7){
                imageButton.setImageResource(R.drawable.camaacuarela);
            }else if((int)datos[i][0]==8){
                imageButton.setImageResource(R.drawable.banoacuarela);
            }else {
                imageButton.setImageResource(R.drawable.sillaacuarela);
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
            Calificacion.putExtra("Categoria","PartesCasa:");
            Calificacion.putExtra("numeroIntentosFallidosAnimales",numIntentosF+"");
            startActivity(Calificacion);

        }
    }

   // public void sonido(View view){
      //  sonido.start();
   // }

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