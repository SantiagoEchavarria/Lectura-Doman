package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CuatroSilabas2 extends AppCompatActivity {
    Button s1, s2, s3, s4;
    ImageButton btnNext;
    Object[][] datos = new Object[11][6];
    TextView txtPalabra;
    int i=0;
    int numIntentosF;
    int res=0;
    int fila=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro_silabas2);
        //Setear Botones
        s1 = findViewById(R.id.ids9);
        s2 = findViewById(R.id.ids10);
        s3 = findViewById(R.id.ids11);
        s4 = findViewById(R.id.ids12);

        btnNext= findViewById(R.id.btnnext17);

        txtPalabra= findViewById(R.id.txtPalabra6);

        datos[0][0]=0; datos[0][1]="e"; datos[0][2]="n"; datos[0][3]="i"; datos[0][4]="C"; datos[0][5]="Cine";
        datos[1][0]=1; datos[1][1]="i"; datos[1][2]="H"; datos[1][3]="j"; datos[1][4]="a"; datos[1][5]="Hija";
        datos[2][0]=2; datos[2][1]="a"; datos[2][2]="o"; datos[2][3]="j"; datos[2][4]="H"; datos[2][5]="Hoja";
        datos[3][0]=3; datos[3][1]="M"; datos[3][2]="p"; datos[3][3]="a"; datos[3][4]="a"; datos[3][5]="Mapa";
        datos[4][0]=4; datos[4][1]="s"; datos[4][2]="a"; datos[4][3]="i"; datos[4][4]="R"; datos[4][5]="Risa";
        datos[5][0]=5; datos[5][1]="u"; datos[5][2]="A"; datos[5][3]="z"; datos[5][4]="l"; datos[5][5]="Azul";
        datos[6][0]=6; datos[6][1]="a"; datos[6][2]="l"; datos[6][3]="T"; datos[6][4]="e"; datos[6][5]="Tela";
        datos[7][0]=7; datos[7][1]="a"; datos[7][2]="V"; datos[7][3]="d"; datos[7][4]="i"; datos[7][5]="Vida";
        datos[8][0]=9; datos[8][1]="s"; datos[8][2]="a"; datos[8][3]="v"; datos[8][4]="U"; datos[8][5]="Uvas";
        datos[9][0]=10; datos[9][1]="i"; datos[9][2]="a"; datos[9][3]="x"; datos[9][4]="T"; datos[9][5]="Taxi";


        //Setea el ejercicio
        s1.setText(datos[0][1].toString());
        s2.setText(datos[0][2].toString());
        s3.setText(datos[0][3].toString());
        s4.setText(datos[0][4].toString());


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

        char dato = datos[fila][5].toString().charAt(res);


        //Verifica si es correcta
        if(verificarLetra(s1.getText().toString(),"" +dato,0)){
            res=res+1;
            s1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            s1.setClickable(false);
            if(res==4){
                btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                btnNext.setClickable(true);
                fila=fila+1;

                s1.setClickable(false);
                s2.setClickable(false);
                s3.setClickable(false);
                s4.setClickable(false);

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

        char dato = datos[fila][5].toString().charAt(res);

        //Verifica si es correcta
        if(verificarLetra(s2.getText().toString(),""+dato,0)){
            res=res+1;
            s2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            s2.setClickable(false);
            if(res==4){
                btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                btnNext.setClickable(true);
                fila=fila+1;
                s1.setClickable(false);
                s2.setClickable(false);
                s3.setClickable(false);
                s4.setClickable(false);
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

        char dato = datos[fila][5].toString().charAt(res);

        //Verifica si es correcta
        if(verificarLetra(s3.getText().toString(),""+dato,0)){
            res=res+1;
            s3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            s3.setClickable(false);
            if(res==4){
                btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                btnNext.setClickable(true);
                fila=fila+1;
                s1.setClickable(false);
                s2.setClickable(false);
                s3.setClickable(false);
                s4.setClickable(false);
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
        char dato = datos[fila][5].toString().charAt(res);

        //Verifica si es correcta
        if(verificarLetra(s4.getText().toString(),""+dato,0)){
            res=res+1;
            s4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            s4.setClickable(false);
            if(res==4){
                btnNext.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                btnNext.setClickable(true);
                fila=fila+1;
                s1.setClickable(false);
                s2.setClickable(false);
                s3.setClickable(false);
                s4.setClickable(false);
            }
        }else{
            txtPalabra.setText(inicio);
            s4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            numIntentosF=numIntentosF+1;
        }
    }
    public void setEjercicio(View view){
        if(fila<=9){
            s1.setText(datos[fila][1].toString());
            s2.setText(datos[fila][2].toString());
            s3.setText(datos[fila][3].toString());
            s4.setText(datos[fila][4].toString());
            i=i+1;
            res=0;
            txtPalabra.setText("");

            btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            s1.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            s2.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            s3.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            s4.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));

            s1.setClickable(true);
            s2.setClickable(true);
            s3.setClickable(true);
            s4.setClickable(true);

            btnNext.setClickable(false);
        }else{
            Intent Calificacion = new Intent(this, Calificacion.class);
            Calificacion.putExtra("Categoria","CuatroSilabas2:");
            Calificacion.putExtra("numeroIntentosFallidosAnimales",numIntentosF+"");
            startActivity(Calificacion);
        }

    }

}