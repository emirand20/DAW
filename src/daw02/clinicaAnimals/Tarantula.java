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
        return "Una tarantula venenosa y tropical.";
        }else if(venenosa == false && tropical == false){
            return "Una tarantula no venenosa y no tropical.";
        }else if(venenosa == true && tropical == false){
            return "Una tarantula venenosa y no tropical.";
        }
            return "Una tarantula no venenosa y tropical.";
    }
}
