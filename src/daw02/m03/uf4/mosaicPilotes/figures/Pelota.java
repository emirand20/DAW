package m03.uf4.mosaicPilotes.figures;
// import java.awt.Color;
// import java.awt.Point;
// import processing.core.PApplet;

// /**
//  *
//  * @author Juanma Sanchez
//  */
// public class Pilota extends Cercle {

//     public final static float VX_PER_DEFECTE = 1;
//     public final static float VY_PER_DEFECTE = 1;

//     protected double vX;
//     protected double vY;

//     public Pilota(float vX, float vY, float radi, Color color, Point point) {
//         super(radi, color, point);
//         this.vX = vX;
//         this.vY = vY;
//     }

//     public Pilota() {
//         this(VX_PER_DEFECTE, VY_PER_DEFECTE, RADI_PER_DEFECTE, COLOR_PER_DEFECTE, POINT_PER_DEFECTE);
//     }

//     public void mou(PApplet finestra) {
//         getPoint().x += (int) vX;
//         if (getPoint().x < 0){
//             vX = -vX;
//         }
//         if (getPoint().x > 900){
//             vX = -vX;
//         }
        
//         getPoint().y += (int) vY;
//         if (getPoint().y < 0){
//             vY = -vY;
//         }
//         if (getPoint().y > 600){
//             vY = -vY;
//         }
//     }

// //<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
//     public double getvX() {
//         return vX;
//     }
    
//     public void setvX(double vX) {
//         this.vX = vX;
//     }
    
//     public double getvY() {
//         return vY;
//     }
    
//     public void setvY(double vY) {
//         this.vY = vY;
//     }
// //</editor-fold>

    
// }