public class Bucles {
    public static void main(String[] args) {
        /* Un bucle se utiliza para recorrer.
         Un bucle funciona hasta que se rompe la condicion
        Un bucle puede tener un iterador */

        // 1.
        boolean condicion = true;
        int i = 0;
        while (condicion) {
            System.out.println(i);
            i++;
        }

        // 2.
        for (int x = 0; condicion; x++) {
            System.out.println(x);
        }
    }
}
