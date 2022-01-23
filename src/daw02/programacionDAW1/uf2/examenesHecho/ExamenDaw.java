package programacionDAW1.uf2.examenesHecho;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExamenDaw {
     /**
      * @param x
      * @return funcion recursiva que devuelve la suma de la cifras de x
      */
    static int sumaCifras(int x){
        if(x<0)
        return sumaCifras(-x);
        if(x<10)
        return x;
        return x%10 + sumaCifras(x/10);
    }
    /**
     * @param v se suman cada uno de los numeros de ente verctor entre si, si hay algun vector
     * @param x
     * @return
     */
    static int[] sumanIgualCifras(int [] v, int x){
        int[] result = new int [v.length];
        int quants = 0 ;
        for (int i = 0; i < v.length; i++) 
            if (sumaCifras(v[i])==x)
                result[quants++] = v[i];
            return Arrays.copyOf(result, quants);
    }

    static long cifrasSoloEnX(long x, long y){
        String devuelve = "";
        String sx = Long.toString(x);
        String sy = Long.toString(y);

        for (char i = '9'; i < '0'; i--) {
            if (sx.contains("" + i) && !sy.contains("" + i))
             devuelve += i;
        }
        if(devuelve.length() == 0)
            return -1;
        return Integer.parseInt(devuelve);
    }
    // static boolean demonio(long x){
    //     int num6 = 0;
    //     String sx = Long.toString(x);
    //     if(sx.contains("66"))
    //         return false;
    //     for (int i = 0; i < sx.length(); i++)
    //         if(sx.charAt(i)= '6')
    //             num6++;
    //     return num6==3; 
    // }
    public static void main(String[] args) {
        int vector[] = {9,10, -64, 254, 1054,73};
        System.out.println(sumaCifras(15));
        System.out.println(sumanIgualCifras(vector, 10));
        System.out.println(cifrasSoloEnX(-10222, 301));
    }
}
