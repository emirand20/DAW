package m03.uf05.colecciones;

public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;
    
    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Libro){
            Libro otro = (Libro)obj;

            if(this.ISBN == otro.ISBN){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public String getDatos() {
        return "Libro [ISBN=" + ISBN + ", autor=" + autor + ", titulo=" + titulo + "]";
    }

    
}

