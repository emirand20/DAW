package uf4.herenciaII.tallerRenfe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, yearA, yearN, ultA, ultN, nVagonAnt, nVagonN;
        boolean estV, estN;

        System.out.println("Numero de trenes");
        x = teclado.nextInt();
        Tren convoi = new Tren(x);
        System.out.println("Año de fabricación vagon antiguo"); 
        yearA = teclado.nextInt();
        System.out.println("Ultia revision vagon antiguo"); 
        ultA = teclado.nextInt();
        System.out.println("¿El estado del vagon es bueno?");
        estV = teclado.nextBoolean();
        System.out.println("¿Cuantos vagones antiguos hay?");
        nVagonAnt = teclado.nextInt();

        System.out.println("Año de fabricación vagon nuevo"); 
        yearN = teclado.nextInt();
        System.out.println("Ultia revision vagon nuevo"); 
        ultN = teclado.nextInt();
        System.out.println("¿El estado del vagon es bueno?");
        estN = teclado.nextBoolean();
        System.out.println("¿Cuantos vagones nuevos hay?");
        nVagonN = teclado.nextInt();

        vAntiguo v = new vAntiguo(x, 500, 7, yearA, ultA, estV, yearA, 60, 120, nVagonAnt);
        vNuevo n = new vNuevo(x, 500, 7, yearN, ultN, estN, yearN, 70, 110, nVagonN);

        System.out.println("\n" + convoi + "\n" + v + "\n" + n);

        
        System.out.println("En el vagon nuevo hay un total de " + n.sillasN() + " asientos");
        System.out.println("En el vagon nuevo hay un total de " + v.sillasV() + " asientos");

        teclado.close();
    }

}