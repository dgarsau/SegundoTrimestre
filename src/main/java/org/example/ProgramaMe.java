package org.example;

import java.util.Arrays;

public class ProgramaMe {

    static java.util.Scanner entrada;

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        String linea = entrada.nextLine();
        int[] vector = vectorSplit(linea);
        System.out.println(Arrays.toString(vector));

        if (vector.length == 1 && vector[0] == 0) {
            return false;
        }

        for (int i = 0; i < vector.length; i++) {
            cifradoExcel(vector[i]);
        }

        return true;
    }


    public static int[] vectorSplit(String cadena){
        String[] vectorString = cadena.split(" ");
        int[] vectorInt = new int[vectorString.length];
        for (int i = 0; i < vectorString.length; i++) {
            vectorInt[i]=Integer.parseInt(vectorString[i]);
        }

        return vectorInt;
    }

    public static String cifradoExcel(int dato){
        char[] abecedario = new char[26];
    }
}




