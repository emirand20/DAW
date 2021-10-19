package herenciaII.tpv;

public class Pan extends Producte{
    double pan;
    String tipoHarina;

    public Pan(String nom, int preu, String marca, int fechaCaducidad, double pan, String tipoHarina) {
        super(nom, preu, marca, fechaCaducidad);
        this.pan = pan;
        this.tipoHarina = tipoHarina;
    }

    @Override
    public String toString() {
        return "Pan [pan=" + pan + ", tipoHarina=" + tipoHarina + "]";
    }
    
}
