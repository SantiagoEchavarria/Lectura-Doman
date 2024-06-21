package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Numeros extends AppCompatActivity {
    TextView r1, r2, r3, txt, txt1;
    MediaPlayer sonido;
    ImageButton btnNext,imageButton;

    Object[][] datos = new Object[100][10];
    int i=0;
    int numIntentosF=0;
    boolean next=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        datos[0][0]=0; datos[0][1]="Humo"; datos[0][2]="Uno"; datos[0][3]="Uso"; datos[0][4]=2;
        datos[1][0]=1; datos[1][1]="Toro"; datos[1][2]="Dos"; datos[1][3]="Domo"; datos[1][4]=2;
        datos[2][0]=2; datos[2][1]="Tres"; datos[2][2]="Oso"; datos[2][3]="Ocho"; datos[2][4]=1;
        datos[3][0]=3; datos[3][1]="Cinco"; datos[3][2]="Cuarzo"; datos[3][3]="Cuatro"; datos[3][4]=3;
        datos[4][0]=4; datos[4][1]="Conejo"; datos[4][2]="Coro"; datos[4][3]="Cinco"; datos[4][4]=3;
        datos[5][0]=5; datos[5][1]="Seis"; datos[5][2]="Cama"; datos[5][3]="Casa"; datos[5][4]=1;
        datos[6][0]=6; datos[6][1]="Silo"; datos[6][2]="Silla"; datos[6][3]="Siete"; datos[6][4]=3;
        datos[7][0]=7; datos[7][1]="Aguila"; datos[7][2]="Ocho"; datos[7][3]="Aro"; datos[7][4]=2;
        datos[8][0]=8; datos[8][1]="Vela"; datos[8][2]="Nueve"; datos[8][3]="Vino"; datos[8][4]=2;
        datos[9][0]=9; datos[9][1]="Cerdo"; datos[9][2]="Collar"; datos[9][3]="Diez"; datos[9][4]=3;

        r1= (TextView) findViewById(R.id.txtLeon13);
        r2=(TextView) findViewById(R.id.txtLima13);
        r3=(TextView) findViewById(R.id.txtLoma13);
        txt=(TextView) findViewById(R.id.txt15);
        txt1=(TextView) findViewById(R.id.txt1) ;

        btnNext= (ImageButton) findViewById(R.id.btnnext15);

        btnNext.setVisibility(View.INVISIBLE);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));



        r1.setText(datos[i][1].toString());
        r2.setText(datos[i][2].toString());
        r3.setText(datos[i][3].toString());


        sonido = MediaPlayer.create(this,R.raw.lion);
    }
    public void setRespuestas(View view){
        if(i<=9){
            if((int)datos[i][0]==1){
                txt1.setText("2");
            }else if((int)datos[i][0]==2){
                txt1.setText("3");
            }else if((int)datos[i][0]==3){
                txt1.setText("4");
            }else if((int)datos[i][0]==4){
                txt1.setText("5");
            }else if((int)datos[i][0]==5){
                txt1.setText("6");
            }else if((int)datos[i][0]==6){
                txt1.setText("7");
            }else if((int)datos[i][0]==7){
                txt1.setText("8");
            }else if((int)datos[i][0]==8){
                txt1.setText("9");
            }else if((int)datos[i][0]==9){
                txt1.setText("10");
            }else if((int)datos[i][0]==0){
                txt1.setText("1");
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
            Calificacion.putExtra("Categoria", "Numeros:");
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