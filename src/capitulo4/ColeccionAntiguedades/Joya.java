package capitulo4.ColeccionAntiguedades;

public class Joya extends Antiguedad {

	protected String materialFabricacion;
	
	protected Joya(int añoFabricacion, String origen, int precio, String materialFabricacion) {
		super(añoFabricacion, origen, precio);
		this.materialFabricacion = materialFabricacion;
		
	}

	protected String getMaterialFabricacion() {
		return materialFabricacion;
	}

	protected void setMaterialFabricacion(String materialFabricacion) {
		this.materialFabricacion = materialFabricacion;
	}

	@Override
	public String toString() {
		return "Joyas [materialFabricacion=" + materialFabricacion + ", añoFabricacion=" + añoFabricacion + ", origen="
				+ origen + ", precio=" + precio + "]";
	}
	
	

}
