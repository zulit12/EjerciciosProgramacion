package paqueteZulit.Ejercicios.Matrices;

public class DiagonalSuperior {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		
		if (esMatrizDiagonalSup(matriz)) {
			System.out.println("La mtriz es superior");
		}
		else {
			System.out.println("La matriz no es superior");
		}
	}
	
	public static boolean esMatrizDiagonalSup (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// Compruebo si hay un elemento fuera de la diagonal
				// principal, que no sea valor cero
				if (i != j && matriz[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

}
