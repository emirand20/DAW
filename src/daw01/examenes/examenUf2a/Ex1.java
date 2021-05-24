package daw01.examenes.examenUf2a;

import java.util.ArrayList;

import daw01.examenes.examenUF1a.I;

public class Ex1 {

    // private static int sumaCifras(int x) {
    // String numCadena = Integer.toString(x);
    // int total = 0;
    // for (int i = 0; i < numCadena.length(); i++) {
    // total += Integer.parseInt(numCadena.charAt(i) + "");
    // }
    // return total;
    // }

    private static int sumaCifras(int x) {
        if (x < 10) {
            return x;
        } else {
            return x % 10 + sumaCifras(x / 10);
        }
        // return x < 10 ? x : x % 10 + sumaCifrasRecursidivad(x / 10);
    }

    private static  ArrayList<Integer> sumanIgualCifras(int[] v, int x) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if (sumaCifras(v[i]) == x) {
                // System.out.println(v[i]);
                numeros.add(v[i]);
            }
        }
        int[] num = new int[numeros.size()];
        // num = numeros.toArray(num);

        // System.out.println(numeros);

        return numeros;
    }

    public static void main(String[] args) {
        // System.out.println(sumaCifras(12345));
        int[] array = { 9, 10, -64, 245, 1054, 73, -10225, 54, 322, 19, 475, -23, -37 };
        System.out.println(sumanIgualCifras(array, 10));

    }
}