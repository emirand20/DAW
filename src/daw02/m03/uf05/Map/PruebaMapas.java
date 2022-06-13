package m03.uf05.Map;
import java.util.Map;
import java.util.HashMap;


public class PruebaMapas {
    class Empleado{
        private String nombre;
        private double sueldo;

        public Empleado(String n){
            nombre = n;
            sueldo = 2000;
        }

        @Override
        public String toString() {
            return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
        }
    }
    /*public static void main(String[] args) {
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
        personal.put("145", new Empleado("Juan"));
        personal.put("146", new Empleado("Ana"));
        personal.put("147", new Empleado("Antonio"));
        personal.put("148", new Empleado("Sandra"));

        System.out.println(personal);

        personal.put("148", new Empleado("Natalia"));
        System.out.println(personal.entrySet());
    }*/
}
