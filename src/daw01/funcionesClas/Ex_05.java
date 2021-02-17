package daw01.funcionesClas;

public class Ex_05 {
    static long sum(int v[]) {
        //retorna la suma de dos elementos v
        long suma = 0;
        for (int i = 0; i < v.length; i++)
            suma += v[i];
        return suma;
    }
}

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Suma de 3 elemntos de v " + sum(v));
    }
}