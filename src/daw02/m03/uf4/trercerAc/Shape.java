package m03.uf4.trercerAc;

import java.awt.Point;
import java.awt.Color;

public class Shape{
   private final Color color;
   private final Point origin;
   private Color col;
   private Point org; 


   public double area(){
    return 0;
   }
   public Color getColor(){
       return color;
   }
   public Point getOrigen(){
       return origin;
   }
   public double perimetre(){
       return 0;
   }
    public void setColor(Color color) {
    this.col = col;
    }
    public void setOrigen(Point origen) {
    this.org = org;
    }
    
    protected Shape(Color col, Point org){
        this.color = col;
        this.origin = org;
    }
    @Override
    public String toString() {
        return "Shape [col=" + col + ", color=" + color + ", org=" + org + ", origin=" + origin + "]";
    }

    protected void Shape(){
        this.org = org;
    }
}
