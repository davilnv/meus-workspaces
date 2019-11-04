package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	JButton entrarButton;
	JButton cadastrarButton;
	JTextField loginField;
	JTextField senhaField;
	JLabel loginLabel;
	JLabel senhaLabel;
	
	public Login(String titulo){
		super(titulo);
		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		entrarButton = new JButton("Entrar");
		cadastrarButton = new JButton("Cadastrar");
		loginField = new JTextField(10);
		senhaField = new JTextField(10);
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(entrarButton);
		add(cadastrarButton);
		setVisible(true);
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}
}
