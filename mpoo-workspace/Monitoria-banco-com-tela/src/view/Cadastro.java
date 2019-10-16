package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Cadastro extends PanelGenerico {
	
	private JButton btnVoltar, btnCadastrar;
	private JTextField tfNumeroConta;
	private JPasswordField tfSenha, tfConfirmarSenha;
	private JLabel lblNumeroConta, lblSenha, lblConfirmarSenha;
	private JRadioButton rbPoupanca, rbCorrente;
	
	public Cadastro(String titulo) {
		super(titulo, 180, 370);
		
		btnVoltar = new JButton("Voltar");
		btnCadastrar = new JButton("Cadastrar");
		
		tfNumeroConta = new JTextField(10);
		tfSenha = new JPasswordField(10);
		tfConfirmarSenha = new JPasswordField(10);
		
		lblNumeroConta = new JLabel("Número da Conta: ");
		lblSenha = new JLabel("Senha: ");
		lblConfirmarSenha = new JLabel("Confirmar Senha: ");
		
		rbPoupanca = new JRadioButton("Poupanca");
		rbCorrente = new JRadioButton("Corrente");
		
		ButtonGroup group = new ButtonGroup();
		group.add(rbPoupanca);
		group.add(rbCorrente);
		
		add(lblNumeroConta);
		add(tfNumeroConta);
		add(lblSenha);
		add(tfSenha);
		add(lblConfirmarSenha);
		add(tfConfirmarSenha);
		
		add(rbPoupanca);
		add(rbCorrente);
		add(btnCadastrar);
		add(btnVoltar);
	}
	
	public JTextField getTfNumeroConta() {
		return tfNumeroConta;
	}

	public JPasswordField getTfSenha() {
		return tfSenha;
	}

	public JPasswordField getTfConfirmarSenha() {
		return tfConfirmarSenha;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public JRadioButton getRbPoupanca() {
		return rbPoupanca;
	}

	public JRadioButton getRbCorrente() {
		return rbCorrente;
	}
	
}
