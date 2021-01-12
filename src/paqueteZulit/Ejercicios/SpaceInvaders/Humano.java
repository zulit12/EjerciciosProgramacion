package paqueteZulit.Ejercicios.SpaceInvaders;

import paqueteZulit.Ejercicios.Utils;

public class Humano {

	int puntosVida = Utils.obtenerNumeroAzar(50, 100);
	int nombre;
	boolean vivo;
	
	public Humano(int puntosVida, int nombre, boolean vivo) {
		this.puntosVida = puntosVida;
		this.nombre = nombre;
		this.vivo = vivo;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	@Override
	public String toString() {
		return "Humano [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}

	
	
	
	
}