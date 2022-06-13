package m03.uf05.examenPrueba;

import java.util.HashMap;
import java.util.Map;

public class QuantesVegades {
    public Map<Character, Integer> QuantesVegadesSurtCadaLletra(String s) {
        Map<Character, Integer> comptaLletres = new HashMap<>();

        s = s.toUpperCase();
        s = s.replaceAll(" ", "");//hi poden haver caràcters diferents de l’espai
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);//	if(Character.isAlphabetic(c)
            if (comptaLletres.containsKey(c)) {
                comptaLletres.replace(c, comptaLletres.get(c) + 1);
            } else {
                comptaLletres.put(s.charAt(i), 1);
            }
        }

        return comptaLletres;
    }

    public static void main(String[] args) {
        QuantesVegades l = new QuantesVegades();
        System.out.println(l.QuantesVegadesSurtCadaLletra("Bona Prova"));
        System.out.println(l.QuantesVegadesSurtCadaLletra("Hola mon"));
        System.out.println(l.QuantesVegadesSurtCadaLletra("Bona nit"));

    }
}
