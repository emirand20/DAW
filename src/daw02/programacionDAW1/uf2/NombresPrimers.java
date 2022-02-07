package programacionDAW1.uf2;

import java.util.Scanner;

public class NombresPrimers {
    /**mientras el resuduo sea true y i sea menor de 2 porque dos ya es primo iteraremos +1 a i para dividirlo
     * y saber di da 1 de residuo.
     * @param n
     * @return
     */
    static boolean esPrimer(long n){
        boolean residu = true;
        long i = 2;
        while((residu)&&(i < n)){ 
            if((n%i)== 0) residu = false;
            else i += 1;
        }
        return residu;
    }
    static void vectorPrimers(int n){}
    static boolean factoriza(long n){
        long numFactor = 0;
        if(n>1){
            int factor = 2;
            n = numFactor;
            System.out.println(n + " = ");
            
        }
        return false;
    }
    /*public static void main(String[] args) {
        //long v[]= vectorPrimers(100000);
        System.out.println("El numero que has introducido es " + esPrimer(54));
        System.out.println(factoriza(95));
    }*/
    public static void main(String[] args) {
        long numeroInicial, numero;
        Scanner teclado = new Scanner(System.in);
        numeroInicial = teclado.nextLong();
        if (numeroInicial > 1) {
            int factor = 2;
            numero = numeroInicial;
            System.out.println(numero + " = ");
            while (numero > factor) {
                if (numero % factor == 0) {
                    numero /= factor;
                    System.out.print(factor + " * ");
                } else {
                    factor++;
                }
            }
            System.out.println(factor);

        }

    }
}
