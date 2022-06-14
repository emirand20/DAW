package m03.uf4.poo.Ejercicio1;
import java.util.Scanner;
public class TableroMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, y, opcion, incremento = 0;

        System.out.println("Dime la posicion inicial de X: ");
        x = teclado.nextInt();
        System.out.println("Dime la posicion inicial de Y: ");
        y = teclado.nextInt();

        Tablero tablero = new Tablero(x, y);

        do{
            System.out.println("\n\tMENU");
            System.out.println("1. Mover arriba");
            System.out.println("2. Mover hacia la derecha");
            System.out.println("3. Mover abajo");
            System.out.println("4. Mover hacia la izquierda");
            System.out.println("5. Salir");
            System.out.print("Dime una opcion: ");
            opcion = teclado.nextInt();

            if(opcion != 5){
                System.out.print("\nDime el incremento o decremento de una coordenada: ");
                incremento = teclado.nextInt();
            }
            switch(opcion){
                case 1: tablero.moverArriba(incremento);
                break;
                case 2: tablero.moverDerecha(incremento);
                break;
                case 3: tablero.moverAbajo(incremento);
                break;
                case 4:tablero.moverIzquirda(incremento);
                break;
                case 5: 
                System.out.println("\nPosicion actual (x)(y) es: (" + tablero.getX() + "):(" + tablero.getY() + ")");
                opcion = 5;
                break;
                default:
                System.out.println("\nLa opcion no existe velva a dijitar");
                break;

            }
            System.out.println("\nPosicion actual (x)(y) es: (" + tablero.getX() + "):(" + tablero.getY() + ")");
        }while(opcion != 5);
    teclado.close();
}
}
