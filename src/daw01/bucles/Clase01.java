package daw01.bucles;

import java.util.Scanner;

public class Clase01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int sumaNotas = 0;
        double mediana = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la nota del alumno del alumno:");
            sumaNotas += entrada.nextInt();
        }
    }
}
