package capitulo4.ArticulosComestibles;

public class Tienda { 

	public static void main(String[]args) {	
	
		Perecedero tomate = new Perecedero(52, "tomate", 5, "25/8/2020");
		Perecedero pera = new Perecedero(90, "pera", 9, "25/10/2020");
		NoPerecedero aceite = new NoPerecedero(1, "Aceite", 30);
		NoPerecedero garbanzos = new NoPerecedero(10, "garbanzos", 5);
		
		System.out.println(tomate.toString());
		System.out.println(pera.toString());
		System.out.println(aceite.toString());
		System.out.println(garbanzos.toString());
	} 
}


