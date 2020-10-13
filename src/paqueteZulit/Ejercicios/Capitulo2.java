package paqueteZulit.Ejercicios;

import javax.swing.JOptionPane;

public class Capitulo2 {
	
	/**
	 * 								COMIENZO DEL PRIMER BLOQUE DE EJERCICIOS
	 */

	/**
	 * BLOQUE EJERCICIO 1 - VALOR DE MAYOR TAMAÑO - 2 NUMEROS
	 */
	private static void bloque1Ejercicio1 () {
		
		String str = JOptionPane.showInputDialog("Inserte el primer valor deseado: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo valor deseado: ");
		int num2 = Integer.parseInt(str);
		
		//Comprabacion de cual de los valores es mayor
		if (num1 > num2) {
			System.out.println("EL valor de mayor tamaño es el primer valor introducido: " + num1);
		} else {
			System.out.println("El valor de mayor tamaño es el segundo valor introducido: " + num2);
		}
	}
	/**
	 * FIN DE EJERCICIO 1 - VALOR DE MAYOR TAMAÑO - 2 NUMEROS
	 */
	
	
	/**
	 * BLOQUE EJERCICIO 1 - VALOR DE MENOR TAMAÑO - 2 NUMEROS
	 */
	private static void bloque1Ejercicio2 () {
		String str = JOptionPane.showInputDialog("Inserte el primer valor deseado: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo valor deseado: ");
		int num2 = Integer.parseInt(str);
		
		//Comprabacion de cual de los valores es menor
		if (num1 < num2) {
			System.out.println("EL valor de menor tamaño es el primer valor introducido: " + num1);
		} else {
			System.out.println("El valor de menor tamaño es el segundo valor introducido: " + num2);
		}
	}
	/**
	 * FIN DE EJERCICIO 1 - VALOR DE MENOR TAMAÑO - 2 NUMEROS
	 */
	
	
	/**
	 * BLOQUE EJERCICIO 3 - QUE VALOR ES MAYOR - 5 NUMEROS
	 */
	private static void bloque1Ejercicio3 () {
		
		// Pedir al usuario numeros
		String str = JOptionPane.showInputDialog("Inserte el primer numero: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num5 = Integer.parseInt(str);
		
		/**
		 *  Comprobacion para conseguir el numero de mayor valor
		 */
		
		if (num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5) {
			System.out.println("Los valor tienen el mismo valor");
		} else {
			if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
				System.out.println("El primer valor introducido es el mayor: " + num1);
			} else {
				if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
					System.out.println("El segundo valor introducido es el mayor: " + num2);
				} else {
					if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
						System.out.println("El tercer valor introducido es el mayor: " + num3);
					} else {
						if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
							System.out.println("El cuarto valor introducido es el mayor: " + num4);
						} else {
							System.out.println("El quinto valor introducido es el mayor valor: " + num5);
						}
					}
				}
			}
		}
		
	}
	/**
	 * FIN DE EJERCICIO 3 - QUE VALOR ES MAYOR - 5 NUMEROS
	 */
	
	/**
	 * BLOQUE EJERCICIO 4 - QUE VALOR ES MENOR - 5 NUMEROS
	 */
	private static void bloque1Ejercicio4 () {
		
		//Pedir al usuario numeros
		String str = JOptionPane.showInputDialog("Inserte el primer numero: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num5 = Integer.parseInt(str);
		
		/**
		 * Comprobacion para conseguir el numero de menor valor
		 */
		if (num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5) {
			System.out.println("Los numeros tienen el mismo valor");
		} else {
			if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
				System.out.println("El primer valor introducido es el menor: " + num1);
			} else {
				if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
					System.out.println("El segundo valor introducido es el menor: " + num2);
				} else {
					if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
						System.out.println("El tercer valor introducido es el menor: " + num3);
					} else {
						if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
							System.out.println("El cuarto valor introducido es el menor: " + num4);
						} else {
							System.out.println("El quinto valor introducido es el menor valor: " + num5);
						}
					}
				}
			}
		}
		
	}
	/**
	 * FIN DE EJERCICIO 4 - QUE VALOR ES MENOR - 5 NUMEROS
	 */
	
	/**
	 * BLOQUE EJERCICIO 5 - QUE VALOR ES MAYOR Y MENOR - 5 NUMEROS
	 */
	private static void bloque1Ejercicio5 () {
		//Pedir al usuario numeros
		String str = JOptionPane.showInputDialog("Inserte el primer numero: ");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte el segundo numero: ");
		int num5 = Integer.parseInt(str);
		
		/**
		 * Comprobación para conseguir el numero de mayor valor
		 */
		if (num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5) {
			System.out.println("Los numero tienen el mismo valor");
		} else {
			if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
				System.out.println("El primer numero introducido es el mayor: " + num1);
			} else {
				if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
					System.out.println("El segundo numero introducido es el mayor: " + num2);
				} else {
					if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
						System.out.println("El tercer numero introducido es el mayor: " + num3);
					} else {
						if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
							System.out.println("El cuarto numero introducido es el mayor: " + num4);
						} else {
							System.out.println("El quinto numero introducido es el mayor valor: " + num5);
						}
					}
				}
			}
		}
		
		/**
		 * Comprobación para conseguir el numero de menor valor
		 */
		if (num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5) {
			System.out.println("Los numero tienen el mismo valor");
		} else {
			if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
				System.out.println("El primer numero introducido es el menor: " + num1);
			} else {
				if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
					System.out.println("El segundo numero introducido es el menor: " + num2);
				} else {
					if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
						System.out.println("El tercer numero introducido es el menor: " + num3);
					} else {
						if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
							System.out.println("El cuarto numero introducido es el menor: " + num4);
						} else {
							System.out.println("El quinto numero introducido es el menor valor: " + num5);
						}
					}
				}
			}
		}
	}
	/**
	 * FIN DE EJERCICIO 5 - QUE VALOR ES MAYOR Y MENOR - 5 NUMEROS
	 */
	
	/**
	 * BLOQUE EJERCICIO 6 - NUMERO PAR O IMPAR 
	 */
	private static void bloque1Ejercicio6 () {
		
		//Pedir numeros al usuario
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num = Integer.parseInt(str);
		
		//formula para comprobar el numero
		int division = num % 2;
		
		//Sacar por la pantalla que tipo de numero es
		if (division == 0) {
			System.out.println("El numero introducido es par");
		} else {
			System.out.println("El numero introducido es impar");
		}
	}
	/**
	 * FIN DE EJERCICIO 6 - NUMERO PAR O IMPAR
	 */
	
	/**
	 * BLOQUE EJERCICIO 7 - NUMERO PAR O IMPAR
	 */
	private static void bloque1Ejercicio7 () {
		
		//Pedir numeros al usuario
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num = Integer.parseInt(str);
	
		//Formula para comprobar el numero y a continuación imprimirlos por pantalla
		if (num % 2==0 & num != 1) {
			System.out.println("El numero es par");
		} 
			else {
			System.out.println("El numero es impar");
		}
	}
	/**
	 * FIN DE EJERCICIO 7 - NUMERO PAR O IMPAR
	 */
	
	
	/**
	 * 
	 * 								FIN DEL PRIMER BLOQUE DE EJERCICIOS
	 * 
	 */
	
	
	
	/**
	 * 								COMIENZO DEL SEGUNDO BOQUE DE EJERCICIOS
	 */
	
	/**
	 * BLOQUE EJERCICIO 1 - CLASIFICACIÓN POR CATEGORIA
	 */
	private static void bloque2Ejercicio1 () {
		
		//Pedir valores al usuario
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num1 = Integer.parseInt(str);
		

		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num2 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num3 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num4 = Integer.parseInt(str);
	
	
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num5 = Integer.parseInt(str);
	
		//Creación de las distintas categorias
		int numeroNegativo = 0;
		int numeroBajos = 0;
		int numeroMedios = 0;
		int numeroGrandes = 0;
		
		
		//Comprobación de a que categoria pertenece num1
		if (num1 < 0 ) {
			numeroNegativo = numeroNegativo + num1;
			}
		if (num1 > 0 && num1 <= 25) {
				numeroBajos = numeroBajos + num1;
			} 
		if (num1 >= 26 && num1 <= 250) {
				numeroMedios = numeroMedios + num1;
			}
		if (num1 > 250) {
				numeroGrandes = numeroGrandes + num1;
			}
			
		//Comprobación de a que categoria pertenece num2
		if (num2 < 0 ) {
			numeroNegativo = numeroNegativo + num2;
			}
		if (num2 > 0 && num2 <= 25) {
				numeroBajos = numeroBajos + num2;
			} 
		if (num2 >= 26 && num2 <= 250) {
				numeroMedios = numeroMedios + num2;
			}
		if (num2 > 250) {
				numeroGrandes = numeroGrandes + num2;
			}
		
		//Comprobación de a que categoria pertenece num3
		if (num3 < 0 ) {
			numeroNegativo = numeroNegativo + num3;
			}
		if (num3 > 0 && num3 <= 25) {
				numeroBajos = numeroBajos + num3;
			} 
		if (num3 >= 26 && num3 <= 250) {
				numeroMedios = numeroMedios + num3;
			}
		if (num3 > 250) {
				numeroGrandes = numeroGrandes + num3;
			}
		
		//Comprobación de a que categoria pertenece num4
		if (num4 < 0 ) {
			numeroNegativo = numeroNegativo + num4;
			}
		if (num4 > 0 && num4 <= 25) {
				numeroBajos = numeroBajos + num4;
			} 
		if (num4 >= 26 && num4 <= 250) {
				numeroMedios = numeroMedios + num4;
			}
		if (num4 > 250) {
				numeroGrandes = numeroGrandes + num4;
			}
		
		//Comprobación de a que categoria pertenece num5
		if (num5 < 0 ) {
			numeroNegativo = numeroNegativo + num5;
			}
		if (num5 > 0 && num5 <= 25) {
				numeroBajos = numeroBajos + num5;
			} 
		if (num5 >= 26 && num5 <= 250) {
				numeroMedios = numeroMedios + num5;
			}
		if (num5 > 250) {
				numeroGrandes = numeroGrandes + num5;
			}
		
		
		//Imprimir en pantalla 
		
		System.out.println("Numeros Negativos = " + numeroNegativo + '\n' + 
						   "Numeros Bajos = " + numeroBajos +  '\n' + 
						   "Numeros Medios = " + numeroMedios +  '\n' + 
						   "Numeros Grandes = " + numeroGrandes +  '\n'
						   
				);
		
	}
	/**
	 * FIN DE EJERCICIO 1 - CLASIFICACIÓN POR CATEGORIA
	 */
	
	/**
	 * BLOQUE EJERCICIO 2 - CLASIFICACIÓN POR CATEGORIA - NUMEROS NEGATIVOS FINALIZA PROGRAMA
	 */
	private static void bloque2Ejercicio2 () {
		
		//Pedir valores al usuario
		String str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num1 = Integer.parseInt(str);
		

		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num2 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num3 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num4 = Integer.parseInt(str);
	
	
		str = JOptionPane.showInputDialog("Inserte un valor: ");
		int num5 = Integer.parseInt(str);
	
	
		//Creación de las distintas categorias
		int numeroBajos = 0;
		int numeroMedios = 0;
		int numeroGrandes = 0;
		
		
		//Comprobación de a que categoria pertenece num1
		if (num1 < 0 ) {
			System.exit(0);
			}			
		if (num1 > 0 && num1 <= 25) {
				numeroBajos = numeroBajos + num1;
			} 
		if (num1 >= 26 && num1 <= 250) {
				numeroMedios = numeroMedios + num1;
			}
		if (num1 > 250) {
				numeroGrandes = numeroGrandes + num1;
			}
			
		//Comprobación de a que categoria pertenece num2
		if (num2 < 0 ) {
			System.exit(0);
			}
		if (num2 > 0 && num2 <= 25) {
				numeroBajos = numeroBajos + num2;
			} 
		if (num2 >= 26 && num2 <= 250) {
				numeroMedios = numeroMedios + num2;
			}
		if (num2 > 250) {
				numeroGrandes = numeroGrandes + num2;
			}
		
		//Comprobación de a que categoria pertenece num3
		if (num3 < 0 ) {
			System.exit(0);
			}
		if (num3 > 0 && num3 <= 25) {
				numeroBajos = numeroBajos + num3;
			} 
		if (num3 >= 26 && num3 <= 250) {
				numeroMedios = numeroMedios + num3;
			}
		if (num3 > 250) {
				numeroGrandes = numeroGrandes + num3;
			}
		
		//Comprobación de a que categoria pertenece num4
		if (num4 < 0 ) {
			System.exit(0);
			}
		if (num4 > 0 && num4 <= 25) {
				numeroBajos = numeroBajos + num4;
			} 
		if (num4 >= 26 && num4 <= 250) {
				numeroMedios = numeroMedios + num4;
			}
		if (num4 > 250) {
				numeroGrandes = numeroGrandes + num4;
			}
		
		//Comprobación de a que categoria pertenece num5
		if (num5 < 0 ) {
			System.exit(0);
			}
		if (num5 > 0 && num5 <= 25) {
				numeroBajos = numeroBajos + num5;
			} 
		if (num5 >= 26 && num5 <= 250) {
				numeroMedios = numeroMedios + num5;
			}
		if (num5 > 250) {
				numeroGrandes = numeroGrandes + num5;
			}
		
		
		//Imprimir en pantalla 
		
		System.out.println("Numeros Bajos = " + numeroBajos +  '\n' + 
						   "Numeros Medios = " + numeroMedios +  '\n' + 
						   "Numeros Grandes = " + numeroGrandes +  '\n'
						   
				);
	}
	/**
	 * FIN DE EJERCICIO 2 - CLASIFICACIÓN POR CATEGORIA - NUMEROS NEGATIVOS FINALIZA PROGRAMA
	 */
	
	
	/**
	 * 								FIN DEL SEGUNDO BLOQUE DE EJERCICIOS
	 */
	
	/**
	 * 								COMIENZO DEL TERCER BLOQUE DE EJERCICIOS
	 */
	
	
	/**
	 * BLOQUE EJERCICIO 1 - CALCULAR NOTA DEL ALUMNO
	 */
	
		private static void bloque3Ejercicio1 () {
				
		
				String str = JOptionPane.showInputDialog("Inserte la nota del alumno: ");		
				
				
				switch (str) {
				case "muy deficiente bajo":
					System.out.println("Ha sacado un 1");
					break;
				case "muy deficiente":
					System.out.println("Ha sacado un 2");
					break;
				case "muy deficiente algo":
					System.out.println("Ha sacado un 3");
					break;
				case "insuficiente":
					System.out.println("Ha sacado un 4");
					break;
				case "suficiente":
					System.out.println("Ha sacado un 5");
					break;
				case "bien": 
					System.out.println("Ha sacado un 6");
					break;
				case "notable": 
					System.out.println("Ha sacado un 7e");
					break;
				case "notable alto": 
					System.out.println("Ha sacado un 8");
					break;
				case "sobresaliente":
					System.out.println("Ha sacado un 9");
					break;
				case "matricula":
					System.out.println("Ha sacado un 10");
					break;
				default:
					System.out.println("La nota introducida no es valida");
				}
				
			}
		
		/**
		 * FIN DE EJERCICIO 1 - CALCULAR NOTA DEL ALUMNO
		 */
	
		/**
		 * BLOQUE EJERCICIO 3 - CALCULADORA AVANZADA
		 */
		
		private static void bloque3Ejercicio3 () {
			//Mostramos las distintas opciones que ofrece la calculadora
			String str = JOptionPane.showInputDialog("1.- Hipotenusa de un triangulo\n"
					+ "2.- Superficie de un circulo\n"
					+ "3.- Perimetro de la circunferencia\n"
					+ "4.- Area del rectandulo\n"
					+ "5.- Area del triangulo\n"
					+ "Introduzca opcion: ");
			int opcion = Integer.parseInt(str);
			
			switch (opcion) {
			case 1: //Calculo de la hipotenusa
				
				str = JOptionPane.showInputDialog("Inserte un cateto");
				int cateto1 = Integer.parseInt(str);
				
				str = JOptionPane.showInputDialog("Inserte el otro cateto");
				int cateto2 = Integer.parseInt(str);
				//Formula de la hipotenusa
				float hipotenusa = (float) Math.sqrt( cateto1 * cateto1 + cateto2 * cateto2 );
				System.out.println("La hipotenusa es: " + hipotenusa);
		
				break;
				
			case 2: //Calculo del area del circulo
				
				str = JOptionPane.showInputDialog("Inserte el radio");
				int radio = Integer.parseInt(str);
				//Formula del area del circulo
				System.out.println("El area del circulo vale: " + Math.PI * Math.pow(radio, 2));
				
				break;
				
			case 3: //Calculo del perimetro de la circunferencia

				str = JOptionPane.showInputDialog("Introduzca el radio");
				int radioC = Integer.parseInt(str);
				
				System.out.println("El perimetro del circlo vale: " + (2 * Math.PI * radioC));
				
				break;
				
			case 4: //Calculo del area del rectangulo
				
				str = JOptionPane.showInputDialog("Base");
				int baseR = Integer.parseInt(str);
				
				str = JOptionPane.showInputDialog("Altura");
				int alturaR = Integer.parseInt(str);
				
				System.out.println("El are del rectangulo es: " + (baseR * alturaR));
				
				break;
				
			case 5: // Calculo del area del triangulo
				
				str = JOptionPane.showInputDialog("Base");
				int baseT = Integer.parseInt(str);
				
				str = JOptionPane.showInputDialog("Altura");
				int alturaT = Integer.parseInt(str);
				
				System.out.println("El are del triangulo es: " + (baseT * alturaT / 2));
				
			break;
				
				
			default:
				System.out.println("El valor introducido no corresponde a ninguna de las opciones señaladas");
				break;
			}
		}
		
		/**
		 * FIN DE EJERCICIO 2 - CALCULADORA AVANZADA
		 */
		
		
		
	public static void main(String[] args) {
		//bloque1Ejercicio1();
		//bloque1Ejercicio2();
		//bloque1Ejercicio3();
		//bloque1Ejercicio4();
		//bloque1Ejercicio5();
		//bloque1Ejercicio6();
		//bloque1Ejercicio7();
		
		//bloque2Ejercicio1();
		//bloque2Ejercicio2();
		
		//bloque3Ejercicio1();
		bloque3Ejercicio3();
	}

}
