package capitulo4.recursos.Math;

public class Ecuaciones {

	public static void main(String[] args) {

		double a = 1;
		double b = 3;
		double c = 2;
		
		//x = (-b +- sqrt(-b+4*a*c)) / (2*a) 
		
		double calculoRaiz = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		
		double xPositiva = (-b + calculoRaiz) / (2*a);
		
		double xNegativa = (-b - calculoRaiz) / (2*a);
		
		
		System.out.println("Raiz positiva: " + xPositiva);
		System.out.println("Raiz negativa: " + xNegativa);
	}
}
