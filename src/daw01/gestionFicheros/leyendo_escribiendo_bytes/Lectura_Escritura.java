package daw01.gestionFicheros.leyendo_escribiendo_bytes;

import java.io.*;

public class Lectura_Escritura {
    public static void main(String[] args) {
        int contador = 0;

        int datos_entrada[] = new int[67949];
        try {

            FileInputStream archivo_lectura = new FileInputStream("/home/emirand/Escritorio/cap/imagen.jpg");
            boolean final_ar = false;

            while (!final_ar) {
                int byete_entrada = archivo_lectura.read();

                if (byete_entrada != -1)
                    datos_entrada[contador] = byete_entrada;

                else
                    final_ar = true;

                System.out.println(datos_entrada[contador]);
                contador++;
            }
            archivo_lectura.close();
        } catch (IOException e) {
            System.out.println("no se encuentra la imagen");
        }
        System.out.println(contador);
        crea_fichero(datos_entrada);
    }

    static void crea_fichero(int datos_nuevo_fichero[]) {

        try {
            FileOutputStream fichero_nuevo = new FileOutputStream("/home/emirand/Escritorio/cap/imagen_copia.jpg");

            for (int i = 0; i < datos_nuevo_fichero.length; i++) {
                fichero_nuevo.write(datos_nuevo_fichero[i]);
            }
            fichero_nuevo.close();
        } catch (IOException e) {
            System.out.println("no se encuentra la imagen");
        }
    }
}
