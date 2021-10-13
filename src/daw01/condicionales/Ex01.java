package daw01.condicionales;

import java.util.Scanner;

/**
 * Resolució exercici 1
 * 1) Demanar a l'usuari la seva edat i segons aquesta mostrar-li un misstge que digui:
 * Si té menys de 10 anys - "Ets molt petit"
 * Si té més de 65 anys - "Ets molt gran"
 * Si està entre 10 i 65 anys - "Tens una edat ideal"
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que edad tienes?");
        int edad = entrada.nextInt();

        if (edad < 10) {
            System.out.println("Eres muy pequeño");
        } else if (edad > 65) {
            System.out.println("Eres muy grande");
        } else {
            System.out.println("Tienes una edad ideal");
        }
        entrada.close();
    }
}
