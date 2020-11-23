package paqueteZulit.Ejercicios.Matrices;

public class ComprobarPositivos {

	public static void main(String[] args) {
		
		int matriz[][] = new int [5][5];
		
		
		boolean esPositiva = comprobarPositivos(matriz);
		if (esPositiva) {
			System.out.println("Es positiva");
		}else {
			System.out.println("La matriz no es positiva");
		}
		
	}

	public static boolean comprobarPositivos (int matriz[][]) {
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) { 
					if (matriz[i][j] > 0) {
						return false;
					}
				}
			}
			return true;
		}

}
