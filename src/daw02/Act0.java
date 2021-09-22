package daw02;

import java.sql.ClientInfoStatus;
//import java.net.BindException;
import java.util.Scanner;

public class Act0 {
    
    public static String Bienvenida(String ciclo, int curso, String nombre){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que ciclo haces?");
        ciclo = sc.next();
        
        System.out.println("¿Que curso haces?");
        curso = sc.nextInt();

        sc.nextLine();

        System.out.println("¿Cual es tu nombre?");
        nombre = sc.next();

        System.out.println("Bienvenido a " + ciclo + curso + "! " + nombre);

        return " ";

    }

    public static void Resultados(int a, int b, boolean c, boolean d, Double e){
        a = 125 % 10;
        b = 15 / 10;
        c = (a > b) || (a < b);
        d = (a < 100) && (a > 100);
        e = 0.1 + 0.1 + 0.1;
    }
    public static void main(String[] args) {
        System.out.println(Bienvenida(" ", 2, " "));
        
    }
}
