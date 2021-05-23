package daw01.examenUF1a;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas en vertical (minimo 5, contando primera y ultima): ");
        int vert = sc.nextInt();
        System.out.print("Carácter a utilizar en el dubujo para representa la letra I: ");
        String carct = sc.next();

        int cont = 0;
        while(vert < 5){
            System.out.println("Valor demasiado bajo, el valor minimo es 5");
            System.out.println("Carácter a utilizar en el dubujo para representa la letra I:" );
        }
    }
}
