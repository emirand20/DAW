package daw01.examenUF1a;

import java.util.ArrayList;
import java.util.Scanner;

public class VocalesEnFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase y te dire cuantas vocales contiene");
        String vocfrase = sc.next();
        ArrayList vocales = new ArrayList();

        for (int i = 0; i < vocfrase.length(); i++) {
            System.out.print(vocfrase.charAt(i));

        }




//        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
//
//        for (int i = 0; i < voc.length; i++) {
//            if (voc.equals("a")) contA++;
//            if (voc.equals("e")) contE++;
//            if (voc.equals("i")) contI++;
//            if (voc.equals("o")) contO++;
//            if (voc.equals("u")) contU++;
//        }


    }
}