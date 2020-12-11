package daw01.bucles;

public class EjercicioEstrella {
    public static void main(String[] args) {
    /*    int num = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            num--;
        }*/
        String[] frutas = {"platano", "manzana", "kiwi", "coco"};
        int cont = 0;
        for (int i = 0; i < frutas.length; i++) {
            if (cont)
                System.out.println("Coco esta situador en el " + ++i + ":");
        }

    }

}


