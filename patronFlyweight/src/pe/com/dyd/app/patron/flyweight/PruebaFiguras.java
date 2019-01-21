/*
 * Código con la ayuda del video:
 * https://www.youtube.com/watch?v=STbOT7rsFXA
 * */
package pe.com.dyd.app.patron.flyweight;

public class PruebaFiguras {
	private static final String colores[] = {"Rojo", "Verde", "Azul", "Blanco", "Negro"};
	
	public static void main(String[] args) {
		for(int i = 0; i < 40; ++i) {
			Circulo circulo = (Circulo)FabricaFiguras.getCirculo(getRandomColor());
			circulo.setX(getRandomX());
			circulo.setY(getRandomY());
			circulo.setRadio(100);
			circulo.dibujar();
		}
	}

	private static int getRandomX() {
		return (int)(Math.random() * 100);
	}

	private static String getRandomColor() {
		// TODO Auto-generated method stub
		return colores[(int)(Math.random() * colores.length)];
	}
	
	private static int getRandomY() {
		return (int)(Math.random() * 100);
	}
}
