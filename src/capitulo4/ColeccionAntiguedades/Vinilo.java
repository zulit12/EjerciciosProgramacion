package capitulo4.ColeccionAntiguedades;

public class Vinilo extends Antiguedad {

	protected String nombre;
	protected String artista;

	public Vinilo(int añoFabricacion, String origen, int precio, String nombre, String artista) {
		super(añoFabricacion, origen, precio);
		this.nombre = nombre;
		this.artista = artista;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getArtista() {
		return artista;
	}

	protected void setArtista(String artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "Vinilo [nombre=" + nombre + ", artista=" + artista + ", a�oFabricacion=" + añoFabricacion + ", origen="
				+ origen + ", precio=" + precio + "]";
	}

}
