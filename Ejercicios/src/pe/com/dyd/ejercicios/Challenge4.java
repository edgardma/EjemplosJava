/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
package pe.com.dyd.ejercicios;

public class Challenge4 {
	
	public static Double area(Polygon polygon) {
		
		polygon.printArea();
		
		return polygon.area();
	}

}

interface Polygon {
	double area();
	void printArea();
}

class Triangle implements Polygon {
	
	private Double base;
	private Double height;
	
	public Triangle(Double base, Double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return (base * height) / 2;
	}

	@Override
	public void printArea() {
		System.out.println("El área del triangulo es " + this.area());
	}
	
}

class Rectangle implements Polygon {
	
	private Double length;
	private Double width;
	
	public Rectangle(Double length, Double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		return length * width;
	}

	@Override
	public void printArea() {
		System.out.println("El área del rectangulo es " + this.area());
	}
	
}

class Square implements Polygon {
	
	private Double side;
	
	public Square(Double side) {
		super();
		this.side = side;
	}
	
	@Override
	public double area() {
		return side * side;
	}

	@Override
	public void printArea() {
		System.out.println("El área del cuadrado es " + this.area());
	}
	
}
