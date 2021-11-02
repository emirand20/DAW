package clinicaAnimals;

public class Pez extends Animals{
    private String tipoAgua;
    private boolean venenoso;

    public Pez(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida, String salvajeCompañia,
            String tipoAgua, boolean venenoso) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.tipoAgua = tipoAgua;
        this.venenoso = venenoso;
    }

    @Override
    public String toString() {
        return "El pez es de agua " + tipoAgua + " y " + venenoso + " venenoso.";
    }    
}
