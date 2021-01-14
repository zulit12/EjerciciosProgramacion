package capitulo4.ColeccionAntiguedades;

public class Antiguedad {

	protected int añoFabricacion;
	protected String origen;
	protected int precio;

	protected Antiguedad(int añoFabricacion, String origen, int precio) {
		this.añoFabricacion = añoFabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	protected int getAñoFabricacion() {
		return añoFabricacion;
	}

	protected void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	protected String getOrigen() {
		return origen;
	}

	protected void setOrigen(String origen) {
		this.origen = origen;
	}

	protected int getPrecio() {
		return precio;
	}

	protected void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Antiguedad [a�oFabricacion=" + añoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

}
