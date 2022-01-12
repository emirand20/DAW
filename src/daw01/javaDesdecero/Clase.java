public class Clase {
    public static void main(String[] args) {
        /* Muestre todas las combinaciones posibles de 4 cibras que contengan solo 2 y 9.
         */
//        int valor1 [] = {2, 9, 2, 9};
//        int valor2 [] = {9, 2, 9, 2};
//        for (int i = 0; i < valor1.length; i++) {
//            System.out.println(i+1 + valor1[Math.random() * valor]);
        long inici = System.nanoTime();
        int c = 0;
        for (int i = 2; i < 10; i++)
            for (int j = 2; j < 10; j++)
                for (int k = 2; k < 10; k++)
                    for (int l = 2; l < 10; l++) {
                        if ((i == 2 || i == 9) && (j == 2 || j == 9) && (k == 2 || k == 9) && (l == 2 || l == 9)) ;
                        System.out.println("" + i + j + k + l);
                        c++;
                    }
        System.out.println("Invertits " + (System.nanoTime() - inici) + "ns.");
        System.out.println("Total " + c );
    }
}



