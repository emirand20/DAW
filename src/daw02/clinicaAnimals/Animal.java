package clinicaAnimals;

public class Animal{
    private int nPatas;
    private String especie;
    private int fechaIngreso;
    private boolean malo;
    private int esperanzaVida;
    private String salvajeCompañia;
    public Animal perro;

    public Animal(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia) {
        this.nPatas = nPatas;
        this.especie = especie;
        this.fechaIngreso = fechaIngreso;
        this.malo = malo;
        this.esperanzaVida = esperanzaVida;
        this.salvajeCompañia = salvajeCompañia;
    }
    @Override
    public String toString() {
        return "El perro tiene"+ nPatas + "patas, es + " + especie + ", fue ingresado el " + fechaIngreso + ", no esta malo, tiene " 
        + esperanzaVida + " años de esperanza de vida y es " + salvajeCompañia;
    }
    
}