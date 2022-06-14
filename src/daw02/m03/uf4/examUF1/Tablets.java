package m03.uf4.examUF1;

public class Tablets extends Dispositiu{
    private double tamany;

    public Tablets(String marca, String model, double preuBase, double d) {
        super(marca, model, preuBase);
        this.tamany = d;
    }

    public double getTamany() {
        return tamany;
    }

    public void setTamany(int tamany) {
        this.tamany = tamany;
    }

    @Override
    public String toString() {
        return "Tablets [tamany=" + tamany + "]";
    }
    
}
