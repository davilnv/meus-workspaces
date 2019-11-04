package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaGenerica extends JFrame {
	
	JButton cadastroButton;
	JTextField field1;
	JTextField field2;
	JTextField field3;
	JLabel lbl1;
	JLabel lbl2;
	JLabel lbl3;
	
	public TelaGenerica(String titulo, String label1, String label2, String label3){
		super(titulo);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		cadastroButton = new JButton("Cadastrar");
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		field3 = new JTextField(10);
		lbl1 = new JLabel(label1);
		lbl2 = new JLabel(label2);
		lbl3 = new JLabel(label3);
		add(lbl1);
		add(field1);
		add(lbl2);
		add(field2);
		add(lbl3);
		add(field3);
		add(cadastroButton);
	}

	public JButton getCadastroButton() {
		return cadastroButton;
	}

	public JTextField getField1() {
		return field1;
	}

	public JTextField getField2() {
		return field2;
	}

	public JTextField getField3() {
		return field3;
	}
}