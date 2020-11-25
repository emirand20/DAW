package daw01.variables;

public class Variables01 {
    public static void main(String[] args) {
        //1. Variables primitivas
        int numeroEntero = 3;
        double numeroDecimal = 0.3;
        boolean síNo= true;
        //2. Variable avanzada ""
        String texto = " hola javi esto es un texto ";

       /* boolean fem= true && false && false && (false || true);
        System.out.println(fem);*/

        boolean reserva=true,plou=true;
        String  dia="diumenge";
        int personas = 11, coches = 2;
        boolean fem = reserva  && !plou && personas <= coches*5 && (dia.equals("dissabte")||dia.equals("diumenge"));
        System.out.println("Farem la barbacoa ? "+fem);
    }
}
