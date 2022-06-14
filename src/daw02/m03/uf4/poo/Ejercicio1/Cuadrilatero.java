package m03.uf4.poo.Ejercicio1;

/*
Ej. 1: Construir un programa que calcule el área y el perimetro de un 
cuadrilatero dada la longitud de sus dos lados. Los valores de la longitus deberán
introducirse por la linea de ordenes. Si es un cuadrado, solo se proporcionara la 
longitud de uno de los lados al contructor.
*/
public class Cuadrilatero {
    //Atributos
    private float lado1, lado2;

    //Metodos
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodo Constructor 2(Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }

    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }

}