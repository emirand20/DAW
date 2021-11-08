package clinicaAnimals;

public class Mascotas extends Animals{
    private String nombre;
    private int fechaNacimiento;
    public Animals animal;

    public Mascotas(int nPatas, String especie, int fechaIngreso, boolean malo, int esperanzaVida,
            String salvajeCompañia, String nombre, int fechaNacimiento, Animals animal) {
        super(nPatas, especie, fechaIngreso, malo, esperanzaVida, salvajeCompañia);
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.animal = animal;
    }
}
