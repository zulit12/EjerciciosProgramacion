package paqueteZulit.Ejercicios.Matrices;

public class MatrizTraspuesta {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];

		
		int matrizTras[][] = matrizTraspuesta(matriz);
		mostrarMatriz(matrizTras);
	}

	public static int [][] matrizTraspuesta (int matriz[] []) {
			
			int matrizTraspuesta [][] = new int[matriz[0].length][matriz.length];
		
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matrizTraspuesta[j][i] = matriz[i][j];
				}
			}
			return matrizTraspuesta;
		}

	public static void mostrarMatriz (int matriz[][]) {
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.print(matriz[i][j] + '\t');
				}
				System.out.println();
			}	
		}
}
