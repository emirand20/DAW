package daw01.funciones;

public class Coche {

    private int ruedas, largo, ancho, peso, precio;
    private String modelo, marca;

    public Coche() {

    }

    public Coche(int ruedas, int largo, int ancho, int peso, String modelo, String marca, int precio) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche [ancho=" + ancho + ", largo=" + largo + ", marca=" + marca + ", modelo=" + modelo + ", peso="
                + peso + ", ruedas=" + ruedas + "]";
    }

    public int getPrecio() {
        return precio;
    }

    public  int suma(Coche cocheA, Coche cocheB) {
        return cocheA.precio + cocheB.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
