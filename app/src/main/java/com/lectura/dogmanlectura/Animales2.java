package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Animales2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_animales2);
        datos[0][0]=0; datos[0][1]="Elefante"; datos[0][2]="Elegante"; datos[0][3]="Elevar"; datos[0][4]=1;
        datos[1][0]=1; datos[1][1]="Mucho"; datos[1][2]="Muñeca "; datos[1][3]="Murciélago"; datos[1][4]=3;
        datos[2][0]=2; datos[2][1]="Casa"; datos[2][2]="Canguro"; datos[2][3]="Cama"; datos[2][4]=2;
        datos[3][0]=3; datos[3][1]="Hipopótamo"; datos[3][2]="Importante"; datos[3][3]="Hipo"; datos[3][4]=1;
        datos[4][0]=4; datos[4][1]="Jirafa"; datos[4][2]="Girasol"; datos[4][3]="Girar"; datos[4][4]=1;
        datos[5][0]=5; datos[5][1]="Chile"; datos[5][2]="Chico"; datos[5][3]="Chimpancé"; datos[5][4]=3;
        datos[6][0]=6; datos[6][1]="Pino"; datos[6][2]="Pingüino"; datos[6][3]="Cigüeña"; datos[6][4]=2;
        datos[7][0]=7; datos[7][1]="Carro"; datos[7][2]="Castor"; datos[7][3]="Camaleón"; datos[7][4]=3;
        datos[8][0]=8; datos[8][1]="Mariposa"; datos[8][2]="Mazorca"; datos[8][3]="Mayo"; datos[8][4]=1;
        datos[9][0]=9; datos[9][1]="Molino"; datos[9][2]="Mosquito"; datos[9][3]="Moto"; datos[9][4]=2;

        r1= (TextView) findViewById(R.id.txtLeon3);
        r2=(TextView) findViewById(R.id.txtLima3);
        r3=(TextView) findViewById(R.id.txtLoma3);
        txt=(TextView) findViewById(R.id.txt3);

        btnNext= (ImageButton) findViewById(R.id.btnnext3);

        btnNext.setVisibility(View.INVISIBLE);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        imageButton = findViewById(R.id.imageButton4);
        imageButton.setImageResource(R.drawable.elefanteacuarela);

        r1.setText(datos[i][1].toString());
        r2.setText(datos[i][2].toString());
        r3.setText(datos[i][3].toString());


        sonido = MediaPlayer.create(this,R.raw.lion);

    }

    public void setRespuestas(View view){
        if(i<=9){
            if((int)datos[i][0]==1){
                imageButton.setImageResource(R.drawable.murcielagoacuarela);
            }else if((int)datos[i][0]==2){
                imageButton.setImageResource(R.drawable.canguroacuarela);
            }else if((int)datos[i][0]==3){
                imageButton.setImageResource(R.drawable.hipopotamoacuarela);
            }else if((int)datos[i][0]==4){
                imageButton.setImageResource(R.drawable.jirafaacuarela);
            }else if((int)datos[i][0]==5){
                imageButton.setImageResource(R.drawable.chimpanceacuarela);
            }else if((int)datos[i][0]==6){
                imageButton.setImageResource(R.drawable.pinguinoacuarela);
            }else if((int)datos[i][0]==7){
                imageButton.setImageResource(R.drawable.camaleonacuarela);
            }else if((int)datos[i][0]==8){
                imageButton.setImageResource(R.drawable.mariposaacuarela);
            }else {
                imageButton.setImageResource(R.drawable.mosquitoacuarela);
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
            Calificacion.putExtra("Categoria","Animales2:");
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