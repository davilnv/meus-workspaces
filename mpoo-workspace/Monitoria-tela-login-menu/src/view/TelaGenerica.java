package view;

import java.awt.CardLayout;

import javax.swing.JFrame;

public abstract class TelaGenerica extends JFrame {
	public static final int LARGURA = 270;
	public static final int ALTURA = 130;
	
	private CardLayout cardLayout;
	
	public TelaGenerica(String titulo, int largura, int altura) {
		super(titulo);
		setSize(largura, altura);
		inicializar();
	}
	
	
	
	public TelaGenerica(String titulo) {
		super(titulo);
		setSize(LARGURA, ALTURA);
		inicializar();
	}

	private void inicializar() {
		cardLayout = new CardLayout();
		setLayout(cardLayout);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void mudarTela(String tela) {
		cardLayout.show(getContentPane(), tela);
	}
}
