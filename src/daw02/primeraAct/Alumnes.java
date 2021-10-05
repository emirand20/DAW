package daw02.primeraAct;

public class Alumnes {

    private Alumne[] alumnos;

    public Alumnes(int nMatriculats){
        this.alumnos = new Alumne[nMatriculats];
    }
    public Alumnes(int []edades){
        this.alumnos = new Alumne[edades.length];
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades.length);
               this.alumnos[i].setEdat(edades[i]);
       }
    }

    public int mediaEdades(int[] edades){

        int media = 0;

        for (int i = 0; i < edades.length; i++) {
            media = media + edades[i];
        } media = media / edades.length;

        return media;
        
    }    

    public int edadMaxima(byte[] edades){
        int mayor = edades[0];
        for (byte b : edades) {
            if(b>mayor){
                mayor = b;
            }
        }
        return mayor;
    }

    public boolean hayUnMenor(byte[] edades){

        for (byte b : edades) {
           if (b < 18){
               return true;
           } 
       }return false;
       
       }

       @Override
       public String toString() {
           return "Alumne [edat=" + alumnos + "]";
       }
      

    }





