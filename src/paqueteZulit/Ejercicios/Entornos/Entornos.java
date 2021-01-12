package paqueteZulit.Ejercicios.Entornos;

import javax.swing.JOptionPane;


public class Entornos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero"));

		int primo[] = esPrimo(numero);
		
		esPrimo(numero);
		
		System.out.println(numero);
		for (int i = 0; i < primo.length; i++) {
			System.out.println(primo[i]);
		}
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
		
		int menorMayorArray[] = minimoAMaximo(num1,num2,num3);
		
		System.out.println("EL numero mas pequeño y mas grande de los 3 numeros introducidos: ");
		for (int i = 0; i < menorMayorArray.length; i++) {
			System.out.println(menorMayorArray[i]);
		}
		
	}

	
	
	// El primero llamado primos calculará los tres últimos números primos de un
    // número

    public static int [] esPrimo(int numero) {
        int [] primos = new int [3];
        int i = numero-1;
        //Comprobamos los numero primos mediente el metodo de la criba de Eratóstenes
        for (int j = 0; j < primos.length; j++) {
            for (; i < numero; i--) {
                if (i % 2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0) {
                    primos[j] = i;
                    i--;
                    break;
                }
            }
        }


        return primos;

    }
    
    public static  int[] minimoAMaximo (int num1, int num2, int num3) {
    	int min = 0, max = 0;
    	
    	int array[] = new int [2];

        if (num1 > num2 && num1 > num3) {
            max = num1;
        }
        if (num2 > num1 && num2 > num3) {
            max = num2;
        }
        if (num3 > num1 && num3 > num2) {
            max = num3;
        }
        if (num1 < num2 && num1 < num3) {
            min = num1;
        }
        if (num2 < num1 && num2 < num3) {
            min = num2;
        }
        if (num3 < num2 && num3 < num1) {
            min = num3;
        }
       
			array[1] = max;
			array[0] = min;

        
		return array;
		
       
	}
   
    
    
    
}
