package examen;

import javax.swing.JOptionPane;

public class TresEnRayaConMatriz {

	public static void main(String[] args) {

		int opcion;

		int tablero[][] = new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

		imprimirMatriz(tablero);

		do {

			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"0. Para Finalizar Aplicación" + '\n' + "1. Para Jugador 1" + '\n' + "2. Para Jugador 2"));

			switch (opcion) {
			case 0:
				System.out.println("El programa a finalizado");
				break;

			case 1:

				tiradaJugador1(tablero);
				imprimirMatriz(tablero);
				System.out.println("Tablero Modificado");

				break;

			case 2:
				tiradaJugador2(tablero);
				imprimirMatriz(tablero);
				System.out.println("Tablero Modificadas");

				break;

			default:
				System.out.println("La opcion introducida no es correcta");
				break;
			}

		} while (opcion != 0);

	}

	public static void imprimirMatriz(int tablero[][]) {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void tiradaJugador1(int tablero[][]) {

		int fila = Integer.parseInt(JOptionPane.showInputDialog("Inserte la fila: "));
		int columna = Integer.parseInt(JOptionPane.showInputDialog("Inserte la columna"));

		
		
		
		
		if (fila == 1) {
			fila = 0;
		}
		if (fila == 2) {
			fila = 1;
		}
		if (fila == 3) {
			fila = 2;
		}

		if (columna == 1) {
			columna = 0;
		}
		if (columna == 2) {
			columna = 1;
		}
		if (columna == 3) {
			columna = 2;
		}

		for (int i = fila; i < tablero.length; i++) {
			for (int j = columna; j < tablero.length; j++) {
				if (i != 0 && j != 0 ) {
					System.out.println("no puedes colocar ficha");
				}else {
					
					for (i = 0; i < tablero.length; i++) {
						for (j = 0; j < tablero.length; j++) {
							if (i == fila && j == columna) {
								tablero[i][j] = 1;
							}
						}
					}
				}
			}
		}
		
		
		
		

	}

	public static void tiradaJugador2(int tablero[][]) {

		
		
		int fila = Integer.parseInt(JOptionPane.showInputDialog("Inserte la fila: "));
		int columna = Integer.parseInt(JOptionPane.showInputDialog("Inserte la columna"));

		
		
		if (fila == 1) {
			fila = 0;
		}
		if (fila == 2) {
			fila = 1;
		}
		if (fila == 3) {
			fila = 2;
		}

		if (columna == 1) {
			columna = 0;
		}
		if (columna == 2) {
			columna = 1;
		}
		if (columna == 3) {
			columna = 2;
		}
		
		for (int i = fila; i < tablero.length; i++) {
			for (int j = columna; j < tablero.length; j++) {
				if (i != 0 && j != 0 ) {
					System.out.println("no puedes colocar ficha");
				}else {
					for (i = 0; i < tablero.length; i++) {
						for (j = 0; j < tablero.length; j++) {
							if (i == fila && j == columna) {
								tablero[i][j] = 2;
							}
						}
					}
				}
			}
		}
		


	}


	
	
	
	
	
	
	
}
