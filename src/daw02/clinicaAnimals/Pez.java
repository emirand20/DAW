package clinicaAnimals;

public class Pez extends Animal{
    private String tipoAgua;
    private boolean venenoso;


    public Pez(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida, String salvajeCompañia,
            String tipoAgua, boolean venenoso) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.tipoAgua = tipoAgua;
        this.venenoso = venenoso;
    }

    public Pez(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida, String salvajeCompañia) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
    }
    
    @Override
    public String toString() {
        String respuesta = null;
        if(tipoAgua == "dulce" && venenoso == true){
            respuesta = "El pez es de agua dulce y es venenoso.";
        }else if(tipoAgua == "salada" && venenoso == false){
            respuesta = "El pez es de agua salada y no es venenoso.";
        }else if(tipoAgua == "dulce" && venenoso == false){
            respuesta = "El pez es de agua dulce y no es venenoso.";
        } 
        respuesta = "El pez es de agua salada y es venenoso";

        return respuesta;
    }    
}
