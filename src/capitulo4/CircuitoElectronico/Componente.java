package capitulo4.CircuitoElectronico;

public class Componente {

	String nombre;
	String componenteAnterior;
	String componenteSiguiente;

	protected Componente(String nombre, String componenteAnterior, String componenteSiguiente) {
		this.nombre = nombre;
		this.componenteAnterior = componenteAnterior;
		this.componenteSiguiente = componenteSiguiente;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getComponenteAnterior() {
		return componenteAnterior;
	}

	protected void setComponenteAnterior(String componenteAnterior) {
		this.componenteAnterior = componenteAnterior;
	}

	protected String getComponenteSiguiente() {
		return componenteSiguiente;
	}

	protected void setComponenteSiguiente(String componenteSiguiente) {
		this.componenteSiguiente = componenteSiguiente;
	}

	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", componenteAnterior=" + componenteAnterior + ", componenteSiguiente="
				+ componenteSiguiente + "]";
	}

}
