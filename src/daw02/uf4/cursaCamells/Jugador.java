package uf4.cursaCamells;

public class Jugador {
    /**
     * Crearemos tres atrivutos que tienen cada jugador, dos dados y un camello
     */
    private Dau dau2;
    private Dau dau1;
    public Camell camell;

    /**
     * Creamos un contructor, que no le pasaremos nada por parametros, pero si crearemos los tres objetos 
     * que le pertenecen a jugador
     */
    public Jugador() {
        camell = new Camell();
        dau1 = new Dau();
        dau2 = new Dau();
    }

    public boolean ronda(){

        int resultado;

        int d1 = dau1.lanza();
        int d2 = dau2.lanza();

        if (d1 == d2){
            resultado = -(d1 + d2);                
        }else resultado = d1 + d2;

        camell.mouCamell(resultado);

        return camell.isGanador();

    }
    }