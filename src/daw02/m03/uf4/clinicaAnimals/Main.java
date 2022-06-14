package m03.uf4.clinicaAnimals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        Clinica clinica = new Clinica();

        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Animales en la clinica.");
            System.out.println("2. Detalles de los animales");
            System.out.println("3. Detalles de los animales especificos.");
            System.out.println("4. Salir");
            System.out.print("\nDime una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
            case 1:
                System.out.println(
                        "\nActualmente: \n 1 Gato \n 1 Serpiente \n 1 Tortuga \n 1 Perro \n 1 Tarantula \n 1 Pez");
                break;
            case 2:
                for (int i = 0; i < clinica.getAnimales().length; i++) {
                    System.out.println(clinica.getAnimales()[i].toString());
                }
                break;
            case 3:
                clinica.getAnimalesDetalles();
                // clinica.getAnimalesDetalles();
                // for (int i = 0; i < clinica.getAnimales().length; i++) {
                // Animal x= clinica.getAnimales()[i];
                // System.out.println("\n" + clinica.getDetalle(x));
                // }
                // for (int i = 0; i < clinica.getAnimales().length; i++) {
                // System.out.println(clinica.getAnimales()7());
                // }
                break;
            case 4:
                opcion = 4;
                break;
            default:
                System.out.println("\nLa opcion no existe vuelva a dijitar");
                break;
            }
            System.out.println();
        } while (opcion != 4);
        sc.close();
        /*
         * hacer un switch y que vea los animales que se tienen en custodia de forma
         * alfabetica los animales luego 2 si quiere ver los animales en custodia con
         * detalles. añadir si la clinica no esta llena y desañadir el animal a su amo
         */
    }
}
