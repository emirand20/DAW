import java.util.ArrayList;
import java.util.Scanner;

public class PruebaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que quieres comprar?");
        String compra = sc.next();
        String frutas[] = {"manzana", "manzana", "pera", "manzana", "platano", "melon", "sandia", "sandia", "melon", "platano"};

        ArrayList<String> items = new ArrayList<String>();

        for (int i = 0; i < frutas.length; i++) {
            if (!items.contains(frutas[i])) {
                items.add(frutas[i]);
            }
        }

        for (int i = 0; i < items.size(); i++) {
            int cont = 0;
            for (int j = 0; j < frutas.length; j++){
                if (frutas[j].equals(items.get(i))){
                    cont++;
                }
            }
            System.out.println("Hay " + cont + " " + items.get(i));
        }


    }
}
//
//
//
//        public void mal () {
//            String frutas[] = {"manzana", "manzana", "pera", "manzana", "platano", "melon"};
//
//            int contadorManzana = 0, contadorPera = 0, contadorPlatano = 0;
//
//            for (int i = 0; i < frutas.length; i++) {
//                if (frutas[i].equals("manzana")) contadorManzana++;
//                if (frutas[i].equals("pera")) contadorPera++;
//                if (frutas[i].equals("platano")) contadorPlatano++;
//            }
//
//            System.out.println(contadorManzana + " " + contadorPera + " " + contadorPlatano);
//        }
//    }
