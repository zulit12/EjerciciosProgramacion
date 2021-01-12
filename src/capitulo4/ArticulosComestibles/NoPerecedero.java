package capitulo4.ArticulosComestibles;

public class NoPerecedero extends Producto {

	
	public NoPerecedero(int codigo, String nombre, int precio) {
		super(codigo, nombre, precio);
		
	}

	@Override
	public String toString() {
		return "NoPerecedero [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
}
