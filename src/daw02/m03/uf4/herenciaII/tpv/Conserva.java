package m03.uf4.herenciaII.tpv;

public class Conserva extends Producte{
    double peso;
    String producto;
    
    public Conserva(String nom, int preu, String marca, String fechaCaducidad, double peso, String producto) {
        super(nom, preu, marca, fechaCaducidad);
        this.peso = peso;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "La conserva: " + nom + " de " + preu + " euros con " + fechaCaducidad + " fecha de caducidad, con volumen de " + peso + " de nombre " + producto ;
    }

}
