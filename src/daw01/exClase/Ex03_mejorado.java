import java.util.Scanner;

public class Ex03_mejorado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean seJuega = false;
        System.out.println("Piedra, papel o tijera?");
        String valor1 = entrada.next();
        if (valor1.equals("tijera") || valor1.equals("papel") || valor1.equals("piedra")) {
            System.out.println("Piedra, papel o tijera?");
            String valor2 = entrada.next();
            if (valor2.equals("tijera") || valor2.equals("papel") || valor2.equals("piedra")) {
                seJuega = true;
            }
        }

        if (seJuega) {
            System.out.println("Juguemos carajo");
        } else {
            System.out.println("no hay partido");
        }

    }
}
