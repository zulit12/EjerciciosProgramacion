package capitulo4.cuestionarioAbstracto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	static List<Preguntas>preguntas = new ArrayList <Preguntas>();
	
	
	public static void main(String[] args) {
		

		PreguntaVF capitalEspaña = new PreguntaVF("Madrid es la capital de España", "V");
		
		PreguntaVF puntoDeEbullicion = new PreguntaVF("El agua hierve a 50 grados","F");
		
		PreguntaVF meLLaman = new PreguntaVF("Me llaman Zulit","V");
		
		PreguntaOpcion nombreAsignatura = new PreguntaOpcion("¿Cual es esta asignatura?", 2, new String[] {"BDD","Programacion","Entornos","Fol","Lenguaje"});
		
		PreguntaOpcion cuantosAños = new PreguntaOpcion("Cuantos Años Tengo", 3, new String[] {"15","18","19","21","25"});
		
		preguntas.add(capitalEspaña);
		preguntas.add(puntoDeEbullicion);
		preguntas.add(meLLaman);
		preguntas.add(nombreAsignatura);
		preguntas.add(cuantosAños);
		
		int aciertos =0;
		for (Preguntas p : preguntas) {
			p.muestraEnPantalla();
			Scanner sc = new Scanner(System.in);
			String respuestaUsuario = sc.nextLine();
			boolean correcta = p.esCorecta(respuestaUsuario);
			if(correcta) {
				aciertos++;
			}
			
		}
		float porcentaje = aciertos / (float)preguntas.size()  * 100;
		
		System.out.println(porcentaje);
		
	}

}
