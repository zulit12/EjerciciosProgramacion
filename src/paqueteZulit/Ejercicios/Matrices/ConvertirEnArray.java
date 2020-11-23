package paqueteZulit.Ejercicios.Matrices;

import paqueteZulit.Ejercicios.UtilsArrays;

public class ConvertirEnArray {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		
		int array[] = convertirEnArray(matriz);
		UtilsArrays.mostrarArray(array);
		System.out.println();
	}
	
	public static int[] convertirEnArray (int matriz[][]) {
		//C�lculo la cantidad de posiciones que ha de tener el rray
		int contador = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			contador += matriz[i].length;
		}
		//Creamos el array con la longitud adecuada
		int array[] = new int[contador];
		//Asignamos los valores de la matriz a las posiciones del array llamado x
		int x = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[x] = matriz[i][j];
				x++;
			}
		}
		//Devuelvo el resultado
		return array;
	}

}
