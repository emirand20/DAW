import java.util.Scanner;

public class Act05_01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que edad tienes?");
        int edad = entrada.nextInt();

        if (edad >= 18){
            System.out.println("Puedes pasar");
        } else if (edad<18){
            System.out.println("No puedes entrar");
        }
    }
}
