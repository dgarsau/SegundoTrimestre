package org.example;

/**
 * CIFRADO EXCEL
 * @author Daniel García Saugar
 * @version 1.0
 */

public class ProgramaMe {

    static java.util.Scanner entrada;

    /**
     * Función main, llama a casoDePrueba mientras devuelva true.
     * @param args
     */
    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    /**
     * Este es el método que llama a los demás, es la función principal del código.
     *
     * @return devuelve un booleano que depende de la entrada del usuario si la entrada es solo un 0, finaliza.
     */
    public static boolean casoDePrueba() {

        char[] abecedario= vectorAbecedario();
        String linea = entrada.nextLine();

        long[] vector = vectorSplit(linea);

        if(vector.length==0 || (vector.length==1 && vector[0]==0)){
            return false;
        }

        String salida = "";
        String salidainvertida= "";
        String salidacompleta="";

        for (int i = 0; i < vector.length-1; i++) {
            long cociente = vector[i];

            if (cociente<=0){
                return false;
            }

            while(cociente>26){
                int resto = (int) (cociente%26);
                if(resto==0){
                    resto=26;
                    cociente--; //Esto es necesario ya que en todas las divisiones se redondea hacia abajo menos en este caso que no redondea.
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
     * Este método convierte la entrada del usuario en un vector de tipo long mediante un split y un bucle for. También controla que la entrada sea del tipo correcto, si no lo es, finaliza el programa devolviendo un vector sin tamaño.
     *
     * @param cadena
     * @return vectorInt
     */
    public static long[] vectorSplit(String cadena){
        String[] vectorString = cadena.split(" ");
        long[] vectorLong = new long[vectorString.length];

        for (int i = 0; i < vectorString.length; i++) {
            try{
                vectorLong[i]=Long.parseLong(vectorString[i]);
            }catch (NumberFormatException e){
                vectorLong = new long[0]; //devuelvo un vector sin tamaño para salir del programa en casoDePrueba
                return vectorLong;
            }
        }

        return vectorLong;
    }

    /**
     * Esto genera un vector de tipo char con las letras del abecedario, usaré su posición para asignar letras dependiendo del resto del número. El tipo char me permite sumar números.
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
     * En esta función se divide el número recogido entre 26.
     *
     * @param cociente
     * @return cociente
     */
    public static long division(long cociente){
        cociente=cociente/26;
        return cociente;
    }

    /**
     * En esta función le doy la vuelta a una variable de tipo string convertiendola en un array con un split y recorriéndola.
     *
     * @param palabra
     * @return
     */
    public static String delReves(String palabra){
        String[] vectorpalabra = palabra.split("");
        String palabrainvertida = "";

        for (int i = vectorpalabra.length-1; i >= 0; i--) {
            palabrainvertida=palabrainvertida.concat(vectorpalabra[i]);
        }

        return palabrainvertida;
    }

}


/* Se entrega el enlace de GitHub un informe de prácticas (pruebas de JUnit aquí), el javadoc exportado en html (.zip) y el tutorial hablando*/