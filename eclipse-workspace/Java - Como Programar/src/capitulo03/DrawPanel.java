package capitulo03;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		// g.drawLine(0, 0, width, height);
		
		// g.drawLine(0, height, width, 0);
		//g.drawLine(x1, y1, x2, y2);
		int teste = 0;
		while (teste < 200) {
			g.drawLine(0, 0, teste*6, width);
			teste += 15;
		}
	}
}
