package daw01.recuperacion.Uf1.Uf2.Uf3;

public class Uf1_Ex2 {
    public static void main(String[] args) {
        int pesoPescacado [] = {7, 15,44, 38, 39, 46, 17, 46, 12, 34, 36, 46};
        int contador = 0;

        for (int i = 0; i < pesoPescacado.length; i++) {
            contador ++;
            if (pesoPescacado[i] >= 5 && pesoPescacado[i]<= 50){
                System.out.print("Pescador " + contador + " recibe: " + pesoPescacado[i] * 8 + " euros \n");
            }
        }
    }
}