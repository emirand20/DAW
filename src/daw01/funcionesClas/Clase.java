package daw01.funcionesClas;

public class Clase {
    static long exp(int base, int exponente) {
        //retorna base^exponente con exponente >= 0
        //return (long) Math.pow (base, exponente)
        int result = 0;
        for (int i = 0; i < exponente; i++)
            result *= base; //result = result * base
        return result;
    }

    public static void main(String[] args) {
        //Retorna baseexponente
        System.out.println("exp (2, 0) = " + exp(2, 0));
        System.out.println("exp (-2, 3) = " + exp(-2, 3));
        System.out.println("exp (5, 4) = " + exp(5, 4));


    }
}

