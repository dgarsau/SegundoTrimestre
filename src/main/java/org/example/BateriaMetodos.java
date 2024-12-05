package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BateriaMetodos {

    static Scanner entrada;

    //EJERCICIO 1

    public void ejercicio1() {

        int numero_usuario = introducirNumero();
        int numerocubo = alcubo(numero_usuario);
        System.out.println(numerocubo);

    }

    public static int introducirNumero() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = entrada.nextInt();

        return numero;

    }

    public static int alcubo(int numero_usuario) {

        int numero_alcubo = numero_usuario * numero_usuario * numero_usuario;
        return numero_alcubo;

    }


    //EJERCICIO 2

    public void ejercicio2() {
        mostrarMenu();
        int opcion_usuario = Reutilizar.introducirInt();
        opcionElegida(opcion_usuario);
    }

    public static void mostrarMenu() {
        System.out.println("BIENVENIDO");
        System.out.println("Elige tu opción:");
        System.out.println("1 - Primera Opcion");
        System.out.println("2 - Segunda Opción");
        System.out.println("Otro - Salir");
    }

    public static void opcionElegida(int opcion_usuario) {
        switch (opcion_usuario) {
            case 1:
                System.out.println("Has elegido la primera opción");
                break;
            case 2:
                System.out.println("Has elegido la segunda opción");
                break;
            default:
                System.exit(0);
        }
    }

    //EJERCICIO 3

    public void ejercicio3() {

        System.out.println("Introduce una palabra");
        String cadena = Reutilizar.introducirString();
        String cadena_mayus = pasarMayusculas(cadena);
        int vocales = numVocales(cadena_mayus);
        System.out.println("La palabra tiene " + vocales + " vocales.");

    }

    public static String pasarMayusculas(String cadena) {
        cadena = cadena.toUpperCase();
        System.out.println(cadena);
        return cadena;
    }

    public static int numVocales(String cadena) {
        int vocales = 0;
        char aux;

        for (int i = 0; i < cadena.length(); i++) {
            aux = cadena.charAt(i);
            if (aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U') {
                vocales++;
            }
        }
        return vocales;
    }

    //EJERCICIO 4
    public void ejercicio4() {

    }

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {
        float dato = entrada.nextFloat();
        if (dato == -1) {
            return false;
        } else {
            float[] semana = rellenarDatos(dato);
            float[] semanaclone = semana.clone();

            comprobarMenor(semanaclone);

            return true;
        }
    }

    public static float[] rellenarDatos(float dato) {
        float datos[] = new float[6];

        datos[0] = dato;

        for (int i = 1; i < datos.length; i++) {
            datos[i] = entrada.nextFloat();
        }

        System.out.println("---");

        return datos;
    }

    public static float comprobarMenor(float[] vector) {
        Arrays.sort(vector);
        float menor = vector[0];
        System.out.println(menor);
    }

}
