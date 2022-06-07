package programacionDAW1.UF3.examen2022;

import java.util.Scanner;

public class CuantosPositivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        System.out.println("\t\tCuantos positivos");
        int paramentros = entrada.nextInt();
        String total = Integer.toString(paramentros);
        for (int i = 0; i < total.length(); i++) {
            System.out.println("Se han pasado " + total.charAt(i) + " párametros");   
        }
        for (int i = 1; i < paramentros; i++) {
            if(paramentros > 0){
                num++;
            }
            else if(paramentros <= 0){
                --num;
            }
        }System.out.println("Entre ellos hay " + num + " valores positivos");
        
    }

}
