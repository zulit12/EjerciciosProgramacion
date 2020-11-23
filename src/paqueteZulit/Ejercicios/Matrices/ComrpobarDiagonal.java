package paqueteZulit.Ejercicios.Matrices;

public class ComrpobarDiagonal {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		
		boolean esDiagonal = comprobarDiagonal(matriz);
		if (esDiagonal) {
			System.out.println("La matriz es diagonal");
		}else {
			System.out.println("La matriz no es diagonal");
		}
	}
	
	public static boolean comprobarDiagonal (int matriz[][]) {
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (i != j && matriz[i][j] != 0) {
					 return false;
					}
				}
			}
			return true;
			
			
		}

}
