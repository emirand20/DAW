public class Act07_14 {
    public static void main(String[] args) {
        //no esta acabado
        int cont = 0;

        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                if (a != b)
                    for (int c = 0; c <= 9; c++) {
                        if (b != c && a != c) {
                            cont++;
                            System.out.println("a-" + a + ", b-" + b + ", c-" + c);
                        }
                    }
                System.out.println("Son " + cont + " combinaciones posibles");
            }
        }
    }
}