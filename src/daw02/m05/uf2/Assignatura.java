package m05.uf2;

public class Assignatura {

    private long id;
    private String nom;
    private int hores;
    private int credits;
    private boolean disponible;

    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }

    public Assignatura() {
        this.id = 0;
        this.nom = null;
        this.hores = 0;
        this.credits = 0;
        this.disponible = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
