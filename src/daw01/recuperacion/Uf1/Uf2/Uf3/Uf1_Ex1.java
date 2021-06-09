package daw01.recuperacion.Uf1.Uf2.Uf3;

import java.util.Scanner;

public class Uf1_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿En que numero del es has nacido? (1/12)");
        int mes = sc.nextInt();


        while (mes <= -1 || mes > 12) {
            System.out.println("El mes no es correcto");
            mes = sc.nextInt();
        }
            switch (mes) {
                case 1:
                    System.out.println("Nacieste en el mes de Enero");
                    break;
                case 2:
                    System.out.println("Nacieste en el mes de Febrero");
                    break;
                case 3:
                    System.out.println("Nacieste en el mes de Marzo");
                    break;
                case 4:
                    System.out.println("Nacieste en el mes de Abril");
                    break;
                case 5:
                    System.out.println("Nacieste en el mes de Mayo");
                    break;
                case 6:
                    System.out.println("Nacieste en el mes de Junio");
                    break;
                case 7:
                    System.out.println("Nacieste en el mes de Julio");
                    break;
                case 8:
                    System.out.println("Nacieste en el mes de Agosto");
                    break;
                case 9:
                    System.out.println("Nacieste en el mes de Septiembre");
                    break;
                case 10:
                    System.out.println("Nacieste en el mes de Octubre");
                    break;
                case 11:
                    System.out.println("Nacieste en el mes de Noviembre");
                    break;
                case 12:
                    System.out.println("Nacieste en el mes de Diciembre");
                    break;
            }
        }

    }
