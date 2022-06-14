package m03.uf05.conjuntsSets;


import java.util.TreeSet;

public class LikesUsuari {
    private String nom;
    private TreeSet<Integer> likes;

    public LikesUsuari(String nom){
        this.nom = nom;
    }
    public void ferLike(int idFoto){
        if(likes.contains(idFoto))
        likes.remove(idFoto);
        else 
        likes.add(idFoto);
    }
}
