package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Verbos2 extends AppCompatActivity {

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
        setContentView(R.layout.activity_verbos2);
        datos[0][0]=0; datos[0][1]="Escribir"; datos[0][2]="Entero"; datos[0][3]="Elefante"; datos[0][4]=1;
        datos[1][0]=1; datos[1][1]="Leon"; datos[1][2]="Liso"; datos[1][3]="Leer"; datos[1][4]=3;
        datos[2][0]=2; datos[2][1]="Pesa"; datos[2][2]="Pensar"; datos[2][3]="Ocho"; datos[2][4]=2;
        datos[3][0]=3; datos[3][1]="Escudo"; datos[3][2]="Prensa"; datos[3][3]="Escuchar"; datos[3][4]=3;
        datos[4][0]=4; datos[4][1]="Arder"; datos[4][2]="Azul"; datos[4][3]="Aprender"; datos[4][4]=3;
        datos[5][0]=5; datos[5][1]="Carro"; datos[5][2]="Cantar"; datos[5][3]="Caballo"; datos[5][4]=2;
        datos[6][0]=6; datos[6][1]="Viajar"; datos[6][2]="Valor"; datos[6][3]="Burro"; datos[6][4]=1;
        datos[7][0]=7; datos[7][1]="Aguila"; datos[7][2]="Observar"; datos[7][3]="Oso"; datos[7][4]=2;
        datos[8][0]=8; datos[8][1]="Ayuno"; datos[8][2]="Ayudar"; datos[8][3]="Vino"; datos[8][4]=2;
        datos[9][0]=9; datos[9][1]="Entero"; datos[9][2]="Elegir"; datos[9][3]="Estudiar"; datos[9][4]=3;

        //Pendiente de actualizar
        r1= (TextView) findViewById(R.id.txtLeon6);
        r2=(TextView) findViewById(R.id.txtLima6);
        r3=(TextView) findViewById(R.id.txtLoma6);
        txt=(TextView) findViewById(R.id.txt7);

        btnNext= (ImageButton) findViewById(R.id.btnnext7);

        btnNext.setVisibility(View.INVISIBLE);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        imageButton = findViewById(R.id.imageButton7);
        imageButton.setImageResource(R.drawable.escribiracuarela);

        r1.setText(datos[i][1].toString());
        r2.setText(datos[i][2].toString());
        r3.setText(datos[i][3].toString());


        sonido = MediaPlayer.create(this,R.raw.lion);
    }
    public void setRespuestas(View view){
        if(i<=9){

            if((int)datos[i][0]==0){
                imageButton.setImageResource(R.drawable.escribiracuarela);
            }else if((int)datos[i][0]==1){
                imageButton.setImageResource(R.drawable.leeracuarela);
            }else if((int)datos[i][0]==2){
                imageButton.setImageResource(R.drawable.pensaracuarela);
            }else if((int)datos[i][0]==3){
                imageButton.setImageResource(R.drawable.escucharacuarela);
            }else if((int)datos[i][0]==4){
                imageButton.setImageResource(R.drawable.aprenderacuarela);
            }else if((int)datos[i][0]==5){
                imageButton.setImageResource(R.drawable.cantaracuarela);
            }else if((int)datos[i][0]==6){
                imageButton.setImageResource(R.drawable.viajaracuarela);
            }else if((int)datos[i][0]==7){
                imageButton.setImageResource(R.drawable.observaracuarela);
            }else if((int)datos[i][0]==8){
                imageButton.setImageResource(R.drawable.ayudaracuarela);
            }else if((int)datos[i][0]==9){
                imageButton.setImageResource(R.drawable.estudiaracuarela);
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
            Calificacion.putExtra("Categoria","Verbos2:");
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