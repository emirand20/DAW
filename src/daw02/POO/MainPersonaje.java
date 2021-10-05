package daw02.POO;

import java.util.Scanner;

public class MainPersonaje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        Personaje[] pers1 = new Personaje[3];

        for (int i = 1; i < 3; i++) {
            pers1[i] = new Personaje() ;
            System.out.println("\n¿Cual es tu nombre?");
            pers1[1].persona = s.next();

            System.out.println("¿Cuales son tus coordenadas?");
            pers1[1].x = s.nextInt();
            pers1[1].y = s.nextInt();

            System.out.println("¿Cuanto dinero llevas?"); 
            pers1[1].dinero = s.nextInt();

            System.out.println("¿Que llevas en la mochila?"); 
            pers1[1].objeto = s.next();

        System.out.println(pers1[i].toString());    

        }
        s.close();
    }

}
