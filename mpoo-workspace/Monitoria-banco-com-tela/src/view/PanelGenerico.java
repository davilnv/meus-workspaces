package view;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public abstract class PanelGenerico extends JPanel{
	
	public PanelGenerico(String titulo, int largura, int altura) {
		setSize(largura, altura);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		setBorder(BorderFactory.createTitledBorder(titulo));
		setVisible(false);
	}
}
