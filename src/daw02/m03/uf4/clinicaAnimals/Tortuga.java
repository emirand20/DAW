package m03.uf4.clinicaAnimals;

public class Tortuga extends Animal{
    private String marinaTerrestre;
    private boolean compañia;

    public Tortuga(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia, String marinaTerrestre, boolean compañia) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.marinaTerrestre = marinaTerrestre;
        this.compañia = compañia;
    }

    public Tortuga(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
    }

    @Override
    public String toString() {
        if(marinaTerrestre == "marina" && compañia == true){
            return "La tortuga es marina y es de compañia";
            }else if(marinaTerrestre == "terrestre" && compañia == false){
                return "La tarantula es terrestre y no es de compañia.";
            }else if(marinaTerrestre == "marina" && compañia == false){
                return "La tarantula es marina y no es de compañia.";
            }
                return "La tarantula es terrestre y es compañia.";
        }
    }