package algoritmos.arreglos;

public class Ordenacion {
	public static int[] metodoLaBurbuja(int[] arreglo) {
		int auxiliar;
		int[] arregloOrdenado = null;
		
		for(int i = 2; i < arreglo.length; i++) {
			for(int j = 0; j < arreglo.length; j++) {
				if(arreglo[j] > arreglo[j + 1]) {
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j+1] = auxiliar;
				}
			}
		}
		
		return arregloOrdenado;
	}
}
