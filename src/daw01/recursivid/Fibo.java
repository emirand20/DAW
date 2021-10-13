package daw01.recursividad;

public class Fibo {
    static void peta() {
        peta();
    }

    static long fact(int i) {
        if (i < 2)
            return 1;
        return i * fact(i - 1);

    }

    static long fibo (int i){
        if (i<2)
            return i;
        return fibo(i -1) + fibo(i);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println("fact (" + i + ") = " + fact(i));
        }
    }
}
