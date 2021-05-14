package daw01.exameneUF1b;

public class Ej2 {
    public static void main(String[] args) {
        String dias[] = {"Lunes", "Miercoles", "Viernes"};
        String m[] = {"M1", "M2", "M3", "M4"};

        //No puedes poner un Fori mayor dentro de uno mas pequeño

        int cont = 0; //lo ponemos para que vaya sumando el numero de mascarillas
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < dias.length; j++) {
                System.out.print(dias[j] + "-" + m[cont] + " ");
                cont++;//sumamos ++, para que al entrar en el if siga por donde se a quedado

                if (cont == m.length){
                    cont = 0;
                }
            }
            System.out.println();
        }
    }
}