package cursaCamells;

public class Camell {

    private int posicion;
    private boolean guanador = false;
    private String nom;

    public Camell(int posicion, boolean guanador, String nom) {
        this.posicion = posicion;
        this.guanador = guanador;
        this.nom = nom;
    }

    public void pos(int i){

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

    public boolean gan(){
        return guanador;
    }

}
