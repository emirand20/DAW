package uf4.practica;

public class Coach extends Persona{
    private String nombre;
    private String apellidos;
    public String equipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void saluda(){
        System.out.println("soy entrenador");
    }

    public void equipo(){
        System.out.println("¡Soy entrenador del barça femenino!");
    }
    
}
