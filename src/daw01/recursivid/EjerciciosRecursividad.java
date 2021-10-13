package daw01.recursividad;

public class EjerciciosRecursividad {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        mostrarArrayRecursivo(array, 0);
        int buscar = 5;
        //int elementoEncontrado = posicionElementoRecursivo(array, buscar, 0);
        //System.out.println(elementoEncontrado);
    }

    public static void mostrarArrayRecursivo(int[] array, int indice) {

        if (indice != array.length) {
            System.out.println(array[indice]);
            mostrarArrayRecursivo(array, indice + 1);
        }
    }

    public static int posicionElementoRecursivo(int[] array, int buscar, int indice) {
        if (indice == array.length) {
            return -1;
        } else if (array[indice] == buscar)
            return indice;
        else {
            return posicionElementoRecursivo(array, buscar, indice + 1);
        }
    }
}
