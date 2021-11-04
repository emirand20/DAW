package clinicaAnimals;

public class Animals {
    private int nPatas;
    private String especie;
    private int fechaIngreso;
    private boolean malo;
    private int esperanzaVida;
    private String salvajeCompañia;
    
    public Animals(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia) {
        this.nPatas = nPatas;
        this.especie = especie;
        this.fechaIngreso = fechaIngreso;
        this.malo = malo;
        this.esperanzaVida = esperanzaVida;
        this.salvajeCompañia = salvajeCompañia;
    }
}