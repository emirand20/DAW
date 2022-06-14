package m03.uf4.herenciaII.tpv;

public class Pan extends Producte{
    double peso;
    String tipoHarina;

    public Pan(String nom, int preu, String marca, String fechaCaducidad, double peso, String tipoHarina) {
        super(nom, preu, marca, fechaCaducidad);
        this.peso = peso;
        this.tipoHarina = tipoHarina;
    }

    @Override
    public String toString() {
        return "El pan: " + nom + " de " + preu + " euros con " + fechaCaducidad + " fecha de caducidad, con peso de " + peso + " y  harina  de " + tipoHarina;
    }
    
}
