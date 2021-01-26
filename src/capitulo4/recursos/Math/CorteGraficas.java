package capitulo4.recursos.Math;

public class CorteGraficas {

	public static void main(String[] args) {

		double y1;
		double y2;
		
		double x = 0.001;
		
		System.out.println(x);
		
		do {
			
			
			y1 = Math.sqrt(x);
			y2 = -(Math.log(x));

			x += 0.0001;
			
		} while (Math.abs(y1 - y2) >= 0.001);
		
		System.out.println("El punto donde se cortan es" + x+ "\t" + y1);
	}

}
