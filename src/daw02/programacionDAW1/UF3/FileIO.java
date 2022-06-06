package programacionDAW1.UF3;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileIO {
    public static void main(String[] args) {
        String[] names = {"Jon", "Javi", "Ester", "Luis"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Ester\\Documents\\AAAPROGRAMACION\\output.txt"));
            writer.write("Esto es una prueba");
            writer.write("\nEsto es una nueva linea");

            for(String name : names){
                writer.write("\n" + name);
            }
            writer.close();
        } catch (Exception e) {
        }
    }
}
