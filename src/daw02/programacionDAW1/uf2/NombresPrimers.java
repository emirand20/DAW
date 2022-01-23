package programacionDAW1.uf2; 

public class NombresPrimers {
    static boolean esPrimer(long n){
        boolean residu = false;
        if(n%2 == 0 || n%3 == 0 || n%5 == 0 || n%7 == 0 || n%11 == 0)
        residu = false;
        else
        residu = true;
        return residu;
    }
    static void vectorPrimers(int n){}
    static void factoriza(int n){
        int divisor = 2, cociente, resto;
        if(n%divisor != 0){
            System.out.println( n + " | " + divisor);
        }else
            System.out.println("error");

        // while(n%divisor != 0){
            
        // }
    }
    public static void main(String[] args) {
        //long v[]= vectorPrimers(100000);
        System.out.println(esPrimer(17));
        //System.out.println(factoriza(4));
    }
}
