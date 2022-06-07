package programacionDAW1.UF3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String[] names = {"Jon", "Javi", "Ester", "Luis"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Ester\\Documents\\AAAPROGRAMACION\\output.txt"));
            
            writer.write("Esto es una prueba, hola");
            writer.write("\nEsto es una nueva linea");

            for(String name : names){
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Ester\\Documents\\AAAPROGRAMACION\\output.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
