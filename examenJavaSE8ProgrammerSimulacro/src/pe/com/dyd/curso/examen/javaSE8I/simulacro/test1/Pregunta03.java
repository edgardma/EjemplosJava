package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

class Product {
	double price;
}

public class Pregunta03 {
	
	public void updatePrice(Product p, double price) {
		price = price * 2;
		p.price = p.price + price;
	}
	
	public static void main(String[] args) {
		Product prt = new Product();
		prt.price = 200;
		double newPrice = 100;
		
		Pregunta03 t = new Pregunta03();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + "...." + newPrice); // Resultado: 400.0....100.0
	}
}
