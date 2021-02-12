package tresEnRaya;

import java.awt.Color;
import java.awt.Graphics;

public class CuadroDeJuego {

	private int esquinaX, esquinaY;
	private int ancho, alto;
	private int xTablero, yTablero;
	private int jugadorPropietario = 0;
	
	public CuadroDeJuego(int xTablero, int yTablero) {
		super();
		this.xTablero = xTablero;
		this.yTablero = yTablero;
	}
	
	public void paint(Graphics g) {
		
		alto = (TresEnRaya.getInstacia().getHeight() / 3);
		ancho = (TresEnRaya.getInstacia().getWidth() / 3);
		
		esquinaX = this.xTablero * ancho;
		esquinaY = this.yTablero * alto;

		g.setColor(Color.black);
		g.drawRect(esquinaX, esquinaY, ancho, alto);
		
			pintaImagenesVectoriales(g);
		
		
	}
	
	private void pintaImagenesVectoriales (Graphics g) {
		// Ahora, dependiendo del jugador propietario de este cuadro, pinto algo diferente
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_1) { // Comprueba jugador 1 - pinta una cruz
			// Para pintar una cruz pinto dos l�neas que se cruzan
			g.drawLine(this.esquinaX, this.esquinaY, 
					this.esquinaX + this.ancho, this.esquinaY + alto);
			g.drawLine(this.esquinaX, this.esquinaY + alto, 
					this.esquinaX + this.ancho, this.esquinaY);
		} 
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_2) { // En este caso el jugador 2
			g.drawOval(this.esquinaX, this.esquinaY, this.ancho, this.alto);
		}
	}
	
	public boolean seHaHechoclicSobreCuadro (int xClic, int yClic) {
		// Compruebo si las coordenas del clic est�n dentro del espacio que ocupa mi cuadro
		if (xClic > this.esquinaX && xClic < (esquinaX + ancho) // Coordenada x dentro del ancho
				&&
			yClic > this.esquinaY && yClic < (esquinaY + alto)) { // Coordenada y dentro del alto
			return true;
		}
		return false;
	}
	
	public void clic (int jugador) {
		if (this.jugadorPropietario == 0) {
			this.jugadorPropietario = jugador;
		}
				
		// Obligo a repintar el objeto Canvas
		TresEnRaya.getInstacia().repaint();
		TresEnRaya.getInstacia().revalidate();
	}
	
	
	
	public int getEsquinaX() {
		return esquinaX;
	}

	public void setEsquinaX(int esquinaX) {
		this.esquinaX = esquinaX;
	}

	public int getEsquinaY() {
		return esquinaY;
	}

	public void setEsquinaY(int esquinaY) {
		this.esquinaY = esquinaY;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getxTablero() {
		return xTablero;
	}

	public void setxTablero(int xTablero) {
		this.xTablero = xTablero;
	}

	public int getyTablero() {
		return yTablero;
	}

	public void setyTablero(int yTablero) {
		this.yTablero = yTablero;
	}

	@Override
	public String toString() {
		return "CuadroDeJuego [esquinaX=" + esquinaX + ", esquinaY=" + esquinaY + ", ancho=" + ancho + ", alto=" + alto
				+ ", xTablero=" + xTablero + ", yTablero=" + yTablero + "]";
	}
	
	
	
	
	
}
