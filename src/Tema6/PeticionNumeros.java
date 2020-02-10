package Tema6;

import javax.swing.JOptionPane;

public class PeticionNumeros {

	
	public void pideNumeroPar() throws ExcepcionNoPar {
		
		String str = JOptionPane.showInputDialog("Introduzca un número par: ");
		int var1 = Integer.parseInt(str);
	
		if (var1%2==1) {
			throw new ExcepcionNoPar("El numero introducido no es par");
		}
		
		else {
			System.out.println("Has introducido un numero Par");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		try {
		PeticionNumeros n=new PeticionNumeros();
		n.pideNumeroPar();
	
		}
		catch (ExcepcionNoPar e) {
			System.out.println(e.getMessage());
		}
	}

}
