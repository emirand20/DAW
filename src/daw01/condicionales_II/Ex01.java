package daw01.condicionales_II;

import java.util.Scanner;

public class    Ex01 {

    public static void main(String[] args) {
        //Haber tonto, recuerda, se declara uma variable y luego se utiliza
        int descuento = 0;
        int total = 500;
        int valorFinal;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Que edad tiene el niño?");
        int edad = entrada.nextInt();

        if (edad >= 0 && edad <= 3) {
            descuento = 10;
        } else if (edad == 4 || edad == 5 || edad == 7) {
            descuento = 15;
        } else if (edad == 6) {
            descuento = 20;
        }
        //SI ESTO DE ABAJO LO MUEVES ARRIBA NO FUNCIONA, PORQUE DESCUENTO NUNCA SE CAMBIA
        valorFinal = total * descuento / 100;

        if (descuento == 0){
            System.out.println("No tiene descuento");
        }else {
            System.out.println("Su niño al tener " + edad + " años, recibirá un descuento de " + valorFinal + " euros");
        }



    }
}