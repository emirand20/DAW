package daw01.variables;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Fuma?");
        boolean fuma = entrada.nextBoolean();
        System.out.println("Come sano?");
        boolean menjaSa = entrada.nextBoolean();
        System.out.println("que tipo de ejercicio hace? \"nada\", \"poco\", \"moderado\", \"duroYfeo\" ");
        String exercici = entrada.next();
        System.out.println(!fuma && menjaSa && exercici.equals("moderado") || exercici.equals("duroYfeo"));

    }
}
