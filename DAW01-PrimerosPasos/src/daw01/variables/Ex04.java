package daw01.variables;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Maria no viene?");
        boolean estaMaria = entrada.nextBoolean();
        System.out.println("Està en joan resfredat?");
        boolean joanResfredat = entrada.nextBoolean();
        System.out.println("Cuan hi ha d'alçada?");
        float alçada = entrada.nextFloat();

        boolean saltara = !estaMaria && !joanResfredat && alçada < 5;
        System.out.println(saltara);


        


    }
}
