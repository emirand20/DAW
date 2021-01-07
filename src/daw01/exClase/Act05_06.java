package daw01.exClase;

import java.util.Scanner;

public class Act05_06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un numero del 1 al 10!");
        double num = entrada.nextDouble();
        if (num == (double) 1) {
            System.out.println("Introduce una nota entre el 1 y 10, sin decimales");
        } else if (num  > 10) {
            System.out.println("Muy grande");
        } else {
            System.out.println("El valor es correcto!");
            System.out.println(Math.round(num));
        }

    }
}

