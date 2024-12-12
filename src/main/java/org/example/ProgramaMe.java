package org.example;

/**
 * CIFRADO EXCEL
 * @author Daniel García Saugar
 * @version 1.0
 */

public class ProgramaMe {

    static java.util.Scanner entrada;

    /**
     * Función principal, llama a casoDePrueba mientras devuelva true.
     * @param args
     */
    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    /**
     * Desde aquí se llaman a las demás funciones
     *
     * @return --devuelve un booleano que depende de la entrada del usuario
     *         --si la entrada es solo un 0, finaliza
     */
    public static boolean casoDePrueba() {

        char[] abecedario= vectorAbecedario();
        String linea = entrada.nextLine();
        if (linea.trim().equals("0")) {
            return false;
        }

        long[] vector = vectorSplit(linea);

        String salida = "";
        String salidainvertida= "";
        String salidacompleta="";

        for (int i = 0; i < vector.length-1; i++) {
            long cociente = vector[i];

            if (cociente==0){
                break;
            }

            while(cociente>26){
                int resto = (int) (cociente%26);
                if(resto==0){
                    resto=26;
                    cociente--;
                }
                cociente=division(cociente);
                salida += abecedario[resto-1];

            }
            salida += abecedario[(int) cociente-1];

            salidainvertida=delReves(salida);
            salida="";
            salidacompleta=salidacompleta.concat(salidainvertida + " ");
        }

        System.out.println(salidacompleta.trim());
        return true;
    }

    /**
     * Esta función convierte la entrada del usuario en un vector de tipo long mediante un
     * split y un bucle for. También controla que la entrada sea del tipo correcto, si no
     * lo es, finaliza el programa.
     *
     * @param cadena
     * @return vectorInt
     */
    public static long[] vectorSplit(String cadena){
        String[] vectorString = cadena.split(" ");
        long[] vectorInt = new long[vectorString.length];

        for (int i = 0; i < vectorString.length; i++) {
            try{
                vectorInt[i]=Long.parseLong(vectorString[i]);
            }catch (NumberFormatException e){
                System.exit(0);
            }
        }

        return vectorInt;
    }

    /**
     * Esto genera un vector de tipo char con las letras del abecedario, usaré su posición
     * para asignar letras dependiendo del resto del número. El tipo char me permite sumar
     * números.
     *
     * @return abecedario
     */
    public static char[] vectorAbecedario(){
        char[] abecedario = new char [26];
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i]= (char) ('A' + i );
        }
        return abecedario;
    }


    /**
     *
     * @param cociente
     * @return cociente
     */
    public static long division(long cociente){
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