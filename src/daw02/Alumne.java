package daw02;

public class Alumne {
    private int edat;


    public Alumne(){
        this.edat =  (int) ((Math.random() * (41 - 17)) + 17);
    } 

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Alumne [edat=" + edat + "]";
    }

}
