package m03.uf4.herenciaII.tallerRenfe;

public class Vagon extends Tren {
    private int peso;
    private int nRuedas;
    private int añoFabricacion;
    private int ultRevision;
    private boolean estadoVagones;
    private int nVagones;
    
    public Vagon(int nTrenes, int peso, int nRuedas, int añoFabricacion, int ultRevision,
            boolean estadoVagones){
        super(nTrenes);
        this.peso = peso;
        this.nRuedas = nRuedas;
        this.añoFabricacion = añoFabricacion;
        this.ultRevision = ultRevision;
        this.estadoVagones = estadoVagones;
    }

    
}