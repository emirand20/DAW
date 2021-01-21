package daw01.exClase;

import java.util.Scanner;

public class Asteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas fila quieres?");
        int f = entrada.nextInt();
        for (int i = 0; i <= f; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.println("*");
            }
        }
    }
}
