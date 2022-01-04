package uf4.cursaCamells;

public class Camell {
    private int posicion;
    private boolean guanador = false;
    private String nom; //opcioal

    public Camell(int posicion, boolean guanador, String nom) {
        this.posicion = posicion;
        this.guanador = guanador;
        this.nom = nom;
    }
        
    /**
     * Creamos un contructor al cual no le pasaremos ningun parametro, pero si le instanciaremos la posicion
     * del camello, el estado inicial del caballo perdiendo y el nombre en esre caso, que no lo utilizaremos,
     */
    public Camell() {
        this(0, false, null);
    }

    /**
     * Moveremos el camello las posicioes que salgan en los dados 
     * @param i, instanciaremos este valor en jugador, que seran los dados que haya sacado cada jugador
     */
    public void mouCamell(int i){

        if (posicion + i <= 0){
            posicion = 0;
        }else posicion += 1;

        if(posicion >= 100){
            guanador = true;
        }
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isGanador(){
        if(posicion >= 100){
            guanador = true;
        }return guanador;
    }

}
