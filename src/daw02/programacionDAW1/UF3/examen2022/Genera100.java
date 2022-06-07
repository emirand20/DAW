package programacionDAW1.UF3.examen2022;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Genera100 {
    public static void main(String[] args) {
        int[] num = new int[100];

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "C:\\Users\\Ester\\Documents\\AAAPROGRAMACION\\DAW01-PrimerosPasos\\txt\\numeros.txt"));

            for (int i = 0; i < num.length; i++) {
                num[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
                writer.write("\n" + num[i]); 
                writer.newLine();
            }            
            System.out.println("Fichero numeros.txt creado correctamente");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("El fichero numeros.txt existe en el directorio");
            System.out.println("Borre dicho fichero antes de continuar");
        }
    }

}
