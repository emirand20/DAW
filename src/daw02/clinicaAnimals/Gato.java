package clinicaAnimals;

public class Gato extends Animal {
    private String raza;
    private boolean pedigree;
    private boolean compañia;

    public Gato(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida, String salvajeCompañia,
            String raza, boolean pedigree, boolean compañia) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.raza = raza;
        this.pedigree = pedigree;
        this.compañia = compañia;
    }

    public Gato(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida, String salvajeCompañia) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
    }

    @Override
    public String toString() {
        String txt = null;
        if (pedigree == true && compañia == true) {
            txt = "El gato de raza " + raza + " es de pedigree y es de compañia";
        } else if (pedigree == false && compañia == false) {
            txt = "El gato de raza " + raza + " no es de pedigree y no es de compañia";
        } else if (pedigree == false && compañia == true) {
            txt = "El gato de raza " + raza + " no es de pedigree pero es de compañia";
        }
        txt = "El gato de raza " + raza + " es de pedigree pero no es de compañia";

        return txt;
    }

}
