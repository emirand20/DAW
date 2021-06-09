package daw01.recuperacion.Uf1.Uf2.Uf3;

import com.sun.source.tree.BreakTree;

public class Uf02_esVocal {
    public static boolean vocal(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else
            return false;

    }

    public static int multiplos(int v[], int x) {

        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % x == 0)
                return v[i];
            //System.out.println(v[i]);
        }
        return contador++;
    }
//    public static String vocales(char[] v) {
//
//        for (int i = 0; i < v.length ; i++) {
//            if (v[i] == 'a' || v[i] == 'e' || v[i] == 'i' || v[i] == 'o' || v[i] == 'u' )
//                System.out.println(vocal(v[i]));
//        }
//    }

        static boolean totes(String s) {

            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) == 'a' && s.charAt(i) == 'A' && s.charAt(i) == 'E' && s.charAt(i) == 'e' && s.charAt(i) == 'I' && s.charAt(i) == 'i' && s.charAt(i) == 'O' && s.charAt(i) == 'o' && s.charAt(i) == 'U' && s.charAt(i) == 'u')){
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        String[] voc = {"u", "f", "z", "b", "e", "n", "O", "A", "R", "I"};
        int num [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(vocal('9'));
        System.out.println(multiplos(num, 2));
       // System.out.println(vocales().equalsIgnoreCase(voc));
        System.out.println(totes("aAEeIiOoUu"));
    }
}