import java.util.Scanner;

public class Act05_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un numero entre 0 y 10!");
        int valor = entrada.nextInt();

        if (valor < 0) {
            System.out.println("Muy pequeño");
        } else if (valor > 10) {
            System.out.println("Muy grande");
        } else {
            System.out.println("El valor es correcto!");
        }
    }
}
