package examen;

import javax.swing.JOptionPane;

public class TresEnRayaConArrays {

	public static void main(String[] args) {

		int opcion;

		int fila1[] = new int[3];
		int fila2[] = new int[3];
		int fila3[] = new int[3];

		valores3EnRaya(fila1, fila2, fila3);
		mostrarArray(fila1);
		mostrarArray(fila2);
		mostrarArray(fila3);
		System.out.println("Tablero limpio");

		do {

			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"0. Para Finalizar Aplicación" + '\n' + "1. Para Jugador 1" + '\n' + "2. Para Jugador 2"));

			switch (opcion) {
			case 0:
				System.out.println("El programa a finalizado");
				break;

			case 1:
				System.out.println("Movimiento Jugador 1");
				ponerFichaJugador1(fila1, fila2, fila3);
				mostrarArray(fila1);
				mostrarArray(fila2);
				mostrarArray(fila3);
				System.out.println("Tablero Modificadas");

				break;

			case 2:
				System.out.println("Movimiento Jugador 2");
				ponerFichaJugador2(fila1, fila2, fila3);
				mostrarArray(fila1);
				mostrarArray(fila2);
				mostrarArray(fila3);

				System.out.println("Tablero Modificadas");

				break;

			default:
				System.out.println("La opcion introducida no es correcta");
				break;
			}

		} while (opcion != 0);

	}

	public static void valores3EnRaya(int fila1[], int fila2[], int fila3[]) {

		for (int i = 0; i < fila1.length; i++) {
			fila1[i] = 0;
		}
		for (int i = 0; i < fila2.length; i++) {
			fila2[i] = 0;
		}

		for (int i = 0; i < fila3.length; i++) {
			fila3[i] = 0;
		}
	}

	public static void mostrarArray(int[] array) {
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void ponerFichaJugador1(int fila1[], int fila2[], int fila3[]) {

		int fila = Integer.parseInt(JOptionPane.showInputDialog("En que fila quiere insertar la ficha: "));
		int columna = Integer.parseInt(JOptionPane.showInputDialog("En que columna quiere insertar la ficha"));

		if (columna == 1) {
			columna = 0;
		}
		if (columna == 2) {
			columna = 1;
		}
		if (columna == 3) {
			columna = 2;
		}

		for (int i = 0; i < fila1.length; i++) {
			if (fila == 1) {
				fila1[columna] = 1;
			}

		}

		for (int i = 0; i < fila2.length; i++) {
			if (fila == 2) {
				fila2[columna] = 1;
			}
		}

		for (int i = 0; i < fila3.length; i++) {
			if (fila == 3) {
				fila3[columna] = 1;
			}
		}

	}

	public static void ponerFichaJugador2(int fila1[], int fila2[], int fila3[]) {

		int fila = Integer.parseInt(JOptionPane.showInputDialog("En que fila quiere insertar la ficha: "));
		int columna = Integer.parseInt(JOptionPane.showInputDialog("En que columna quiere insertar la ficha"));

		if (columna == 1) {
			columna = 0;
		}
		if (columna == 2) {
			columna = 1;
		}
		if (columna == 3) {
			columna = 2;
		}

		for (int i = 0; i < fila1.length; i++) {
			if (fila == 1) {
				fila1[columna] = 2;
			}

		}

		for (int i = 0; i < fila2.length; i++) {
			if (fila == 2) {
				fila2[columna] = 2;
			}
		}

		for (int i = 0; i < fila3.length; i++) {
			if (fila == 3) {
				fila3[columna] = 2;
			}
		}

	}

}
