package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class PartesCuerpo extends AppCompatActivity {
    TextView r1, r2, r3,txt;
    Object[][] datos = new Object[100][10];
    int i=0;
    int numIntentosF=0;
    ImageButton btnNext,imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partes_cuerpo);

        datos[0][0]=0; datos[0][1]="Nariz"; datos[0][2]="Mano"; datos[0][3]="Mama"; datos[0][4]=2;
        datos[1][0]=1; datos[1][1]="Oso"; datos[1][2]="Oreja"; datos[1][3]="Oro"; datos[1][4]=2;
        datos[2][0]=2; datos[2][1]="Brazo"; datos[2][2]="Vaso"; datos[2][3]="Vaca"; datos[2][4]=1;
        datos[3][0]=3; datos[3][1]="Nariz"; datos[3][2]="Mani"; datos[3][3]="Mazo"; datos[3][4]=1;
        datos[4][0]=4; datos[4][1]="Roca"; datos[4][2]="Oro"; datos[4][3]="Ojo"; datos[4][4]=3;
        datos[5][0]=5; datos[5][1]="Pierna"; datos[5][2]="Oso"; datos[5][3]="Roca"; datos[5][4]=1;
        datos[6][0]=6; datos[6][1]="Cara"; datos[6][2]="Mesa"; datos[6][3]="Melón"; datos[6][4]=1;
        datos[7][0]=7; datos[7][1]="Barra"; datos[7][2]="Barba"; datos[7][3]="Baba"; datos[7][4]=2;//cambiado
        datos[8][0]=8; datos[8][1]="Pulgar"; datos[8][2]="Papa"; datos[8][3]="Puma"; datos[8][4]=1;
        datos[9][0]=9; datos[9][1]="Goma"; datos[9][2]="Labios"; datos[9][3]="Casa"; datos[9][4]=2;

        r1=(TextView) findViewById(R.id.r1);
        r2=(TextView) findViewById(R.id.r2);
        r3=(TextView) findViewById(R.id.r3);
        txt=(TextView) findViewById(R.id.txt2);

        btnNext= (ImageButton) findViewById(R.id.btnnext2);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        imageButton = findViewById(R.id.imageButton3);
        imageButton.setImageResource(R.drawable.manoacuarela);

    }
    public void setRespuestas(View view){
        if(i<=9){
            if((int)datos[i][0]==0){
                imageButton.setImageResource(R.drawable.manoacuarela);
            }else if((int)datos[i][0]==1){
                imageButton.setImageResource(R.drawable.orejaacuarela);
            }else if((int)datos[i][0]==2){
                imageButton.setImageResource(R.drawable.brazoacuarela);
            }else if((int)datos[i][0]==3){
                imageButton.setImageResource(R.drawable.narizacuarela);
            }else if((int)datos[i][0]==4){
                imageButton.setImageResource(R.drawable.ojoacuarela);
            }else if((int)datos[i][0]==5){
                imageButton.setImageResource(R.drawable.piernaacuarela);
            }else if((int)datos[i][0]==6){
                imageButton.setImageResource(R.drawable.caraacuarela);
            }else if((int)datos[i][0]==7){
                imageButton.setImageResource(R.drawable.barbaacuarela);
            }else if((int)datos[i][0]==8){
                imageButton.setImageResource(R.drawable.pulgaracuarela);
            }else if((int)datos[i][0]==9){
                imageButton.setImageResource(R.drawable.labiosacuarela);
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
            Calificacion.putExtra("Categoria","PartesCuerpo:");
            Calificacion.putExtra("numeroIntentosFallidosAnimales",numIntentosF+"");
            startActivity(Calificacion);

        }
    }

    //public void sonido(View view){
        //sonido.start();
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