import java.util.Scanner;

public class Act05_07 {
    public static void main(String[] args) {
//        Leer una cadena con la clase Scanner que será nuestro NIF,  sin espacios en los 8 caracteres de nº i letra, de forma que será 9 caracteres exactamente, si la longitud de la cadena no es de 9 caracteres, indica:
//        “NIF incorrecto, has introducido X caracteres”, si la longitud de NIF es correcta, entonces el programa comprobará que los 8 primeros caracteres son números,
//        si no lo son, el mensaje será: NIF incorrecto. Error específicamente los 8 dígitos de la parte numérica”.
//        También se pedirá que se compruebe si el último carácter es letra mayúscula o minúscula, válida.
//        Si la letra introducida es incorrecta, el programa dará el mensaje de error: NIF incorrecto. Letra no válida.

//        int[] numeros = new int[8];
//        String[] letra = new String[0];
//        Scanner teclado = new Scanner(System.in);
//        int i;
//        for (i = 0; i < numeros.length; i++) {
//            System.out.printf("Introduzca el número " + i + " de su NIF:" + "\n", i + 1);
//            numeros[i] = teclado.nextInt();
//        }
//        for (int j = 0; j < letra.length; j++) {
//            System.out.println("Introduzca la letra: ");
//            letra[j] = teclado.next();
//        }
//
//        //Te muestra el array que se a escrito
//        for (i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu DNI");
        String dni = sc.next();

        //1. ver que son numeros

        String aux = "";

        for (int i = 0; i < dni.length() - 1; i++) {
            aux += dni.charAt(i);
        }
    }

}

