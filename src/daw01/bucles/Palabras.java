package daw01.bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {



    }

    public void recorrerPalabra() {
        // todo lo que sea recorrer implica un for, length nos devuelve un int con valor igual al tamaño de la variable
        String palabra = "murcelago";
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
    }

    public void recorrerPorductos() {
        // Un array es un conjunto de elementos

        Scanner entrada = new Scanner(System.in);

        String productos[] = new String[3];

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Que quieres que te compre?");
            productos[i] = entrada.next();
        }
        int cont = 0;
        for (int i = 0; i < productos.length; i++) {
            System.out.println(++cont + "." + productos[i]);

        }

    }
}
