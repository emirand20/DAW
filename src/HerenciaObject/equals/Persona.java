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

    /*
     * @Override
     * public int hashCode() {
     * final int prime = 31;
     * int result = 1;
     * result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
     * result = prime * result + ((fechaDeNacimiento == null) ? 0 :
     * fechaDeNacimiento.hashCode());
     * result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
     * return result;
     * }
     * 
     * @Override
     * public boolean equals(Object obj) {
     * if (this == obj)
     * return true;
     * if (obj == null)
     * return false;
     * if (getClass() != obj.getClass())
     * return false;
     * Persona other = (Persona) obj;
     * if (apellidos == null) {
     * if (other.apellidos != null)
     * return false;
     * } else if (!apellidos.equals(other.apellidos))
     * return false;
     * if (fechaDeNacimiento == null) {
     * if (other.fechaDeNacimiento != null)
     * return false;
     * } else if (!fechaDeNacimiento.equals(other.fechaDeNacimiento))
     * return false;
     * if (nombre == null) {
     * if (other.nombre != null)
     * return false;
     * } else if (!nombre.equals(other.nombre))
     * return false;
     * return true;
     */
    @Override
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

    }
}
