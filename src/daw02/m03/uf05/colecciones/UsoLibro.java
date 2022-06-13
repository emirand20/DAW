package m03.uf05.colecciones;

public class UsoLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("P en Java", "juan", 25);
        Libro libro2 = new Libro("P en Java", "juan", 23);

        if(libro1.equals(libro2)){
            System.out.println("Es el mismo libro");
        }else{
            System.out.println("No es le mismo libro");
        }
    }
}
