package m03.uf4.clinicaAnimals;

public class Mascotas extends Animal{
    private String nombre;
    private int fechaNacimiento;
    public Animal animal;

    public Mascotas(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia, String nombre, int fechaNacimiento, Animal animal) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.animal = animal;
    }
}
