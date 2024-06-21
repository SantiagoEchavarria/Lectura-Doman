package com.lectura.dogmanlectura;

import android.content.Context;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero {
    public void createFile(Context context, String fileName, String codigo, String nombre) {
        File file = new File(context.getFilesDir(), fileName);
        boolean fileCreated = false;

        try {
            fileCreated = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write(codigo + "\n" +nombre );

            fileWriter.close();
            if(fileCreated) {
                System.out.println("=== El archivo se creo correctamente ===");
            } else {
                System.out.println("=== El archivo ya existe ===");
            }
        } catch (IOException e) {
            System.out.println("=== Excepcion al crear el archivo " + e);
        }
    }

    public boolean existeFile(Context context, String fileName) {
        File file = new File(context.getFilesDir(), fileName);
        return file.exists();
    }

    public Integer obtenerNota(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (lineNumber == 3) {
                    try {
                        return Integer.parseInt(line);
                    } catch (NumberFormatException e) {
                        System.out.println("=== La tercera línea no es un entero válido ===");
                        return null;
                    }
                }
            }
            System.out.println("=== El archivo no tiene al menos tres líneas ===");
        } catch (IOException e) {
            System.out.println("=== Ocurrió un error al leer el archivo ===");
            e.printStackTrace();
        }
        return null;
    }

    //este metodo lee el archivo, pide como parametro el nombre del archivo que se va a leer
    public String readFile(Context context, String fileName) {
        System.out.println("=== Leyendo el archivo " + fileName + " ===");
        File file = new File(context.getFilesDir(), fileName);
        //File file = new File(fileName);
        String data = "no existe ";
        String anterior = "";
        try {
            Scanner sc = new Scanner(file);
            //hasNextLine()es un metodo de la libreria scanner, recorre y lee la linea de un archivo y
            //devuelve un boolean dependiendo si tiene o no elementos
            while (sc.hasNextLine()) {
                data = sc.nextLine();

                anterior = anterior + "\n" + data;

                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" === Hubo un error al abrir el archivo " + e);
        }

        return anterior;
    }


    public void deleteFile(String codigo) {
        System.out.println("=== Borrando el archivo " + codigo + " ===");
        File file = new File(codigo);
        if (file.delete()) {
            System.out.println("=== El archivo se borro correctamente ===");
        } else {
            System.out.println("=== No se pudo borrar el archivo ===");
        }
    }/*pide lo mismo crear, ya que se va a crear un archivo
    primero elimina el archivo seleccionado y luego se crea un nuevo archivo con el mismo nobre
    */


    public void actualizar(Context context, String fileName,String actividad, String calificacion) {
        this.deleteFile(fileName);
        this.createFile(context, fileName, actividad, calificacion);
    }
}
