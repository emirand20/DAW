package daw01.variables;

public class EjerciciosExpresionesLogicas {
    public static void main(String[] args) {
        //Mañana ire al cine si mi madre me da 5 euros y yo encuentro 15 y si no llueve y Laura viene conmigo
        boolean irCine;
        boolean encontrar;
        boolean cincoEuros;
        boolean lluvia;
        boolean lauraViene;
        // Respulta que el martes mi madre me da 3 euros, encuentro 15, no llueve pero Laura no puede venir conmigo

        //martes
        encontrar = true;
        cincoEuros = false;
        lluvia = false;
        lauraViene = false;
        irCine = encontrar && cincoEuros && !lluvia && lauraViene;

        System.out.println(irCine);

    }
}
