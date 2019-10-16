package view;

import javax.swing.JButton;

public class Login extends PanelGenerico{
	private JButton btnVoltar;
	
	public Login(String titulo) {
		super(titulo);
		
		btnVoltar = new JButton("Voltar");
		add(btnVoltar);
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}
	
}
