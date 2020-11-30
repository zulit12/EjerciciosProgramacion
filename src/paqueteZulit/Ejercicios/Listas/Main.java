package paqueteZulit.Ejercicios.Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class Main {

		
	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<String> fichero = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();
		List<String> lista2 = new ArrayList<String>();
		
		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el programa esté finalizado
		fichero.add("Primera línea"); fichero.add("Segunda línea"); fichero.add("Tercera línea");
		
		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();
		
			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;
			case 1:
				agregarLinea(fichero);
				break;
			case 2:
				agregarLineaUsuarioElige(fichero);
				break;
			case 3:
				editarLinea(fichero);
				break;
			case 4:
				borrarLinea(fichero);
				break;
			case 5: 
				portapapeles = cortaLineas(fichero);
				break;
			case 6:
				pegarLineas(lista2, portapapeles);
				break;
			case 7: // Ha elegido visualizar el fichero
				visualizaLista(fichero);
				break;
			case 8:
				visualizaLista(lista2);
				break;
			default:
				System.out.println("Opción no válida");
			}
			
			
		} while (opcion != 0);

	}

	/**
	 * Muestra un menú en pantalla y pide una opción al usuario
	 * @return
	 */
	public static int menu () {
		String strMenu = "\n\nMenú"
				+ "\n0.- Salir"
				+ "\n1.- Agregar una línea"
				+ "\n2.- Insertar una línea en una posición"
				+ "\n3.- Editar una línea"
				+ "\n4.- Eliminar una línea"
				+ "\n5.- Cortar un conjunto de líneas"
				+ "\n6.- Pegar un conjunto de líneas"
				+ "\n7.- Visualizar el fichero"
				+ "\n8.- Visualizar el fichero 2"
				+ "\n\nIntroduzca su opción: ";
				
		// Muestro el menú
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}
	
	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla y cada una con su número de línea
	 * @param lista
	 */
	public static void visualizaLista (List<String> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}


	/**
	 * 
	 * @param fichero
	 */
	public static void agregarLinea (List<String> fichero) {
		
		String linea = JOptionPane.showInputDialog("Inserte el texto que quiera añadir");
		
		fichero.add(linea);
		
	}
	
	/**
	 * 
	 * @param fichero
	 */
	public static void agregarLineaUsuarioElige (List<String> fichero) {
		
		int numLinea = Integer.parseInt(JOptionPane.showInputDialog("Escoga la linea en la cual quiere introducir el texto"));
		
		String linea = JOptionPane.showInputDialog("Escriba la linea de texto que quiere añadir");
		
		fichero.add(numLinea, linea);
		}
	
	/**
	 * 
	 * @param fichero
	 */
	public static void editarLinea (List<String> fichero) {
		
		int numLinea = Integer.parseInt(JOptionPane.showInputDialog("Que linea desea Editar"));
		
		String nuevaLinea = JOptionPane.showInputDialog(fichero.get(numLinea) + '\n'  
							+ "Inserte la nueva Linea de Texto");
		
		fichero.remove(numLinea);
		fichero.add(numLinea, nuevaLinea);		
		
	}
	
	/**
	 * 
	 * @param fichero
	 */
	public static void borrarLinea (List<String> fichero) {
		
		int numLinea = Integer.parseInt(JOptionPane.showInputDialog("¿Que linea desea borrar?"));
		
		fichero.remove(numLinea);
		
	}
	
	/**
	 * 
	 * @param fichero
	 * @return
	 */
	public static List cortaLineas (List<String> fichero) {
		
		List<String> portaPapeles = new ArrayList<String>();
		
		
		int numInicial = Integer.parseInt(JOptionPane.showInputDialog("Primera Linea a Cortar"));
		int numFinal   = Integer.parseInt(JOptionPane.showInputDialog("Inserte Ultima Linea a Cortar"));
		
		for (int i = numInicial; i < numFinal; i++) {
			portaPapeles.add(fichero.get(numInicial));
			fichero.remove(numInicial);
		}
		
		return portaPapeles;
	}

	/**
	 * 
	 * @param fichero
	 * @param cortaPapeles
	 */
	public static void pegarLineas (List<String> fichero, List<String> cortaPapeles) {
		
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("En que linea desea insertar el Portapales"));
		
		fichero.addAll(numUsuario, cortaPapeles);
		
	}
	

}
	
	
	
	

