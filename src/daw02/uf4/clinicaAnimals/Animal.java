package uf4.clinicaAnimals;

public class Animal{
    private int nPatas;
    private String especie;
    private int fechaIngreso;
    private boolean malo;
    private int esperanzaVida;
    private String salvajeCompañia;

    public Animal(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia) {
        this.nPatas = nPatas;
        this.especie = especie;
        this.fechaIngreso = fechaIngreso;
        this.malo = malo;
        this.esperanzaVida = esperanzaVida;
        this.salvajeCompañia = salvajeCompañia;
    }
    
    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isMalo() {
        return malo;
    }

    public void setMalo(boolean malo) {
        this.malo = malo;
    }

    public int getEsperanzaVida() {
        return esperanzaVida;
    }

    public void setEsperanzaVida(int esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }

    public String getSalvajeCompañia() {
        return salvajeCompañia;
    }

    public void setSalvajeCompañia(String salvajeCompañia) {
        this.salvajeCompañia = salvajeCompañia;
    }

    @Override
    public String toString() {
        if (malo == true){
        return "El animal tiene " + nPatas + " patas, es de especie " + especie + ", fue ingresado " + fechaIngreso + ", esta enfermo y tiene una esperanza de vida de " + esperanzaVida + " y es " + salvajeCompañia;
        }return "El animal tiene " + nPatas + " patas, es de especie " + especie + ", fue ingresado " + fechaIngreso + ", no esta enfermo, tiene una esperanza de vida de " + esperanzaVida + " y es " + salvajeCompañia;
    }
    
}