package uf4.trercerAc;

import java.awt.Point;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        MiPunto punto1 = new MiPunto(3, 4);
        Color color1 = new Color(121, 121, 121);
        Cercle circulo = new Cercle(2, punto1, color1);
        
        circulo.area();
        circulo.perimetre();
        circulo.getOrigen();
        circulo.Cercle();
        circulo.getRadio();
        circulo.toString();
        circulo.getRadio();


        MiPunto punto2 = new MiPunto(3, 4);
        Color color2 = new Color(121, 121, 121);
        Rectangle rectangle = new Rectangle(2,5, punto2, color2);
        
        
        rectangle.area();
        rectangle.getHeight();
        rectangle.getHeight();
        rectangle.getWidth();
        rectangle.rectangle();
        rectangle.getOrigen();
        rectangle.setHW(2, 5);
        rectangle.toString();
    }
}
