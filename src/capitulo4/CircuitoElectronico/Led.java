package capitulo4.CircuitoElectronico;

public class Led extends Componente {

	protected String potencia;

	protected Led(String nombre, String componenteAnterior, String componenteSiguiente, String potencia) {
		super(nombre, componenteAnterior, componenteSiguiente);
		this.potencia = potencia;
	}

	protected String getPotencia() {
		return potencia;
	}

	protected void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Led [potencia=" + potencia + ", nombre=" + nombre + ", componenteAnterior=" + componenteAnterior
				+ ", componenteSiguiente=" + componenteSiguiente + "]";
	}

}
