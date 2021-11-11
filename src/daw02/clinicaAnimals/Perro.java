package clinicaAnimals;

public class Perro extends Animal{
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

    public Perro(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
    }

    @Override
    public String toString() {
        if(pedigree == true  && compañia == true){
            return "El perro de raza " + raza + " es de pedigree y es de compañia";
        }else if(pedigree == false  && compañia == false){
            return "El perro de raza " + raza + " no es de pedigree y no es de compañia";
        }else if(pedigree == false  && compañia == true){
            return "El perro de raza " + raza + " no es de pedigree pero es de compañia";            
        }
        return "El perro de raza " + raza + " es de pedigree pero no es de compañia";            
    }
}
