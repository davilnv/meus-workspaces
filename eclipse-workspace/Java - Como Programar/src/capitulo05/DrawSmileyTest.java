package capitulo05;

import javax.swing.JFrame;

public class DrawSmileyTest {
	public static void main(String[] args) {
		DrawSmiley panel = new DrawSmiley();
		Alvo panel1 = new Alvo();
		JFrame application = new JFrame();
		
//		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		application.add(panel);
//		application.setSize(230, 250);
//		application.setVisible(true);
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel1);
		application.setSize(230, 250);
		application.setVisible(true);
		
	}
}
