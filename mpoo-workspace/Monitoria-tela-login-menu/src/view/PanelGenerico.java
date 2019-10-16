package view;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PanelGenerico extends JPanel{
	
	public PanelGenerico(String titulo) {
		setSize(TelaGenerica.LARGURA, TelaGenerica.ALTURA);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		setBorder(BorderFactory.createTitledBorder(titulo));
		setVisible(true);
	}
}
