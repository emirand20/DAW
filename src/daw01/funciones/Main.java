package daw01.funciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String dni = null;
        do {
            System.out.println("Dime tu dni");
            dni = entrada.next();
        } while (dni.length() < 9 || dni.length() > 10);

        Dni javiDni = new Dni(dni);

    }

}
