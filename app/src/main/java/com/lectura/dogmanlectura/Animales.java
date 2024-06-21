package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Animales extends AppCompatActivity {
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
        setContentView(R.layout.activity_animales);

        datos[0][0]=0; datos[0][1]="León"; datos[0][2]="Lima"; datos[0][3]="Loma"; datos[0][4]=1;
        datos[1][0]=1; datos[1][1]="Grasa"; datos[1][2]="Gato"; datos[1][3]="Casa"; datos[1][4]=2;
        datos[2][0]=2; datos[2][1]="Ojo"; datos[2][2]="Oso"; datos[2][3]="Ocho"; datos[2][4]=2;
        datos[3][0]=3; datos[3][1]="Roca"; datos[3][2]="Ratón"; datos[3][3]="Rama"; datos[3][4]=2;
        datos[4][0]=4; datos[4][1]="Conejo"; datos[4][2]="Coro"; datos[4][3]="Cabra"; datos[4][4]=1;
        datos[5][0]=5; datos[5][1]="Casa"; datos[5][2]="Cama"; datos[5][3]="Caballo"; datos[5][4]=3;
        datos[6][0]=6; datos[6][1]="Caza"; datos[6][2]="Caja"; datos[6][3]="Camello"; datos[6][4]=3;
        datos[7][0]=7; datos[7][1]="Aguila"; datos[7][2]="Ajo"; datos[7][3]="Aro"; datos[7][4]=1;
        datos[8][0]=8; datos[8][1]="Vela"; datos[8][2]="Vaca"; datos[8][3]="Vino"; datos[8][4]=2;
        datos[9][0]=9; datos[9][1]="Cerdo"; datos[9][2]="Collar"; datos[9][3]="Cena"; datos[9][4]=1;

        r1= (TextView) findViewById(R.id.txtLeon);
        r2=(TextView) findViewById(R.id.txtLima);
        r3=(TextView) findViewById(R.id.txtLoma);
        txt=(TextView) findViewById(R.id.txt2);

        btnNext= (ImageButton) findViewById(R.id.btnnext2);

        btnNext.setVisibility(View.INVISIBLE);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        imageButton = findViewById(R.id.imageButton);
        imageButton.setImageResource(R.drawable.leonacuarela);

        r1.setText(datos[i][1].toString());
        r2.setText(datos[i][2].toString());
        r3.setText(datos[i][3].toString());


        sonido = MediaPlayer.create(this,R.raw.lion);
    }

    public void setRespuestas(View view){
        if(i<=9){
            if((int)datos[i][0]==1){
                imageButton.setImageResource(R.drawable.gatoacuarela);
            }else if((int)datos[i][0]==2){
                imageButton.setImageResource(R.drawable.osoacurela);
            }else if((int)datos[i][0]==3){
                imageButton.setImageResource(R.drawable.ratonacurela);
            }else if((int)datos[i][0]==4){
                imageButton.setImageResource(R.drawable.conejoacurela);
            }else if((int)datos[i][0]==5){
                imageButton.setImageResource(R.drawable.caballoacurela);
            }else if((int)datos[i][0]==6){
                imageButton.setImageResource(R.drawable.camelloacuarela);
            }else if((int)datos[i][0]==7){
                imageButton.setImageResource(R.drawable.aguilaacurela);
            }else if((int)datos[i][0]==8){
                imageButton.setImageResource(R.drawable.vacaacurela);
            }else if((int)datos[i][0]==9){
                imageButton.setImageResource(R.drawable.cerdoacuarela);
            }else if((int)datos[i][0]==0){
                imageButton.setImageResource(R.drawable.leonacuarela);
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
            Calificacion.putExtra("Categoria", "Animales:");
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