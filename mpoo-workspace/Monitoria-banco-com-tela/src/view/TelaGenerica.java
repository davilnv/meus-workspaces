package view;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaGenerica extends JFrame {
	
	private CardLayout cardLayout;

	public TelaGenerica(String titulo, int largura, int altura) {
		super(titulo);
		setSize(largura, altura);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardLayout = new CardLayout();
		setLayout(cardLayout);
		setVisible(false);
	}
	
	public void mudarTela(String tela) {
		cardLayout.show(getContentPane(), tela);
	}
}
