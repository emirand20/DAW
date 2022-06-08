package m05.uf2;

public class GestionAcademica {
    private static final String horas = "Les hores de l'assignatura: ";
    private static final String son = " son";

    public static void main(String[] args) {
        int hours = 0;
        double cost = 0;

        Assignatura assig = new Assignatura(1, "Desenvolupament web", 22, 2, true);;
        hours = assig.getHores();
        System.out.println(horas + assig.getNom() + son + hours);

        cost = (hours * 15.5) + (hours * 15.5 * 21 / 100);
        System.out.println(horas + assig.getNom() + son + cost);

    }

}
