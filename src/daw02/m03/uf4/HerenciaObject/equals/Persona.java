package m03.uf4.HerenciaObject.equals;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, String apellidos, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

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

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (this == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        // casteamos a la clase correcta
        Persona p = (Persona) obj;

        return Object.equals(nombre, p.nombre) && Object.equals(apellidos, p.apellidos) // queda mucho mejor que todo el
                                                                                        // bloque que esta por encima
                && Object.equals(fechaDeNacimiento, p.fechaDeNacimiento);

    }*/
}
