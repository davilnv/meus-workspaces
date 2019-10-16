package view;

import javax.swing.JButton;

public class Menu extends PanelGenerico{

	private JButton btnLogin, btnCadastro, btnSair;

	public Menu(String titulo) {
		super(titulo);

		btnLogin = new JButton("Login");
		btnCadastro = new JButton("Cadastrar");
		btnSair = new JButton("Sair");

		add(btnLogin);
		add(btnCadastro);
		add(btnSair);

		setVisible(true);
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public JButton getBtnCadastro() {
		return btnCadastro;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

}
