package uf4.practica;

public class Persona {
    private String nombre;
    private String apellido;
    public String trabajo;

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void saluda(){
        System.out.println("Hola soy javi");
    }

    public void saluda(String texto){
        System.out.println(texto);
    }
    

}

