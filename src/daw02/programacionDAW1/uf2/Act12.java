package programacionDAW1.uf2;
import java.util.Random;

public class Act12 {
    //1
    static int mayor2(int a, int b) {
    if (a > b) return a;
    return b;
}       
    //2
    static int mayor3(int a, int b, int c) {return mayor2(a, mayor2(b, c));}       
    //3
    static int mayor4(int a, int b, int c, int d) {return mayor2(mayor2(a, b), mayor2(c, d));}
    //4
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
    //5
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
    //6
    static int cuantasVocales(String cad, String sonVocals) {
        int contador = 0;
        for (int i = 0; i < sonVocals.length(); i++) {
            sonVocals.charAt(i);
            for (int j = 0; j < cad.length(); j++) {
                if (sonVocals.charAt(i)==cad.charAt(j)) {
                    contador++;
                }
            }
        }
        return contador;
    }     
    //7
    static String separa (String cad, String separador){
        String palabra = "";
         for (int i = 0; i < cad.length(); i++) {
             palabra += cad.charAt(i);
             for (int j = 0; j < separador.length(); j++) {
                 palabra += separador.charAt(j);
             }
         }
       return palabra;
    }
    //8
    static boolean hiHaBruixa(String cad){
        return cad.contains("=()=");
    }
    //9
    static String explanada(int n){
        char caract[] = {'{', '}', '='};
        String r = "";
        for (int i = 0; i < n; i++) {
            r += caract[(int)(Math.random() * 3)];           
        }
        return r;
    }
    //10
    static boolean explanadaBruixa(int n){
        return hiHaBruixa(explanada(n));
    }
    //11
    /*static boolean quantesBruixes(String cad){
        return
    }*/
    //15
    static int max(int v[]){
        int max = 0;
        for (int j = 0; j < v.length; j++) {
            if(v[j]> max)
            max = v[j];
        }
        return max;     
    }
    //16
    static double max(double v[]){
        double max = 0.0;
        for (int j = 0; j < v.length; j++) {
            if(v[j]> max)
            max = v[j];
        }
        return max; 
    }
    //17
    static int min(int v[]){
        int minimo = v[0];
        for (int i = 0; i < v.length; i++) {
            if(v[i]< minimo){
                minimo = v[i];
            }
        }return minimo;
    }
    //18
    static int suma(int v[]){
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }return sum;
    }
    //19
    static double mitja(int v[]){
        int mitad = 0;
        for (int i = 0; i < v.length; i++) {
            mitad += v[i];
        }return mitad/v.length;
    }
    //21
    static int[] gira_vector(int v[]){
        int s;
        for (int i = 0, j = v.length-1; i < v.length/2; i++, j--) {
            s = v[i]; v[i] = v[j]; v[j]=s;
        }
        return v;
    }
    //22
    static int[] suma_vectors(int v1[], int v2[]){
        int v[] = new int[v2.length > v1.length ? v2.length : v1.length];
        for (int i = 0; i < v.length; i++) {
            v[i] += v2[i];
        }return v;
    }
    //23
    static int[] crea_vector(int min, int max, int num_valors){
        int valors[] = new int [num_valors];
        int sc = 0;
        if(max<min)
        sc = max;
        max = min;
        min = sc;
        for (int i = 0; i < valors.length; i++) {
            sc = (int) (Math.random() * (max - min) + min);
        }
        return valors;
    }
    //24
    static int posicion(int v[], int x){
        int pos = -1;
        for (int i = 0; i < v.length; i++) {
         if(v[i] == x)pos = i;   
        }return pos;
    }
    //25
    static int quants(int v[], int x){
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if(v[i]==x) cont++;
        } return cont;
    }
    //26
    static long[] vec_primers(int num_primers){
        long v[] = new long [num_primers];
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if(v[i] % i == 0) v[cont++] = num_primers;
        }return v;
    }
    //27 
    static void inserta(int v[], int x, int p){
        int val = x;
        int num;
        for (int i = 0; i < v.length; i++) {
            num = val; val = v[i]; v[i] = num;
        }
    }
    public static void main(String[] args) {
    /*System.out.println(mayor2(3, 6));
    System.out.println(mayor3(8, 12, 9));
    System.out.println(mayor4(7, 6, 9, 8));
    System.out.println(cuantasVeces("hola casa", ' '));
    System.out.println(cuantosEspacios("Esto es un ejercicio", ' '));
    System.out.println(cuantasVocales("Mi nombre es javier", "a, e , i , o, u"));
    System.out.println(separa("hola", "--"));
    /*System.out.println(hiHaBruixa("==))="));
    System.out.println(explanada(10));*/
    }
}

