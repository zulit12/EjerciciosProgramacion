package tresEnRaya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TresEnRaya extends Canvas {
		
		public static final int ANCHO = 400;
		public static final int ALTO = 400;
		JFrame ventana = null;
		private static TresEnRaya instancia = null;
		
		List<CuadroDeJuego> cuadrados = new ArrayList<CuadroDeJuego>();
		
		public int ganadorDelTablero;
		public static int JUGADOR_1 = 1;
		public static int JUGADOR_2 = 2;
		private int turnoActual = JUGADOR_1;
		private int matrizJugadas[][] = new int[][] {{0, 0, 0},
													 {0, 0, 0},
													 {0, 0, 0}};
		
	public static TresEnRaya getInstacia () {
		if (instancia == null) {
			instancia = new TresEnRaya();
		}
		return instancia;
	}
	
	public TresEnRaya() {
		
		ventana = new JFrame("Tres En Raya");
		
		JPanel panel = (JPanel) ventana.getContentPane();
		
		panel.setLayout(new BorderLayout());
		
		panel.add(this, BorderLayout.CENTER);
		
		ventana.setBounds( 0, 0, ANCHO, ALTO);
		
		ventana.setVisible(true);
		
		
		
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				// S�lo nos interesa el clic con el bot�n principal del rat�n
				if (e.getButton() == MouseEvent.BUTTON1) {
					for (CuadroDeJuego cuadrados : cuadrados) {
						if (cuadrados.seHaHechoclicSobreCuadro(e.getX(), e.getY())) {
							cuadrados.clic(turnoActual);
							// Hago cambio de turno
							if (turnoActual == JUGADOR_1) {
								// cambio el turno
								turnoActual = JUGADOR_2;
							}
							else {
								// Cambio el turno
								turnoActual = JUGADOR_1;
							}
						}
					}
					
				}
				getGanadorDelTablero(matrizJugadas);
				ganadorDelTablero = getGanadorDelTablero(matrizJugadas);
				if (ganadorDelTablero == 1) {
					System.out.println("Ha ganado el jugador 1");
				}
				if (ganadorDelTablero == 2) {
					System.out.println("Ha ganado el jugador 2");
				}
				if (ganadorDelTablero == -1) {
					System.out.println("Ha sido empate");
				}

			}

		});
		

		
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});

		
		ventana.setResizable(false);
		
		this.requestFocus();
	}
	
	private void cerrarAplicacion() {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana,"¿Desea cerrar la aplicacion?","Salir de la aplicacion",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public static void creaCuadros(List<CuadroDeJuego>lista) {
		int cuadrados[][] = new int[3][3];
		for (int i = 0; i < cuadrados.length; i++) {
			for (int j = 0; j < cuadrados.length; j++) {
				lista.add(new CuadroDeJuego(i,j));
			}
		}
	}
	
	public void paint(Graphics g) {


		g.setColor(Color.WHITE);
		g.fillRect( 0, 0, getWidth(), getHeight());
		for (CuadroDeJuego cuadrados : this.cuadrados) {
			cuadrados.paint(g);
		}
	}
	
	public int[][] getMatrizJugadas() {
		return matrizJugadas;
	}
	
	private static int getGanadorDelTablero (int matrizJugadas[][]) {
		// Busco si existe un ganador mirando las filas
		for (int i = 0; i < matrizJugadas.length; i++) {
			if (matrizJugadas[i][0] == matrizJugadas[i][1] && matrizJugadas[i][1] == matrizJugadas[i][2]) { 
				return matrizJugadas[i][0];
			}
		}
		// Busco si existe un ganador en las columnas
		for (int i = 0; i < matrizJugadas[0].length; i++) {
			if (matrizJugadas[0][i] == matrizJugadas[1][i] && matrizJugadas[1][i] == matrizJugadas[2][i]) { 
				return matrizJugadas[0][i];
			}
		}
		// Busco un ganador en la diagonal principal
		if (matrizJugadas[0][0] == matrizJugadas[1][1] && matrizJugadas[1][1] == matrizJugadas[2][2]) { 
			return matrizJugadas[0][0];
		}
		// Busco un ganador en la diagonal secundaria
		if (matrizJugadas[0][2] == matrizJugadas[1][1] && matrizJugadas[1][1] == matrizJugadas[2][0]) {
			return matrizJugadas[0][2];
		}
		
		// Si llegó hasta aquí no hay ganador, pero aún quedan dos posibilidades: puede que queden casillas vacías o puede que no
		// Voy a suponer que no hay casillas vacías y voy a recorrer el tablero buscando alguna casilla vacía
		boolean hayCasillasVacias = false;
		for (int i = 0; i < matrizJugadas.length; i++) {
			for (int j = 0; j < matrizJugadas[0].length; j++) {
				if (matrizJugadas[i][j] == 0) {
					hayCasillasVacias = true;
				}
			}
		}

		// Devuelvo valores diferentes dependiendo de si existen casillas vacías o no
		if (hayCasillasVacias == true) {
			return 0; // Indica que el juego continúa.
		}
		else {
			return -1; // Indica que no quedan casillas vacías, hay empate
		}
	}
	
	public void juego() {
		creaCuadros(cuadrados);
	}
	
	
	public static void main(String[] args) {
		TresEnRaya.getInstacia().juego();

	}
}
