package paqueteZulit.Ejercicios.Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import paqueteZulit.Ejercicios.Utils;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<Integer> fichero = new ArrayList<Integer>();
		
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
				crearListaAleatoria(fichero);
				break;
			case 2:
				
				break;
			case 3:
			
				break;
			case 4:
			
				break;

			case 5: // Ha elegido visualizar el fichero
				visualizaLista(fichero);

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
				+ "\n1.- Crear aleatoriamente la lista de valores"
				+ "\n2.- Calcular suma, media, mayor y menor"
				+ "\n3.- Agregar una cantidad de nuevos valores"
				+ "\n4.- Eliminar elementos cuyo valor esté en un intervalo"
				+ "\n5.- Visualizar el fichero"
				+ "\n\nIntroduzca su opción: ";
				
		// Muestro el menú
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}
	
	public static void visualizaLista (List<Integer> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
	
	public static void crearListaAleatoria (List<Integer> lista){
		
		//Crear variables 
		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Inserte la longitud que desea para la lista"));
		int valorMin = Integer.parseInt(JOptionPane.showInputDialog("Inserte el valor minimo que quiere insertar"));
		int valorMax = Integer.parseInt(JOptionPane.showInputDialog("Inserte el malor maximo que quiere insertar"));
		//Borrar lista
		lista.removeAll(lista);
		//Bucle creacion numeros azar
		for (int i = 0; i < longitud; i++) {
			lista.add(Utils.obtenerNumeroAzar(valorMin, valorMax));
		}
		
		
		
		
		
		
	}
	
	public static void sumaMediaMayorMenor (List<Integer> lista) {
		
		float media = 0;
		int suma = 0;
		int mayor = lista.get(0);
		int menor = lista.get(0);
		
		for (int i = 0; i < lista.size(); i++) {
			suma += lista.get(i);
		}
		
		media = (float) suma/lista.size();
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > mayor) mayor = lista.get(i);
			
			if (lista.get(i) < menor) menor = lista.get(i);
		}
		
		System.out.println("La suma  es: " + suma + '\n');
		System.out.println("La media es: " + media + '\n');
		
		System.out.println("El numero mayor es: " + mayor + '\n');
		System.out.println("El numero menor es: " + menor + '\n');
		
		
	}
	
	public static void agregarCantidadNuevosValores (List<Integer> lista) {
		
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Inserte la posicion en la cual quiere añadir los nuevos valores"));
		int valorIng = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de valores que quiere insertar"));
		int valorMin = Integer.parseInt(JOptionPane.showInputDialog("Inserte el valor minimo que quiere insertar"));
		int valorMax = Integer.parseInt(JOptionPane.showInputDialog("Inserte el malor maximo que quiere insertar"));
		//Bucle creacion numeros
		
		
		
		
		
		
	
		}
		
		
	

}
