package clinicaAnimals;

public class Clinica {
    public static void main(String[] args) {
        Animals tarantula = new Tarantula(8, "especie", 2-1-2, false, 9, "compañia", false, false);
        Animals serpiente = new Serpiente(0, "especie", 2-4-2, false, 8, "salvaje", true, true);
        Animals tortuga = new Tortuga(4, "especie", 2-4-7, true, 5, "compañia", "marina", true);
        Animals perro = new Perro(4, "especie", 4-5-2, false, 14, "compañia", "American", true, true);

        System.out.println(tarantula + "\n" + serpiente + "\n" + tortuga);
    }
}
