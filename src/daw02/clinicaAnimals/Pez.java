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
        if(tipoAgua == "dulce" && venenoso == true){
            return "El pez es de agua dulce y es venenoso.";
        }else if(tipoAgua == "salada" && venenoso == false){
            return "El pez es de agua salada y no es venenoso.";
        }else if(tipoAgua == "dulce" && venenoso == false){
            return "El pez es de agua dulce y no es venenoso.";
        } 
        return "El pez es de agua salada y es venenoso";
    }    
}
