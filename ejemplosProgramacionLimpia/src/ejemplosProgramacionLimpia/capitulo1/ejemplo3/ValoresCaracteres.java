package ejemplosProgramacionLimpia.capitulo1.ejemplo3;

public class ValoresCaracteres {
	public static void main(String[] args) {
		char caracter = 'A';
		char ultima = 'z';
		
		char nuevaLinea = '\n';
		char tabulacion = '\t';
		char retornoCarro = '\r';
		char comillaSimple = '\'';
		char contraBarra = '\\';
		char dobleComillas = '\"';
		char formFeed = '\f';
		
		System.out.println("Primera letra " + caracter + " y última " + ultima);
		System.out.println("Con la \\ usamos caracteres especiales");
		System.out.println("Que parezca un \"accidente\"");
		System.out.println("Vamos a saltar \n y ahora otra vez" + nuevaLinea);
		System.out.println(tabulacion + "Vamos a ver: " + nuevaLinea + "y ahora \r");
	}
}
