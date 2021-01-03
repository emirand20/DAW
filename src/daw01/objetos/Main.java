package daw01.objetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creo una clase de nombre calculadora
        Calculadora calculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué quieres calcular?");
        String item = entrada.nextLine();
        //busco el operador (suma, resta, div..) y lo pongo null porque no tengo ni idea de que sera
        String operador = null;
        //como he de recorrer utilizo .length(), si el ite, que es el nombre que le hemos puesto en la posicion de i esta +, -, * o /, pintamelo. asi recorre y le tpdp uno por uno.
        int posicion = 0;
        for (int i = 0; i < item.length(); i++) {
            if (item.charAt(i) == '+' || item.charAt(i) == '-' || item.charAt(i) == '*' || item.charAt(i) == '/') {
                posicion = i;
                operador = item.charAt(i) + "";
            }
        }//y aqui te lo pinta.
        String a = "";
        for (int i = 0; i < posicion; i++) {
            a += item.charAt(i);
        }

        String b = "";
        for (int i = ++posicion; i < item.length(); i++) {
            b += item.charAt(i);
        }


        switch (operador) {
            case "+":
                System.out.println(calculadora.suma(Integer.parseInt(a), Integer.parseInt(b)));
                break;
            case "-":
                System.out.println(calculadora.resta(Integer.parseInt(a), Integer.parseInt(b)));
                break;
            case "*":
                System.out.println(calculadora.multiplicación(Integer.parseInt(a), Integer.parseInt(b)));
                break;
            case "/":
                System.out.println(calculadora.div(Integer.parseInt(a), Integer.parseInt(b)));
                break;

        }


    }
}
