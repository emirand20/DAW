package m03.uf4.herenciaII.tpv;

public class Agua extends Producte{
    double volumen;
    double residu;

    public Agua(String nom, int preu, String marca, String fechaCaducidad, double volumen, double residu) {
        super(nom, preu, marca, fechaCaducidad);
        this.volumen = volumen;
        this.residu = residu;
    }

    @Override
    public String toString() {
        return "El agua: " + nom + " de " + preu + " euros con " + fechaCaducidad + " fecha de caducidad, con volumen de " + volumen + " y residuo de " + residu    ;
    }
}
