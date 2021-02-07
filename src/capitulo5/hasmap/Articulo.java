package capitulo5.hasmap;

public class Articulo {

	private int codigoBarras;
	private int numEstante;
	private String nombre;
	private int numStock;
	
	
	public Articulo(int codigoBarras, int numEstante, String nombre, int numStock) {
		super();
		this.codigoBarras = codigoBarras;
		this.numEstante = numEstante;
		this.nombre = nombre;
		this.numStock = numStock;
	}


	public int getCodigoBarras() {
		return codigoBarras;
	}


	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	public int getNumEstante() {
		return numEstante;
	}


	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumStock() {
		return numStock;
	}


	public void setNumStock(int numStock) {
		this.numStock = numStock;
	}


	@Override
	public String toString() {
		return "Articulo [codigoBarras=" + codigoBarras + ", numEstante=" + numEstante + ", nombre=" + nombre
				+ ", numStock=" + numStock + "]";
	}
	
	
	
	
	
	
}
