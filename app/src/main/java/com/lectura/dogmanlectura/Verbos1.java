package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Verbos1 extends AppCompatActivity {

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
        setContentView(R.layout.activity_verbos1);
        datos[0][0]=0; datos[0][1]="Leon"; datos[0][2]="Hablar"; datos[0][3]="Loma"; datos[0][4]=2;
        datos[1][0]=1; datos[1][1]="Grasa"; datos[1][2]="Gato"; datos[1][3]="Comer"; datos[1][4]=3;
        datos[2][0]=2; datos[2][1]="Chatear"; datos[2][2]="Caminar"; datos[2][3]="Comer"; datos[2][4]=2;
        datos[3][0]=3; datos[3][1]="Caminar"; datos[3][2]="Correr"; datos[3][3]="Remar"; datos[3][4]=2;
        datos[4][0]=4; datos[4][1]="Conejo"; datos[4][2]="Coro"; datos[4][3]="Dormir"; datos[4][4]=3;
        datos[5][0]=5; datos[5][1]="Saltar"; datos[5][2]="Cama"; datos[5][3]="Caballo"; datos[5][4]=1;
        datos[6][0]=6; datos[6][1]="Caza"; datos[6][2]="Bailar"; datos[6][3]="Camello"; datos[6][4]=2;
        datos[7][0]=7; datos[7][1]="Aguila"; datos[7][2]="Amar"; datos[7][3]="Jugar"; datos[7][4]=3;
        datos[8][0]=8; datos[8][1]="Estudiar"; datos[8][2]="Correr"; datos[8][3]="Venir"; datos[8][4]=1;
        datos[9][0]=9; datos[9][1]="Trabajar"; datos[9][2]="Collar"; datos[9][3]="Cenar"; datos[9][4]=1;

        //Pendiente de actualizar
        r1= (TextView) findViewById(R.id.txtLeon7);
        r2=(TextView) findViewById(R.id.txtLima7);
        r3=(TextView) findViewById(R.id.txtLoma7);
        txt=(TextView) findViewById(R.id.txt8);

        btnNext= (ImageButton) findViewById(R.id.btnnext8);

        btnNext.setVisibility(View.INVISIBLE);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        imageButton = findViewById(R.id.imageButton8);
        imageButton.setImageResource(R.drawable.hablaracuarela);

        r1.setText(datos[i][1].toString());
        r2.setText(datos[i][2].toString());
        r3.setText(datos[i][3].toString());


        sonido = MediaPlayer.create(this,R.raw.lion);
    }
    public void setRespuestas(View view){
        if(i<=9){
            //Actualizar imagenes
            if((int)datos[i][0]==0){
                imageButton.setImageResource(R.drawable.hablaracuarela);
            }else if((int)datos[i][0]==1){
                imageButton.setImageResource(R.drawable.comeracuarela);
            }else if((int)datos[i][0]==2){
                imageButton.setImageResource(R.drawable.caminaracuarela);
            }else if((int)datos[i][0]==3){
                imageButton.setImageResource(R.drawable.correracuarela);
            }else if((int)datos[i][0]==4){
                imageButton.setImageResource(R.drawable.dormiracuarela);
            }else if((int)datos[i][0]==5){
                imageButton.setImageResource(R.drawable.saltaracuarela);
            }else if((int)datos[i][0]==6){
                imageButton.setImageResource(R.drawable.bailaracuarela);
            }else if((int)datos[i][0]==7){
                imageButton.setImageResource(R.drawable.jugaracuarela);
            }else if((int)datos[i][0]==8){
                imageButton.setImageResource(R.drawable.estudiaracuarela);
            }else if((int)datos[i][0]==9){
                imageButton.setImageResource(R.drawable.trabajo);//faltacambiar
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
            Calificacion.putExtra("Categoria","Verbos1:");
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