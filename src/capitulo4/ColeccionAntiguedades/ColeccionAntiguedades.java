package capitulo4.ColeccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {

		Arma winchester = new Arma(1873, "Estados Unidos", 500, "Winchester", "10,8");
		Joya anillo = new Joya(1997, "Inglaterra", 2000, "Diamantes");
		Libro lotr = new Libro(2000, "Inglaterra", 35, "Tolien", "El señor de los Anillos", "George Allen & Unwin");
		Vinilo TheChronic = new Vinilo(1992, "Compton", 27, "TheChronic", "Dr.dre");
		
		System.out.println(winchester.toString());
		System.out.println(anillo.toString());
		System.out.println(lotr.toString());
		System.out.println(TheChronic.toString());
		
	}

}
