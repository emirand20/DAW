package daw01.examen02;

import javax.swing.*;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de filas en vertical: ");
        int vert = sc.nextInt();
        System.out.print("Introduce el número de columnas en horizontal: ");
        int col = sc.nextInt();
        System.out.print("Caracter a utilizar en el dibujo: ");
        String caract = sc.next();

        int cont = 0;

        for (int i = 0; i < col; i++) {
            System.out.print(caract);
        }
        System.out.println();

        for (int i = 0; i < vert; i++) {
            System.out.println(caract);
            cont++;
        }

        for (int i = 0; i < col; i++) {
            System.out.print(caract);
        }
        System.out.println();

        for (int i = 0; i < vert; i++) {
            System.out.println(caract);
            cont++;
        }

        for (int i = 0; i < col; i++) {
            System.out.print(caract);
        }
    }
}