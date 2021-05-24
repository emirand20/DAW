package daw01.examenes.examenUf2a;

import java.util.Enumeration;

public class Ex1 {
    static int sumaCifras (int x){
        x = ' ';
        String numCadena = Integer.toString(x);

        for (int i = 0; i < numCadena.length(); i++) {
            numCadena.charAt(i++);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumaCifras(6546852));

    }
}