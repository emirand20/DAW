package clinicaAnimals;

public class Clinica {
    
    public Animal[] aAnimales;

    public Clinica(){
        Animal aAnimales[] = new Animal[6];
        aAnimales[0] = new Gato(4, "Persa", 2-4-2, false, 16, "comañia");
        aAnimales[1] = new Perro(4, "American", 2-4-2, false, 15, "compañia");
        aAnimales[2] = new Pez(0, "Payaso", 2-4-2, true, 4, "compañia");
        aAnimales[3] = new Serpiente(0, "Boa", 2-4-2, false, 9, "salvaje");
        aAnimales[4] = new Tarantula(8, "Tarantula", 4-2-4, false, 8, "salvaje");
        aAnimales[5] = new Tortuga(4, "Mediterranea", 2-4-2, true, 50, "salvaje");

    }

}
