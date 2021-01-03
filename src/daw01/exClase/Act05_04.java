package daw01.exClase;

import java.util.Scanner;

public class Act05_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un numero!");
        int n = entrada.nextInt();

        if (n % 2 == 0){
            System.out.println("El valor es par!");
        } else if (n % 2 == 1){
            System.out.println("El valor es inpar!");
        }
    }
}
