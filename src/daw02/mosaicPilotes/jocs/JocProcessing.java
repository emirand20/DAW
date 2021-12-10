import net.balmes.m03.jocgrafic.JocInterface.JocInterface;
import processing.core.PApplet;

/**
 * @author Juanma Sanchez
 */
public abstract class JocProcessing extends PApplet implements JocInterface {
    
    
    @Override
    public void settings(){
        jocSettings();
    }
    
    @Override
    public void setup(){
        jocSetup();
    }
    
    @Override
    public void draw(){
        if(!jocEsFinal()){
            jocJugada();
        } else {
            jocFinal();
        } 
    }
    
}