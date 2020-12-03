package daw01.javaDesdecero;

import java.util.Scanner;

public class AdivinaNumFor {
    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 100);
        Scanner entrada = new Scanner(System.in);
        System.out.println(aleatorio);

        int numero = 0;

        int i = 0;
        for (; numero != aleatorio; i++) {
            System.out.println("dime un numero");
            numero = entrada.nextInt();
            if (numero < aleatorio) {
                System.out.println("muy pequeño");
            } else if (numero != aleatorio) {
                System.out.println("Muy mayor");
            }
            System.out.println(i);
        }
        System.out.println("has ganado despues de " + i + " intento" + ((i > 0) ? "" : "s"));

    }
}
