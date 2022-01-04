package uf4.herenciaII.tallerRenfe;

public class Tren {
    private int nTrenes;

    public Tren(int nTrenes) {
        this.nTrenes = nTrenes;
    }
    
    public int getnTrenes() {
        return nTrenes  ;
    }

    @Override
    public String toString() {
        return "Hay " + nTrenes + " tren. ";
    }    
}
