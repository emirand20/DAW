package uf4.cursaCamells;

import java.util.ArrayList;

public class Cursa {
    public static void main(String[] args) {
        /**
         * Hacemos un arrayList de jugadores, para que jueguen quien quiera
         */
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        
        /**
        * Crearemos un bucle el cual creara aquel numero de jugadores que queramos y estableceremos un premio, el cual
          sera el resultado de la multiplicacion del precio por el numero de jugadores.
        */
        for (int i = 0; i < 50; i++) {
            jugadores.add(new Jugador());
        }

        int premi = 6 * jugadores.size();

        boolean hayGanador = false;
        int numGanadores = 0;
        /***
         * minetras no haya un ganador, recorrera cada jugador recorrera desde 0 a 100 que sera quienes sean ganadores. Si hay 
         * ganadores este sera true, y contaremos el numero de ganadores que hay
         */
        while (!hayGanador){
            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.get(i).ronda()){
                    hayGanador = true;
                    numGanadores++;
                }
                //System.out.println("Els jugadors avançen " + jugadores.get(i).camell.getPosicion());
            }
        }
        
        System.out.println("Han guanyat " + numGanadores + " jugadores"); //diremos el numero de ganadores que hay
        System.out.println("Cada un s'endu " + premi / numGanadores); //respecto a este numero de ganadores se dividira el premio
        
    }
}
