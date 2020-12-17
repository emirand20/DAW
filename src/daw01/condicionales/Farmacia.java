package daw01.condicionales;

import java.util.Scanner;

public class Farmacia {
    public static void main(String[] args) {
        double valor, descuento, recargo, total;
        String tipoPago;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra: ");
        valor = entrada.nextDouble();
        System.out.println("Ingrese el tipo de pago");
        tipoPago = entrada.next();
        descuento = 0.05 * valor;
        recargo = 0.03 * valor;

        if (tipoPago.equalsIgnoreCase("contado")){
            System.out.println("El descuento es: " + descuento);
            total = valor - descuento;
            System.out.println("El total es: " + total);
        } else {
            System.out.println("El recargo es: " + recargo);
            total = valor + recargo;
            System.out.println("El total es: " + total);
        }
    }
}
