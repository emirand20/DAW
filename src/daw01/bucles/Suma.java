package daw01.bucles;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dame tres numeros");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int resultado = (a + b) / c;

        System.out.println("\n" + resultado);
        s.close();
    }
}