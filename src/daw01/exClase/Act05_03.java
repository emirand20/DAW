import java.util.Scanner;

public class Act05_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un numero entre -100 y 100!");
        int numero = entrada.nextInt();

        if (numero < -100 || numero > 100) {
            System.out.println("Valor introducido fuera de rango.");
        } else if (numero < 0) {
            System.out.println("El valor es negativo");
        } else if (numero == 0 || numero < 100) {
            System.out.println("El valor es positivo");
        }
    }
}
