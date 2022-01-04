package uf4.practica;

public class FutbolPlayer extends Persona{
    private int dorsal;
    private String equipo;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }   
    
    public void saluda(){
        System.out.println("Soy jugadora");
    }

    public void posicion(){
        System.out.println("Juego de extrema izquierda");
    }
}
