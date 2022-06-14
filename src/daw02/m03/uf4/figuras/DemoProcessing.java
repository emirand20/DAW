package m03.uf4.figuras;

// import processing.core.PApplet;

// public class DemoProcessing extends PApplet{
    
//     @Override
//     public void settings(){ //s'executa abans de que es creei el marc
//         size(600, 400); //definir la mida del marc
//         System.out.println(width); //amplada que hem definit
//         System.out.println(height); //alçada que hem definit
//     }
    
//     //S'executa un unic cop. Dibuixa el primer marc.
//     @Override
//     public void setup(){
//         background(0); //canviar el color de fons
//         fill(0, 0, 255);//Indicar el color per pintar la següent figura
//         this.ellipse(300, 200, 600, 400); 
//         //dibuixem ellipse de color blau al mig 
//         // x=300, y=200, amplada=600, alçada=400
//         //amb diametres al màxim
//         fill(255, 0, 0); //color vermell
//         ellipse(width / 2, height / 2, 60, 60); //dibuixem un cercle petit al mig
//         //dibuixem rectangle verd
//         fill(0, 255, 0);
//         //rect(200, 200, 60, 60);
//         //notem que indiquem el vèrtex superior esquerra
//         //per a centrar-lo dibuixem hem de posar-lo 30 posicions més amunt
//         //El (0,0) està a dalt a l'esquerra
//         //canviar-ho per situar bé el rectangle
//         rect(200 - 30, 200 - 30, 60, 60);        
//         //dibuixem un triangle
//         fill(0, 255, 255);
//         //https://processing.org/reference/triangle_.html
//         //Syntax
//         //triangle(x1, y1, x2, y2, x3, y3)	
//         //Parameters
//         //x1	(float)	x-coordinate of the first point
//         //y1	(float)	y-coordinate of the first point
//         //x2	(float)	x-coordinate of the second point
//         //y2	(float)	y-coordinate of the second point
//         //x3	(float)	x-coordinate of the third point
//         //y3	(float)	y-coordinate of the third point        
//         triangle(400 - 30, 200 + 30 , 400, 200 - 30, 400 + 30, 200 + 30);
        
//     }

// //PROVA 1: Refresc
// //draw es va refrescant cada i, per tant, permet fer moviment
// //    @Override
// //    public void draw(){
// //       fill(255, 0, 0);
// //       ellipse(mouseX, mouseY, 20, 20);
// //    }
    
// // PROVA 2. Moviment
// //    es va refrescant cada i, per tant, permet fer moviment
// //    @Override
// //    public void draw(){
// //       background(0); 
// //       fill(255, 0, 0);
// //       ellipse(mouseX, mouseY, 50, 50);
// //    }
    
// // PROVA 3: Refresc i keypressed
// //    es va refrescant cada i, per tant, permet fer moviment
//     @Override
//     public void draw(){
//         //exemple rudimentari de crear moviment
//         //primer cal fer clic per tenir focus
//         if (keyPressed){
//             background(0);
//             frameRate(10); //podem fer que refresqui més lentament
//             System.out.println(key);
//         }

//        fill(255, 0, 0);
//        ellipse(mouseX, mouseY, 20, 20);
//     }
    
//     //Sempre igual
//     public static void main(String[] args) {
//         //Li passem un argument String (que no sé per a què l'utilitza) 
//         //I un objecte de la classe que volem executar
//         DemoProcessing.runSketch(new String[]{"No sé on s'utilitza"}, 
//                 new DemoProcessing());
                                      
//     }
// }
