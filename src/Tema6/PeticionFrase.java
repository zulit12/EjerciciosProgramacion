package Tema6;

import javax.swing.JOptionPane;

public class PeticionFrase {

	int todoEspacios = 0;
	
	
	public void pideFrase() throws ExcepcionEspacioBlanco, ExcepcionMinCaracteres, ExcepcionNoBombilla, ExcepcionPalabrota {
		
		String str = JOptionPane.showInputDialog("Introduzca una frase con bombilla: ");
		for (int i = 0 ; i < str.length() ;i++ ) {
			if( str.charAt(i)==' ') {
				todoEspacios++;
			}
		}
		
		if(todoEspacios == str.length()) {
			throw new ExcepcionEspacioBlanco("La cadena de texto introducida no puede ser todo espacios");
		}
		
		if(str.length()<3 ) {
			throw new ExcepcionMinCaracteres("La cadena debe de tener un minimo de tres caracteres");
		}
		
		if(!str.contains("bombilla") && !str.contains("Bombilla")){
			throw new ExcepcionNoBombilla("La cadena debe contener la palabra bombilla");
		}
		
		if(str.contains("tonto") || str.contains("tonta") || str.contains("idiota")) {
			throw new ExcepcionPalabrota("La cadena de texto no debe contener lenguaje inapropiado");
		}
		
		else {
			System.out.println(str);
		}
	
	}
	
	
	public static void main(String[] args) {
		
		try {
		PeticionFrase n=new PeticionFrase();
		n.pideFrase();
	
		}
		catch (ExcepcionEspacioBlanco |  ExcepcionMinCaracteres | ExcepcionNoBombilla | ExcepcionPalabrota e) {
			System.out.println(e.getMessage());
		}
	}

}
