package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta04 {
	
	public static void main(String[] args) {
		char[][] grid = new char[3][3];
		grid[0][0] = 'Y';
		grid[0][1] = 'Y';
		grid[1][1] = 'X';
		grid[1][2] = 'Y';
		grid[2][1] = 'X';
		grid[2][2] = 'X';
		grid[2][0] = 'X'; // Respuesta correct
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(i +"." + j + ":" +  grid[i][j] +"-");
			}
			System.out.println("");
		}
	}
}
