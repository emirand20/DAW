package m03.uf4.examUF1;

public class Dispositiu {
    private String marca;
    private String model;
    public double preuBase;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPreuBase() {
        return preuBase = preuBase - (preuBase % 30);
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    public Dispositiu(String marca, String model, double preuBase) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
    }

    @Override
    public String toString() {
        return "Dispositiu [marca=" + marca + ", model=" + model + ", preuBase=" + preuBase + "]";
    }

    
}
