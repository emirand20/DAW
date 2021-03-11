package daw01.funcionesClas;

public class ClaseIIII {
    static String dup(int num, char c) {
        //Retorna el caracter c repetit n vegades
        String s = "";
        for (int i = 0; i < num; i++)
            s += c;
        return s;
    }
//    static int indice (String s, char c){
//        for (int i = 0; i < s.length(); i++)
//            if (s.charAt(i) == c)
//                return i;
//
//    }
    public static void main(String[] args) {
        /*
        System.out.println("dup (10, 'x' = " + dup(10, 'x'));
         */
        System.out.println("indice(\"Hola que tal\" , 'a')");
    }
}
