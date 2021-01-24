package daw01.exClase;

public class Act07_04 {
    public static void main(String[] args) {
        for (int i = 200; i > 48; i--) {
            if (i % 2 == 0)
                System.out.print(String.format("%3d, ", i));
        }
    }
}
