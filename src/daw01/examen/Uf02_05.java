package daw01.examen;

import java.util.Scanner;

public class Uf02_05 {
    static int cifraMenor(int n) {
        for (int i = 9; i < n; --i) {
            if (n > 10)
                return n;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(cifraMenor(66));
    }
}
