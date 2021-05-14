package daw01.bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaArrayList {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = entrada.nextLine();
        ArrayList vocales = new ArrayList();
        ArrayList consonantes = new ArrayList();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                vocales.add(frase.charAt(i));
            } else {
                if (frase.charAt(i) != ' ') {
                    consonantes.add(frase.charAt(i));
                }
            }
        }

        for (int i = 0; i < vocales.size(); i++) {
            System.out.println(vocales.get(i));
        }
        System.out.println();
        for (int i = 0; i < consonantes.size(); i++) {
            System.out.println(consonantes.get(i));
        }
    }
}
