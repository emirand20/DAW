package daw01.exameneUF1b;

import java.util.Locale;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que color eliges, entre estos cuatro?: azul, rojo, amarillo o verde");
        String color = sc.next().toLowerCase(Locale.ROOT);
        //int cont = 0;
        switch (color) {
            case "azul":
                System.out.println("El color en inglés se escribe blue");
                break;
            case "rojo":
                System.out.println("El color en inglés se escribe red");
                break;
            case "amarillo":
                System.out.println("El color en inglés se escribe yellow");
                break;
            case "verde":
                System.out.println("El color en inglés se escribe green");
                break;
            default:
                System.out.println("No conozco ese color");
        }
    }
}