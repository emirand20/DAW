package programacionDAW1.UF3.pruebaExamen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.Writer;

import javax.lang.model.element.Element;

public class EscripturaDeFitxers {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("EscripturaDeFitxers.txt"));

            for (int i = 0; i < 100; i++) {
                i = (int) (Math.random() * 100);
                writer.write(String.valueOf(i + " "));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
         * try {
         * BufferedReader reader = new BufferedReader(new
         * FileReader("EscripturaDeFitxers.txt"));
         * String lector;
         * int num;
         * System.out.println("Estos son los numeros pares");
         * 
         * while ((lector = reader.readLine()) != null)
         * 
         * num = Integer.parseInt(lector);
         * 
         * for (int i = 0; i < lector.length(); i++) {
         * if ((i) % 2 == 0)
         * System.out.println((i));
         * }
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         */
    }
}
