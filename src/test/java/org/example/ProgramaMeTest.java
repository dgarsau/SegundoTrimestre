package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaMeTest {


    @Test
    void vectorSplit() {

        long[] salida1 = {0};
        long[] salida2 = {1, 2, 3, 4, 5, 0};
        long[] salida3 = new long[0];

        assertAll(
                () -> assertArrayEquals(salida1,ProgramaMe.vectorSplit("0")),
                () -> assertArrayEquals(salida2,ProgramaMe.vectorSplit("1 2 3 4 5 0")),
                () -> assertArrayEquals(salida3,ProgramaMe.vectorSplit("hola"))
        );
    }

    /* Aquí no hace falta probar con letras porque la entrada está controlada en mi programa por otro método que se ejecuta antes, no pruebo entre 0 porque el programa no llega a la división si es 0*/
    @Test
    void division() {

        assertAll(
                () -> assertEquals(27, ProgramaMe.division(702)),
                () -> assertEquals(3, ProgramaMe.division(100)),
                () -> assertEquals(0, ProgramaMe.division(25))

        );
    }

    /* Como estamos operando con Strings, le dará la vuelta en todos los casos*/
    @Test
    void delReves() {

        assertAll(
                () -> assertEquals("edcba", ProgramaMe.delReves("abcde")),
                () -> assertEquals("AAAAA", ProgramaMe.delReves("AAAAA")),
                () -> assertEquals("54321", ProgramaMe.delReves("12345"))
        );
    }
}
