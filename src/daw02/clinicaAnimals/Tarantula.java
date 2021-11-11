package clinicaAnimals;

public class Tarantula extends Animal {
    private boolean venenosa;
    private boolean tropical;

    public Tarantula(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia, boolean venenosa, boolean tropical) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.venenosa = venenosa;
        this.tropical = tropical;
    }

    public Tarantula(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
    }

    @Override
    public String toString() {
        String respuesta = null;

        if (venenosa == true && tropical == true) {
            respuesta = "Una tarantula venenosa y tropical.";
        } else if (venenosa == false && tropical == false) {
            respuesta = "Una tarantula no venenosa y no tropical.";
        } else if (venenosa == true && tropical == false) {
            respuesta = "Una tarantula venenosa y no tropical.";
        }
        respuesta = "Una tarantula no venenosa y tropical.";

        return respuesta;
    }
}
