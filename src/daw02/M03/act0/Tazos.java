package M03.act0;

import java.time.LocalDate;
import java.util.Scanner;

public class Tazos {
    private static Scanner s = new Scanner(System.in);

    private static int id(){
        int id = 0;
        while (id == 0){
            System.out.println("Pon otro numero");
            id = s.nextInt();
        }
        return id;
    }
    // public int valor(){

    //     return 0;
    // }
    public static void main(String[] args) {

        Tazos[] tazos = new Tazos[20];
        
        int id = 0;
        int valorSentimental;

        for (int i = 0; i < tazos.length; i++) {
            
        }

        // public String alfabetico(){
        //     return " ";
        // }
    }
    
    public LocalDate fecha;
    
}
