import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit; //para visualizar en que parte de la pantalla queremos las ventanas
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Point;

/**
 * jFrame es una clase que hereda de otros paquetes, que pertenecen a la
 * biblioteca grafica (java.swing) y gracias a jFrame podemos crear ventanas y
 * objetos para poner dentro de estas ventanas
 */

public class Snake extends JFrame {

    int widht = 600;
    int height = 480;

    Point snake;
    Point comida;

    ArrayList<Point> lista = new ArrayList<Point>();

    int widthPoint = 10;
    int heightPoint = 10;
    ImagenSnake imagenSnake;

    int direccion = KeyEvent.VK_LEFT;
    long frecuencia = 25 ; // actualizaremos el juego cada 20 milisegundos

    public Snake() {
        setTitle("Snake");// titulo en la parte superior
        setSize(widht, height);// largo y ancho

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // se nos crea una ventana en medio lapantalla
        this.setLocation(dim.width / 2 - widht / 2, dim.height / 2 - height / 2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cuando cerremos la ventana sale del programa

        Teclas tecla = new Teclas();
        addKeyListener(tecla);// creamos el objeto tecla

        stardGame();

        imagenSnake = new ImagenSnake();
        this.getContentPane().add(imagenSnake);

        setVisible(true);// hacemos visible la ventana

        Momento momento = new Momento();
        Thread trid = new Thread(momento); // hace el manejo del juego
        trid.start();
    }

    public void stardGame(){
        comida = new Point(200,200); //comida es un nuevo punto
        snake = new Point(widht / 2, height / 2);
        

        lista = new ArrayList<Point>();
        //lista.add(snake); 
        crearComida();
    }

    public void crearComida(){
        Random rnd = new Random();

        comida.x = rnd.nextInt(widht);
        if((comida.x % 5) > 0){
            comida.x = comida.x - (comida.x % 5); 
        }

        if(comida.x < 5){
            comida.x = comida.x + 10;
        }

        comida.y = rnd.nextInt(height);
        if((comida.y % 5) > 0){
            comida.y = comida.y - (comida.y % 5); 
        }

        if(comida.y < 5){
            comida.y = comida.y + 10;
        }
    }

    public class ImagenSnake extends JPanel {

        // Point snake;
        // int widthPoint = 10;
        // int heightPoint = 10;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.black); // establecemos el color del panel snake
            g.fillRect(snake.x, snake.y, widthPoint, heightPoint);

            g.setColor(Color.RED);  // establecemos el color del panel comida
            g.fillRect(comida.x, comida.y, widthPoint, heightPoint);
        }

    }

    public void actualizar() {
        imagenSnake.repaint();

        lista.add(0, new Point(snake.x, snake.y));
        lista.remove((lista.size()- 1));

        if((snake.x > (comida.x - 10) && (snake.x < ((comida.x + 10)) && snake.y > (comida.y - 10)) && snake.y < (comida.y + 10))){
            lista.add(0, new Point(snake.x, snake.y));
            crearComida();
        }
    }

    public class Teclas extends KeyAdapter {

        // int direccion = KeyEvent.VK_LEFT;

        @Override
        public void keyPressed(KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) { // esta funcion lo que nos hara que cuando apretemos el escape
                                                        // salga. VK_ es la referencia para cualquier tecla.
                System.exit(0);
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                if (direccion != KeyEvent.VK_DOWN) {
                    direccion = KeyEvent.VK_UP;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                if (direccion != KeyEvent.VK_UP) {
                    direccion = KeyEvent.VK_DOWN;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                if (direccion != KeyEvent.VK_RIGHT) {
                    direccion = KeyEvent.VK_LEFT;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                if (direccion != KeyEvent.VK_LEFT) {
                    direccion = KeyEvent.VK_RIGHT;
                }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            super.keyReleased(e);
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // super.keyTyped(e);
            char letra = e.getKeyChar();
            System.out.println(letra); // nos va a devolver la tecla que hemos pulsado
        }

    }

    public class Momento extends Thread {

        long last = 0;

        public void run() {
            while (true) {
                if ((java.lang.System.currentTimeMillis() - last) > frecuencia) {

                    if (direccion == KeyEvent.VK_UP) {
                        snake.y = snake.y - heightPoint; // si subes restas la cantidad de mm que tienes arriba
                        if (snake.y > height) {
                            snake.y = 0;
                        }
                        if (snake.y < 0) {
                            snake.y = height - heightPoint;
                        }
                    } else if (direccion == KeyEvent.VK_DOWN) {
                        snake.y = snake.y + heightPoint;
                        if (snake.y > height) {
                            snake.y = 0;
                        }
                        if (snake.y < 0) {
                            snake.y = height - heightPoint;
                        }
                    } else if (direccion == KeyEvent.VK_LEFT) {
                        snake.x = snake.x - widthPoint;
                        if (snake.x > widht) {
                            snake.x = 0;
                        }
                        if (snake.x < 0) {
                            snake.x = widht - widthPoint;
                        }
                    } else if (direccion == KeyEvent.VK_RIGHT) {
                        snake.x = snake.x + widthPoint;
                        if (snake.x > widht) {
                            snake.x = 0;
                        }
                        if (snake.x < 0) {
                            snake.x = widht - widthPoint;
                        }
                    }
                    actualizar();
                    last = java.lang.System.currentTimeMillis();
                }
            }
        }
    }

}