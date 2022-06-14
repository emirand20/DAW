package m03.uf4.herenciaII.tpv;

public class Cafe extends Producte{
    
    String origen;
    double peso;
    int intensidad;

    public Cafe(String nom, int preu, String marca, String fechaCaducidad, String origen, double peso, int intensidad) {
        super(nom, preu, marca, fechaCaducidad);
        this.origen = origen;
        this.peso = peso;
        this.intensidad = intensidad;
    }

    @Override
    public String toString() {
        return "El cafe: " + nom + " de " + preu + " euros con " + fechaCaducidad + " fecha de caducidad, con volumen de " + origen + " de peso " + peso +" con intensidad " + intensidad;
    }
}