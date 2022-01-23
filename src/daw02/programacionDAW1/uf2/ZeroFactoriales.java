package programacionDAW1.uf2;

import java.math.BigInteger;

public class ZeroFactoriales {
    /**
     * @param x BigInteger(), System.nanoTine(), System.currentTimeMills()
     * @return sera el numero del que querramos saber su factorial, lo amacenamos en un BigInteger 
     * porque en la mayoria de ecasiones el numero sera demasiado grande para alacenarlo en eun int o long
     * Crearemos una variable para saber cuanto ha tardado el programa en ejecitarse, con una variable de long,
     * aunque sea long.
     */
    public static BigInteger factorial(BigInteger x) {
        if ((x.compareTo(BigInteger.ZERO) == 0) || (x.compareTo(BigInteger.ONE) == 0)) {
            return BigInteger.ONE;
        } else {
            return x.multiply(factorial(x.subtract(BigInteger.ONE)));
        }
    }
    public static void main(String[] args) {        
       // BigInteger a = new BigInteger("22");
        long ejecucion = System.nanoTime();
        System.out.println(factorial(new BigInteger("10")));
        System.out.println("Temps d'execusió: " + ejecucion + " ns."); 
    }
}

