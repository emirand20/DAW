package daw01.exClase;

import java.util.Scanner;

public class Act05_07 {
    public static void main(String[] args) {

        int[] numeros = new int[2];

        Scanner teclado = new Scanner(System.in);
        int i;
        for (i = 0; i < numeros.length; i++) {
            System.out.printf("Introduzca el número " + i + " de su NIF:" + "\n", i + 1);
            numeros[i] = teclado.nextInt();
        }
        //Te muestra el array que se a escrito
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }
    }
}

