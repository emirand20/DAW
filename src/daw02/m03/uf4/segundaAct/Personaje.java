package m03.uf4.segundaAct;

public class Personaje{
    String persona;
    int x, y;
    int dinero;
    String objeto;

    /*public Personaje(String persona, int x, int y, int dinero, String objeto) {
        this.persona = persona;
        this.x = x;
        this.y = y;
        this.dinero = dinero;
        this.objeto = objeto;
    }*/

    void nomPersona(String name){
        this.persona = name;
    }

    void coordenadas (int a, int b){
        this.x = a;
        this.y = b;
    }
    
    void cantDinero(int nMoney){
        this.dinero = nMoney;
    }

    void nObj(String nObj){
        this.objeto = nObj;
    }

    @Override
    public String toString() {
        return "El nombre del personaje: " + persona + " se encuentra en las coordenadas: " + "(" + x + ", " + y
                + "), dispone de " + dinero + " euros y lleva " + objeto + " en la mochila"
        ;
    }
    
    
}