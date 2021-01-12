package capitulo4.ColeccionAntiguedades;

public class Libro extends Antiguedad {

	protected String autor;
	protected String titulo;
	protected String editorial;

	protected Libro(int añoFabricacion, String origen, int precio, String autor, String titulo, String editorial) {
		super(añoFabricacion, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected String getEditorial() {
		return editorial;
	}

	protected void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", editorial=" + editorial + ", añoFabricacion="
				+ añoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

}
