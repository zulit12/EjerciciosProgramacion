package paqueteZulit.Ejercicios.Matrices;

public class MatrizSimetrica {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		
		if (esMatrizSimetrica(matriz)) {
			System.out.println("La matriz es simetrica");
		}
		else {
			System.out.println("La matriz no es simetrica");
		}
		
	}
	
	public static boolean esMatrizSimetrica (int matriz[][]) {
		//Doble bucle y comprobacion de si la matriz es simetrica
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					return false;
				}
			}
		}
		return true;	
	}

}
