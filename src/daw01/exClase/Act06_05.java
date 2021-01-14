package daw01.exClase;

import java.util.Random;

public class Act06_05 {
    public static void main(String[] args) {
        Random rd = new Random();
        int valores[] = {1, 1, 1, 1, 1, 1, 1, 1, 2};
        String letas[] = {"X", "X"};

        for (int i = 0; i < 8; i++) {
            int a = (int) (Math.random() * valores.length);

            for (int j = 0; j < 2; j++) {
                int b = (int) (Math.random() * letas.length);

            }
        }
    }
}
