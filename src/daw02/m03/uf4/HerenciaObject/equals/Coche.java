package m03.uf4.HerenciaObject.equals;

public class Coche {
    private String marca;
    private String modelo;
    private String motorizacion;
    
    public Coche(String marca, String modelo, String motorizacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.motorizacion = motorizacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotorizacion() {
        return motorizacion;
    }

    
}
