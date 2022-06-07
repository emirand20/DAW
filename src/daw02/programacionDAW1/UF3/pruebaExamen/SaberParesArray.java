package programacionDAW1.UF3.pruebaExamen;

public class SaberParesArray {
    public static void main(String[] args) {
        int[] numbers = {85, 31, 50, 75, 23, 36, 71, 83, 89, 77, 88, 70, 57, 44, 29, 13, 49, 53, 5, 20, 64, 65, 93, 71, 66, 33, 99, 15, 48, 45, 2, 96, 87, 198, 48, 6, 48, 2, 6, 184, 2169}; 
        for (int i = 0; i < numbers.length; i++) {
            if((numbers[i] % 2) == 0)
            System.out.println(numbers[i]);
        }
    }
}
