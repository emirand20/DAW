package daw01.exameneUF1b;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Intoduce el Nif del primer candidato/a: ");
        String can1 = entrada.next();
        System.out.printf("Intoduce el Nif del segun candidato/a: ");
        String can2 = entrada.next();
        int cont = 0;

        for (int i = 0; i < can1.length(); i++) {
            for (int j = 0; j < can2.length(); j++) {
                if (can1.charAt(i) == can2.charAt(j)) {
                    cont++;
                    System.out.println("La compatibilidad entre los NIF introducidos es de " + cont);
                }

            }
        }
    }
}