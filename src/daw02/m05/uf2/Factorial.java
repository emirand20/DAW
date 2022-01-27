package m05.uf2;

import java.util.Scanner;

public class Factorial {
    public static double factorial (double number) {

        if (number == 0) {
            return 1;
        }
        else {
            double resultat = number * factorial(number - 1);
            return resultat;
        }
    }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            System.out.print("Introdueix un nombre: ");
            Scanner sc = new Scanner(System.in);
            
            double p = sc.nextDouble();
            
            System.out.print("El seu factorial és: " + factorial(p));
            
            sc.close();
}
}
