package daw01.cmiranda;

public class Dni {

    private int number;
    private char letter;

    public Dni(String Dni) {
        if (Dni.length() == 9 && comprueba_numero(Dni)) {
            System.out.println();
        }
    }

    private boolean comprueba_numero(String Dni) {
        String solo_numeros = "";
        for (int i = 0; i < Dni.length() - 1; i++) {
            solo_numeros += Dni.charAt(i);
        }

        if (Integer.parseInt(solo_numeros) > 0) {
            this.number = Integer.parseInt(solo_numeros);

        }

        return Integer.parseInt(solo_numeros) > 0;
    }

}
