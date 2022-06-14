package m03.uf4.trercerAc;

import java.awt.Point;


public class MiPunto extends java.awt.Point{
    //ponemos sumer* porque hereda del podre Point, por eso pornemos extense, y creamos el constructor con los parametros que 
    //tenemos
    public MiPunto(int x, int y) {
        super(x, y); 
    }

    static Point puntoMedio(Point p1, Point p2){
        int puntoMedioX = (int) (p1.getX() + p2.getX()) / 2;
        int puntoMedioY = (int) (p1.getY() + p2.getY()) / 2;

        Point puntoMedio = new Point(puntoMedioX,puntoMedioY);

        return puntoMedio;
    }

    static Point distanciaDosPuntos(Point p1,Point p2){
        int distanciaX = (int) (p1.getX() + p2.getX());
        int distanciaY = (int) (p1.getY() + p2.getY());

        Point distanciaDosPuntos = new Point(distanciaX, distanciaY);
        return distanciaDosPuntos;
    }
    public static void main(String[] args) {
        Point punto1 = new Point(0, 0);
        Point punto2 = new Point(100, 100);
        Point punto3 = new Point(20, 20);
  
        System.out.println(puntoMedio(punto1, punto2));
        System.out.println(puntoMedio(punto1, punto3));
        System.out.println(puntoMedio(punto2, punto3));

        System.out.println("\n\t---------------");
        System.out.println(distanciaDosPuntos(punto1, punto2));
        System.out.println(distanciaDosPuntos(punto1, punto3));
        System.out.println(distanciaDosPuntos(punto2, punto3));
      }
}