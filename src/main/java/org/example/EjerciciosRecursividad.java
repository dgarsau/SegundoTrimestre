package org.example;

import java.util.Scanner;

public class EjerciciosRecursividad {

    public static void main(String[] args) {

        int numero = 10;
        int total=conteo(numero);

        System.out.println(total);
    }

    public static int conteo(int n) {
        int total=0;
        if (n > 0) {
            n--;
            total+=conteo(n);
        }
        return total;
    }
}


