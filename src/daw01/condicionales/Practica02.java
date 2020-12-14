package daw01.condicionales;

import java.util.Scanner;

public class Practica02 {
    public static void main(String[] args) {
        //1.- Realizar el ejercicio en el que se ingrese 4 notas del alumno,
        // mostrar el promedio de las 4 notas e indicar si está APROBADO caso contrario NO APROBADO.

        int nota1, nota2, nota3, nota4;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que has sacado en el primer examen?");
        nota1 = entrada.nextInt();
        System.out.println("Y en el segundo?");
        nota2 = entrada.nextInt();
        System.out.println("Y en la tercera?");
        nota3 = entrada.nextInt();
        System.out.println("Y en la ultimo?");
        nota4 = entrada.nextInt();

        int media = (nota1+nota2+nota3+nota4)/4;
        if (media>=6);
    }
}
