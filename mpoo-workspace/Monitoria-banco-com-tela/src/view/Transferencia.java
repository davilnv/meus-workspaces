package view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Transferencia extends PanelGenerico {
	
	private JButton btnVoltar, btnSacar, btnDepositar, btnTransferir;
	private JLabel lblSaldo;

	public Transferencia(String titulo) {
		super(titulo, 180, 370);
		
		btnSacar = new JButton("Sacar");
		btnDepositar = new JButton("Depositar");
		btnTransferir = new JButton("Transferir");
		btnVoltar = new JButton("Voltar");
		
		add(lblSaldo);
		add(btnSacar);
		add(btnDepositar);
		add(btnTransferir);
		add(btnVoltar);
	}
	
	public JLabel getLblSaldo() {
		return this.lblSaldo;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public JButton getBtnSacar() {
		return btnSacar;
	}

	public JButton getBtnDepositar() {
		return btnDepositar;
	}

	public JButton getBtnTransferir() {
		return btnTransferir;
	}
	
}
