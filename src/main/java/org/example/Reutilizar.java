package org.example;

import java.util.Scanner;

public class Reutilizar {

    public static int introducirInt(){

        Scanner entrada = new Scanner(System.in);
        int dato = entrada.nextInt();
        return dato;

    }

    public static String introducirString(){

        Scanner entrada = new Scanner(System.in);
        String dato = entrada.next();
        return dato;

    }

    public static void imprimirMatriz(String matriz[][]){
        for (String[] filas: matriz){
            for (String columnas: filas){
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

    }

}
