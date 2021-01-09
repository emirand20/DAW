package daw01.exClase;

import java.util.Scanner;

public class Act06_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = (int) (Math.random() * 6) + 1;

        System.out.println("Dime un numero entre 1 y 6");
        int valor = entrada.nextInt();

        if (numero == valor){
            System.out.println("Has acertado, habia pensado " + numero);
        } else {
            System.out.println("No has acertado, yo habia pensado el " + numero + ", " + "y tu has dicho " + valor);
        }
    }
}
