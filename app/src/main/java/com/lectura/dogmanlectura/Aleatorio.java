package com.lectura.dogmanlectura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class Aleatorio extends AppCompatActivity {
    Random random = new Random();
    TextView r1, r2, r3, txt;
    MediaPlayer sonido;
    ImageButton btnNext,imageButton;

    Object[][] datos = new Object[100][10];
    int i=0;
    int aleatorio=0;
    int numeroPalabras=79;



    int numIntentosF=0;
    boolean next=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatorio);
        aleatorio=random.nextInt(numeroPalabras) + 1;
    //Animales1
        datos[0][0]=0; datos[0][1]="Leon"; datos[0][2]="Lima"; datos[0][3]="Loma"; datos[0][4]=2;
        datos[1][0]=1; datos[1][1]="Grasa"; datos[1][2]="Gato"; datos[1][3]="Casa"; datos[1][4]=2;
        datos[2][0]=2; datos[2][1]="Ojo"; datos[2][2]="Oso"; datos[2][3]="Ocho"; datos[2][4]=2;
        datos[3][0]=3; datos[3][1]="Roca"; datos[3][2]="Raton"; datos[3][3]="Rama"; datos[3][4]=2;
        datos[4][0]=4; datos[4][1]="Conejo"; datos[4][2]="Coro"; datos[4][3]="Cabra"; datos[4][4]=1;
        datos[5][0]=5; datos[5][1]="Casa"; datos[5][2]="Cama"; datos[5][3]="Caballo"; datos[5][4]=3;
        datos[6][0]=6; datos[6][1]="Caza"; datos[6][2]="Caja"; datos[6][3]="Camello"; datos[6][4]=3;
        datos[7][0]=7; datos[7][1]="Aguila"; datos[7][2]="Ajo"; datos[7][3]="Aro"; datos[7][4]=1;
        datos[8][0]=8; datos[8][1]="Vela"; datos[8][2]="Vaca"; datos[8][3]="Vino"; datos[8][4]=2;
        datos[9][0]=9; datos[9][1]="Cerdo"; datos[9][2]="Collar"; datos[9][3]="Cena"; datos[9][4]=1;
        //Animales2
        datos[10][0] = 10; datos[10][1] = "Elefante"; datos[10][2] = "Elegante"; datos[10][3] = "Elevar"; datos[10][4] = 1;
        datos[11][0] = 11; datos[11][1] = "Mucho"; datos[11][2] = "Muñeca "; datos[11][3] = "Murcielago"; datos[11][4] = 3;
        datos[12][0] = 12; datos[12][1] = "Casa"; datos[12][2] = "Canguro"; datos[12][3] = "Cama"; datos[12][4] = 2;
        datos[13][0] = 13; datos[13][1] = "Hipopótamo"; datos[13][2] = "Importante"; datos[13][3] = "Hipo"; datos[13][4] = 1;
        datos[14][0] = 14; datos[14][1] = "Jirafa"; datos[14][2] = "Girasol"; datos[14][3] = "Girar"; datos[14][4] = 1;
        datos[15][0] = 15; datos[15][1] = "Chile"; datos[15][2] = "Chico"; datos[15][3] = "Chimpancé"; datos[15][4] = 3;
        datos[16][0] = 16; datos[16][1] = "Pino"; datos[16][2] = "Pingüino"; datos[16][3] = "Cigüeña"; datos[16][4] = 2;
        datos[17][0] = 17; datos[17][1] = "Carro"; datos[17][2] = "Castor"; datos[17][3] = "Camaleón"; datos[17][4] = 3;
        datos[18][0] = 18; datos[18][1] = "Mariposa"; datos[18][2] = "Mazorca"; datos[18][3] = "Mayo"; datos[18][4] = 1;
        datos[19][0] = 19; datos[19][1] = "Molino"; datos[19][2] = "Mosquito"; datos[19][3] = "Moto"; datos[19][4] = 2;


        //Partes casa
        datos[20][0]=20; datos[20][1]="Techo"; datos[20][2]="Termo"; datos[20][3]="Tema"; datos[20][4]=1;
        datos[21][0]=21; datos[21][1]="Papel"; datos[21][2]="Pared"; datos[21][3]="Pastel"; datos[21][4]=2;
        datos[22][0]=22; datos[22][1]="Sucio"; datos[22][2]="Sueño"; datos[22][3]="Suelo"; datos[22][4]=3;
        datos[23][0]=23; datos[23][1]="Barrio"; datos[23][2]="Balcón"; datos[23][3]="Barco"; datos[23][4]=2;
        datos[24][0]=24; datos[24][1]="Ropa"; datos[24][2]="Rosa"; datos[24][3]="Roma"; datos[24][4]=1;
        datos[25][0]=25; datos[25][1]="Muro"; datos[25][2]="Mula"; datos[25][3]="Mudo"; datos[25][4]=1;
        datos[26][0]=26; datos[26][1]="Foco"; datos[26][2]="Coco"; datos[26][3]="Foto"; datos[26][4]=1;
        datos[27][0]=27; datos[27][1]="Caja"; datos[27][2]="Calle"; datos[27][3]="Cama"; datos[27][4]=3;
        datos[28][0]=28; datos[28][1]="Baño"; datos[28][2]="Vaca"; datos[28][3]="banda"; datos[28][4]=1;
        datos[29][0]=29; datos[29][1]="Sismo"; datos[29][2]="Siete"; datos[29][3]="Silla"; datos[29][4]=3;

        //Partes casa 2
        datos[30][0]=30; datos[30][1]="Nevera"; datos[30][2]="Negro"; datos[30][3]="Necio"; datos[30][4]=1;
        datos[31][0]=31; datos[31][1]="Lampara"; datos[31][2]="Lavadora"; datos[31][3]="Larva"; datos[31][4]=2;
        datos[32][0]=32; datos[32][1]="Poceta"; datos[32][2]="Poso"; datos[32][3]="Ponchera"; datos[32][4]=1;
        datos[33][0]=33; datos[33][1]="Terreno"; datos[33][2]="Terremoto"; datos[33][3]="Televisor"; datos[33][4]=3;
        datos[34][0]=34; datos[34][1]="Conejo"; datos[34][2]="Computadora"; datos[34][3]="Comprimir"; datos[34][4]=2;
        datos[35][0]=35; datos[35][1]="Escritorio"; datos[35][2]="Escrito"; datos[35][3]="Escribir"; datos[35][4]=1;
        datos[36][0]=36; datos[36][1]="Comida"; datos[36][2]="Cortina"; datos[36][3]="Correo"; datos[36][4]=2;
        datos[37][0]=37; datos[37][1]="Licencia"; datos[37][2]="Liso"; datos[37][3]="Licuadora"; datos[37][4]=3;
        datos[38][0]=38; datos[38][1]="Palmera"; datos[38][2]="Placa"; datos[38][3]="Plancha "; datos[38][4]=3;
        datos[39][0]=39; datos[39][1]="Chico"; datos[39][2]="Chimenea"; datos[39][3]="Chino"; datos[39][4]=2;

        //Partes Cuerpo
        datos[40][0]=40; datos[40][1]="Nariz"; datos[40][2]="Mano"; datos[40][3]="Mama"; datos[40][4]=2;
        datos[41][0]=41; datos[41][1]="Oso"; datos[41][2]="Oreja"; datos[41][3]="Oro"; datos[41][4]=2;
        datos[42][0]=42; datos[42][1]="Brazo"; datos[42][2]="Vaso"; datos[42][3]="Vaca"; datos[42][4]=1;
        datos[43][0]=43; datos[43][1]="Nariz"; datos[43][2]="Mani"; datos[43][3]="Mazo"; datos[43][4]=1;
        datos[44][0]=44; datos[44][1]="Roca"; datos[44][2]="Oro"; datos[44][3]="Ojo"; datos[44][4]=3;
        datos[45][0]=45; datos[45][1]="Pierna"; datos[45][2]="Oso"; datos[45][3]="Roca"; datos[45][4]=1;
        datos[46][0]=46; datos[46][1]="Menton"; datos[46][2]="Mesa"; datos[46][3]="Melon"; datos[46][4]=1;
        datos[47][0]=47; datos[47][1]="Goma"; datos[47][2]="Lengua"; datos[47][3]="Casa"; datos[47][4]=2;
        datos[48][0]=48; datos[48][1]="Pulgar"; datos[48][2]="Papa"; datos[48][3]="Puma"; datos[48][4]=1;
        datos[49][0]=49; datos[49][1]="Goma"; datos[49][2]="Labios"; datos[49][3]="Casa"; datos[49][4]=2;

        //adjetivos
        datos[50][0]=50; datos[50][1]="Casa azul"; datos[50][2]="Casa grande"; datos[50][3]="Casa roja"; datos[50][4]=2;
        datos[51][0]=51; datos[51][1]="Perro rapido"; datos[51][2]="Perro grande"; datos[51][3]="Perro pequeño"; datos[51][4]=3;
        datos[52][0]=52; datos[52][1]="Carro rápido"; datos[52][2]="Carro lento"; datos[52][3]="Camion lento"; datos[52][4]=1;
        datos[53][0]=53; datos[53][1]="Día soleado"; datos[53][2]="Noche oscura"; datos[53][3]="Dia nublado"; datos[53][4]=1;
        datos[54][0]=54; datos[54][1]="Gato blanco"; datos[54][2]="Gato azul"; datos[54][3]="Gato negro"; datos[54][4]=3;
        datos[55][0]=55; datos[55][1]="Flor negra"; datos[55][2]="Flor hermosa"; datos[55][3]="Arbol grande"; datos[55][4]=2;
        datos[56][0]=56; datos[56][1]="Tren largo"; datos[56][2]="Tren corto"; datos[56][3]="Bus largo"; datos[56][4]=1;
        datos[57][0]=57; datos[57][1]="Rio tranquilo"; datos[57][2]="Mar tranquilo"; datos[57][3]="Rio azul"; datos[57][4]=2;
        datos[58][0]=58; datos[58][1]="Cielo estrellado"; datos[58][2]="Cielo oscuro"; datos[58][3]="Cielo azul"; datos[58][4]=3;
        datos[59][0]=59; datos[59][1]="Llano largo"; datos[59][2]="Montaña seca"; datos[59][3]="Montaña alta"; datos[59][4]=3;

        //verbos 2
        datos[60][0]=60; datos[60][1]="Escribir"; datos[60][2]="Español"; datos[60][3]="España"; datos[60][4]=1;
        datos[61][0]=61; datos[61][1]="Loma"; datos[61][2]="Letra"; datos[61][3]="Leer"; datos[61][4]=3;
        datos[62][0]=62; datos[62][1]="Pelo"; datos[62][2]="Pensar"; datos[62][3]="Peso"; datos[62][4]=2;
        datos[63][0]=63; datos[63][1]="Caminar"; datos[63][2]="Casa"; datos[63][3]="Cama"; datos[63][4]=1;
        datos[64][0]=64; datos[64][1]="Aprendio"; datos[64][2]="Aprende"; datos[64][3]="Aprender"; datos[64][4]=3;
        datos[65][0]=65; datos[65][1]="Casa"; datos[65][2]="Cantar"; datos[65][3]="Camello"; datos[65][4]=2;
        datos[66][0]=66; datos[66][1]="Viajar"; datos[66][2]="Vista"; datos[66][3]="Vaca"; datos[66][4]=1;
        datos[67][0]=67; datos[67][1]="Aguila"; datos[67][2]="Observar"; datos[67][3]="Oso"; datos[67][4]=2;
        datos[68][0]=68; datos[68][1]="Azul"; datos[68][2]="Ayudar"; datos[68][3]="Ayunar"; datos[68][4]=2;
        datos[69][0]=69; datos[69][1]="Español"; datos[69][2]="España"; datos[69][3]="Estudiar"; datos[69][4]=3;

        //sustantivos 1
        datos[70][0]=70; datos[70][1]="Cama"; datos[70][2]="Casa"; datos[70][3]="Coma"; datos[70][4]=2;
        datos[71][0]=71; datos[71][1]="Peso"; datos[71][2]="Pecho"; datos[71][3]="Perro"; datos[71][4]=3;
        datos[72][0]=72; datos[72][1]="Mamá"; datos[72][2]="Mico"; datos[72][3]="Mesa"; datos[72][4]=3;
        datos[73][0]=73; datos[73][1]="Libro"; datos[73][2]="Listo"; datos[73][3]="Lima"; datos[73][4]=1;
        datos[74][0]=74; datos[74][1]="Gasto"; datos[74][2]="Gato"; datos[74][3]="Goma"; datos[74][4]=2;
        datos[75][0]=75; datos[75][1]="Coche"; datos[75][2]="Bus"; datos[75][3]="Tren"; datos[75][4]=1;
        datos[76][0]=76; datos[76][1]="Flor"; datos[76][2]="Arbol"; datos[76][3]="Fama"; datos[76][4]=1;
        datos[77][0]=77; datos[77][1]="Noche"; datos[77][2]="Niño"; datos[77][3]="Negro"; datos[77][4]=2;
        datos[78][0]=78; datos[78][1]="Eso"; datos[78][2]="Escuela"; datos[78][3]="Entonces"; datos[78][4]=2;
        datos[79][0]=79; datos[79][1]="Ciudad"; datos[79][2]="Cuido"; datos[79][3]="Cerdo"; datos[79][4]=1;

        //Enlaza respuestas texto y boton
        r1= (TextView) findViewById(R.id.txtLeon10);
        r2=(TextView) findViewById(R.id.txtLima10);
        r3=(TextView) findViewById(R.id.txtLoma10);
        txt=(TextView) findViewById(R.id.txt11);
        btnNext= (ImageButton) findViewById(R.id.btnnext11);

        btnNext.setVisibility(View.INVISIBLE);
        btnNext.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        imageButton = findViewById(R.id.imageButton11);
/*
        //Iniciar
        imageButton.setImageResource(R.drawable.lion);

        r1.setText("");
        r2.setText("Iniciar");
        r3.setText("");
*/
    inicializarRespuestas();

        sonido = MediaPlayer.create(this,R.raw.lion);
    }



    public void setRespuestas(View view){
        aleatorio=random.nextInt(numeroPalabras) + 1;
        int i2=i;


        if(i<=9){
            i=aleatorio;
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
            //Animales2
            else if((int)datos[i][0]==10){
                imageButton.setImageResource(R.drawable.elefanteacuarela);
            }
            else if((int)datos[i][0]==11){
                imageButton.setImageResource(R.drawable.murcielagoacuarela);
            }else if((int)datos[i][0]==12){
                imageButton.setImageResource(R.drawable.canguroacuarela);
            }else if((int)datos[i][0]==13){
                imageButton.setImageResource(R.drawable.hipopotamoacuarela);
            }else if((int)datos[i][0]==14){
                imageButton.setImageResource(R.drawable.jirafaacuarela);
            }else if((int)datos[i][0]==15){
                imageButton.setImageResource(R.drawable.chimpanceacuarela);
            }else if((int)datos[i][0]==16){
                imageButton.setImageResource(R.drawable.pinguinoacuarela);
            }else if((int)datos[i][0]==17){
                imageButton.setImageResource(R.drawable.camaleonacuarela);
            }else if((int)datos[i][0]==18){
                imageButton.setImageResource(R.drawable.mariposaacuarela);
            }else if((int)datos[i][0]==19){
                imageButton.setImageResource(R.drawable.mosquitoacuarela);
            }
            //Partes casa
            else if((int)datos[i][0]==20){
                imageButton.setImageResource(R.drawable.techoacuarela);
            }
            else if((int)datos[i][0]==21){
                imageButton.setImageResource(R.drawable.muroacuarela);
            }else if((int)datos[i][0]==22){
                imageButton.setImageResource(R.drawable.pisoacuarela);
            }else if((int)datos[i][0]==23){
                imageButton.setImageResource(R.drawable.balconacuarela);
            }else if((int)datos[i][0]==24){
                imageButton.setImageResource(R.drawable.ropaacuarela);
            }else if((int)datos[i][0]==25){
                imageButton.setImageResource(R.drawable.muroacuarela);
            }else if((int)datos[i][0]==26){
                imageButton.setImageResource(R.drawable.focoacuarela);
            }else if((int)datos[i][0]==27){
                imageButton.setImageResource(R.drawable.camaacuarela);
            }else if((int)datos[i][0]==28){
                imageButton.setImageResource(R.drawable.banoacuarela);
            }else if((int)datos[i][0]==29){
                imageButton.setImageResource(R.drawable.sillaacuarela);
            }
            //Partes casa 2
            else if((int)datos[i][0]==30){
                imageButton.setImageResource(R.drawable.neveraacuarela);
            }else if((int)datos[i][0]==31){
                imageButton.setImageResource(R.drawable.lavadoraacuarela);
            }else if((int)datos[i][0]==32){
                imageButton.setImageResource(R.drawable.tvacuarela);
            }else if((int)datos[i][0]==33){
                imageButton.setImageResource(R.drawable.tvacuarela);
            }else if((int)datos[i][0]==34){
                imageButton.setImageResource(R.drawable.computadoraacuarela);
            }else if((int)datos[i][0]==35){
                imageButton.setImageResource(R.drawable.escritorioacuarela);
            }else if((int)datos[i][0]==36){
                imageButton.setImageResource(R.drawable.cortinasacuarela);
            }else if((int)datos[i][0]==37){
                imageButton.setImageResource(R.drawable.licuadoraacuarela);
            }else if((int)datos[i][0]==38){
                imageButton.setImageResource(R.drawable.lavamanosacuarela);
            }else if((int)datos[i][0]==39){
                imageButton.setImageResource(R.drawable.chimeneaacuarela);
            }
           //Partes cuerpo
            else if((int)datos[i][0]==40){
                imageButton.setImageResource(R.drawable.manoacuarela);
            }else if((int)datos[i][0]==41){
                imageButton.setImageResource(R.drawable.orejaacuarela);
            }else if((int)datos[i][0]==42){
                imageButton.setImageResource(R.drawable.brazoacuarela);
            }else if((int)datos[i][0]==43){
                imageButton.setImageResource(R.drawable.narizacuarela);
            }else if((int)datos[i][0]==44){
                imageButton.setImageResource(R.drawable.ojoacuarela);
            }else if((int)datos[i][0]==45){
                imageButton.setImageResource(R.drawable.piernaacuarela);
            }else if((int)datos[i][0]==46){
                imageButton.setImageResource(R.drawable.caraacuarela);
            }else if((int)datos[i][0]==47){
                imageButton.setImageResource(R.drawable.barbaacuarela);
            }else if((int)datos[i][0]==48){
                imageButton.setImageResource(R.drawable.pulgaracuarela);
            }else if((int)datos[i][0]==49){
                imageButton.setImageResource(R.drawable.labiosacuarela);
            }

            //adjetivos

            else if((int)datos[i][0]==50){
                imageButton.setImageResource(R.drawable.casagrandeacuarela);
            }else if((int)datos[i][0]==51){
                imageButton.setImageResource(R.drawable.perropequenoacurela);
            }else if((int)datos[i][0]==52){
                imageButton.setImageResource(R.drawable.carrorapidoacuarela);
            }else if((int)datos[i][0]==53){
                imageButton.setImageResource(R.drawable.diasoleadoacuarela);
            }else if((int)datos[i][0]==54){
                imageButton.setImageResource(R.drawable.gatonegroacuarela);
            }else if((int)datos[i][0]==55){
                imageButton.setImageResource(R.drawable.floracuarela);
            }else if((int)datos[i][0]==56){
                imageButton.setImageResource(R.drawable.trenlargoacuarela);
            }else if((int)datos[i][0]==57){
                imageButton.setImageResource(R.drawable.maracuarela);
            }else if((int)datos[i][0]==58){
                imageButton.setImageResource(R.drawable.cieloacuarela);
            }else if((int)datos[i][0]==59){
                imageButton.setImageResource(R.drawable.montanaaltaacuarela);

                //verbos2
            } if((int)datos[i][0]==60){
                imageButton.setImageResource(R.drawable.escribiracuarela);
            }else if((int)datos[i][0]==61){
                imageButton.setImageResource(R.drawable.leeracuarela);
            }else if((int)datos[i][0]==62){
                imageButton.setImageResource(R.drawable.correracuarela);
            }else if((int)datos[i][0]==63){
                imageButton.setImageResource(R.drawable.caminaracuarela);
            }else if((int)datos[i][0]==64){
                imageButton.setImageResource(R.drawable.aprenderacuarela);
            }else if((int)datos[i][0]==65){
                imageButton.setImageResource(R.drawable.cantaracuarela);
            }else if((int)datos[i][0]==66){
                imageButton.setImageResource(R.drawable.viajaracuarela);
            }else if((int)datos[i][0]==67){
                imageButton.setImageResource(R.drawable.observaracuarela);
            }else if((int)datos[i][0]==68){
                imageButton.setImageResource(R.drawable.ayudaracuarela);
            }else if((int)datos[i][0]==69){
                imageButton.setImageResource(R.drawable.estudiaracuarela);
            }

            //sustantivos 1
            else if((int)datos[i][0]==70){
                imageButton.setImageResource(R.drawable.casagrandeacuarela);
            }else if((int)datos[i][0]==71){
                imageButton.setImageResource(R.drawable.perroacuarela);
            }else if((int)datos[i][0]==72){
                imageButton.setImageResource(R.drawable.escritorioacuarela);
            }else if((int)datos[i][0]==73){
                imageButton.setImageResource(R.drawable.libroacuarela);
            }else if((int)datos[i][0]==74){
                imageButton.setImageResource(R.drawable.gatonegroacuarela);
            }else if((int)datos[i][0]==75){
                imageButton.setImageResource(R.drawable.carroacuarela);
            }else if((int)datos[i][0]==76){
                imageButton.setImageResource(R.drawable.floracuarela);
            }else if((int)datos[i][0]==77){
                imageButton.setImageResource(R.drawable.ninoacuarela);
            }else if((int)datos[i][0]==78){
                imageButton.setImageResource(R.drawable.escuelaacuarela);
            }else if((int)datos[i][0]==79){
                imageButton.setImageResource(R.drawable.ciudadacuarela);
            }
            //falta adjetivos 2


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
            i=i2;
        }else{
            Intent Calificacion = new Intent(this, Calificacion.class);
            Calificacion.putExtra("numeroIntentosFallidosAnimales",numIntentosF+"");
            startActivity(Calificacion);

        }
    }



    public void respuesta1(View view) {

        if ((int) datos[aleatorio][4] == 1) {
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

        if((int) datos[aleatorio][4]==2) {
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
        if((int) datos[aleatorio][4]==3) {
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






    public void inicializarRespuestas() {
        aleatorio=random.nextInt(numeroPalabras) + 1;
        int i2=i;


        if(i<=9){
            i=aleatorio;
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
            //Animales2
            else if((int)datos[i][0]==10){
                imageButton.setImageResource(R.drawable.elefanteacuarela);
            }
            else if((int)datos[i][0]==11){
                imageButton.setImageResource(R.drawable.murcielagoacuarela);
            }else if((int)datos[i][0]==12){
                imageButton.setImageResource(R.drawable.canguroacuarela);
            }else if((int)datos[i][0]==13){
                imageButton.setImageResource(R.drawable.hipopotamoacuarela);
            }else if((int)datos[i][0]==14){
                imageButton.setImageResource(R.drawable.jirafaacuarela);
            }else if((int)datos[i][0]==15){
                imageButton.setImageResource(R.drawable.chimpanceacuarela);
            }else if((int)datos[i][0]==16){
                imageButton.setImageResource(R.drawable.pinguinoacuarela);
            }else if((int)datos[i][0]==17){
                imageButton.setImageResource(R.drawable.camaleonacuarela);
            }else if((int)datos[i][0]==18){
                imageButton.setImageResource(R.drawable.mariposaacuarela);
            }else if((int)datos[i][0]==19){
                imageButton.setImageResource(R.drawable.mosquitoacuarela);
            }
            //Partes casa
            else if((int)datos[i][0]==20){
                imageButton.setImageResource(R.drawable.techoacuarela);
            }
            else if((int)datos[i][0]==21){
                imageButton.setImageResource(R.drawable.muroacuarela);
            }else if((int)datos[i][0]==22){
                imageButton.setImageResource(R.drawable.pisoacuarela);
            }else if((int)datos[i][0]==23){
                imageButton.setImageResource(R.drawable.balconacuarela);
            }else if((int)datos[i][0]==24){
                imageButton.setImageResource(R.drawable.ropaacuarela);
            }else if((int)datos[i][0]==25){
                imageButton.setImageResource(R.drawable.muroacuarela);
            }else if((int)datos[i][0]==26){
                imageButton.setImageResource(R.drawable.focoacuarela);
            }else if((int)datos[i][0]==27){
                imageButton.setImageResource(R.drawable.camaacuarela);
            }else if((int)datos[i][0]==28){
                imageButton.setImageResource(R.drawable.banoacuarela);
            }else if((int)datos[i][0]==29){
                imageButton.setImageResource(R.drawable.sillaacuarela);
            }
            //Partes casa 2
            else if((int)datos[i][0]==30){
                imageButton.setImageResource(R.drawable.neveraacuarela);
            }else if((int)datos[i][0]==31){
                imageButton.setImageResource(R.drawable.lavadoraacuarela);
            }else if((int)datos[i][0]==32){
                imageButton.setImageResource(R.drawable.tvacuarela);
            }else if((int)datos[i][0]==33){
                imageButton.setImageResource(R.drawable.tvacuarela);
            }else if((int)datos[i][0]==34){
                imageButton.setImageResource(R.drawable.computadoraacuarela);
            }else if((int)datos[i][0]==35){
                imageButton.setImageResource(R.drawable.escritorioacuarela);
            }else if((int)datos[i][0]==36){
                imageButton.setImageResource(R.drawable.cortinasacuarela);
            }else if((int)datos[i][0]==37){
                imageButton.setImageResource(R.drawable.licuadoraacuarela);
            }else if((int)datos[i][0]==38){
                imageButton.setImageResource(R.drawable.lavamanosacuarela);
            }else if((int)datos[i][0]==39){
                imageButton.setImageResource(R.drawable.chimeneaacuarela);
            }
            //Partes cuerpo
            else if((int)datos[i][0]==40){
                imageButton.setImageResource(R.drawable.manoacuarela);
            }else if((int)datos[i][0]==41){
                imageButton.setImageResource(R.drawable.orejaacuarela);
            }else if((int)datos[i][0]==42){
                imageButton.setImageResource(R.drawable.brazoacuarela);
            }else if((int)datos[i][0]==43){
                imageButton.setImageResource(R.drawable.narizacuarela);
            }else if((int)datos[i][0]==44){
                imageButton.setImageResource(R.drawable.ojoacuarela);
            }else if((int)datos[i][0]==45){
                imageButton.setImageResource(R.drawable.piernaacuarela);
            }else if((int)datos[i][0]==46){
                imageButton.setImageResource(R.drawable.caraacuarela);
            }else if((int)datos[i][0]==47){
                imageButton.setImageResource(R.drawable.barbaacuarela);
            }else if((int)datos[i][0]==48){
                imageButton.setImageResource(R.drawable.pulgaracuarela);
            }else if((int)datos[i][0]==49){
                imageButton.setImageResource(R.drawable.labiosacuarela);
            }

            //adjetivos

            else if((int)datos[i][0]==50){
                imageButton.setImageResource(R.drawable.casagrandeacuarela);
            }else if((int)datos[i][0]==51){
                imageButton.setImageResource(R.drawable.perropequenoacurela);
            }else if((int)datos[i][0]==52){
                imageButton.setImageResource(R.drawable.carrorapidoacuarela);
            }else if((int)datos[i][0]==53){
                imageButton.setImageResource(R.drawable.diasoleadoacuarela);
            }else if((int)datos[i][0]==54){
                imageButton.setImageResource(R.drawable.gatonegroacuarela);
            }else if((int)datos[i][0]==55){
                imageButton.setImageResource(R.drawable.floracuarela);
            }else if((int)datos[i][0]==56){
                imageButton.setImageResource(R.drawable.trenlargoacuarela);
            }else if((int)datos[i][0]==57){
                imageButton.setImageResource(R.drawable.maracuarela);
            }else if((int)datos[i][0]==58){
                imageButton.setImageResource(R.drawable.cieloacuarela);
            }else if((int)datos[i][0]==59){
                imageButton.setImageResource(R.drawable.montanaaltaacuarela);

                //verbos2
            } if((int)datos[i][0]==60){
                imageButton.setImageResource(R.drawable.escribiracuarela);
            }else if((int)datos[i][0]==61){
                imageButton.setImageResource(R.drawable.leeracuarela);
            }else if((int)datos[i][0]==62){
                imageButton.setImageResource(R.drawable.correracuarela);
            }else if((int)datos[i][0]==63){
                imageButton.setImageResource(R.drawable.caminaracuarela);
            }else if((int)datos[i][0]==64){
                imageButton.setImageResource(R.drawable.aprenderacuarela);
            }else if((int)datos[i][0]==65){
                imageButton.setImageResource(R.drawable.cantaracuarela);
            }else if((int)datos[i][0]==66){
                imageButton.setImageResource(R.drawable.viajaracuarela);
            }else if((int)datos[i][0]==67){
                imageButton.setImageResource(R.drawable.observaracuarela);
            }else if((int)datos[i][0]==68){
                imageButton.setImageResource(R.drawable.ayudaracuarela);
            }else if((int)datos[i][0]==69){
                imageButton.setImageResource(R.drawable.estudiaracuarela);
            }

            //sustantivos 1
            else if((int)datos[i][0]==70){
                imageButton.setImageResource(R.drawable.casagrandeacuarela);
            }else if((int)datos[i][0]==71){
                imageButton.setImageResource(R.drawable.perroacuarela);
            }else if((int)datos[i][0]==72){
                imageButton.setImageResource(R.drawable.escritorioacuarela);
            }else if((int)datos[i][0]==73){
                imageButton.setImageResource(R.drawable.libroacuarela);
            }else if((int)datos[i][0]==74){
                imageButton.setImageResource(R.drawable.gatonegroacuarela);
            }else if((int)datos[i][0]==75){
                imageButton.setImageResource(R.drawable.carroacuarela);
            }else if((int)datos[i][0]==76){
                imageButton.setImageResource(R.drawable.floracuarela);
            }else if((int)datos[i][0]==77){
                imageButton.setImageResource(R.drawable.ninoacuarela);
            }else if((int)datos[i][0]==78){
                imageButton.setImageResource(R.drawable.escuelaacuarela);
            }else if((int)datos[i][0]==79){
                imageButton.setImageResource(R.drawable.ciudadacuarela);
            }
            //falta adjetivos 2


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
            i=i2;
        }else{
            Intent Calificacion = new Intent(this, Calificacion.class);
            Calificacion.putExtra("numeroIntentosFallidosAnimales",numIntentosF+"");
            startActivity(Calificacion);

        }
    }
}