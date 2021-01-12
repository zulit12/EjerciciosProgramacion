package paqueteZulit.Ejercicios.Entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Hola {

	@Test
	public void testMenorMayor() {
		int resultado[] = Entornos.minimoAMaximo(5, 40, 80);
		int esperado[] = {5,80};
		assertArrayEquals(resultado, esperado);
		
		
	}
	
	@Test
	public void testValorPrimo() {
		int resultado[] = Entornos.esPrimo(50);
		int esperado[] = {47,43,41};
		assertArrayEquals(resultado, esperado);
	}
	

}

