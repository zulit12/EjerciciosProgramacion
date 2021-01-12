package capitulo4.ArticulosComestibles;

public class Perecedero extends Producto {

	protected String fecha;
	
	protected Perecedero(int codigo, String nombre, int precio, String fecha) {
		super(codigo, nombre, precio);
		this.fecha = fecha;

	}

	protected String getFecha() {
		return fecha;
	}

	protected void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Perecederos [fecha=" + fecha + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	
	
}
