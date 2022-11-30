
import java.util.Scanner;

public class ExEdad {
    public static void main(String[] args) {
        //Fer un programa en Java per decidir si un grup de 3 persones poden entrar a un espectacle de circ,
        // tenint en compte que només podran entrar si, com a mínim hi ha entre els tres un major d'edat.
        // Demanar les edats als 3 membres del grup i indicar si poden entrar, o no, tots plegats.

        String preguntaEdad = "¿Cuantos años tines?";
        System.out.println(preguntaEdad);
        Scanner entrada = new Scanner(System.in);
        int edad1 = entrada.nextInt();
        System.out.println(preguntaEdad);
        int edad2 = entrada.nextInt();
        System.out.println(preguntaEdad);
        int edad3 = entrada.nextInt();


        if (edad1 >= 18 && edad2 >= 18 || edad3 >= 18 || edad1 >= 18 || edad2 >= 18){
            System.out.println("Podeis entrar");;
        } else{
            System.out.println("no compra");
        }
    }


}

