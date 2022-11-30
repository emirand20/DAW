
import java.util.Scanner;

/*
    - Los programas tienen que ser cortos, claros y eficientes
 */
public class IfElse {

    public static void main(String[] args) {
        String preguntaEdad = "cuantos años tienes";
        System.out.println(preguntaEdad);
        // Esto lo que hace es leer el teclado
        // su nombre es "entrada"
        Scanner entrada = new Scanner(System.in);
        // la variable edat recibe lo que esta escrito por teclado
        // es nextInt porque edat es un Int
        int edat = entrada.nextInt();
        // 1.
       if (edat >= 18) {
            System.out.println("Sí compra");
        } else {
            System.out.println("no Compra");
        }
        // 2. Operador ternario
        //System.out.println(edat >= 18 ? "Sí compra" : "no compra");


    }
}
