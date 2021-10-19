package trercerAc;

import java.awt.Color;
import java.awt.Point;

import primeraAct.foo;

public class Rectangle extends Shape{
    double height;
    double width;
    private Point org;

    public Rectangle(double height, double width, Point point, Color color) {
        super(color, point);
        this.height = height;
        this.width = width;
    }

    public double area(){
        return 0;
    }
    
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double perimetre(){
        double perimetre = 2 * (height + width);
        return perimetre;
    }

    public void Rectangle(Point org, double h, double w){
        this.org = org;
        this.height = h;
        this.width = w;
    }

    public void rectangle(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("-");
            }
        } 
        System.out.println();
    }
    

    public void setHW(double height,double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle [height=" + height + ", width=" + width + "]";
    }
    
    
}
