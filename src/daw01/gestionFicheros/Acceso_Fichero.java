package daw01.gestionFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {
    public static void main(String[] args) {
        Leer_Fichero accediendo = new Leer_Fichero();
        accediendo.lee();
    }
    static class Leer_Fichero{
        public void lee(){
            try {

                FileReader entrada = new FileReader("/home/emirand/Escritorio/ejemplo.txt");

                BufferedReader mibuffer = new BufferedReader(entrada);
                //int c = 0;
//                while(c!=-1){
//                    c=entrada.read();
//                    char letra = (char)c;
//                    System.out.print(letra);
//                }
                String linea ="";

                while (linea!=null){
                    linea = mibuffer.readLine();

                    if (linea!=null)
                    System.out.println(linea);

                }
                entrada.close();
            }catch (IOException e){
                System.out.println("No se a encontrado el archivo");
            }
        }
    }
}
