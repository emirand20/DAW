package programacionDAW1.UF3.examen2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Scanner;

public class CuantasVeces {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de un fichero nuérico (valores enteros, uno por linea) numeros.txt");
        System.out.println("Intoruce el valor entero a buscar en el fichero [10 - 99]: (0 para terminar el programa)");
        String valorNumerico = entrada.next();
        System.out.println("Analizando en el fichero: numeros.txt");
        String line;
        int num = 0;
        //boolean encontrado;
        int exit = Integer.parseInt(valorNumerico);
        if (exit != 0) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(
                        "C:\\Users\\Ester\\Documents\\AAAPROGRAMACION\\DAW01-PrimerosPasos\\txt\\numeros.txt"));
                while ((line = reader.readLine()) != null) {
                    //System.out.println(line);
                    //int lecturaNumeros = Integer.parseInt(line);
                    if (valorNumerico.contains(line)) {
                        num++;
                    }
                }
                if (num > 0) {
                    System.out.println(
                            "Sen han encontrado " + num++ + " valores iguales a " + valorNumerico + " en el fichero");
                } else if (num == 0) {
                    System.out.println("No se ha encontrado el valor " + valorNumerico + " en el fichero");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Que tengas buen día");
        }
    }
}
