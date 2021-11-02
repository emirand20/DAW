package clinicaAnimals;


public class Tarantula extends Animals{
    private boolean venenosa;
    private boolean tropical;

    public Tarantula(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia, boolean venenosa, boolean tropical) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.venenosa = venenosa;
        this.tropical = tropical;
    }

    @Override
    public String toString() {
        if(venenosa == true && tropical == true){
        return "La tarantula es venenosa y es tropical.";
        }else if(venenosa == false && tropical == false){
            return "La tarantula no es venenosa y no es tropical.";
        }else if(venenosa == true && tropical == false){
            return "La tarantula es venenosa y no es tropical.";
        }
            return "La tarantula no es venenosa y es tropical.";
    }
}
