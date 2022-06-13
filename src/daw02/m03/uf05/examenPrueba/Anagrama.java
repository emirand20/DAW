package m03.uf05.examenPrueba;

import java.util.TreeSet;

public class Anagrama {
    public boolean esAnagrama(String s1, String s2) {
        TreeSet<Character> sC1 = new TreeSet<>();
        TreeSet<Character> sC2 = new TreeSet<>();
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        if (s1.length() != s2.length()) {//podria haver-hi caràcters no alfabètic
            return false;  //per exemple, “abb cc” i “accbb” es consideren anagrames
        }

        for (int i = 0; i < s1.length(); i++) {
            sC1.add(s1.charAt(i));
            sC2.add(s2.charAt(i));  //aquí no tens en compte majúscules i minuscules //Podies haver cridat el mètode anterior
        }
        return sC1.equals(sC2);
    }

    public static void main(String[] args) {
        Anagrama a = new Anagrama();
        System.out.println(a.esAnagrama("Roger", "gerro"));
        System.out.println(a.esAnagrama("amor", "Roma"));
        System.out.println(a.esAnagrama("roca", "carro"));
    }


}
