package daw01.javaDesdecero;

import java.util.Scanner;

public class Adivina_numero {
    public static void main(String[] args) {
        //El programa a generar un numero de 0 a 100 y yo he de adivinar cual serà.
        //El metodo random da un numero aleatorio de 0 a 1.
        int aleatorio = (int) (Math.random() * 100);
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while (numero != aleatorio) {

            System.out.println("Introduce un numero!");
            numero = entrada.nextInt();
            intentos++;
            if (aleatorio < numero) {
                System.out.println("Mas bajo");
            } else if (aleatorio > numero) {
                System.out.println("Mas alto");
            }
        }
        System.out.println("Perfecto maquina lo has conseguido en " + intentos + " intentos");


    }
}
