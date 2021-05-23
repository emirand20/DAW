package daw01.examenUF1a;

public class PiensaTres {
    public static void main(String[] args) {
        int max = 300;
        int min = 100;
        int range = max - min + 1;

        for (int i = 0; i < 1; i++) {
            int rand = (int) (Math.random() * range) + min;
            int rand2 = (int) (Math.random() * range) + min;
            int rand3 = (int) (Math.random() * range) + min;

            System.out.println("Los valores son v1 = " + rand + "  v2 = " + rand2 + "  Y v3 = " + rand3);

            if (rand>rand2 && rand>rand3){
                System.out.print("El mayor es = " + rand);
            }if (rand2>rand && rand2>rand3){
                System.out.print("El mayor es = " + rand2);
            }else
                System.out.print("El mayor es = " + rand3);

            if (rand<rand2 && rand<rand3){
                System.out.println("\nEl manor es = " + rand);
            }if (rand2<rand && rand2<rand3){
                System.out.println("\nEl manor es = " + rand2);
            }else
                System.out.println("\nEl manor es = " + rand3);
        }

    }
}