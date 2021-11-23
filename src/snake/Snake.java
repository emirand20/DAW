import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit; //para visualizar en que parte de la pantalla queremos las ventanas

import java.awt.Point;


/**
 * jFrame es una clase que hereda de otros paquetes, que pertenecen a la
 * biblioteca grafica (java.swing) y gracias a jFrame podemos crear ventanas y
 * objetos para poner dentro de estas ventanas
 */

public class Snake extends JFrame {

    int widht = 600;
    int height = 480;
    public Snake() {
        setTitle("Snake");// titulo en la parte superior
        setSize(widht, height);// largo y ancho
        setVisible(true);// hacemos visible la ventana
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-widht/2, dim.height/2-height/2); //se nos crea una ventana en medio de la pantalla

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cuando cerremos la ventana sale del programa
    }
}