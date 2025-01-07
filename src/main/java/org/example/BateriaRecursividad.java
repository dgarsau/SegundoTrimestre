package org.example;

import java.util.Scanner;

public class BateriaRecursividad {

    public static int factorialRecursivo(int numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * factorialRecursivo(numero - 1);
    }

    public int ejercicio0(int eleccion, int numero) {

        Scanner entrada = new Scanner(System.in);

        switch (eleccion) {

            case 0:
                System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
                System.out.println("1 - Dígitos");
                System.out.println("2 - Potencias");
                System.out.println("3 - Del Revés");
                System.out.println("4 - Binario");
                System.out.println("5 - A binario");
                System.out.println("6 - Orden alfabético");
                System.out.println("7 - Mostrar suma");

                eleccion = entrada.nextInt();
                return ejercicio0(eleccion, 0);

            case 1:
                System.out.println("Introduce un número:");
                numero=entrada.nextInt();
                
        }
        return 0;
    }
}

