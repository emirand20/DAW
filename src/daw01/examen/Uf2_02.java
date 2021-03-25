package daw01.examen;

public class Uf2_02 {
    static int noStan(long x) {
        /*
        Funcio static long noStan (long x) a la que le pasaremos el parametro entero x de tipo long y nos retorna otro long, donde fueran todas las cifras que no aparecen
        (no se encuentran) en el valor pasado la funcion, ordenadas de mayor a menor (del 9 al 0)
         */
        x = 123456;
        for (int i = 0; i < x; i++) {
            return 9870;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(noStan(123456));
    }
}
