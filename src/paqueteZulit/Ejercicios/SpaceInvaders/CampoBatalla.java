package paqueteZulit.Ejercicios.SpaceInvaders;

public class CampoBatalla {

	Humano humanos[] = new Humano[20];
	Malvado malvados[] = new Malvado[20];
	
	
	
	public CampoBatalla() {
		for (int i = 0; i < humanos.length; i++) {
			humanos[i] = new Humano(i, i, false);
		}

		for (int i = 0; i < malvados.length; i++) {
			malvados[i] = new Malvado(i, i, false);
		}
	}
	
	public void mostrarCampo() {
		for (int i = 0; i < humanos.length; i++) {
			System.out.println(humanos[i].toString());
		}
		for (int i = 0; i < malvados.length; i++) {
			System.out.println(malvados[i].toString());
		}
	}
	
	
}
