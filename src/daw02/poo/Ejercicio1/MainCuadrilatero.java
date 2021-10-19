package poo.Ejercicio1;

import java.util.Scanner;

public class MainCuadrilatero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Cuadrilatero c1;
        float lado1, lado2;

        System.out.println("Dime lado1: ");
        lado1 = s.nextInt();
        System.out.println("Dime lado2: ");
        lado2 = s.nextInt();

        //Es un cuadrado
        if (lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
        }else{
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro es; " + c1.getPerimetro());
        System.out.println("El area es: " + c1.getArea());

        s.close();
    }
}
