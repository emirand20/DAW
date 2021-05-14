package daw01.examenUF1a;

public class PiensaTres {
    public static void main(String[] args) {
        int max = 300;
        int min = 100;
        int range = max - min + 1;

        //for (int i = 0; i < 3; i++) {
            int rand = (int)(Math.random() * range) + min * 3;

            System.out.println("Los valores son v1 = " + rand + "  v2 = " + rand + "  Y v3 = " + rand); ;
        }
    }


