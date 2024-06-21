package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class UnaSilaba extends AppCompatActivity {
    public static Object[][] respuestas=new Object[5][3];
    TextView txtPalabra,txt;
    ImageButton im1, im2, im3, im4, btnNext;
    static int numIntentosF=0;
    static int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_una_silaba);

        respuestas[0][0]="Sol"; respuestas[0][1]=2; respuestas[0][2]=1;
        respuestas[1][0]="Pan"; respuestas[1][1]=4; respuestas[1][2]=2;
        respuestas[2][0]="Flor"; respuestas[2][1]=3; respuestas[2][2]=3;
        respuestas[3][0]="Mar"; respuestas[3][1]=1; respuestas[3][2]=4;
        respuestas[4][0]="Tren"; respuestas[4][1]=4; respuestas[4][2]=5;


        txtPalabra= (TextView) findViewById(R.id.txtPalabra);
        txt=(TextView) findViewById(R.id.txt5);

        im1=findViewById(R.id.im1);
        im2=findViewById(R.id.im2);
        im3=findViewById(R.id.im3);
        im4=findViewById(R.id.im4);
        btnNext=findViewById(R.id.btnnext5);

        im1.setImageResource(R.drawable.lunacuarelasilaba);
        im2.setImageResource(R.drawable.solacuarelasilaba);//
        im3.setImageResource(R.drawable.espaciocuarelasilaba);
        im4.setImageResource(R.drawable.asteroidecuarelasilaba);
    }

    public void setRespuestas(View view){
        if(i<=4){
            if((int)respuestas[i][2]==1){
                im1.setImageResource(R.drawable.lunacuarelasilaba);
                im2.setImageResource(R.drawable.solacuarelasilaba);//
                im3.setImageResource(R.drawable.espaciocuarelasilaba);
                im4.setImageResource(R.drawable.asteroidecuarelasilaba);
            }else if((int)respuestas[i][2]==2){
                im1.setImageResource(R.drawable.bayascuarelasilaba);
                im2.setImageResource(R.drawable.florcuarelasilaba);
                im3.setImageResource(R.drawable.motocuarelasilaba);
                im4.setImageResource(R.drawable.pancuarelasilaba);//
            }else if((int)respuestas[i][2]==3){
                im4.setImageResource(R.drawable.mielcuarelasilaba);
                im2.setImageResource(R.drawable.buhocuarelasilaba);
                im1.setImageResource(R.drawable.arbolcuarelasilaba);
                im3.setImageResource(R.drawable.florcuarelasilaba);//
            }else if((int)respuestas[i][2]==4){
                im1.setImageResource(R.drawable.marcuarelasilaba);//
                im2.setImageResource(R.drawable.pradocuarelasilaba);
                im3.setImageResource(R.drawable.carrocuarelasilaba);
                im4.setImageResource(R.drawable.pradocuarelasilaba);
            }else if((int)respuestas[i][2]==5){
                im1.setImageResource(R.drawable.barcocuarelasilaba);
                im2.setImageResource(R.drawable.carrocuarelasilaba);
                im3.setImageResource(R.drawable.motocuarelasilaba);
                im4.setImageResource(R.drawable.trencuarelasilaba);//
            }

            //Datos de las pregunta
            txtPalabra.setText(respuestas[i][0].toString());
            txt.setText("");
            txt.setGravity(Gravity.CENTER);

            //Color de las respuestas
            im1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            im2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            im3.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            im4.setBackgroundColor(getResources().getColor(android.R.color.transparent));


            btnNext.setVisibility(View.VISIBLE);
            btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));

            im1.setClickable(true);
            im2.setClickable(true);
            im3.setClickable(true);
            im4.setClickable(true);

        }else{
            Intent Calificacion = new Intent(this, Calificacion.class);
            Calificacion.putExtra("numeroIntentosFallidosAnimales",numIntentosF+"");
            Calificacion.putExtra("Categoria","UnaSilaba:");
            i=0;
            startActivity(Calificacion);

        }
    }


    public void respuesta1(View view) {
        if ((int) respuestas[i][1] == 1) {
            im1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            i=i+1;
            txt.setText("Es Correcto!");
            btnNext.setVisibility(View.VISIBLE);
            btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            im1.setClickable(false);
            im2.setClickable(false);
            im3.setClickable(false);
            im4.setClickable(false);
        }else {
            txt.setText("Incorrecto, intetalo de nuevo");

            im1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }
    public void respuesta2(View view){
        if((int) respuestas[i][1]==2) {
            im2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            txt.setText("Es Correcto!");
            im1.setClickable(false);
            im2.setClickable(false);
            im3.setClickable(false);
            im4.setClickable(false);

            btnNext.setVisibility(View.VISIBLE);
            btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            i=i+1;

        }else {
            txt.setText("Incorrecto, intetalo de nuevo");
            im2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }
    public void respuesta3(View view){
        if((int) respuestas[i][1]==3) {
            im3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            i=i+1;
            txt.setText("Es Correcto!");
            btnNext.setVisibility(View.VISIBLE);
            btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            im1.setClickable(false);
            im2.setClickable(false);
            im3.setClickable(false);
            im4.setClickable(false);

        }else {

            im3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
            txt.setText("Incorrecto, intetalo de nuevo");
        }
    }
    public void respuesta4(View view){
        if((int) respuestas[i][1]==4) {

            im4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            i=i+1;
            txt.setText("Es Correcto!");
            btnNext.setVisibility(View.VISIBLE);
            btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));

            im1.setClickable(false);
            im2.setClickable(false);
            im3.setClickable(false);
            im4.setClickable(false);

        }else {

            im4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
            txt.setText("Incorrecto, intetalo de nuevo");
        }
    }

}