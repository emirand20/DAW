package uf4.herenciaII.tallerRenfe;

public class vNuevo extends Vagon{
    private int nFabricacion;
    private int nAsienstos;
    private int nPlazasDpie;
    private int nNuevos;
    public int totalSillas;

    public vNuevo(int nTrenes, int peso, int nRuedas, int añoFabricacion, int ultRevision, boolean estadoVagones,
            int nFabricacion, int nAsienstos, int nPlazasDpie, int nNuevos) {
        super(nTrenes, peso, nRuedas, añoFabricacion, ultRevision, estadoVagones);
        this.nFabricacion = nFabricacion;
        this.nAsienstos = nAsienstos;
        this.nPlazasDpie = nPlazasDpie;
        this.nNuevos = nNuevos;
    }

    public int getnFabricacion() {
        return nFabricacion = 2015;
    }

    public int sillasN(){
        this.nAsienstos = 70;

        this.totalSillas = this.nAsienstos * this.nNuevos;
        return totalSillas;
    }

    public int getnPlazasDpie() {
        return nPlazasDpie = 110;
    }

    @Override
    public String toString() {
        return "El vagon nuevo tiene " + nAsienstos + " asientos, con año de fabricacion  del " + nFabricacion + " y un numero de plazas de pie " + nPlazasDpie;

    }

    
}
