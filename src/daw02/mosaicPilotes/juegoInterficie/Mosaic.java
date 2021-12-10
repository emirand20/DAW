import java.awt.Color;
import java.awt.Point;
import net.balmes.m03.jocgrafic.Jocs.JocProcessing;
import net.balmes.m03.jocgrafic.figures.Pilota;

public class Mosaic extends JocProcessing{

    public Pilota p1;
    public Pilota p2;
    public Pilota p3;
    public Pilota p4;    
    
    @Override
    public void jocSettings() {
        size(900, 600);
    }

    @Override
    public void jocSetup() {
        frameRate(60);
        background(0);
        p1 = new Pilota(2,3,10, Color.BLUE, new Point(width/2, height / 2));
        p1.dibuixa(this);
        p2 = new Pilota(-2,-3,10, Color.BLUE, new Point(width/2, height / 2));
        p2.dibuixa(this);        
        p3 = new Pilota(2,-3,10, Color.BLUE, new Point(width/2, height / 2));
        p3.dibuixa(this);
        p4 = new Pilota(-2,3,10, Color.BLUE, new Point(width/2, height / 2));
        p4.dibuixa(this);            

    }

    @Override
    public void jocJugada() {
        if (keyPressed){
            noLoop();
        }
        //background(0);
        p1.mou(this);
        p1.dibuixa(this);
        p2.mou(this);
        p2.dibuixa(this);   
        p3.mou(this);
        p3.dibuixa(this);
        p4.mou(this);
        p4.dibuixa(this);

    }

    @Override
    public boolean jocEsFinal() {
        return false;
    }

    @Override
    public void jocFinal() {
        if(!jocEsFinal()){
            jocJugada();
        } else {
            jocFinal();
        } 

    }
    public static void main(String[] args) {
        Mosaic.runSketch(new String[]{"Quina passada"},
                new Mosaic());
    }
}