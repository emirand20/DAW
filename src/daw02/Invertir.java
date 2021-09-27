package daw02;

import java.util.Scanner;

public class Invertir {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Escribe una cifra de cuatro numeros");

        int cifra = num.nextInt();
        int resto, invertido = 0;
        while (cifra > 0){
            resto = cifra % 10;
            invertido = invertido * 10 + resto;
            cifra /= 10;
        }
        System.out.println("Numero invertido: " + (-invertido));
    }
}
