import java.util.Random;

public class Act06_05 {
    public static void main(String[] args) {
        int num = 1 + (int) (Math.random() * 10);

        if (num < 7) {
            System.out.println(1);
        } else if (num == 8 || num == 9) {
            System.out.println("X");
        } else {
            System.out.println(2);
        }
    }
}


