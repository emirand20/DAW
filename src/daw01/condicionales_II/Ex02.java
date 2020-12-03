package daw01.condicionales_II;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame una letra cualquiera!");
        String letra = entrada.next();
        switch (letra){
            case "A":
                System.out.println("Es la primera letra mayuscula");
                System.out.println("Es la primera letra minuscula");
                break;
            case "a":
                System.out.println();
        }



    }
}
