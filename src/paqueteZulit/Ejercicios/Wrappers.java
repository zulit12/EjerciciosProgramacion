package paqueteZulit.Ejercicios;

import javax.swing.JOptionPane;

public class Wrappers {

	public static void limiteMaximoMinimo() {
		
		System.out.println("Valor m�ximo para un Integer: " + Integer.MAX_VALUE);
		System.out.println("Valor m�nimo para un Integer: " + Integer.MIN_VALUE);
		
		System.out.println("\nValor m�ximo para un Long: " + Long.MAX_VALUE);
		System.out.println("Valor m�nimo para un Long: " + Long.MIN_VALUE);
		
		System.out.println("\nValor m�ximo para un Short: " + Short.MAX_VALUE);
		System.out.println("Valor m�nimo para un Short: " + Short.MIN_VALUE);
		
		System.out.println("\nValor m�ximo para un Float: " + Float.MAX_VALUE);
		System.out.println("Valor m�nimo para un Float: " + Float.MIN_VALUE);
		
		System.out.println("\nValor m�ximo para un Double: " + Double.MAX_VALUE);
		System.out.println("Valor m�nimo para un Double: " + Double.MIN_VALUE);
		
		System.out.println("\nValor m�ximo para un Byte: " + Byte.MAX_VALUE);
		System.out.println("Valor m�nimo para un Byte: " + Byte.MIN_VALUE);
		
	}
	
	public static void contraseña() {
		
		boolean mayusculas = false;
		boolean minusculas = false;
		boolean digito = false;
		boolean caracterNoAlfa = false;
		
		
		do {
			String contrasena = JOptionPane.showInputDialog("Introduzca una contraseña con los siguientes requisitos: " + "\n"+
															"Al menos una mayuscula" + "\n"+
															"Al menos una minuscula" + "\n"+
															"Al menos un digito"     + "\n"+
															"Al menos un caracter no alfanumerico"); 
			char cadena[] = contrasena.toCharArray();
			
			for (int i = 0; i < cadena.length; i++) {
			
				if (mayusculas == false) {
					mayusculas = Character.isUpperCase(cadena[i]);
				}
				
				if (minusculas == false) {
					minusculas = Character.isLowerCase(cadena[i]);
				}
				
				if (digito == false) {
					digito = Character.isDigit(cadena[i]);
				}
				
				if (caracterNoAlfa == false) {
					caracterNoAlfa = Character.isLetterOrDigit(cadena[i]);
				}
				
			}
			
			if (mayusculas == false || minusculas == false || digito == false || caracterNoAlfa == false) {
				System.out.println("No se han cumplido los requisitos");
			}
			
		} while (mayusculas == false || minusculas == false || digito == false || caracterNoAlfa == false);
		System.out.println("Contraseña valida");
	}
	
	public static void numerosHexadecimal() {
		
		for (int i = 0; i <= 100; i++) {

            String hex = Integer.toHexString(i);

            System.out.println("El hexadecimal de " + i + " es: " + hex);

        }
	}
	
	
	public static void main(String[] args) {
		
		//limiteMaximoMinimo();
		//contraseña();
		numerosHexadecimal();
	}

}
