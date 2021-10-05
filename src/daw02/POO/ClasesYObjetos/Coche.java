package daw02.POO.ClasesYObjetos;

public class Coche {
    //Atributos
    String color;
    String marca;
    int km;

    //Metodos
            
    public static void main(String[] args) {

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche es: " + coche1.color);
        System.out.println("La marca del coche es: " + coche1.marca);
        System.out.println("El kilometraje del coche es " + coche1.km);

        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;

        System.out.println("\nEl color del coche es: " + coche2.color);
        System.out.println("La marca del coche es: " + coche2.marca);
        System.out.println("El kilometraje del coche es " + coche2.km);

    }
}
