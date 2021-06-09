package daw01.recuperacion.Uf1.Uf2.Uf3;

public class Uf1_Ex3 {
    public static void main(String[] args) {
        String consonantes[] = {"c", "m", "s", "t", "r"};
        String vocales[] = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < 2; i++) {
            int a = (int) (Math.random() * consonantes.length);
            int b = (int) (Math.random() * vocales.length);
            System.out.print(consonantes[a] + vocales[b] );


        }
    }
}
