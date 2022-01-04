package uf4.figuras;

import java.awt.Color;
import java.awt.Point;

public class Figura {
    public static final Color DEFAULT_COLOR = new Color(255, 0, 0); 
    public static final Point DEFAULT_ORIGIN = new Point(0,0);
    
   private Color color;
   private Point origin;

    public Figura() {
        this(DEFAULT_COLOR, DEFAULT_ORIGIN);
        //color = DEFAULT_COLOR;
        //origin = DEFAULT_ORIGIN;
    }

    //Constructor centralitzat
    public Figura(Color color, Point origin) {
        //centralitzar el control d'errors
        if (color == null) throw new IllegalArgumentException();
        this.color = color;
        this.origin = origin;
    }

    public Figura(Point origin) {
        this(DEFAULT_COLOR, origin);
    }

    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public Point getOrigin() {
        return origin;
    }
    
    public void setOrigin(Point origin) {
        this.origin = origin;
    }
    
    //mètode incorrecte ja que no podem calcular un perímetre 
    // si no sabem com és la figura
    public double perimeter(){
        return 0;
    }
    
    public double area(){
        return 0;
    } 

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + ", origin=" + origin + "}";
    }
    
    
    public static void main(String[] args) {
    	Figura f1 = new Figura(null, null);
    	Figura f2 = new Figura(new Point(2,3));
        System.out.println(f2.getOrigin().getX());
        System.out.println(f1);
        //System.out.println(s1.getOrigin().getX());
        
    }
}
