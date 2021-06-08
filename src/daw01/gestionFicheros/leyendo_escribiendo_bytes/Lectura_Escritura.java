package daw01.gestionFicheros.leyendo_escribiendo_bytes;
import java.io.*;

public class Lectura_Escritura {
    public static void main(String[] args) {

        try {
            FileInputStream archivo_lectura = new FileInputStream("/home/emirand/Escritorio/cap/imagen.jpg");
            boolean final_ar = false;
            while (!final_ar){
                int byete_entrada = archivo_lectura.read();
                if (byete_entrada == -1)
                    final_ar = true;

                System.out.println(byete_entrada);
            }
            archivo_lectura.close();
        }catch (IOException e){
            System.out.println("no hemos encontrado nada");
        }
    }
}
