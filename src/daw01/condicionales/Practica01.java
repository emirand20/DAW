
import java.util.Scanner;

public class Practica01 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer numero!");
        num1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numero");
        num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else {
            System.out.println("El numero es: " + num2);
        }

    }
}
