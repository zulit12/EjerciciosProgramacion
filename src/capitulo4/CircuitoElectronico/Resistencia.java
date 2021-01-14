package capitulo4.CircuitoElectronico;

public class Resistencia extends Componente {

	protected String ohmnios;

	protected Resistencia(String nombre, String componenteAnterior, String componenteSiguiente,
			String ohmnios) {
		super(nombre, componenteAnterior, componenteSiguiente);
		this.ohmnios = ohmnios;
	}



	protected String getOhmnios() {
		return ohmnios;
	}

	protected void setOhmnios(String ohmnios) {
		this.ohmnios = ohmnios;
	}

	@Override
	public String toString() {
		return "Resistencia [ohmnios=" + ohmnios + ", nombre=" + nombre + ", componenteAnterior=" + componenteAnterior
				+ ", componenteSiguiente=" + componenteSiguiente + "]";
	}

}
