package capitulo05;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Alvo extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.WHITE);
		g.fillOval(25, 25, 170, 170);
		
		g.setColor(Color.RED);
		g.fillOval(40, 40, 140, 140);
		
		g.setColor(Color.WHITE);
		g.fillOval(55, 55, 110, 110);
		
		g.setColor(Color.RED);
		g.fillOval(70, 70, 80, 80);
		
		g.setColor(Color.WHITE);
		g.fillOval(85, 85, 50, 50);
		
		g.setColor(Color.RED);
		g.fillOval(97, 97, 25, 25);
	}
}
