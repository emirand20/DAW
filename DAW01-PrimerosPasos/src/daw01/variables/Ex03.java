package daw01.variables;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Que valor tiene ell tabaco?");
        int valorTabaco = entrada.nextInt();
        System.out.println("Tu amigo1 deja de fumar?");
        boolean amigo1 = entrada.nextBoolean();
        System.out.println("Tu amigo2 deja de fumar?");
        boolean amigo2= entrada.nextBoolean();
        System.out.println("Tu pareja deja de fumar?");
        boolean pareja = entrada.nextBoolean();
        System.out.println("Que sueldo ganas?");
        int sueldo = entrada.nextInt();

        boolean dejoDefumar = valorTabaco >= 5 || amigo1 == true || amigo2 == true || pareja == true || sueldo < 1500;
        System.out.println(dejoDefumar);

    }
}
