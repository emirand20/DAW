package m03.uf4.trercerAc;

import java.awt.color.*;

public class Color extends java.awt.Color{

    public Color(int r, int g, int b) {
        super(r, g, b);
    }

    
    static final Color ROJO_COLOR(){
        Color rColor = new Color(255,0,0);
        return rColor;
    }

    static final Color VERDE_COLOR(){
        Color vColor = new Color(0, 255, 0);
        return vColor;
    }

    static final Color AZUL_COLOR(){
        Color aColor = new Color(0,0,255);
        return aColor;
    }
}