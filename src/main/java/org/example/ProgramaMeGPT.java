package org.example;

import java.util.Scanner;

public class ProgramaMeGPT {

    static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {
        long[] vector = vectorSplit(entrada.nextLine());

        // Si el único número ingresado es 0, termina el programa
        if (vector.length == 1 && vector[0] == 0) {
            return false;
        }

        // Usamos un StringBuilder para construir la salida final
        StringBuilder salidacompleta = new StringBuilder();

        // Recorremos el vector de números y los convertimos en columnas
        for (int i = 0; i < vector.length - 1; i++) {
            long numeroColumna = vector[i];
            if (numeroColumna == 0) {
                break;
            }

            // Convertimos el número de columna a letras
            String columna = obtenerColumna(numeroColumna);
            salidacompleta.append(columna).append(" ");
        }

        // Eliminar el último espacio y mostrar el resultado
        System.out.println(salidacompleta.toString().trim());
        return true;
    }

    // Función que convierte una cadena de texto con números separados por espacio a un vector de números
    public static long[] vectorSplit(String cadena) {
        String[] vectorString = cadena.split(" ");
        long[] vectorInt = new long[vectorString.length];

        for (int i = 0; i < vectorString.length; i++) {
            try {
                vectorInt[i] = Long.parseLong(vectorString[i]);
            } catch (NumberFormatException e) {
                System.exit(0); // Si hay un error en el formato, terminamos el programa
            }
        }

        return vectorInt;
    }

    // Función que convierte un número de columna a su representación en letras (como en Excel)
    public static String obtenerColumna(long numero) {
        StringBuilder columna = new StringBuilder();
        while (numero > 0) {
            numero--; // Ajuste para convertir a un sistema basado en 1 (A=1, Z=26)
            columna.insert(0, (char) ('A' + (numero % 26))); // Calculamos la letra y la agregamos al principio
            numero /= 26; // Pasamos a la siguiente "ciclo de columna"
        }
        return columna.toString();
    }
}