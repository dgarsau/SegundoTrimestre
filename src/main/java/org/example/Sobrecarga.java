package org.example;

public class Sobrecarga {

    public static void principal() {
        saludar();
    }

    static String saludar () {
        return "Hola, cómo estás??";
    }

    static String saludar (String nombre) {
        return "Hola " + nombre + ", cómo estás??";
    }

    static String saludar (String nombre, String ciudad) {
        return "Hola" + nombre + ", qué tal por " + ciudad + "??";
    }
}

