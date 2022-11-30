import java.util.Scanner;
/**
 * 2) Demanar a l'usuari un valor entre 5 i 10
 * Si indica un valor més petit que 5 dir-li - "T'has quedat curt"
 * Si indica un valor superior a 10 dir-li - "T'has passat"
 * Si el valor està dins del rang dir-li - "El valor és correcte"
 */
public class Ex02 {
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
