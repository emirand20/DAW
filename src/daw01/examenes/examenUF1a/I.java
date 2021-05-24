package daw01.examenes.examenUF1a;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertical = -1;
        do {
            System.out.print("Número de filas en verticalical (minimo 5, contando primera y ultima): ");
            vertical = sc.nextInt();
        } while (vertical < 5);
        String caracter = "foo";

        do {
            System.out.print("Carácter a utilizar en el dubujo para representa la letra I: ");
            caracter = sc.next();
        } while (caracter.length() > 1);

        for (int i = 0; i < 3; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        for (int i = 0; i < vertical - 2; i++) {
            System.out.println(" " + caracter);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(caracter);
        }

        System.out.println();
    }
}
