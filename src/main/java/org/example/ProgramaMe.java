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

        char[] abecedario= vectorAbecedario();
        String linea = entrada.nextLine();
        int[] vector = vectorSplit(linea);

        String salida = "";
        String salidainvertida= "";
        String salidacompleta="";

        if (vector.length == 1 && vector[0] == 0) {
            return false;
        } else if (vector[vector.length-1]!=0) {
            return true;
        }

        for (int i = 0; i < vector.length-1; i++) {
            int cociente = vector[i];

            while(cociente>26){
                salida += abecedario[cociente%26-1];
                cociente=division(cociente);
            }
            salida += abecedario[cociente-1];

            salidainvertida=delReves(salida);
            salidacompleta=salidacompleta.concat(salidainvertida + " ");
            salida="";
        }

        System.out.println(salidacompleta);

        return true;
    }


    public static String formatoEntrada(String cadena){
        
        return;
    }


    public static int[] vectorSplit(String cadena){
        String[] vectorString = cadena.split(" ");
        int[] vectorInt = new int[vectorString.length];
        for (int i = 0; i < vectorString.length; i++) {
            vectorInt[i]=Integer.parseInt(vectorString[i]);
        }

        return vectorInt;
    }

    public static char[] vectorAbecedario(){
        char[] abecedario = new char [26];
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i]= (char) ('A' + i );
        }

        return abecedario;
    }

    public static int division(int cociente){
        cociente=cociente/26;
        return cociente;
    }

    public static String delReves(String palabra){
        String[] vectorpalabra = palabra.split("");
        String palabrainvertida = "";

        for (int i = vectorpalabra.length-1; i >= 0; i--) {
            palabrainvertida=palabrainvertida.concat(vectorpalabra[i]);
        }

        return palabrainvertida;
    }



}




