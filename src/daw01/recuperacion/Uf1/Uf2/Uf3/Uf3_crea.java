package daw01.recuperacion.Uf1.Uf2.Uf3;

import daw01.gestionFicheros.Escribir_Fichero;

import java.io.FileWriter;
import java.io.IOException;

public class Uf3_crea {
    public static void main(String[] args) {
        Escribiendo accede_es = new Escribiendo();

        accede_es.escribir();
    }
    static class Escribiendo {
        public void escribir(){
            int frase = 0;
            for (int i = 99; i > 10; i--) {
                if (i % 2 == 0)
                    System.out.print(String.format("%3d, ", i));
                frase = i;
            }

            try {
                FileWriter escritura = new FileWriter("/home/emirand/Escritorio/numeros.txt");

                for (int i = 0; i < frase; i++) {
                    escritura.write((i));
                }
                escritura.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
