package practica;

public class Persona {
    private String nombre;
    private String apellido;

    public String nom(){
        return nombre;
    }    
    public String ap(){
        return apellido;
    }
    
    public void saluda(){
        System.out.println("Hola soy javi");
    }

    public void saluda(String texto){
        System.out.println(texto);
    }

}

