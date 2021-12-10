import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;

/**
 * @author Juanma Sanchez
 */
public class Cercle extends Figura{
    public static final float RADI_PER_DEFECTE = 10;
    
    private float radi; //float per coherència amb PApplet processing

    public Cercle(float radi, Color color, Point point) {
        super(color, point);
        this.radi = radi;
    }

    public Cercle() {
        this(RADI_PER_DEFECTE, COLOR_PER_DEFECTE, POINT_PER_DEFECTE);
    }   
    @Override
    public void dibuixa(PApplet finestra) {
        finestra.fill(getColor().getRGB());        
        finestra.ellipse(getPoint().x, getPoint().y, 2*radi, 2*radi);
    }

//<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
    public float getRadi() {
        return radi;
    }
    
    public void setRadi(float radi) {
        this.radi = radi;
    }
//</editor-fold>   
}