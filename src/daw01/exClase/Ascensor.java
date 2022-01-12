import java.util.Scanner;

public class Ascensor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] pisos = {"S4", "S3", "S2", "S1", "PB", "P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9"};

        int aleatorio = (int) (Math.random() * 12);

        String ubiAscensor;
        do {
            ubiAscensor = pisos[aleatorio];
        } while (ubiAscensor.equals("P8") || ubiAscensor.equals("P9"));

        System.out.println("El ascensor esta en la planta: " + ubiAscensor);

        String plantaNueva;
        boolean busca = false;
        do {
            System.out.println("A que planta quiere ir?");
            plantaNueva = entrada.next();
            for (int i = 0; i < pisos.length && !busca; i++) {
                if (pisos[i].equals(plantaNueva)) {
                    busca = true;
                }
            }
            if (!busca){
                System.out.println("no existe");
            }
        } while (!busca);


        if (plantaNueva.equals(ubiAscensor)) {
            System.out.println("Ya esta ahi");
        } else if (plantaNueva.equals("P8") || plantaNueva.equals("P9")) {
            System.out.println("Planta restringida");
        } else {
            int ascensor = 0;
            int user = 0;

            for (int i = 0; i < pisos.length; i++) {
                if (plantaNueva.equals(pisos[i])) {
                    user = i;
                }
                if (ubiAscensor.equals(pisos[i])) {
                    ascensor = i;
                }
            }
            if (user < ascensor) {
                System.out.println("Ascensor bajando a la planta " + plantaNueva);
            } else {
                System.out.println("Ascensor subiendo a la planta " + plantaNueva);
            }
        }


    }
}
