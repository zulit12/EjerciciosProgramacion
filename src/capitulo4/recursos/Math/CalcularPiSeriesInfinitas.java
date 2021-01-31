package capitulo4.recursos.Math;

public class CalcularPiSeriesInfinitas {

	public static void main(String[] args) {
		
	// Math.Pi =  (4/1)-(4/3)+(4/5)-(4/7)+(4/9)-(4/11)+(4/13)-(4/15)
		
	double calculo;	
	double x = 3;
	float piCalculado = 4;
	int signo = -1;	
	do {
		piCalculado += signo * 4.0 / x;
		signo *= -1;
		x += 2;

	} while (Math.abs(Math.PI - piCalculado) >= 0.00001);	
	System.out.println(piCalculado);
	System.out.println(Math.PI);
		
	}
	
}
