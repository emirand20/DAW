package programacionDAW1.uf2;
/**
 * @author ------Miranda Balladares, Edward Javier------
 */
public class EXM32104WA{
    // Ejercicio 1
    static boolean noSuman(int a, int b, int c){
        if(a + b == a || a + b == b || a + b == c 
        && a + c == a || a + c == c || a + c == b 
        && b + c == b || b + c == c || b + c == a)
        return false;
        return true;
    }
    // Ejercicio 2
   static int divisible5(int x){
       int contador = 0 ;
       if(x%5 == 0)
       return divisible5(contador);
       if(x%5 == 1)
       return divisible5(contador++);
       return divisible5(contador * 5);
   }
    // Ejercicio 3
   static boolean xifresRepetides(int x){
       String s = Integer.toString(x);
       for (int i = 0; i < s.charAt(i); i++){
           if(s.substring(i).contains("" + s.charAt(i)));
           return true;
       }
       return false;
   }
    // Ejercicio 4
   static String repiteFin(String s, int x){
       String devuelve = " ";
       String sx = Integer.toString(x);
       if(sx.length() > s.length())
       return devuelve;
       else
       for (int i = 0; i < s.length(); i++) {
           for (int j = 0; j < sx.length(); j++) {
               devuelve += s.charAt(j);
           }
       }
       return devuelve;
   }
    // Ejercicio 5
    static int nota(int[] c, int[] r){
        int notaAlumno = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < r.length; j++) {
                if(c[i] == r[j]){
                    notaAlumno += 4;
                }
                // if(r[j] == 0){
                //     notaAlumno = 0;
                // }
                // if(c[j] != r[j]){
                //     notaAlumno = notaAlumno -1;
                // }
                // }
            }
        }return notaAlumno;
    }
    
    public static void main(String[] args) {
        /*System.out.println("Ejercicio  1");
        System.out.println("noSuman(10,5,5) = " + noSuman(10,5,5));
        System.out.println("noSuman(6,5,2)  = " + noSuman(6,5,2));
        System.out.println("noSuman(0,0,5)  = " + noSuman(0,0,5));
        System.out.println("noSuman(5,0,5)  = " + noSuman(5,0,5));
        System.out.println("noSuman(4,9,5)  = " + noSuman(4,9,5));
        System.out.println("noSuman(2,2,3)  = " + noSuman(2,2,3));
        /*System.out.println("\nEjercicio  2");
        System.out.println("divisible5(2500) = " + divisible5(2500));
        System.out.println("divisible5(5)    = " + divisible5(5));
        System.out.println("divisible5(18)   = " + divisible5(18));
        System.out.println("divisible5(40)   = " + divisible5(40));
        System.out.println("divisible5(250)  = " + divisible5(250));
        System.out.println("divisible5(1324) = " + divisible5(1324));
        /*System.out.println("\nEjercicio  3");
        System.out.println("xifresRepetides(1013)    = " + xifresRepetides(1013));
        System.out.println("xifresRepetides(224612)  = " + xifresRepetides(224612));
        System.out.println("xifresRepetides(1689030) = " + xifresRepetides(1689030));
        System.out.println("xifresRepetides(1)       = " + xifresRepetides(1));
        System.out.println("xifresRepetides(11)      = " + xifresRepetides(11));
        System.out.println("xifresRepetides(5655)    = " + xifresRepetides(5655));*/
       /* System.out.println("\nEjercicio  4");
        System.out.println("repiteFin(\"abc\", 3)   = \"" + repiteFin("abc",3) + "\"");
        System.out.println("repiteFin(\"abc\", 4)   = \"" + repiteFin("abc",4) + "\"");
        System.out.println("repiteFin(\"Ricardo\",4)= \"" + repiteFin("Ricardo",4) + "\"");
        System.out.println("repiteFin(\"Mio\", 2)   = \"" + repiteFin("Mio",2) + "\"");
        System.out.println("repiteFin(\"XYZ\", 1)   = \"" + repiteFin("XYZ",1) + "\"");
        System.out.println("repiteFin(\"123\", 0)   = \"" + repiteFin("123",0) + "\"");*/
        System.out.println("\nEjercicio  5");
        int [] ok = {1,3,2,4,4,3,1,2};   int [] r1 = {1,0,2,5,3,2,1,0};
        int [] ok2 = {1,5,3};   int [] r2 = {2,4,5};  int [] r3 = {1,2,3};
        System.out.println("nota({1,3,2,6,4,3,1,2},{1,0,2,5,3,2,1,0}) = " + nota(ok,r1));
        System.out.println("nota({1,5,3},{2,4,5}) = " + nota(ok2,r2));
        System.out.println("nota({1,5,3},{1,2,3}) = " + nota(ok2,r3));
    }
}


