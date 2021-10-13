package daw01.gestionFicheros;
import java.util.logging.Level;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;


public class Escribir_Fichero {
    public static void main(String[] args) {

    try{
        FileWriter s= new FileWriter("/home/oem/Documentos/holamundo.txt");  
        s.write("hola mundo");
        s.close();
    }catch (IOException ex){
        Logger.getLogger(Escribir_Fichero.class.getName()).log(Level.SEVERE,null,ex);

    }
    }
}