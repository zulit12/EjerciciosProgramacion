package excepciones.ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	private static int getNumeroPar () throws PeticionNumeros {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero par: "));
		
		
		if (numero % 2 == 0) {
			return numero;
			
		}
		else {
			throw new PeticionNumeros("El numero: " + numero + " no es par");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			getNumeroPar();
		} catch (PeticionNumeros e) {
			e.printStackTrace();
		}

	}

}
