package daw02.POO.ClasesYObjetos;

public class Operacion {
    // Atributos
    /*
     * int num1; int num2; int suma; int resta; int multiplicacion; int division;
     */

    // metodos

    // Metodos para pedirle al usuario que nos digite dos nums
    // public void leerNums() {
    // Scanner n = new Scanner(System.in);
    // System.out.println("Dime el primer numero: ");
    // num1 = n.nextInt();
    // System.out.println("Dime el segundo numero: ");
    // num2 = n.nextInt();
    // }

    // parametros
    public int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public int resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public int multiplicacion(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public int division(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }

    public void mostrarResultados(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicaion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
