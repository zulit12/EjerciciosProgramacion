package paqueteZulit.Ejercicios;

import javax.swing.JOptionPane;



public class ExamenA {

	public static void main(String[] args) {
		
		int bolosP1[] = new int[10];
		int bolosP2[] = new int[10];
		int valorRondaP1 = 10;
		int valorRondaP2 = 10;
		int puntosPlayer1 = 0;
		int puntosPlayer2 = 0;
		int rondas = 0;
		
		valoresBolos(bolosP1);
		valoresBolos(bolosP2);
		
		
		
		
		int opcion;
		int jugador;
		
		do {
			//Mostrar Menu
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Si quiere jugar pulse 1" + '\n' +
					  "Si quiere finalizar partida pulse 0 "));
			
			rondas++;
			
			
			switch (opcion) {
			//Primer caso finalizar programa
			case 0:
				System.out.println("La partida ha finalizado");
			
				break;
			//Segundo caso Tirada del Jugador
			case 1:
				jugador = Integer.parseInt(JOptionPane.showInputDialog("Con que jugador quiere participar: " + '\n' + "1. para jugador 1" + '\n'+ 
																													  "2. para jugador 2"));
				
				switch (jugador) {
				case 1:
					puntosPlayer1 += (puntos(bolosP1, valorRondaP1, rondas));
					System.out.println("Puntos Totales : " + puntosPlayer1);
					imprimirBolos(bolosP1);
					valorRondaP1 = valorRondaP1 / 2;
					
					
					break;
					
				case 2:
					puntosPlayer2 += (puntos(bolosP2, valorRondaP2, rondas));
					System.out.println("Puntos Totales : " + puntosPlayer2);
					imprimirBolos(bolosP2);
					valorRondaP2 = valorRondaP2 / 2;
					break;

				default:
					break;
				}
				break;
			//Salida default
			default:
				System.out.println("La opcion elegida no es valida");
				break;
			}
			
			System.out.println("Lanzamiento: " + opcion + " - Bolos Player1: " + quedanBolos(bolosP1) + " - Polos Player 2: " + quedanBolos(bolosP2));
		} while (opcion != 0 && (quedanBolos(bolosP1) == true) && (quedanBolos(bolosP2) == true));
		
		if (puntosPlayer1 > puntosPlayer2) {
			System.out.println("Ha ganado el Jugador 1");
		} else {
			System.out.println("Ha ganado el Jugador 2");
		}
	
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void valoresBolos(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;
		}
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void imprimirBolos(int array[]) {
		
		int inicioFila = 0;
		for (int i = 4; i > 0; i--) {
			for (int j = Math.abs(i-4); j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = inicioFila; j < inicioFila + i; j++) {
				System.out.print(array[j] + "   ");
			}
			inicioFila += i;
			System.out.println();
		}
		
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static boolean quedanBolos(int array[]) {
		boolean tirados = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				tirados = true;
				break;
			}
		}

		return tirados;
	}
	
	/**
	 * 
	 * @param array
	 * @param valor
	 * @param rondas
	 * @return
	 */
	public static int puntos(int array[], int valor, int rondas) {

		int contador = 0;
		int puntos = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				if (puedoDisparar(array, rondas) == true) {
					array[i] = 0;
					contador++;
				}
			}

		}

		puntos = valor * contador;
		System.out.println("Has tirado  " + contador + " bolos");
		System.out.println("Valor de puntuación " + valor);
		System.out.println("Puntos obtenidos en esta ronda: " + puntos);

		return puntos = valor * contador;

	}

	/**
	 * 
	 * @param array
	 * @param numRonda
	 * @return
	 */
	public static boolean puedoDisparar(int array[],int  numRonda) {
		int numAzar = (int) Math.round(Math.random() * 100); 


		int probabilidad = calculoProbabilidad(numRonda);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				if (numAzar <= probabilidad) {
					return true;
				}

			}
		}

		return false;

	}
	
	/**
	 * 
	 * @param numRonda
	 * @return
	 */
	public static int calculoProbabilidad(int numRonda) {
		
		int probabilidad =Utils.obtenerNumeroAzar(60, 70)- 15 * numRonda;
		if (probabilidad < 30) {
			probabilidad = 30;
		}
		return probabilidad;
	}
	
	
}
