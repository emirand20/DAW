package clinicaAnimals;

public class Clinica {

    // public Animal[] aAnimales = new Animal[6];
    private Animal[] animales = new Animal[6];

    // public Clinica(){
    // aAnimales[0] = new Gato(4, "Gato", 2-4-2, false, 16, "comañia");
    // aAnimales[1] = new Perro(4, "American", 2-4-2, false, 15, "compañia");
    // aAnimales[2] = new Pez(0, "Payaso", 2-4-2, true, 4, "compañia");
    // aAnimales[3] = new Serpiente(0, "Boa", 2-4-2, false, 9, "salvaje");
    // aAnimales[4] = new Tarantula(8, "Tarantula", 4-2-4, false, 8, "salvaje");
    // aAnimales[5] = new Tortuga(4, "Mediterranea", 2-4-2, true, 50, "salvaje");
    // }

    public Clinica() {
        animales[0] = new Gato(4, "Gato", 2 - 4 - 2, false, 16, "comañia", "Persa", false, true);
        animales[1] = new Perro(4, "Perro", 2 - 4 - 2, false, 15, "compañia", "American", false, true);
        animales[2] = new Pez(0, "Payaso", 2 - 4 - 2, true, 4, "compañia", "salada", true);
        animales[3] = new Serpiente(0, "Boa", 2 - 4 - 2, false, 9, "salvaje", true, true);
        animales[4] = new Tarantula(8, "Tarantula", 4 - 2 - 4, false, 8, "salvaje", true, true);
        animales[5] = new Tortuga(4, "Mediterranea", 2 - 4 - 2, true, 50, "salvaje", "marina", true);
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public void getAnimalesDetalles() {
        // this.animales[0].toString()
        for (Animal animal : this.animales) {
            System.out.println(animal.getEspecie());
        }

    }

}
