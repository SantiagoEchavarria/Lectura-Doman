package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CincoLetras extends AppCompatActivity {
    Button s1, s2, s3, s4, s5;
    ImageButton btnNext;
    Object[][] datos = new Object[11][7];
    TextView txtPalabra;
    int i=0;
    int numIntentosF;
    int res=0;
    int fila=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco_letras);
        //Setear Botones
        s1 = findViewById(R.id.ids5);
        s2 = findViewById(R.id.ids6);
        s3 = findViewById(R.id.ids7);
        s4 = findViewById(R.id.ids);
        s5 = findViewById(R.id.ids8);

        btnNext= findViewById(R.id.btnnext16);

        txtPalabra= findViewById(R.id.txtPalabra4);

        datos[0][0]=0; datos[0][1]="d"; datos[0][2]="r"; datos[0][3]="e"; datos[0][4]="a"; datos[0][5]="P"; datos[0][6]="Pared";
        datos[1][0]=1; datos[1][1]="o"; datos[1][2]="t"; datos[1][3]="P"; datos[1][4]="a"; datos[1][5]="l"; datos[1][6]="Plato";
        datos[2][0]=2; datos[2][1]="o"; datos[2][2]="n"; datos[2][3]="M"; datos[2][4]="a"; datos[2][5]="g"; datos[2][6]="Mango";
        datos[3][0]=3; datos[3][1]="n"; datos[3][2]="i"; datos[3][3]="v"; datos[3][4]="A"; datos[3][5]="ó"; datos[3][6]="Avión";
        datos[4][0]=4; datos[4][1]="o"; datos[4][2]="g"; datos[4][3]="F"; datos[4][4]="u"; datos[4][5]="e"; datos[4][6]="Fuego";
        datos[5][0]=5; datos[5][1]="e"; datos[5][2]="p"; datos[5][3]="P"; datos[5][4]="a"; datos[5][5]="l"; datos[5][6]="Papel";
        datos[6][0]=6; datos[6][1]="L"; datos[6][2]="p"; datos[6][3]="a"; datos[6][4]="i"; datos[6][5]="z"; datos[6][6]="Lapiz";
        datos[7][0]=7; datos[7][1]="m"; datos[7][2]="a"; datos[7][3]="l"; datos[7][4]="u"; datos[7][5]="P"; datos[7][6]="Pluma";
        datos[8][0]=9; datos[8][1]="F"; datos[8][2]="r"; datos[8][3]="t"; datos[8][4]="u"; datos[8][5]="a"; datos[8][6]="Fruta";
        datos[9][0]=10; datos[9][1]="e"; datos[9][2]="v"; datos[9][3]="N"; datos[9][4]="e"; datos[9][5]="i"; datos[9][6]="Nieve";


        //Setea el ejercicio
        s1.setText(datos[0][1].toString());
        s2.setText(datos[0][2].toString());
        s3.setText(datos[0][3].toString());
        s4.setText(datos[0][4].toString());
        s5.setText(datos[0][5].toString());


        txtPalabra.setText("");

        btnNext.setClickable(false);
    }

    public boolean verificarLetra(String palabra, String dato, int indice){

        // Verificar si el índice de comienzo es válido para ambas cadenas
        if (indice >= 0 && indice < palabra.length() && indice < dato.length()) {
            char letraEscrita = palabra.charAt(indice);
            char letraDato = dato.charAt(indice);

            System.out.println("Letra escrita: " + letraEscrita);
            System.out.println("Letra dato: " + letraDato);

            if (letraEscrita == letraDato) {
                System.out.println("La letra es igual.");
                return true;
            } else {
                System.out.println("La letra es diferente.");
                return false;
            }
        } else {
            // Manejar el caso donde el índice de comienzo está fuera de rango
            System.out.println("El índice de comienzo está fuera de rango.");
            System.out.println(indice);
            return false;
        }
    }

    public void s1Respuesta(View view){

        String inicio=txtPalabra.getText().toString();
        System.out.println("Inicio: "+inicio);
        System.out.println("");

        String anterior=txtPalabra.getText().toString();
        System.out.println("anterior1: "+anterior);

        anterior = anterior+datos[i][1].toString();
        txtPalabra.setText(anterior);

        char dato = datos[fila][6].toString().charAt(res);


        //Verifica si es correcta
        if(verificarLetra(s1.getText().toString(),"" +dato,0)){
            res=res+1;
            s1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            s1.setClickable(false);
            //se termina
            if(res==5){
                btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                btnNext.setClickable(true);
                fila=fila+1;
            }
        }else{
            txtPalabra.setText(inicio);
            s1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }
    public void s2Respuesta(View view){

        String inicio=txtPalabra.getText().toString();
        System.out.println("Inicio: "+inicio);
        System.out.println("");
        String anterior=txtPalabra.getText().toString();
        System.out.println("anterior: "+anterior);
        anterior = anterior+datos[i][2].toString();
        txtPalabra.setText(anterior);

        char dato = datos[fila][6].toString().charAt(res);

        //Verifica si es correcta
        if(verificarLetra(s2.getText().toString(),""+dato,0)){
            res=res+1;
            s2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            s2.setClickable(false);
            if(res==5){
                btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                btnNext.setClickable(true);
                fila=fila+1;
            }
        }else{
            txtPalabra.setText(inicio);
            s2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }
    public void s3Respuesta(View view){

        String inicio=txtPalabra.getText().toString();
        System.out.println("Inicio: "+inicio);
        System.out.println("");
        String anterior=txtPalabra.getText().toString();
        System.out.println("anterior: "+anterior);
        anterior = anterior+datos[i][3].toString();
        txtPalabra.setText(anterior);

        char dato = datos[fila][6].toString().charAt(res);

        //Verifica si es correcta
        if(verificarLetra(s3.getText().toString(),""+dato,0)){
            res=res+1;
            s3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            s3.setClickable(false);
            if(res==5){
                btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                btnNext.setClickable(true);
                fila=fila+1;
            }
        }else{
            txtPalabra.setText(inicio);
            s3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }
    public void s4Respuesta(View view){

        String inicio=txtPalabra.getText().toString();

        String anterior=txtPalabra.getText().toString();

        anterior = anterior+datos[i][4].toString();
        txtPalabra.setText(anterior);
        char dato = datos[fila][6].toString().charAt(res);

        //Verifica si es correcta
        if(verificarLetra(s4.getText().toString(),""+dato,0)){
            res=res+1;
            s4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            s4.setClickable(false);
            if(res==5){
                btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                btnNext.setClickable(true);
                fila=fila+1;
            }
        }else{
            txtPalabra.setText(inicio);
            s4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }

    public void s5Respuesta(View view){

        String inicio=txtPalabra.getText().toString();

        String anterior=txtPalabra.getText().toString();

        anterior = anterior+datos[i][5].toString();
        txtPalabra.setText(anterior);
        char dato = datos[fila][6].toString().charAt(res);

        //Verifica si es correcta
        if(verificarLetra(s5.getText().toString(),""+dato,0)){
            res=res+1;
            s5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            s5.setClickable(false);
            if(res==5){
                btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                btnNext.setClickable(true);
                fila=fila+1;
            }
        }else{
            txtPalabra.setText(inicio);
            s5.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }

    public void setEjercicio(View view){
        if(fila<=9){
            s1.setText(datos[fila][1].toString());
            s2.setText(datos[fila][2].toString());
            s3.setText(datos[fila][3].toString());
            s4.setText(datos[fila][4].toString());
            s5.setText(datos[fila][5].toString());
            i=i+1;
            res=0;
            txtPalabra.setText("");

            btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            s1.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            s2.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            s3.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            s4.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            s5.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));


            s1.setClickable(true);
            s2.setClickable(true);
            s3.setClickable(true);
            s4.setClickable(true);
            s5.setClickable(true);

            btnNext.setClickable(false);
        }else{
            Intent Calificacion = new Intent(this, Calificacion.class);
            Calificacion.putExtra("Categoria","CincoLetras:");
            Calificacion.putExtra("numeroIntentosFallidosAnimales",numIntentosF+"");
            startActivity(Calificacion);
        }

    }

}