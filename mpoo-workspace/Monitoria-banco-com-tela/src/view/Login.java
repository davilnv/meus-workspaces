package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends PanelGenerico{

	private JButton btnOK, btnVoltar;
	private JTextField tfNumeroConta;
	private JPasswordField tfSenha;
	private JLabel lblNumeroConta, lblSenha;
	
	public Login(String titulo) {
		super(titulo, 180, 370);

		tfNumeroConta = new JTextField(10);
		tfSenha = new JPasswordField(10);
		
		lblNumeroConta = new JLabel("Número da Conta: ");
		lblSenha = new JLabel("Senha: ");
		
		btnOK = new JButton("OK");
		btnVoltar = new JButton("Voltar");

		add(lblNumeroConta);
		add(tfNumeroConta);
		add(lblSenha);
		add(tfSenha);
		add(btnOK);
		add(btnVoltar);
	}

	public JTextField getTfNumeroConta() {
		return tfNumeroConta;
	}

	public JPasswordField getTfSenha() {
		return tfSenha;
	}

	public JButton getBtnOK() {
		return btnOK;
	}
	
	public JButton getBtnVoltar() {
		return btnVoltar;
	}
	
}
