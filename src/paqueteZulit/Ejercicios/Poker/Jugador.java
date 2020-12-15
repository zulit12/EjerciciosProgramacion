package paqueteZulit.Ejercicios.Poker;

public class Jugador {

		private String nombre;
		private Carta mano[] = new Carta[5];
		/**
		 * @param nombre
		 */
		public Jugador(String nombre) {
			super();
			this.nombre = nombre;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the mano
		 */
		public Carta[] getMano() {
			return mano;
		}
		/**
		 * @param mano the mano to set
		 */
		public void setMano(Carta[] mano) {
			this.mano = mano;
		}
		
		
		public void compruebaMano () {
			for (int i = 0; i < this.mano.length; i++) {
				int contadorCoincidencias = 1;
				for (int j = i + 1; j < mano.length; j++) {
						if (mano[i].getValor() == mano[j].getValor()) {
								contadorCoincidencias++;
						}
				}
			
				switch (contadorCoincidencias) {
				case 2:
					System.out.println("\tTienes 2 cartas de valor " + mano[i].getValor());
					break;
				case 3:
					System.out.println("\tTienes 3 cartas de valor " + mano[i].getValor());
					break;
				case 4:
					System.out.println("\tTienes 4 cartas de valor " + mano[i].getValor());
					break;

				default:
					break;
				}

			}
			
		}
}
