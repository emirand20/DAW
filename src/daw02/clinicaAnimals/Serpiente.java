package clinicaAnimals;

public class Serpiente extends Animal{
    private boolean venenosa;
    private boolean tropical;

    public Serpiente(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia, boolean venenosa, boolean tropical) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.venenosa = venenosa;
        this.tropical = tropical;
    }

    public Serpiente(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
    }


    @Override
    public String toString() {
        String respuesta = null;
        if(venenosa == true && tropical == true){
            respuesta = "La serpiente es venenosa y es tropical.";
            }else if(venenosa == false && tropical == false){
            respuesta = "La serpiente no es venenosa y no es tropical.";
            }else if(venenosa == true && tropical == false){
                respuesta = "La serpiente es venenosa y no es tropical.";
            }
                respuesta = "La serpiente no es venenosa y es tropical.";

            return respuesta;    
        }
    }

