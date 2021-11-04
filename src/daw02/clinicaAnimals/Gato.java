package clinicaAnimals;

public class Gato extends Animals{
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

    @Override
    public String toString() {
        if(pedigree == true  && compañia == true){
            return "El gato de raza " + raza + " es de pedigree y es de compañia";
        }else if(pedigree == false  && compañia == false){
            return "El gato de raza " + raza + " no es de pedigree y no es de compañia";
        }else if(pedigree == false  && compañia == true){
            return "El gato de raza " + raza + " no es de pedigree pero es de compañia";            
        }
        return "El gato de raza " + raza + " es de pedigree pero no es de compañia";
    }

    
}
