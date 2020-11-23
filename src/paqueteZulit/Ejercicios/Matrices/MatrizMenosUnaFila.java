package paqueteZulit.Ejercicios.Matrices;

import javax.swing.JOptionPane;

public class MatrizMenosUnaFila {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		
		String eliminarFila = JOptionPane.showInputDialog("Inserte numero para eliminarFila");
		
		
	}
	
	public static int [][] matrizMenosUnaFila (int matriz [][], int eliminarFila) {
			
			if (eliminarFila < 0 || eliminarFila >= matriz.length) {
				return matriz;
			}
			
			int nuevaMatriz[][] = new int [matriz.length-1][matriz[0].length];
			
			int filaNuevaMatriz = 0;
			for (int i = 0; i < matriz.length; i++) {
				if (i != eliminarFila) {
					for (int j = 0; j < matriz[i].length; j++) {
						nuevaMatriz[filaNuevaMatriz] [j] = matriz[i] [j];
					}
					filaNuevaMatriz++;
				}
			}
			return nuevaMatriz;
			
		}

}
