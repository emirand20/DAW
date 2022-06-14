package m03.uf4.herenciaII.tallerRenfe;

public class vAntiguo extends Vagon{
    private int nFabricacion;
    private int nAsienstos;
    private int nPlazasDpie;
    private int nAntiguos;
    public int totalSillas;

    public vAntiguo(int nTrenes, int peso, int nRuedas, int añoFabricacion, int ultRevision, boolean estadoVagones,
            int nFabricacion, int nAsienstos, int nPlazasDpie, int nAntiguos) {
        super(nTrenes, peso, nRuedas, añoFabricacion, ultRevision, estadoVagones);
        this.nFabricacion = nFabricacion;
        this.nAsienstos = nAsienstos;
        this.nPlazasDpie = nPlazasDpie;
        this.nAntiguos = nAntiguos;
    }

    public int getnFabricacion() {
        return nFabricacion = 2005;
    }

    public int sillasV(){
        this.nAsienstos = 60;
        
        this.totalSillas = this.nAsienstos * this.nAntiguos;
        return totalSillas;
    }

    public int getnPlazasDpie() {
        return nPlazasDpie = 120;
    }

    @Override
    public String toString() {
        return "El vagon antiguo tiene " + nAsienstos + " asientos, con año de fabricacion  del " + nFabricacion + " y un numero de plazas de pie " + nPlazasDpie;
    }
    
}
