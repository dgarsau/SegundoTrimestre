package org.example;

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

    public static char[] vectorAbecedario(){
        char[] abecedario = new char [26];
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i]= (char) ('A' + i );
        }
        return abecedario;
    }

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