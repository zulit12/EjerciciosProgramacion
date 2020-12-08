package paqueteZulit.Ejercicios.Primeros_Objetos;

public class CromoBaloncesto {

	String nombreJugador;
	int alturaCm;
	int pesoKg;
	float puntosMediosPorpartido;

	public CromoBaloncesto() {

	}

	public CromoBaloncesto(String nombre, int altura, int peso, float puntos) {
		this.nombreJugador = nombre;
		this.alturaCm = altura;
		this.pesoKg = peso;
		this.puntosMediosPorpartido = puntos;

	}

	//Getters 

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}

	public int getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}

	public float getPuntosMediosPorpartido() {
		return puntosMediosPorpartido;
	}

	public void setPuntosMediosPorpartido(float puntosMediosPorpartido) {
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
	
	@Override
	public String toString() {
		return "CromoBaloncesto [nombreJugador=" + nombreJugador + ", alturaCm=" + alturaCm + ", pesoKg=" + pesoKg
				+ ", puntosMediosPorpartido=" + puntosMediosPorpartido + "]";
	}

}