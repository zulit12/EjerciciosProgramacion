package capitulo5.hasmap;


import java.util.HashMap;
import javax.swing.JOptionPane;



public class Hashmap {

	static HashMap<String, Articulo> hm = new HashMap<String, Articulo>();
	
	static int codigoBarras, numEstante, numStock;
	static String nombre;
	
	public static void main (String args[]) {
		
		
			// Creación de un HashMap general
			
			// Inserción de datos en un HashMap general
			hm.put("1", new Articulo (55555, 10, "Agua", 784));
			hm.put("2", new Articulo (4853, 74, "Pistachos", 945));
			hm.put("3", new Articulo (896, 74, "Cocacola", 12));
			hm.put("4", new Articulo (4531, 78, "Whyski", 324));
			hm.put("5", new Articulo (0, 0, "Servilletas", 632));
			// Inserción de un objeto con un tipo de identificador diferente
			hm.put(new String("6"), new Articulo (66666666, 845, "Galletas", 254));
			
				
	
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ejecutar la aplicacion = 1" 
																+ "Cerrar aplicacion = 0"));
		
		
		
		do {
			
			opcion = menu();
		
			
			switch (opcion) {
			case 0: 
				System.out.println("Adios!");
				break;
			case 1:
				//Mostrar Articulos
				System.out.println("\nRecorrido del HashMap:");
				Object claves[] = hm.keySet().toArray();
				for (int i = 0; i < claves.length; i++) {
					System.out.println("Identificador tipo: " + claves[i].getClass().getName() + " - valor: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
				}
				
				break;
			case 2:
				//Añadir articulos
				crearArticulos();
				break;
			case 3:
				eliminarArticulo();
			
				break;
			case 4: 
				//Modificar Estante
				actualizarEstante();
				break;
			case 5:
				//Modificador Stock
				actualizarStock();
			case 6: 
				//Actualizar Nombre
				encontrarArticulo();

				
			default:
				System.out.println("OpciÃ³n no vÃ¡lida");
			}
			
			
		} while (opcion != 0);
		
	}
		
		
	
	public static int menu () {
		String strMenu = "\n\nMenÃº"
				+ "\n0.- Salir"
				+ "\n1.- Mostrar Articulos"
				+ "\n2.- Insertar Articulo"
				+ "\n3.- Eliminar Articulo"
				+ "\n4.- Actualizar Estanteria"
				+ "\n5.- Actualizar Stock"
				+ "\n6.- Actualizar Nombre";
				

		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));

		return opcionUsuario;
	}
	
	public static void crearArticulos() {
		
		String key = JOptionPane.showInputDialog("Inserte la key de su producto");

		int codigoBarras = Integer.parseInt(JOptionPane.showInputDialog("Inserte el codigo de barras"));
		int numEstante = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero del Estante"));
		String nombre = JOptionPane.showInputDialog("Inserte el nombre del arrticulo");
		int stock = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero de stock disponible"));
		
		
		
		hm.put(key, new Articulo(codigoBarras, numEstante, nombre, stock));

	}
	
	public static void eliminarArticulo() {
		String key = JOptionPane.showInputDialog("Inserte la key del articulo que desea eliminar");
		hm.remove(key);
	}
	

	public static void actualizarEstante() {
		
		String key = JOptionPane.showInputDialog("Inserte el key del articulo a modificar");
		System.out.println(hm.get(key));
		int nuevoNumEstante = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero del Estante"));
		
		
		hm.get(key).setNumEstante(nuevoNumEstante);
	}
	
	public static void actualizarStock() {
		
		String key = JOptionPane.showInputDialog("Inserte el key del articulo a modificar");
		System.out.println(hm.get(key));
		int nuevoNumStock = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero del Estante"));
		
		
		hm.get(key).setNumStock(nuevoNumStock);
	}
	
	public static void actualizarNombre() {
		
		String key = JOptionPane.showInputDialog("Inserte el key del articulo a modificar");
		System.out.println(hm.get(key));
		String nombre = JOptionPane.showInputDialog("Inserte el numero del Estante");
		
		
		hm.get(key).setNombre(nombre);
	}
	
	public static void encontrarArticulo() {
		
		String key = JOptionPane.showInputDialog("Inserte el key del articulo a modificar");
		System.out.println(hm.get(key).getNombre());
				
		System.out.println(hm.get(key).getNumEstante());	
	}
	
}
