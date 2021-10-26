package herenciaII.tallerRenfe;

public class mElectrica extends Vagon{
    private String voltaje;
    private String amperaje;
    
    public mElectrica(int nTrenes, int peso, int nRuedas, int añoFabricacion, int ultRevision, boolean estadoVagones,
            String voltaje, String amperaje) {
        super(nTrenes, peso, nRuedas, añoFabricacion, ultRevision, estadoVagones);
        this.voltaje = voltaje;
        this.amperaje = amperaje;
    }

    @Override
    public String toString() {
        return "mElectrica [amperaje=" + amperaje + ", voltaje=" + voltaje + "]";
    }
    
    
}