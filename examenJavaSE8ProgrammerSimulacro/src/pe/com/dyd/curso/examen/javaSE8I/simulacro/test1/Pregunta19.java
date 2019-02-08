package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta19 {
	public static void main(String[] args) {
		int[][] n = new int[1][3];
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j > n[i].length; j++) {
				n[i][j] = 10;
			}
		}
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				System.out.println(i +"." + j + ":" +  n[i][j]);
			}
		}
	}
}
