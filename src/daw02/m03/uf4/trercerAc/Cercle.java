package m03.uf4.trercerAc;

import java.awt.Point;
import java.awt.Color;

public class Cercle extends Shape{
    private double radio;
    private Point org;

    public Cercle(double radio, Point point, Color color) {
        super(color, point);
        this.radio = radio;
    }
    public double area(){
        return 0;
    }
    public void Cercle(Point org, double radio){
        this.org = org;
        this.radio = radio;
    }
    public void Cercle(){
        for (int i = 0; i < radio; i++) {
            for (int j = 0; j < radio; j++) {
                System.out.print("o");
            }
        }
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double perimetre(){
        return 0;
    }

    @Override
    public String toString() {
        return "Cercle [org=" + org + ", radio=" + radio + "]";
    }

    
    
}
