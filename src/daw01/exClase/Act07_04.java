package daw01.exClase;

public class Act07_04 {
    public static void main(String[] args) {
        for (int i = 99; i > 10; i--) {
            if (i % 2 == 0)
                System.out.print(String.format("%3d, ", i));
        }
    }
}
