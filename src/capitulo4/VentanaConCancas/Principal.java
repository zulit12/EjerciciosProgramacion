package capitulo4.VentanaConCancas;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Micanvas");
		
		MiCanvas miCanvas = new MiCanvas();
		
		ventana.getContentPane().setLayout(new BorderLayout());

		ventana.getContentPane().add(miCanvas, BorderLayout.CENTER);
		
		ventana.setBounds(0, 0, 800, 600);
		
		ventana.setVisible(true);
	}

}
