package m03.uf4.segundaAct;

public class BombetaMain {
    public static void main(String[] args) {
        Bombeta bombilla = new Bombeta();
        Bombeta[] bombiallas = new Bombeta[5]; 

        for (int i = 0; i < bombiallas.length; i++) {
            int intensidad = (int) (Math.random()*6+1);
            bombiallas[i].setIntensidad(intensidad);

            System.out.println(bombiallas[i].toString());
        }
    
    }
}
