package clinicaAnimals;

public class Perro extends Animals{
    private String raza;
    private boolean pedigree;
    private boolean compañia;

    public Perro(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida, String salvajeCompañia,
            String raza, boolean pedigree, boolean compañia) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.raza = raza;
        this.pedigree = pedigree;
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "El perro es de raza " + raza + ", es " + pedigree + " pedigree y " + compañia + " compañia.";
    }
}
