/*
El programa lee un texto por teclado y lo guarda en un String. 
A continuación mostrará el número de palabras que contiene.

 */
package numeropalabras;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumeroPalabras {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa la frase");
        frase = entrada.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(frase);
        System.out.println("Numero de palabras " + stringTokenizer.countTokens());
    }

}
