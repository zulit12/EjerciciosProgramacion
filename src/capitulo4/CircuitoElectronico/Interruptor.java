package capitulo4.CircuitoElectronico;

public class Interruptor extends Componente {

	protected String fabricante;

	protected Interruptor(String nombre, String componenteAnterior, String componenteSiguiente,
			String fabricante) {
		super(nombre, componenteAnterior, componenteSiguiente);
		this.fabricante = fabricante;
	}

	protected String getFabricante() {
		return fabricante;
	}

	protected void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Interruptor [fabricante=" + fabricante + ", nombre=" + nombre + ", componenteAnterior="
				+ componenteAnterior + ", componenteSiguiente=" + componenteSiguiente + "]";
	}

}
