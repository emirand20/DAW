package daw01.funcionesClas.funcionesProcediments;

public class Act12_01 {
    static int mayor2(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(mayor2(3, 6));
        System.out.println(mayor3(8, 12, 9));
        System.out.println(mayor4(7,6,9,8));
    }

    static int mayor3(int a, int b, int c) {
        return mayor2(a, mayor2(b, c));
    }

    static int mayor4(int a, int b, int c, int d) {
        return mayor2(mayor2(a, b), mayor2(c, d));
    }
    
}
