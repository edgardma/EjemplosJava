import pe.com.empresa.reconocimiento.Proceso;

public class Main {

	public static void main(String[] args) {
        if (args.length > 2) { 
            System.out.println("Hay demasiados parámetros.");
        } else if (args.length == 1) {       
            System.out.println("Falta un parámetro.");
        } else if (args.length == 0) {     
            System.out.println("Falta los parámetros.");
        } else {
    		Proceso.procesarImagenes(args[0], args[1]);
        }
	}
}
