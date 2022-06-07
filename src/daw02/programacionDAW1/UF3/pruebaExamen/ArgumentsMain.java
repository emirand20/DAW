package programacionDAW1.UF3.pruebaExamen;

public class ArgumentsMain {
    public static void main(String[] args) {
        int[] num = new int[100];
        //int total = 0;
        for (int i = 0; i < num.length; i++) {
            i = (int) (Math.random() * 100);
            num[i] = i;
            System.out.println(" " + num[i]);
            /**sumaremos los pares*/

            /*if((i % 2) == 0){
                total += num[i];
                System.out.println("Este es par : " + total);
            }*/
        }
    }
}
