package daw01.variables;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("amigo1 va?");
        boolean va1 = entrada.nextBoolean();
        System.out.println("amigo2 va?");
        boolean va2 = entrada.nextBoolean();
        System.out.println("amigo3 va?");
        boolean va3 = entrada.nextBoolean();

        boolean solucio = (va1 && va2) || (va1 && va3) || (va2 && va3);
        System.out.println("Anire a la platja ? " + solucio);

    }
}
