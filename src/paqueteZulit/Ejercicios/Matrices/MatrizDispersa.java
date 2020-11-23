package paqueteZulit.Ejercicios.Matrices;

public class MatrizDispersa {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
	
		if (esMatrizDispersa(matriz)) {
			System.out.println("La matriz es dispersa");
		}
		else {
			System.out.println("La matriz no es dispersa");
		}
	}

	public static boolean esMatrizDispersa (int matriz[][]) {
		//Comprobamos las filas
		for (int i = 0; i < matriz.length; i++) {
			boolean noHayCeros = true;
			//Con el bucle de j recorremos todos los elementos de las filas
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0) {
					noHayCeros = false;
				}
			}
			if (noHayCeros) {
				return false;
			}
		}
		//Comprobamos todas las columnas
		for (int i = 0; i < matriz.length; i++) {
			boolean noHayCeros = true;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[j][i] == 0) {
					noHayCeros = false;
				}
			}
			if (noHayCeros) {
				return false;
			}
		}
		return true;
	}
}