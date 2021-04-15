package daw01.funcionesClas.funcionesProcediments;

import java.util.ArrayList;

public class Act12_01 {
    static int mayor2(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static int mayor3(int a, int b, int c) {
        return mayor2(a, mayor2(b, c));
    }

    static int mayor4(int a, int b, int c, int d) {
        return mayor2(mayor2(a, b), mayor2(c, d));
    }

    static int cuantasVeces(String cad, char c) {

        int suma = 0;
        for (int i = 0; i < cad.length(); i++) {
            cad.charAt(i);
            if (c == cad.charAt(i)) {
                suma++;
            }
        }
        return suma;
    }

    static int cuantosEspacios(String esp, char c) {

        int suma = 0;
        for (int i = 0; i < esp.length(); i++) {
            esp.charAt(i);
            if (c == esp.charAt(i)) {
                suma++;
            }
        }
        return suma;
    }

    static int cuantasVocales(String cad, String sonVocals) {

        int contador = 0;

        for (int i = 0; i < sonVocals.length(); i++) {
            sonVocals.charAt(i);
            for (int j = 0; j < cad.length(); j++) {
                if (sonVocals.charAt(i) == cad.charAt(j)) {
                    contador++;
                }
            }
        }
        return contador;
    }


    public static void main(String[] args) {
        //System.out.println(mayor2(3, 6));
        //System.out.println(mayor3(8, 12, 9));
        //System.out.println(mayor4(7, 6, 9, 8));
        //System.out.println(cuantasVeces("hola casa", ' '));
        //System.out.println(cuantosEspacios("Esto es un ejercicio", ' '));
        System.out.println(cuantasVocales("Mi nombre es javier", "a, e , i , o, u"));
    }


}
