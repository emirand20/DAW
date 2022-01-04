package uf4.herenciaII.tallerRenfe;

public class mGasolina extends Vagon{
    private String potCV;
    private String autonomia;
    
    public mGasolina(int nTrenes, int peso, int nRuedas, int añoFabricacion, int ultRevision, boolean estadoVagones,
            String potCV, String autonomia) {
        super(nTrenes, peso, nRuedas, añoFabricacion, ultRevision, estadoVagones);
        this.potCV = potCV;
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "mGasolina [autonomia=" + autonomia + ", potCV=" + potCV + "]";
    }

}
