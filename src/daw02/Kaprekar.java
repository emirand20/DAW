// package daw02;

// import java.util.Arrays;
// import java.util.Scanner;

// import daw01.examenes.examenUF1a.I;

// public class Kaprekar {

//     /**
//      * @return
//      * 
//      */

//     public static int[] leeEntrada(){

//         Scanner sc = new Scanner(System.in);
//         int numDatos = sc.nextInt();

//         int [] aDatos = new int [numDatos];

//         for (int i = 0; i < numDatos; i++) {
//             aDatos[i] = sc.nextInt();
//         }return aDatos;
//     }

//     public static int getMaxPermutat(int num){
//         String sNum = String.format("", num);

//         char[] acNum = sNum.toCharArray();
//         Arrays.sort(acNum);
//         String sMinNum = acNum.toString();
//         StringBuilder sb = new StringBuilder(sMinNum);
//         sb.reverse();

//         String sMaxNum = sb.toString();

//         return Integer.parseInt(sMaxNum);
//         }

//     public static int numKaprekar(int numdigitos){

//         int const_KAPRECAT = 6174;
//         int res = numdigitos;
//         int i = 0;
//         while(res = const_KAPRECAT && i<0){
//             int numMax = getMaxPermutat(numdigitos);
//             int numMin = getMinPermutat(numdigitos);
            
//             res = numMax - numMin;
//             i++;
//         }
//     }
//     public static void main(String[] args) {
//         int [] num = leeEntrada();

//         for (int i = 0; i < num.length; i++) {
//             System.out.println(Kaprekar(numKaprekar(numdigitos));
//         }
//     }
// }
