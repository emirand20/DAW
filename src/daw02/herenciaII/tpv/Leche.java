package herenciaII.tpv;

public class Leche extends Producte{
    double volumen;
    boolean ecologico;

    public Leche(String nom, int preu, String marca, int fechaCaducidad, double volumen, boolean ecologico) {
        super(nom, preu, marca, fechaCaducidad);
        this.volumen = volumen;
        this.ecologico = ecologico;
    }

    @Override
    public String toString() {
        return "Leche{" + "volumen=" + volumen + ", ecologico=" + ecologico + '}';
    }
}
