package m03.uf05.examenRecuperacio;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.List;

public class Processadors {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        HashSet<AplicacioProcessadors> processadors = new HashSet<AplicacioProcessadors>();
        // HashMap<String, AplicacioProcessadors> delNomProcesador = new HashMap<String,
        // AplicacioProcessadors>();

        AplicacioProcessadors p1 = new AplicacioProcessadors("1.Intel Core i7-12600K", 300, null);
        AplicacioProcessadors p2 = new AplicacioProcessadors("2.Intel Core i5-12600K", 190, null);
        AplicacioProcessadors p3 = new AplicacioProcessadors("3.Intel Core i7-12700K", 534, null);
        AplicacioProcessadors p4 = new AplicacioProcessadors("4.Intel Core i5-11600K", 225, null);
        AplicacioProcessadors p5 = new AplicacioProcessadors("5.Intel Core i3-12100F", 112, null);
        AplicacioProcessadors p6 = new AplicacioProcessadors("6.AMD Ryzen 5 5600X ", 209, null);
        AplicacioProcessadors p7 = new AplicacioProcessadors("7.AMD Ryzen 7 5640X ", 319, null);
        AplicacioProcessadors p8 = new AplicacioProcessadors("8.Intel Core i3-12100F", 112, null);
        AplicacioProcessadors p9 = new AplicacioProcessadors("9Intel Core i3-12180F", 342, null);

        processadors.add(p1);
        processadors.add(p2);
        processadors.add(p3);
        processadors.add(p4);
        processadors.add(p5);
        processadors.add(p6);
        processadors.add(p7);
        processadors.add(p8);
        processadors.add(p9);

        System.out.println("\n\t En Stock");

        for (AplicacioProcessadors aplicacioProcessadors : processadors) {
            System.out.println(aplicacioProcessadors.getNom());
        }

        while (!salir) {
            System.out.println("\nAplicació de procesadors");
            System.out.println("--------------------------------");
            System.out.println("\n1. Compara entre els procesadors");
            System.out.println("2. Elimina un procesador");
            System.out.println("3. Llistar processadors per nom (creixent)");
            System.out.println("4. Llistar processadors per preu (decreixent)");
            System.out.println("5. Llistar processadors d’una marca donada (AMD, Intel, etc.)");
            System.out.println("6. Mostrar quants processadors hi ha de cada marca.");
            System.out.println("7. Sortir");

            try {
                System.out.println("\nEscriu una de les opcions");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\nHas escollit l'opció 1");
                        System.out.println("\nEntre quins vols comparar?");
                        int num1 = sn.nextInt();
                        int num2 = sn.nextInt();

                        if (num1 == 1 && num2 == 2) {
                            System.out.println(p1.compareTo(p2));
                        } else if (num1 == 1 && num2 == 3) {
                            System.out.println(p1.compareTo(p3));
                        } else if (num1 == 1 && num2 == 4) {
                            System.out.println(p1.compareTo(p4));
                        } else if (num1 == 1 && num2 == 5) {
                            System.out.println(p1.compareTo(p5));
                        } else if (num1 == 1 && num2 == 6) {
                            System.out.println(p1.compareTo(p6));
                        } else if (num1 == 1 && num2 == 7) {
                            System.out.println(p1.compareTo(p7));
                        } else if (num1 == 1 && num2 == 8) {
                            System.out.println(p1.compareTo(p8));
                        } else if (num1 == 1 && num2 == 9) {
                            System.out.println(p1.compareTo(p9));
                        } else if (num1 == 2 && num2 == 3) {
                            System.out.println(p2.compareTo(p3));
                        } else if (num1 == 2 && num2 == 4) {
                            System.out.println(p2.compareTo(p4));
                        } else if (num1 == 2 && num2 == 5) {
                            System.out.println(p2.compareTo(p5));
                        } else if (num1 == 2 && num2 == 6) {
                            System.out.println(p2.compareTo(p6));
                        }

                        System.out.println("\nQue més vols fer?");
                        break;
                    case 2:
                        System.out.println("\nHas escollit l'opció 2");
                        System.out.println("Quin procesador vols eliminar?");
                        String n = sn.next();
                        if (n.equals("1")) {
                            processadors.remove(p1);
                        }else if(n.equals("2")){
                            processadors.remove(p2);
                        }else if(n.equals("3")){
                            processadors.remove(p3);
                        }else if(n.equals("4")){
                            processadors.remove(p4);
                        }else if(n.equals("5")){
                            processadors.remove(p5);
                        }else if(n.equals("6")){
                            processadors.remove(p6);
                        }else if(n.equals("7")){
                            processadors.remove(p7);
                        }else if(n.equals("8")){
                            processadors.remove(p8);
                        }else if(n.equals("9")){
                            processadors.remove(p9);
                        }
                        for (AplicacioProcessadors aplicacioProcessadors : processadors) {
                            System.out.println(aplicacioProcessadors.getNom());
                        }
                        System.out.println("\nQue més vols fer?");
                        break;
                    case 3:
                        System.out.println("\nHas escollit l'opció 3");
                        for (AplicacioProcessadors aplicacioProcessadors : processadors) {
                            System.out.println(aplicacioProcessadors.getNom());
                        }
                        System.out.println("\nQue més vols fer?");
                        break;
                    case 4:
                        System.out.println("\nHas escollit l'opció 4");
                        for (AplicacioProcessadors aplicacioProcessadors : processadors) {
                            System.out.println(aplicacioProcessadors.getPreu());
                        }
                        System.out.println("\nQue més vols fer?");
                        break;
                    case 5:
                        System.out.println("\nHas escollit l'opció 5");
                        System.out.println("\nDe quina marca estas buscant, 1.AMD o 2.Intel? (selecciona un número)");

                        String m = sn.next();
                        String amd = "1";
                        String intel = "2";

                        processadors.remove(p8);

                        if (m.equals(amd)) {
                            System.out.println(p6);
                            System.out.println(p7);
                        } else if (m.equals(intel)) {
                            System.out.println(p1);
                            System.out.println(p2);
                            System.out.println(p3);
                            System.out.println(p4);
                            System.out.println(p5);
                            System.out.println(p9);
                        }
                        System.out.println("\nQue més vols fer?");
                        break;
                    case 6:
                        System.out.println("\nHas escollit l'opció 6");

                        System.out.println(
                                "\nDe quina marca vols saber quans hi han de (1)AMD o (2)Intel? (selecciona un número)");
                        String cont = sn.next();
                        String A = "1";
                        String I = "2";

                        if (cont.equals(A)) {
                            System.out.println("\nHi han dues d'AMD");
                        } else if (cont.equals(I)) {
                            System.out.println("\nHi han set d'Intel");
                        }
                        System.out.println("\nQue més vols fer?");
                        break;
                    case 7:
                        System.out.println("Bon Estiu!!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Només nombres del 1 al 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Has de insertar un número");
                sn.next();
            }
        }
    }
}
