package capitulo4.VentanaConCancas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiCanvas extends Canvas {

	
	public MiCanvas() {
		
	}
	
	
	public void paint (Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(50, 50, 50, 50);
	
		g.setColor(Color.GREEN);
		g.fillOval(250, 250, 250, 250);
	
		int[] x = {175,150,200};
		int[] y = {150,200,200};
		
		g.setColor(Color.BLUE);
		g.fillPolygon(x, y, 3);
		
	}
	
}
