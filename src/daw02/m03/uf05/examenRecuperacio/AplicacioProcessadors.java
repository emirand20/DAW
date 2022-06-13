package m03.uf05.examenRecuperacio;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeSet;;

public class AplicacioProcessadors {

    private String nom;
    private double preu;
    private Date data;

    public AplicacioProcessadors(String nom, double preu, Date data) {
        this.nom = nom;
        this.preu = preu;
        this.data = data;
    }

    // Entrar un processador (no s’admeten duplicats)
    public boolean equals(final Object obj) {
        if (obj instanceof AplicacioProcessadors) {
            final AplicacioProcessadors otro = (AplicacioProcessadors) obj;
            if (this.nom == otro.nom) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean compareTo(AplicacioProcessadors e){
        boolean estado = false;
        if(nom.equals(e)){
            estado = true;
        }else{
            estado = false;
        }
        return estado;
    }

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    @Override
    public String toString() {
        return "nom: " + nom + ", preu: " + preu + " euros";
    }
}
