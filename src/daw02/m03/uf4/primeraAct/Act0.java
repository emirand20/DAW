package m03.uf4.primeraAct;


import java.util.Scanner;


public class Act0 {
    
    public static String Bienvenida(String ciclo, int curso, String nombre){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que ciclo haces?");
        ciclo = sc.next();
        
        System.out.println("¿Que curso haces?");
        curso = sc.nextInt();

        sc.nextLine();

        System.out.println("¿Cual es tu nombre?");
        nombre = sc.next();

        System.out.println("Bienvenido a " + ciclo + curso + "! " + nombre);

        sc.close();
        return " ";
    }

/**
 * @param nMatriculats es un int con el numero de bytes que queremos
 * @return esta funcion de edades un vector entre 17 y 40 años de tipo byte[]
 */
    public static byte[] inicialitzaEdats(int nMatriculats){

        byte vector[] = new byte[nMatriculats];
        for (int i = 0; i < nMatriculats; i++) {
            vector[i] =  (byte) ((Math.random() * (41 - 17)) + 17);
        }
        return vector;
    }

/**
 * @param edades edades es el byte que le pasamos al principio, no conoce a las otras funciones
 * @return retornamos un int que sera la edad maxima del vector de edades, creamos una variable de 
 * tipo int de edades en la posicion 0, para que comparemos con las otras versiones, hacemos un for each para recorrer 
 * el vector de edades y ponmos una condicion que compare todos los vectores para saber el mayor. Y retornamos el mayor.
 */
    public static int edadMaxima(byte[] edades){
        int mayor = edades[0];
        for (byte b : edades) {
            if(b>mayor){
                mayor = b;
            }
        }
        return mayor;

         // for (int j = 1; j < edades.length; j++) { 
        //     if (edades[j] > mayor) {
        //         mayor = edades[j];
        //     }
        // }
    }

    public static int mediaEdades(byte[] edades){

        int media = 0;

        for (int i = 0; i < edades.length; i++) {
            media = media + edades[i];
        } media = media / edades.length;

        return media;
        
    }    

    /**
     * @param edades recorreremos el vector de edades para saber si hay algun menor
     * @return al recorrer sera true si hay uno entre el numero que hayamos puesto
     */

    public static boolean hayUnMenor(byte[] edades){

     for (byte b : edades) {
        if (b < 18){
            return true;
        } 
    }return false;
    
    }
       

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1
        System.out.println(Bienvenida(" ", 2, " "));

        //2.
        int a = 125 % 10;
        int b = 15 / 10;
        boolean c = (a > b) || (a < b);
        boolean d = (a < 100) && (a > 100);
        double e = 0.1 + 0.1 + 0.1;

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        //3.Es falso porque dan un numero infinito de 3, y lo acaba redondeando a 4.
        
        double resultado = 0.1 + 0.1 + 0.1;

        if(resultado == 0.3){
            System.out.println("es verdadero");
        }else
            System.out.println("es falso");
        System.out.println(resultado); 

        //4.a y 4.b

       System.out.println("¿Cuantos alumnos nuevos se han matriculado?");
       
       int numero=sc.nextInt();
       byte[] edades=inicialitzaEdats(numero);
       sc.close();
    
       System.out.println("Los alumnos que se han matriculado tienen estas edades: ");

        for (int i = 0; i < edades.length; i++) {
            System.out.print(edades[i] + "\t");
        } 
        System.out.println("El mayor es de " + edadMaxima(edades) + " años");

        System.out.println("La media de edades de los alumnos inscritos es: " + mediaEdades(edades));

        System.out.println(hayUnMenor(edades));

        Alumne nuevoAlumno= new Alumne();
        System.out.println(nuevoAlumno.toString());
        sc.close();


    }
}
