package daw01.gestionFicheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {
    public static void main(String[] args) {

    Escribiendo accede_es = new Escribiendo();

    accede_es.escribir();
    }
    static class Escribiendo {
        public void escribir(){
            String frase = "1651651";

            try {
                FileWriter escritura = new FileWriter("/home/emirand/Escritorio/numeros.txt");

                for (int i = 0; i < frase.length(); i++) {
                    escritura.write(frase.charAt(i));
                }
                escritura.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}