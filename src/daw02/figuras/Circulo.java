// package figuras;

// import java.awt.Point;

// public class Circulo extends Figura{

//     public static final double DEFAULT_RADIOUS = 5;

//     private double radius = DEFAULT_RADIOUS;

// 	public Cercle() {
//         this(DEFAULT_RADIOUS, DEFAULT_ORIGIN);
//     }

// 	public Cercle(double radious, Point origin) {
//         super(origin);
//         this.radius = radious;
//     }


// 	public double getRadious() {
// 		return radius;
// 	}

// 	public void setRadious(double radious) {
// 		this.radius = radious;
// 	}

// 	@Override // sobreescriure
// 	public double area() {
// 		return Math.PI * radius * radius;
// 	}

// 	@Override
// 	public double perimeter() {
// 		return Math.PI * 2 * radius;

// 	}

// 	@Override
// 	public String toString() {
// 		return "Cercle{" + "radius=" + radius + '}' + super.toString();

// 		// super permet accedir als mètodes de la superclasse que estan sobreescrits
// 	}

// 	public static void main(String[] args) {
// 		Cercle c = new Cercle();
// 		System.out.println(c);

// 	}
// }
