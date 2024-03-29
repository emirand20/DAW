package m03.uf4.poo.Ejercicio1;

public class Tablero {
    //Atributos

    private int x;
    private int y;

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverArriba(int incremento) {
        y += incremento;
    }
    public void moverAbajo(int decremento){
        y -= decremento;
    }

    public void moverDerecha(int incremento) {
        x += incremento;
    }

    public void moverIzquirda(int decremento){
        x -= decremento;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tablero [x=" + x + ", y=" + y + "]";
    }
}
