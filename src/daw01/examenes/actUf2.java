package daw01.examenes;

public class actUf2 {

    static int major2 (int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }

    static int major3 (int a, int b, int c){
        if (a > b && a > c) {
            return a;
        }if (a < b && b > c)
            return b;
        else
            return c;
    }

    static int major4 (int a, int b, int c, int d){
//        if (a > b && a > c && a > d) {
//            return a;
//        }if (a < b && b > c && b > d)
//            return b;
//        if (c > b && a < c && c > d)
//            return c;
//        else
//            return d;

        int x = major2(a, b);
        int k = major2(c, d);

        if(x > k){ return x; }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(major2(2,4));
        System.out.println(major3(2,4,8));
        System.out.println(major4(4,7,9,5));
    }
}
