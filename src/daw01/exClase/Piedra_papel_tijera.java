package daw01.exClase;

import java.util.Scanner;

/**
 * Fer un programa per jugar a "pedra", "paper", "tisores"
 * Demanarà als dos usuaris el que trien i mostrarà qui ha guanyat.
 * Se suposa que un usuari no veu el que tria l'altre.
 */
public class Piedra_papel_tijera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escoge piedra papel o tijera!");
        String usuario1 = entrada.next();
        System.out.println("Escoge piedra papel o tijera!");
        String usuario2 = entrada.next();

        if (!usuario1.equals("tijera") || !usuario1.equals("papel") || !usuario1.equals("piedra") || !usuario2.equals("tijera") || !usuario2.equals("papel") || !usuario2.equals("piedra")) {
            System.out.println("error");
        } else {
            if (usuario1.equals("piedra") && usuario2.equals("tijera")) {
                System.out.println("Has ganado usuario1!!");
            } else if (usuario1.equals("tijera") && usuario2.equals("papel")) {
                System.out.println("Has ganado usuario1!!");
            } else if (usuario1.equals("papel") && usuario2.equals("piedra")) {
                System.out.println("Has ganado usuario1!");
            } else if (usuario2.equals("piedra") && usuario1.equals("tijera")) {
                System.out.println("Has ganado usuario2!!");
            } else if (usuario2.equals("tijera") && usuario1.equals("papel")) {
                System.out.println("Has ganado usuario2!!");
            } else if (usuario2.equals("papel") && usuario1.equals("piedra")) {
                System.out.println("Has ganado usuario2!");
            } else {
                System.out.println("Empate!!");
            }
        }


    }
}
