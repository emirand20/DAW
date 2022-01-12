import java.util.Scanner;

public class Act05_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame dos numeros!");
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        x = Math.abs(x);
        y = Math.abs(y);
        if (x > y){
            System.out.println("El numero absoluto de " + x + " es mayor que " + y);
        } else if (x < y){
            System.out.println("El numero absoluto de " + y + " es mayor que " + x);
        }
        entrada.close();
    }
}
