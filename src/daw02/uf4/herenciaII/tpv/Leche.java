package uf4.herenciaII.tpv;

public class Leche extends Producte{
    double volumen;
    boolean ecologico;

    public Leche(String nom, int preu, String marca, String fechaCaducidad, double volumen, boolean ecologico) {
        super(nom, preu, marca, fechaCaducidad);
        this.volumen = volumen;
        this.ecologico = ecologico;
    }

    @Override
    public String toString() {
        return "La leche: " + nom + " de " + preu + " euros con " + fechaCaducidad + " fecha de caducidad, con volumen de " + volumen + " y es ecologico " + ecologico ;
    }
}
