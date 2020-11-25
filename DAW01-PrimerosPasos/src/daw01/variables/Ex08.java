package daw01.variables;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Que temperatura esta el agua?");
        int tAigua = entrada.nextInt();
        System.out.println("Y que temperatura ambiente hace");
        int tAire = entrada.nextInt();
        System.out.println("Se metera uno de mis tres amigos al agua?");
        boolean fica1 = entrada.nextBoolean();
        boolean fica2 = entrada.nextBoolean();
        boolean fica3 = entrada.nextBoolean();

        boolean tira = tAigua >= 18 && tAigua <= 25 && tAire >= 25 && fica1  || fica2 || fica3;
        System.out.println("Me metere al agua?" + tira);




    }
}
