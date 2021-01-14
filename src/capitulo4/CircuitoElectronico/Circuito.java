package capitulo4.CircuitoElectronico;

public class Circuito {

	public static void main(String[] args) {

		Bateria bateria = new Bateria("Pila", "Interruptor", "Resistencia", "1,5");
		Resistencia resistencia = new Resistencia("Resistencia", "Interruptor", "Pila", "35");
		Led led = new Led("Bombilla", "Resistencia", "Interruptor", "90 lumenes");
		Interruptor interruptor = new Interruptor("Interruptor", "Led", "Pila", "Esprit Glass");
		
		bateria.setComponenteAnterior("Interruptor");
		bateria.setComponenteSiguiente("Resistencia");
		resistencia.setComponenteAnterior("Pila");
		resistencia.setComponenteSiguiente("Led");
		led.setComponenteAnterior("Resistencia");
		led.setComponenteSiguiente("Interruptor");
		interruptor.setComponenteAnterior("Led");
		interruptor.setComponenteAnterior("Bateria");
		
		System.out.println(bateria.toString());
		System.out.println(resistencia.toString());
		System.out.println(led.toString());
		System.out.println(interruptor.toString());
	}

}
