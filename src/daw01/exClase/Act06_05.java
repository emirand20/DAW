package daw01.exClase;

public class Act06_05 {
    public static void main(String[] args) {
        int valores[] = {1, 1, 1, 1, 1, 1, 1, 1, 2};
        String letas[] = {"X", "X"};

        for (int i = 0; i < 8; i++) {
            int a = (int) (Math.random() * valores.length);
            System.out.println(valores[a]);
        }
        for (int i = 0; i < 2; i++) {
            int a = (int) (Math.random() * letas.length);
            System.out.println(letas[a]);
        }
    }
}
