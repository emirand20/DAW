package programacionDAW1.UF3.pruebaExamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichers {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("EscripturaDeFitxers.txt"));
            String line;
            int num;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //num = Integer.parseInt(reader.readLine());
            //System.out.println(num);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
