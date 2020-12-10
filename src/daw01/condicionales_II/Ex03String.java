package daw01.condicionales_II;

import java.util.Scanner;

public class Ex03String {
    public static void main(String[] args) {
        String[] pisos = {"S1", "S2", "S3", "S4", "PB", "P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9"};

        int aleatorio = (int) (Math.random() * 12);
        Scanner entrada = new Scanner(System.in);

        String ubiPiso = "";
        do {
            ubiPiso = pisos[aleatorio];
        } while (ubiPiso.equals("P8") || ubiPiso.equals("P9"));

        System.out.println("El ascensor esta en la planta: " + ubiPiso);

        System.out.println("A que planta quiere ir?");
        String plantaNueva = entrada.next();

        boolean busca = false;
        for (int i = 0; i < pisos.length && !busca; i++) {
            if (pisos[i].equals(plantaNueva)) {
                busca = true;
            }

        }

        if (busca) {
            if (plantaNueva.equals(ubiPiso)) {
                System.out.println("Ya esta ahi");
            } else if (plantaNueva.equals("P8") || plantaNueva.equals("P9")) {
                System.out.println("Planta restringida");
            } else {
                int numPlantaNueva = 0;
                int numUbi = 0;
                for (int i = 0; i < pisos.length; i++) {
                    if (plantaNueva.equals(pisos[i])) {
                        numPlantaNueva = i;
                    }
                    if (ubiPiso.equals(pisos[i])) {
                        numUbi = i;
                    }
                }
                if (numPlantaNueva < numUbi) {
                    System.out.println("Ascensor bajando a la planta " + plantaNueva);
                } else {
                    System.out.println("Ascensor subiendo a la planta " + plantaNueva);
                }
            }
        } else {
            System.out.println("Su planta no existe");
        }


    }
}
