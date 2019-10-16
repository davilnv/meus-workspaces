package capitulo04;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(
		"Escolha 1 para desenhar retângulos\n" +
		"Escolha 2 para desenhar um oval");
		
		int choice = Integer.parseInt(input);
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}
