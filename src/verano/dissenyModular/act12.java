package verano.dissenyModular;

public class act12 {
    static int major2(int a, int b) {
        if (a > b) return a;
        return b;
    }

    static int major3(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        }
        if (a < b && b > c)
            return b;
        else
            return c;
    }

    static int major4(int a, int b, int c, int d) {

        int x = major2(a, b);
        int k = major2(c, d);

        if (x > k) {
            return x;
        }
        return k;
    }

    static int cuantasVeces(String cad, char c) {

        int suma = 0;
        for (int i = 0; i < cad.length(); i++) {
            cad.charAt(i);
            if (c == cad.charAt(i)) {
                suma++;
            }
        }
        return suma;
    }

    static int cuantosEspacios(String esp, char c) {

        int suma = 0;
        for (int i = 0; i < esp.length(); i++) {
            esp.charAt(i);
            if (c == esp.charAt(i)) {
                suma++;
            }
        }
        return suma;
    }

    static int cuantasVocales(String cad, String sonVocals) {

        int contador = 0;

        for (int i = 0; i < sonVocals.length(); i++) {
            sonVocals.charAt(i);
            for (int j = 0; j < cad.length(); j++) {
                if (sonVocals.charAt(i) == cad.charAt(j)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    static String separa(String cad, String separador) {

        int contador = 0;
        for (int i = 0; i < cad.length(); i++) {
            System.out.print(cad.charAt(i));
            contador++;
            if (contador++ > 0) {
                System.out.print(separador);
            }
        }
        return " ";
    }

    static boolean hiHaBruixa(String cad) {
        boolean busca = false;
        for (int i = 0; i < cad.length() && !busca; i++) {
            int letraSiguiente = ++i;
            // volvemos a dejar el iterador como estaba
            --i;
            // si la posición es igual a length --
            if (letraSiguiente == cad.length() ) {
                letraSiguiente--;
            }
            if (cad.charAt(i) == cad.charAt(letraSiguiente)) {
                busca = true;
            }

        }

        return busca;

        // return cad.contains("))")||cad.contains("==")||cad.contains("((");
    }

    //}


    public static void main(String[] args) {
/*      System.out.println(major2(9,4));
        System.out.println(major3(2,4,8));
        System.out.println(major4(4,7,9,5));
        System.out.println(cuantasVeces("casa casa d cc cc c", 'c'));
        System.out.println(cuantosEspacios("hola mundo   ", ' '));
        System.out.println(cuantasVocales("buenos dias", "aeiou"));
        System.out.println(separa("hola", "-")); */
        System.out.println(hiHaBruixa(".33"));

    }

}
