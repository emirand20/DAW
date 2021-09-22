package daw02;

import java.util.Scanner;

//import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class Parell {

    public static boolean esPar (int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();

        System.out.println(esPar(num));
    }
         
}
