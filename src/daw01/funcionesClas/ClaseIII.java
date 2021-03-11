package daw01.funcionesClas;

public class ClaseIII {
    static double exp (int base, int exponente){
//        if (exponente < 0)
//            return 1.0/ exp (base, - exponente);
//        double result = 1.0;
        if (exponente == 0)
            return 1.0;
            return base *exp(base, -exponente);
    }

    public static void main(String[] args) {
        System.out.println(exp(2,7));
    }
}
