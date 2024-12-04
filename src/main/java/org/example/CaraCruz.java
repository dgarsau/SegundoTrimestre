package org.example;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class CaraCruz {

    public static void caraCruz(){

        mostrarOpciones();
        String opcion_usuario=recogerOpcion();
        String opcion_sorteo=sorteo();
        comprobarResultado(opcion_usuario,opcion_sorteo);

    }

    public static void mostrarOpciones(){

        System.out.println("BIENVENIDO");
        System.out.println("Elige tu opción:");
        System.out.println("C - cara");
        System.out.println("X - cruz");

    }

    public static String recogerOpcion(){

        Scanner entrada = new Scanner(System.in);
        String opcion=entrada.next();
        return opcion;

    }

    public static String sorteo(){

        Random random = new Random();

        String opciones[] = {"C","X"};
        String sorteo = opciones[random.nextInt(2)];

        return sorteo;

    }

    public static void comprobarResultado(String opcion, String sorteo){

        if(opcion.equals(sorteo)){
            System.out.println("Has ganado! Ha salido: " + sorteo);
        }else{
            System.out.println("Has perdido! Ha salido: " + sorteo);
        }

    }

}

