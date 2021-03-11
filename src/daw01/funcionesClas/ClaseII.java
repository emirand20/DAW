package daw01.funcionesClas;

public class ClaseII {
    static double exp(int base, int exponente) {
        double result = 1.0;
        for (int i = 0; i < exponente; i++)
            result *= base;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("exp(-2,3) = " + exp(2, 3));
    }
}

