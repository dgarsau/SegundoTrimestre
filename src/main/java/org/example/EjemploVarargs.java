package org.example;

public class EjemploVarargs {

    public static void principal(){

        String notas[][]=datos("Xavi", "Manuel", "Adrián", "Danielle", "Jose");
        Reutilizar.imprimirMatriz(notas);

    }

    public static String[][] datos(String...nombres){

        String notas[][] = new String[nombres.length][2];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Dame la nota para " + nombres[i] + ": ");
            notas[i][0] = nombres[i];
            notas[i][1] = Integer.toString(Reutilizar.introducirInt());
        }

        return notas;
    }

}
