package tresEnRaya;

import java.awt.Color;
import java.awt.Graphics;


public class CuadroDeJuego {

	private int esquinaX, esquinaY;
	private int ancho, alto;
	private int xTablero, yTablero;
	
	
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
