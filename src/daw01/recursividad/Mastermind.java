package daw01.recursividad;

import java.util.Scanner;

public class Mastermind {
//    static String letrasBase []() {
//
//    }

    public static void main(String[] args) {


        System.out.println("PROGRAMA MASTERMIND DE LETRAS. HAS DE ENCERTAR LA COMBINACIÓN QUE PENSARE!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de letras para elegir (2-15): ");
        int respuesta = sc.nextInt();
        System.out.println("Introduce el numero de letras para jugar (1-15): ");
        int respuesta2 = sc.nextInt();
        System.out.println("Quieres que haya letras repetidas en la comibinacion que pensaras? (S/N) ");
        String respuesta3 = sc.next();

        if (respuesta3.equals("S")) {
            System.out.println("Habran letas repetidas en la combinación que has de encertar");
        } else
            System.out.println("No habran letras repetidas en la combinación que has de encertar");
        System.out.println("Numero maximo de jugadas antes de dar por finalizada la partida ");
        int respuesta4 = sc.nextInt();
        System.out.println("Introduce un total de " + respuesta2 + " letras entre las que se indican a continuación");

    }


}
