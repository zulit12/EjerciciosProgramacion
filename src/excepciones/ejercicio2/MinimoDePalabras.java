package excepciones.ejercicio2;

public class MinimoDePalabras extends Exception {

	private int minimoNumeroPalabras;
		
		public MinimoDePalabras(int minimoNumeroPalabras) {
			this.minimoNumeroPalabras = minimoNumeroPalabras;
			// TODO Auto-generated constructor stub
		}
	
		public MinimoDePalabras(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
	
		public MinimoDePalabras(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}
	
		public MinimoDePalabras(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}
}
