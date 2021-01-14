package capitulo4.CircuitoElectronico;

public class Bateria extends Componente {

	protected String voltios;

	protected Bateria(String nombre, String componenteAnterior, String bateria, String voltios) {
		super(nombre, componenteAnterior, bateria);
		this.voltios = voltios;

	}

	protected String getVoltios() {
		return voltios;
	}

	protected void setVoltios(String voltios) {
		this.voltios = voltios;
	}

	@Override
	public String toString() {
		return "Bateria [voltios=" + voltios + ", nombre=" + nombre + ", componenteAnterior=" + componenteAnterior
				+ ", componenteSiguiente=" + componenteSiguiente + "]";
	}

}
