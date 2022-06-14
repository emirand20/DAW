package m03.uf4.herenciaII.tpv;

public class Carrito{
    public static void main(String[] args) {
        Leche leche = new Leche("Pascual", 3, "Pascual", "3-4-2004", 5, true);
        Agua agua = new Agua("Viladrau", 5, "Viladrau", "3-1-1001", 4.1, 4.1);
        Cafe cafe = new Cafe("Nestcafe", 5, "Nestcafe", "3-1-031", "Polonia", 4.1, 5);
        Conserva cons = new Conserva("Lentejas", 5, "Hacendado", "5-4-Ac.1", 5.1, "Lentejas");
        Pan pan = new Pan("Integral", 5, "Mercadona", "4-1-Ad.2", 1.2 , "Trigo");
       
        System.out.println("\n" + leche + "\n" + agua + "\n" + cafe + "\n" + cons + "\n" + pan);     
    }
   
}
