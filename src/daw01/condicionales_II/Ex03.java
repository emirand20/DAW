package daw01.condicionales_II;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 10);
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿A que planta desea ir?");
        int planta = entrada.nextInt();

        if (planta == aleatorio) {
            System.out.println("Esta en la " + aleatorio + "planta");
        } else if (planta > 14) {
            System.out.println("Planta desconocida");
        } else if (planta > 7) {
            System.out.println("Zona restringida!");
        } else if (planta >= -4 || planta <= 7) {
        }
        if (aleatorio > -4) {
            System.out.println("Esta subiendo");

        } else if (aleatorio < 7) {
            System.out.println("Esta bajando");
        }

    }
}
