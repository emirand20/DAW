package daw01.funciones;

public class Dni {

    private String dni;
    private boolean error = false;

    public Dni(String dni) {
        this.compruebaNum(dni);
    }

    private void compruebaNum(String dni) {
        dni = dni.substring(0, dni.length() - 1);
      

    }

}