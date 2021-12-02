package practica;

public class Main {
    public static void main(String[] args) {

        FutbolPlayer j1 = new FutbolPlayer();
        //Persona p1 = new FutbolPlayer();
        Coach c1 = new Coach();
        
       // System.out.println(c1.equipo() + "\n" + j1.saluda() + "\n" + j1.posicion());

        c1.equipo();
        j1.saluda();
        j1.posicion();
    }
}
