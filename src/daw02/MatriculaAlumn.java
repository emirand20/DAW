package daw02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MatriculaAlumn {
    public static void main(String[] args) {

        int edad [] = {17, 40};
        Alumnes clase = new Alumnes(edad);
        System.out.println(clase.toString());
    }
    
}