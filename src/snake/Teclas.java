import java.awt.event.*; //para que nos permita interactuar con las teclas

// /**
//  * KeyListener es una interfaz que implementa tres metodos, KeyPressed(KeyEvent
//  * e),es llamado este metodo cuando una tecla es presionada,
//  * KeyReleased(KeyEvent e), en el momento que la tecla sube/levanta es invocado
//  * este metodo, KeyTyped(KeyEvent e), es la suma de los dos anteriores, cuando
//  * han tenido los dos sucesos es invocado.
//  */

// public class Teclas extends KeyAdapter {

//     int direccion = KeyEvent.VK_LEFT;

//     @Override
//     public void keyPressed(KeyEvent e) {

//         if (e.getKeyCode() == KeyEvent.VK_ESCAPE) { // esta funcion lo que nos hara que cuando apretemos el escape
//                                                     // salga. VK_ es la referencia para cualquier tecla.
//             System.exit(0);
//         } else if (e.getKeyCode() == KeyEvent.VK_UP) {
//             if (direccion != KeyEvent.VK_DOWN) {
//                 direccion = KeyEvent.VK_UP;
//             }
//         } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//             if (direccion != KeyEvent.VK_UP) {
//                 direccion = KeyEvent.VK_DOWN;
//             }
//         } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//             if (direccion != KeyEvent.VK_RIGHT) {
//                 direccion = KeyEvent.VK_LEFT;
//             }
//         } else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
//             if (direccion != KeyEvent.VK_LEFT) {
//                 direccion = KeyEvent.VK_RIGHT;
//             }
//     }

//     @Override
//     public void keyReleased(KeyEvent e) {
//         // TODO Auto-generated method stub
//         super.keyReleased(e);
//     }

//     @Override
//     public void keyTyped(KeyEvent e) {
//         // super.keyTyped(e);
//         char letra = e.getKeyChar();
//         System.out.println(letra); // nos va a devolver la tecla que hemos pulsado
//     }

// }
